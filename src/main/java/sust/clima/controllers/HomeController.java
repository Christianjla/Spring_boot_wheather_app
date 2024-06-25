package sust.clima.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {

    @GetMapping("/")
  public String home(HttpSession session) {
    // 1. Revisamos que el usuario esté logueado para acceder a esta vista
    if (session.getAttribute("user") == null) {
      return "redirect:/login";
    }
    return "home.html";
  }
    
    

}
