package Project.CarePet65PM2.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "detail_service")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DetailService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="sv_id")
    private int ServiceId;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="mtr_id")
    private int MaterialId;
    @Column(name="quantity")
    private int Quantity;
}
