package paw.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Table(name="user_roles")
@ToString
@EqualsAndHashCode
public class Role implements Serializable {

    @Id
    @Column(name="login")
    String login;

    @Column(name="role")
    String role;
}
