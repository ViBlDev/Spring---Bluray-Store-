package com.mycompany.bluraystore;

import com.mycompany.bluraystore.controller.MovieController;
import com.mycompany.bluraystore.repository.FileMovieRepository;
import com.mycompany.bluraystore.service.DefaultMovieService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App
{
    public static void main( String[] args )
    {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MovieController controller = context.getBean(MovieController.class);

        controller.add();

    }
}
