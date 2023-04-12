package Project.CarePet65PM2.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "detail_bill")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DetailBill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="bill_id")
    private int BillId;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="sv_id")
    private int ServiceId;
    @Column(name="quantity")
    private int Quantity;
    @Column(name="pet_id")
    private int PetId;
    @Column(name="sv_price")
    private int Price;

}
