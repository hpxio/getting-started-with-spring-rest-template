package com.app.rc.gettingStartedWithSpringRestTemplateClient.config;

import com.app.rc.gettingStartedWithSpringRestTemplateClient.GettingStartedWithSpringRestTemplateClientApplication;

import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;

@WebAppConfiguration
@ContextConfiguration(classes = GettingStartedWithSpringRestTemplateClientApplication.class, loader = SpringBootContextLoader.class)
public class SpringIntegrationTest {
}
