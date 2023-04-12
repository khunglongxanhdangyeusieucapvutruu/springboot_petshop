package Project.CarePet65PM2.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "feedback")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="fb_id")
    private int Id;
    @Column(name="fb_content")
    private String Content;
    @Column(name="fb_time")
    private String Time;
    @Column(name="ctm_id")
    private String CustomerId;
}
