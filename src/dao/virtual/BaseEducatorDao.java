package dao.virtual;

import entity.Educator;

import java.util.List;

public interface BaseEducatorDao {
    List<Educator> get();

    void create();

    void update();

    void delete();
}
