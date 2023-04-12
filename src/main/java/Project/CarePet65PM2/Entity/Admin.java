package Project.CarePet65PM2.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "admin") //ten bang trong database
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Admin {
    @Id
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
