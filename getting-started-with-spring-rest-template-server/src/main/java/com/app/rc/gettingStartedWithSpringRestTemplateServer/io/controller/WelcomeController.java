package com.app.rc.gettingStartedWithSpringRestTemplateServer.io.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Default Controller
 */
@RestController
@RequestMapping("/")
public class WelcomeController {

  /**
   * Default Controller
   * @return Welcome message
   */
  @GetMapping
  public String defaultUrl() {
    return "welcome User";
  }
}
