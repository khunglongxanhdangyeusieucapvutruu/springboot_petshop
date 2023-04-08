package Project.CarePet65PM2.Controller;


import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test {

    @GetMapping("/")
    public String index(Model model){
        String ten = null;
        String tuoi = null;
        model.addAttribute("",ten);
        model.addAttribute("",tuoi);
        return "index";
    }

//    @GetMapping("/click")
//    public String index2(@Param("key") String key, Model model){
//        //System.out.println(key);
//        return "index2";
//    }

    @PostMapping("/click")
    public String index21(@ModelAttribute("ten") String ten1, @ModelAttribute("tuoi") String tuoi, Model model){
        model.addAttribute("ten",ten1);
        model.addAttribute("tuoi",tuoi);
        return "index2";
    }




}
