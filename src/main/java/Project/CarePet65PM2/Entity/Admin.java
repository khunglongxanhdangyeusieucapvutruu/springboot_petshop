package Project.CarePet65PM2.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "admin") //ten bang trong database
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ad_id")  //ten truong trong database
    private int Id;
    @Column(name="ad_name")
    private String Name;
    @Column(name="personid")
    private String PersonId;
    @Column(name="gender")
    private boolean Gender;
    @Column(name="birthday")
    private LocalDate Birthday;
    @Column(name="password")
    private String Password;
    @Column(name="role")
    private int Role;
}
