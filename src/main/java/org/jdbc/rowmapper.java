package org.jdbc;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class rowmapper implements RowMapper<Student> {
    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student s = new Student();
        s.setName(rs.getString("name"));
        s.setAge(rs.getInt("age"));
        s.setEmail(rs.getString("email"));
        System.out.println(s);
        return s;
    }
}
