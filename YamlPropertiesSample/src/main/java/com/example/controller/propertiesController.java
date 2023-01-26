package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.config.YamlPropertiesConfig;

@Controller
public class propertiesController {
  
  @Autowired
  private YamlPropertiesConfig yamlPropertiesConfig;
  
  @GetMapping("/properties")
  public String getPropertiesPage(Model model) {
    model.addAttribute("yamlPropertiesConfig", yamlPropertiesConfig);
    return "/propertiesPage";
  }
}
