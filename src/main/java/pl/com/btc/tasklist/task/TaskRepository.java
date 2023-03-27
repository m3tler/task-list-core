package pl.com.btc.tasklist.task;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends CrudRepository<Task, Long> {
    List<Task> findAllByUserId(Long userId);
    List<Task> findAllByIdIn(List<Long> ids);
}
