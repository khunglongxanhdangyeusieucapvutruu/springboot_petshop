package Project.CarePet65PM2.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "discount")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Discount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="dc_code")
    private int Code;
    @Column(name="dc_description")
    private String Description;
    @Column(name="dc_condition")
    private int Condition;
    @Column(name="dc_value")
    private int Value;
    @Column(name="dc_value_percent")
    private double ValuePrecent;
    @Column(name="dc_start_time")
    private LocalDate StartTime;
    @Column(name="dc_end_time")
    private LocalDate EndTime;

}
