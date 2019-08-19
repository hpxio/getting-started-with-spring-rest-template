package com.app.rc.gettingStartedWithSpringRestTemplateClient.ui.controller;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestTemplate;

class WelcomeControllerTest {

  private final RestTemplate restTemplate = new RestTemplate();

  @Test
  void defaultController() {
    final String result = restTemplate.getForObject("http://localhost:8085/", String.class);
    Assert.assertNotNull(result);
    Assert.assertEquals("Welcome User", result);
  }
}