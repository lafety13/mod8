package task4;

import task3.AbstractDAOImpl;

import java.util.List;

public class UserDAO<T> extends AbstractDAOImpl<T> {
    @Override
    public T save(T item) {
        return super.save(item);
    }

    @Override
    public void delete(T item) {
        super.delete(item);
    }

    @Override
    public void deleteAll(List<T> item) {
        super.deleteAll(item);
    }

    @Override
    public void saveAll(List<T> item) {
        super.saveAll(item);
    }

    @Override
    public List<T> getList() {
        return super.getList();
    }

    @Override
    public void deleteByld(long id) {
        super.deleteByld(id);
    }

    @Override
    public T get(long id) {
        return super.get(id);
    }
}
