package Project.CarePet65PM2.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "category_news")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CategoryNews {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name="cn_id")
    private int Id;
    @Column( name ="cn_name")
    private String Name;
}
