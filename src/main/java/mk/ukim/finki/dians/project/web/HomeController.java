package mk.ukim.finki.dians.project.web;

import mk.ukim.finki.dians.project.service.AmenityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.stream.Collectors;

@Controller
@RequestMapping("/home")
public class HomeController {
    private final AmenityService amenityService;

    public HomeController(AmenityService amenityService) {
        this.amenityService = amenityService;
    }

    @GetMapping
    public String getHomePage(Model model){
        model.addAttribute("places", this.amenityService.listAll());
        model.addAttribute("banks", this.amenityService.findByType("Bank"));
        model.addAttribute("atms", this.amenityService.findByType("ATM"));
        return "main";
    }

    @PostMapping("/filter")
    public String getFilter(@RequestParam String bankChoice,
                            @RequestParam String type) {

        /*todo
        */

        return "redirect:/home";
    }
}
