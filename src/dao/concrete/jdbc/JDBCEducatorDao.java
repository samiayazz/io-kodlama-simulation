package dao.concrete.jdbc;

import dao.virtual.BaseEducatorDao;
import entity.Educator;

import java.util.ArrayList;
import java.util.List;

public class JDBCEducatorDao implements BaseEducatorDao {
    @Override
    public List<Educator> get() {
        //JDBC Operations
        return new ArrayList<Educator>();
    }

    @Override
    public void add(Educator educator) {
        //JDBC Operations
        String fullname = educator.getFirstName() + " " + educator.getLastName();
        System.out.println("JDBC: \"" + fullname + "\" adlı kullanıcı oluşturuldu!");
    }

    @Override
    public void update(int oldEducatorId, Educator newEducator) {
        //JDBC Operations
        String fullname = newEducator.getFirstName() + " " + newEducator.getLastName();
        System.out.println("JDBC: \"" + fullname + "\" adlı kullanıcı güncellendi!");
    }

    @Override
    public void delete(int id) {
        //JDBC Operations
        System.out.println("JDBC: Kullanıcı silindi!");
    }
}
