package portfolio.backend.taskmanagement.repository;

import portfolio.backend.taskmanagement.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
