package Project.CarePet65PM2.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "customer")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name="ctm_id")
    private int Id;
    @Column( name="ctm_name")
    private String Name;
    @Column( name="ctm_phone")
    private String Phone;
    @Column( name="ctm_email")
    private String Email;
    @Column( name="ctm_address")
    private String AddRess;
    @Column( name="ctm_password")
    private String Password;
    @Column( name="ctm_gender")
    private int Gender;
    @Column( name="ctm_can_feedback")
    private int CanFeedback;

}
