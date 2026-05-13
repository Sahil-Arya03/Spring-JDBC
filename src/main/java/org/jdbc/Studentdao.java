package org.jdbc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class Studentdao
{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insert()
    {
        String sql = "insert into students (name, age, email) values (?, ?, ?)";
         int result =jdbcTemplate.update(sql,"aarit",23,"Aaarit738@gmail.com");
        System.out.println("rows affected"+result);
    }
}
