package kg.magalab.natv.model.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_user")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User extends AbstractPersistable<Long> {

    @Column(name = "name", nullable = false, length = 50)
    String name;

    @Column(name = "phone_number", nullable = false, length = 50)
    String phoneNumber;

    @Column(name = "email", nullable = false, length = 50)
    String email;

}
