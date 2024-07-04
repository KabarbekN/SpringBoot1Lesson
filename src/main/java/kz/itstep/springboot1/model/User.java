package kz.itstep.springboot1.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
//@Setter
//@Getter
//@ToString
//@EqualsAndHashCode
@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "id")
    private Long id;

    private String username;

    private String password;
}
