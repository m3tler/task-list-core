package pl.com.btc.tasklist.task;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.com.btc.tasklist.user.User;
import pl.com.btc.tasklist.user.UserService;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TaskService {

    private final TaskRepository taskRepository;
    private final UserService userService;

    public List<Task> getTasksForUser(String username) {
        User user = userService.loadUserByUsername(username);
        return taskRepository.findAllByUserId(user.getId());
    }

    public Task addNewTaskForUser(String username, Task task) {
        User user = userService.loadUserByUsername(username);
        task.setUser(user);
        return taskRepository.save(task);
    }

    public Optional<Task> updateTaskForUser(String username, Long id, Task task) {
        if (!taskRepository.existsById(id)) {
            return Optional.empty();
        }

        List<Task> tasksForUser = getTasksForUser(username);
        Task taskToUpdate = taskRepository.findById(id).get();
        if (!tasksForUser.contains(taskToUpdate)) {
            return Optional.empty();
        }

        User user = userService.loadUserByUsername(username);
        task.setId(id);
        task.setUser(user);
        return Optional.of(taskRepository.save(task));
    }

    public void deleteTasksForUser(String username, List<Long> ids) {
        List<Task> tasksForUser = getTasksForUser(username);
        List<Long> finalIds = ids;
        ids = tasksForUser.stream().map(Task::getId).filter(finalIds::contains).toList();
        taskRepository.deleteAllById(ids);
    }
}
