package ua.ithillel.lms.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {

  @GetMapping("/")
  public String welcome(Model model) {
    model.addAttribute("current_year", LocalDateTime.now().getYear());
    return "welcome";
  }

  @GetMapping("/info")
  public String info(Model model) {
    model.addAttribute("current_year", LocalDateTime.now().getYear());
    model.addAttribute("current_milliseconds", System.currentTimeMillis());
    return "info";
  }
}
