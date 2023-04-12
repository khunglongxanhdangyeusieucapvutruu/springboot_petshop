package Project.CarePet65PM2.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "shop_info")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Shop {
   @Column(name="shop_name")
    private String Name;
    @Column(name="address")
    private String Address;
    @Column(name="shop_phone")
    private String Phone;
    @Column(name="shop_description")
    private String Description;
    @Column(name="shop_facebook")
    private String Facebook;
    @Column(name="shop_website")
    private String Website;
    @Column(name="shop_banner")
    private String Banner;
    @Column(name="shop_logo")
    private String Logo;
}
