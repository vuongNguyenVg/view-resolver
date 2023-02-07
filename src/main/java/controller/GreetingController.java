package controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {

   @GetMapping("/greeting")
   public String showGreeting(Model model) {
      model.addAttribute("helloThymeleafViewResolverString", "Hello Thymeleaf View Resolver!");
      return "greeting";
   }
}