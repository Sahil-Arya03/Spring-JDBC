package org.jdbc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class Studentdao
{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insert(Student student)
    {
        String sql = "insert into students (name, age, email) values (?, ?, ?)";
        int result = jdbcTemplate.update(sql, student.getName(), student.getAge(), student.getEmail());
        System.out.println("rows affected"+result);
    }
    public void delete ( int id)
    {
        String Sql= "delete from students where id = ?";
        int result = jdbcTemplate.update(Sql,id);
        System.out.println("rows affected"+result);
    }
    public void update(Student st,int id)
    {
        String Sql="UPDATE students (name,age,email) values(?,?,?)  WHERE id = ?;";
        int result = jdbcTemplate.update(Sql,st.getName(),st.getAge(),st.getEmail(),id);
        System.out.println("rows affected"+result);
    }
}
