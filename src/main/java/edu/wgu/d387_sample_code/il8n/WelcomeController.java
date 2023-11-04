package edu.wgu.d387_sample_code.il8n;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
@RequestMapping("/api")
public class WelcomeController {

    @Autowired
    private DisplayMessage displayMessage; // Autowire the DisplayMessage class


    @GetMapping("/welcome-messageUS")
    public String getWelcomeMessageUS(Locale locale) {
        locale = Locale.US;
        String welcomeMessage = displayMessage.getWelcomeMessage(locale); // Get the welcome message using DisplayMessage
        return welcomeMessage;
    }

    @GetMapping("/welcome-messageFr")
    public String getWelcomeMessageFr(Locale locale) {
        locale = Locale.CANADA_FRENCH;
        String welcomeMessage = displayMessage.getWelcomeMessage(locale); // Get the welcome message using DisplayMessage
        return welcomeMessage;
    }
}