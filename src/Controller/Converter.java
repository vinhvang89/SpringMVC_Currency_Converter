package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Converter {
    @GetMapping("/convert")
    public String converter(@RequestParam double money, Model model){
        double kq = money*23000;
        model.addAttribute("kq",kq);
        return "result";
    }

}
