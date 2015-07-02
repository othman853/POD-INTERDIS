package br.edu.qi.pod.interdis.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("br.edu.qi.pod.interdis")
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class);
    }

}
