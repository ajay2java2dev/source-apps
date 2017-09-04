package io.secure.appengine.springsecurity.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource({"classpath*:webSecurityConfig.xml"})
public class ClientSecurityConfig {
    public ClientSecurityConfig() {
        super();
    }
}
