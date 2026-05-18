package org.jdbc;

import org.springframework.stereotype.Repository;

@Repository
public class studentImple extends Studentdao {
    @Override
    public void insert(Student student) {
        super.insert(student);
    }
    @Override
    public void Display() {
        super.Display();
    }
    @Override
    public void delete(int id) {
        super.delete(id);
    }
    @Override
    public void update(Student st, int id) {
        super.update(st, id);
    }
}
