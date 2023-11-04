package edu.wgu.d387_sample_code.il8n;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZonedDateTime;

@RestController
@RequestMapping("/api")
public class TimeConversionController {
    private TimeConversion timeConversion;

    @Autowired
    public TimeConversionController(TimeConversion timeConversion) {
        this.timeConversion = timeConversion;
    }

    @GetMapping("/TimeZone")
    public String getTimeZoneConversion() {
        String timeConversion1 = timeConversion.getTimeConversion();
        return timeConversion1;
    }
}
