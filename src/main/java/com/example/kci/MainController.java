package com.example.kci;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

  @RequestMapping("/kci")
  public void index() {
    System.out.println("index");
  }
}
