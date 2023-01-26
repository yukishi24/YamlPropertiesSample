package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class propertiesController {
  @GetMapping("/properties")
  public String getPropertiesPage() {
    return "/propertiesPage";
  }
}
