package io.developer.contacts;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class ContactSyncherMain
{
    private static Logger logger = Logger.getLogger(ContactSyncherMain.class);

    public static void main( String[] args )
    {
        logger.info("Starting application : Contact-Sync");
        SpringApplication.run(ContactSyncherMain.class,args);
        logger.info("Application started : Contact-Sync");
    }

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Contact-Syncher is up and running!";
    }
}
