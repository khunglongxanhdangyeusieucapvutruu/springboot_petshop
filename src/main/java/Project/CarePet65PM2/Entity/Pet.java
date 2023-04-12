package Project.CarePet65PM2.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "pet")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="pet_id")
    private int Id;
    @Column(name="pet_name")
    private String Name;
    @Column(name="pet_type")
    private int Type;
    @Column(name="pet_species")
    private String Species;
    @Column(name="pet_gender")
    private int  Gender;
    @Column(name="pet_note")
    private String Note;
    @Column(name="ctm_id")
    private int  CustomerId;
}
