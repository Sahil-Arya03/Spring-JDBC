package org.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Spring jdbc program");
        ApplicationContext conn = new ClassPathXmlApplicationContext("config.xml");
        JdbcTemplate jdbcTemplate = conn.getBean("jdbcTemplate",JdbcTemplate.class);
        String sql = "INSERT INTO students(name, age, email) VALUES (?,?,?);";
        int result = jdbcTemplate.update(sql,"aarit",34,"aarit34945@gmail.com");
        System.out.println("number of rows affected: "+result+" ");
    }
}
