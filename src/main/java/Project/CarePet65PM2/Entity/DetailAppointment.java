package Project.CarePet65PM2.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "detail_appointment")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DetailAppointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="apm_id")
    private int AppointmentId;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="sv_id")
    private int ServiceId;
}
