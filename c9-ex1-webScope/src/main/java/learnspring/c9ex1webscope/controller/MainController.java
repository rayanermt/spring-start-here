/*
    Redirects the user to the Main page.
 */
package learnspring.c9ex1webscope.controller;

import learnspring.c9ex1webscope.services.LoggedUserManagementService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    /*
        How do I know a user is logged in?
            - By knowing if the user is already in the session scoped bean.
            - That is, by using LoggedUserManagementService.
     */

    private final LoggedUserManagementService loggedUserManagementService;

    public MainController(LoggedUserManagementService loggedUserManagementService) {
        this.loggedUserManagementService = loggedUserManagementService;
    }

    @GetMapping("/main")
    public String welcome(@RequestParam(required = false) String logout,
                          Model model) {

//        Handle logout action.
        if (logout != null) {
            loggedUserManagementService.setUsername(null);
        }

//        Show curstom username.
        String username = loggedUserManagementService.getUsername();

        if (username != null) {
            model.addAttribute("username", username);
            return "welcome";
        }

        return "redirect:/";
    }
}
