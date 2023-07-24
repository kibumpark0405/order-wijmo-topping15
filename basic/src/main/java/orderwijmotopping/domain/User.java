package orderwijmotopping.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import orderwijmotopping.BasicApplication;

@Entity
@Table(name = "User_table")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    public static UserRepository repository() {
        UserRepository userRepository = BasicApplication.applicationContext.getBean(
            UserRepository.class
        );
        return userRepository;
    }
}
