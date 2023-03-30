package pl.com.btc.tasklist.task;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/tasks")
@AllArgsConstructor
public class TaskController {

    private final TaskService taskService;

    @GetMapping
    public List<Task> getTasks(Authentication authentication) {
        return taskService.getTasksForUser(authentication.getName());
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
