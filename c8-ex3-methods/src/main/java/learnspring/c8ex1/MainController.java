package learnspring.c8ex1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @RequestMapping("/home/{category}")
    public String home(@PathVariable String category, Model page) {
        page.addAttribute("username", "Rayane");
        page.addAttribute("category", category);
        return "home.html";
    }
}
