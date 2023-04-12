package Project.CarePet65PM2.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "category_service")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CategoryService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name="cs_id")
    private int Id;
    @Column( name="cs_name")
    private String Name;
}
