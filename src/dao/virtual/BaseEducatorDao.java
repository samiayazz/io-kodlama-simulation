package dao.virtual;

import entity.Educator;

import java.util.List;

public interface BaseEducatorDao {
    List<Educator> get();

    void create(Educator educator);

    void update(int oldEducatorId, Educator newEducator);

    void delete(int id);
}
