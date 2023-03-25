package pl.com.btc.tasklist.task;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/tasks")
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public List<Task> getTasks() {
        return taskService.getAllTasks();
    }

    @GetMapping("{id}")
    public ResponseEntity<Task> getTask(@PathVariable("id") Long id) {
        return ResponseEntity.of(taskService.getTaskById(id));
    }

    @PostMapping
    public ResponseEntity<Task> addTask(@RequestBody Task task) {
        return ResponseEntity.ofNullable(taskService.addNewTask(task));
    }

    @PutMapping("{id}")
    public ResponseEntity<Task> updateTask(@PathVariable("id") Long id, @RequestBody Task task) {
        return ResponseEntity.of(taskService.updateTask(id, task));
    }

    @DeleteMapping("{ids}")
    public void deleteTask(@PathVariable List<Long> ids) {
        taskService.deleteTasks(ids);
    }
}
