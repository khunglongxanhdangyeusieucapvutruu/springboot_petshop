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
    @Column(name="ad_phone")
    private String Phone;
    @Column(name="ad_name")
    private String Name;
    @Column(name="ad_personid")
    private String PersonId;
    @Column(name="ad_gender")
    private boolean Gender;
    @Column(name="ad_birthday")
    private LocalDate Birthday;
    @Column(name="ad_password")
    private String Password;
    @Column(name="ad_role")
    private int Role;
}
