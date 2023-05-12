package ro.pao.repository;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface Repository <T> {

    Optional<T> getObjectById(UUID id) throws SQLException;

    void deleteObjectById(UUID id);

    void updateObjectById(UUID id, T newObject);

    void addNewObject(T object) throws SQLException;

    List<T> getAll();

    void addAllFromGivenList(List<T> objectList) throws SQLException;
    
}