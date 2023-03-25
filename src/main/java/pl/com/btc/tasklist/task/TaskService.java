package pl.com.btc.tasklist.task;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks() {
        List<Task> taskList = new ArrayList<>();
        taskRepository.findAll().forEach(taskList::add);
        return taskList;
    }

    public Optional<Task> getTaskById(Long id)  {
        return taskRepository.findById(id);
    }

    public Task addNewTask(Task task) {
        return taskRepository.save(task);
    }

    public Optional<Task> updateTask(Long id, Task task) {
        if(!taskRepository.existsById(id)) {
            return Optional.empty();
        }
        task.setId(id);
        return Optional.of(taskRepository.save(task));
    }

    public void deleteTasks(List<Long> ids) {
        taskRepository.deleteAllById(ids);
    }
}
