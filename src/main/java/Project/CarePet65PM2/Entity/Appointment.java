package Project.CarePet65PM2.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "appointment") //ten bang trong database
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="apm_id")  //ten truong trong database
    private int Id;
    @Column( name ="apm_time")
    private LocalDate Time;
    @Column( name="apm_status")
    private  int Status;
    @Column( name ="ctm_id")
    private int CustomerId;
}
