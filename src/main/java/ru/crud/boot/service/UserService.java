package ru.crud.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.crud.boot.model.User;
import ru.crud.boot.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(long id) {
        return userRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    public void addUser(User user) {
        userRepository.save(user);
    }

    public void editUserById(long id, User updateUser) {
        updateUser.setId(id);
        userRepository.save(updateUser);
    }

    public void deleteUserById(long id) {
        userRepository.deleteById(id);
    }
}
