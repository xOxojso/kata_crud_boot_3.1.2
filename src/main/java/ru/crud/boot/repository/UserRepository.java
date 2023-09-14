package ru.crud.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.crud.boot.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
