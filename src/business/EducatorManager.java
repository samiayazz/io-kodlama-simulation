package business;

import dao.virtual.BaseEducatorDao;
import entity.Educator;

import java.util.List;

public class EducatorManager {
    private BaseEducatorDao educatorDao;

    public EducatorManager(BaseEducatorDao educatorDao) {
        this.educatorDao = educatorDao;
    }

    public List<Educator> get() {
        return educatorDao.get();
    }

    public void add(Educator educator) {
        educatorDao.add(educator);
    }

    public void update(int oldEducatorId, Educator newEducator) {
        educatorDao.update(oldEducatorId, newEducator);
    }

    public void delete(int id) {
        educatorDao.delete(id);
    }
}
