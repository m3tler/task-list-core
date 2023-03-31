package pl.com.btc.tasklist.task;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;
import pl.com.btc.tasklist.user.User;
import pl.com.btc.tasklist.user.UserService;

import java.util.List;

import static pl.com.btc.tasklist.task.TaskSpecifications.*;

@RestController
@RequestMapping(path = "/tasks")
@AllArgsConstructor
public class TaskController {

    private final TaskService taskService;
    private final UserService userService;

    @GetMapping
    public Page<Task> getTasks(Authentication authentication,
                               @RequestParam(required = false, defaultValue = "0") int page,
                               @RequestParam(required = false, defaultValue = "10") int size,
                               @RequestParam(required = false, defaultValue = "id") String sortBy,
                               @RequestParam(required = false, defaultValue = "asc") String sortOrder,
                               @RequestParam(required = false) String name,
                               @RequestParam(required = false) String done,
                               @RequestParam(required = false) String from,
                               @RequestParam(required = false) String to) {

        User user = userService.loadUserByUsername(authentication.getName());
        Specification<Task> specification = Specification.where(taskBelongsToUser(user)
                .and(taskNameContains(name))
                .and(taskDoneIs(done))
                .and(taskDeadlineIsBetween(from, to)));

        Sort.Order order = new Sort.Order(Sort.Direction.fromString(sortOrder), sortBy);
        Pageable pageable = PageRequest.of(page, size, Sort.by(order));

        return taskService.getTasksForUser(authentication.getName(), specification, pageable);
    }

    @PostMapping
    public ResponseEntity<Task> addTask(Authentication authentication, @RequestBody Task task) {
        return ResponseEntity.ofNullable(taskService.addNewTaskForUser(authentication.getName(), task));
    }

    @PutMapping("{id}")
    public ResponseEntity<Task> updateTask(Authentication authentication, @PathVariable("id") Long id, @RequestBody Task task) {
        return ResponseEntity.of(taskService.updateTaskForUser(authentication.getName(), id, task));
    }

    @DeleteMapping("{ids}")
    public void deleteTask(Authentication authentication, @PathVariable List<Long> ids) throws Exception {
        taskService.deleteTasksForUser(authentication.getName(), ids);
    }
}
