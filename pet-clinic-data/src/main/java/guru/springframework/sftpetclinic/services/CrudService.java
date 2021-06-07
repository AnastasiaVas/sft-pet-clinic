package guru.springframework.sftpetclinic.services;

import java.util.Set;

public interface CrudService<T, ID> {

    Set<T> findAll();

    Set<T> findAll(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
