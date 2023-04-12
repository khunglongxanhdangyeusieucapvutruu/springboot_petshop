package Project.CarePet65PM2.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "bill") //ten bang trong database
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "bill_id")  //ten truong trong database
    private int Id;
    @Column( name="bill_date_release")
    private LocalDate DateRelease;
    @Column(name="ctm_id")
    private int CustomerId;
    @Column( name="ad_id")
    private int AdminId;
    @Column( name="dc_code")
    private String DiscountCode;
}

