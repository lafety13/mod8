package task1;

import java.util.List;

public interface  AbstractDAO <T> {
    T save(T a);
    void delete(T a);
    void deleteAll(List T);
    void saveAll(List T);
    List<T> getList();
}
