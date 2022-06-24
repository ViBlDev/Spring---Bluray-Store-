package com.mycompany.bluraystore;

import com.mycompany.bluraystore.controller.MovieController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SpringBootApplication
@ImportResource("classpath:applicationContext.xml") // au cas ou, pour le moment ça ne sert pas
public class App
{
    public static void main( String[] args )
    {

        ApplicationContext context = SpringApplication.run(App.class,args);

        MovieController controller = context.getBean(MovieController.class);

        controller.add();

    }
}
