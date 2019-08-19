package com.app.rc.gettingStartedWithSpringRestTemplateServer.io.controller;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestTemplate;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class WelcomeControllerTest {

  private final RestTemplate restTemplate = new RestTemplate();

  @Test
  void defaultUrl() {
    final String result = restTemplate.getForObject("http://localhost:8087/", String.class);
    assertNotNull(result);
    assertEquals("welcome User", result);
  }
}