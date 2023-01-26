package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * メインコントローラー
 * 
 * @author yukishi
 *
 */
@Controller
public class mainController {
  @GetMapping("/")
  public String getRoot() {
    return "index";
  }
}
