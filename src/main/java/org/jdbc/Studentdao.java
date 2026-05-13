package org.jdbc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Scanner;

@Repository
public class Studentdao
{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insert()
    {
        String sql = "insert into students (name, age, email) values (?, ?, ?)";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.nextLine();
        System.out.println("Enter age");
        int age = sc.nextInt();
        System.out.println("Enter email");
        String email = sc.nextLine();
         int result =jdbcTemplate.update(sql,name,age,email);
        System.out.println("rows affected"+result);
    }
}
