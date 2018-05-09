package org.apache.servicecomb.samples.boot.simple;

import org.apache.servicecomb.springboot.starter.provider.EnableServiceComb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableServiceComb
public class Application {
    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
