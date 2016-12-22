package task3;

import task2.AbstractDAO;
import java.util.ArrayList;
import java.util.List;

public class AbstractDAOImpl<T> implements AbstractDAO<T> {
    private List<T> list = new ArrayList<>();

    @Override
    public T save(T item) {
        list.add(item);
        return item;
    }

    @Override
    public void delete(T item) {
        list.remove(item);
    }

    @Override
    public void deleteAll(List<T> item) {
        list.removeAll(item);
    }

    @Override
    public void saveAll(List<T> item) {
        list.addAll(item);
    }

    @Override
    public List<T> getList() {
        return list;
    }

    @Override
    public void deleteByld(long id) {
        list.remove((int)id);
    }

    @Override
    public T get(long id) {
        return list.get((int) id);
    }
}
