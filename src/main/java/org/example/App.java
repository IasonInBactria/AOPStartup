package org.example;

import org.example.config.SpringConfig;
import org.example.mapper.BookMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContextExtensionsKt;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        System.out.println( "Hello World!" );
        BookMapper mapper = context.getBean(BookMapper.class);
        mapper.save();
    }
}
