package com.app.rc.gettingStartedWithSpringRestTemplateClient.stepDefs;

import com.app.rc.gettingStartedWithSpringRestTemplateClient.config.SpringIntegrationTest;

import org.junit.Assert;
import org.springframework.web.client.RestTemplate;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lombok.extern.slf4j.Slf4j;

import static org.hamcrest.CoreMatchers.is;

@Slf4j
public class WelcomeStepDefs extends SpringIntegrationTest {

  private String result;
  private RestTemplate restTemplate;

  @When("^the client calls default uri$")
  public void theClientCalls() {
    result = restTemplate.getForObject("http://localhost:8085/", String.class);
    Assert.assertNotNull(result);
    log.info("Result -> {}", result);
  }

  @Then("^the client receives status code of (\\d+)$")
  public void theClientReceivesStatusCodeOf(int arg0) {
  }

  @And("^the client receives message (.+)$")
  public void theClientReceivesMessageWelcomeUser() {
    log.info("Result -> {}", result);
    Assert.assertEquals("welcome User", result);
  }
}
