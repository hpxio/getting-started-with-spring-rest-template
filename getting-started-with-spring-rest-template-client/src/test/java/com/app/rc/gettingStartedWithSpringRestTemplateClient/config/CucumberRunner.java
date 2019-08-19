package com.app.rc.gettingStartedWithSpringRestTemplateClient.config;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", glue = "com.app.rc.gettingStartedWithSpringRestTemplateClient.stepDefs")
public class CucumberRunner {
}
