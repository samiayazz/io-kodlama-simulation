package dao.concrete.hibernate;

import dao.virtual.BaseEducatorDao;
import entity.Educator;

import java.util.ArrayList;
import java.util.List;

public class HibernateEducatorDao implements BaseEducatorDao {
    @Override
    public List<Educator> get() {
        //Hibernate Operations
        return new ArrayList<Educator>();
    }

    @Override
    public void add(Educator educator) {
        //Hibernate Operations
        String fullname = educator.getFirstName() + " " + educator.getLastName();
        System.out.println("Hibernate: \"" + fullname + "\" adlı kullanıcı oluşturuldu!");
    }

    @Override
    public void update(int oldEducatorId, Educator newEducator) {
        //Hibernate Operations
        String fullname = newEducator.getFirstName() + " " + newEducator.getLastName();
        System.out.println("Hibernate: \"" + fullname + "\" adlı kullanıcı güncellendi!");
    }

    @Override
    public void delete(int id) {
        //Hibernate Operations
        System.out.println("Hibernate: Kullanıcı silindi!");
    }
}
