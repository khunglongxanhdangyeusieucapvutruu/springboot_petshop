package Project.CarePet65PM2.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "news")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="news_id")
    private int Id;
    @Column(name="news_title")
    private String Title;
    @Column(name="news_description")
    private String Description;
    @Column(name="news_content")
    private String Content;
    @Column(name="news_img")
    private String  Img;
    @Column(name="news_date_relese")
    private LocalDate DateRelese;
    @Column(name="ad_id")
    private int AdminId;
    @Column(name="cn_id")
    private int  CategoryNewsId;



}
