
package corejavaexam;

import java.util.List;

public interface TestInterface <E>{
    void save(E e);
    List<E>FindAll();
    void update(E e);
    E findBY(int id);
    void delete(int id);
}
