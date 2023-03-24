package pl.com.btc.tasklist.task;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private boolean isDone;
    private LocalDateTime deadline;

    public Task() {}

    public Task(String name, Boolean isDone, LocalDateTime deadline) {
        this.name = name;
        this.isDone = isDone;
        this.deadline = deadline;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean isDone) {
        isDone = isDone;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "Task{" + "id=" + id + ", name='" + name + '\'' + ", isDone=" + isDone + ", deadline=" + deadline + '}';
    }
}
