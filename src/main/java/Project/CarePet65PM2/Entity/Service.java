package Project.CarePet65PM2.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "service")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="sv_id")
    private int Id;
    @Column(name="sv_name")
    private String Name;
    @Column(name="sv_price")
    private double Price;
    @Column(name="sv_description")
    private String Description;
    @Column(name="sv_pet")
    private int Pet;
    @Column(name="cs_id")
    private int CustomerId;

}
