package task2;
import java.util.List;

public interface AbstractDAO <T> {
    T save(T item);
    void delete(T item);
    void deleteAll(List<T> item);
    void saveAll(List<T> item);
    List<T> getList();
    void deleteByld(long id);
    T get(long id);
}
