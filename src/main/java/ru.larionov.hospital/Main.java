package ru.larionov.hospital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ru.larionov.hospital.service.DemoService;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Main.class,args);
        DemoService demoService = context.getBean("demoService", DemoService.class);
        demoService.run();
    }
}
