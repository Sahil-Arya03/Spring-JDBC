package org.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class App implements CommandLineRunner
{
    @Autowired
    private studentImple dao;
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
    @Override
    public void run (String... args)
    {   System.out.println("running the application");
        System.out.println("choose the operation\n"+"1.insert\n"+"2.update\n"+"3.delete\n"+"4.display");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice)
        {
            case 1:
                System.out.println("name");
                String name = sc.next();
                System.out.println("age");
                int age = sc.nextInt();
                System.out.println("email");
                String email = sc.next();
                Student student = new Student(name, age, email);
                System.out.println("inserting the values");
                dao.insert(student);
                break;
            case 2:
                System.out.println("enter the id");
                int id = sc.nextInt();
                System.out.println("enter the new values");
                Student student1 = new Student();
                student1.setName(sc.next());
                student1.setAge(sc.nextInt());
                student1.setEmail(sc.next());
                dao.update(student1,id);
                break;
            case 3:
                System.out.println("enter the id");
                int icd= sc.nextInt();
                dao.delete(icd);
                break;
            case 4:
                System.out.println("table display");
                dao.Display();
                break;
        }
    }
}
