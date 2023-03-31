package pl.com.btc.tasklist.task;

import org.springframework.data.jpa.domain.Specification;
import pl.com.btc.tasklist.user.User;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class TaskSpecifications {
    public static Specification<Task> taskBelongsToUser(User user) {
        return (root, query, cb) -> {
            if (user == null) {
                return cb.isTrue(cb.literal(true));
            }
            return cb.equal(root.get("user"), user);
        };
    }

    public static Specification<Task> taskNameContains(String name) {
        return (root, query, cb) -> {
            if (name == null || name.isBlank() || name.isEmpty()) {
                return cb.isTrue(cb.literal(true));
            }
            return cb.like(cb.lower(root.get("name")), "%" + name.toLowerCase() + "%");
        };
    }

    public static Specification<Task> taskDoneIs(String isDone) {
        return (root, query, cb) -> {
            if (isDone == null) {
                return cb.isTrue(cb.literal(true));
            }
            return cb.equal(root.get("isDone"), cb.literal(isDone));
        };
    }

    public static Specification<Task> taskDeadlineIsBetween(String from, String to) {
        return (root, query, cb) -> {
            if (from == null || to == null) {
                return cb.isTrue(cb.literal(true));
            }

            try {
                LocalDateTime fromDateTime = LocalDateTime.parse(from, DateTimeFormatter.ISO_DATE_TIME);
                LocalDateTime toDateTime = LocalDateTime.parse(to, DateTimeFormatter.ISO_DATE_TIME);
                return cb.between(root.get("deadline"), fromDateTime, toDateTime);
            } catch (DateTimeParseException e) {
                return cb.isTrue(cb.literal(true));
            }
        };
    }
}


