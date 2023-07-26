package com.example.kci;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

  @RequestMapping("/kci")
  @ResponseBody
  public String index() {
    return "안녕하세요!!.";
  }
}
