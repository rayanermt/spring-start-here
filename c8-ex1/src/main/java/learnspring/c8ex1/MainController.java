package learnspring.c8ex1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @RequestMapping("/home")    // Assign HTTP request path.
    public String home(@RequestParam String color, Model page) {
        // Data the controller will send to the view.
        page.addAttribute("username", "Josh");
        page.addAttribute("userColor", color);

        return "home.html";
    }
}
