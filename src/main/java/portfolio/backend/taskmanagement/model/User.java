package portfolio.backend.taskmanagement.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String role; // For simplicity, use roles like "USER", "ADMIN"

    @OneToMany(mappedBy = "user")
    private Set<Task> tasks;
}
