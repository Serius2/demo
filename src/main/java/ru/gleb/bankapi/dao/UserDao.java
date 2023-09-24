package ru.gleb.bankapi.dao;

import org.springframework.stereotype.Component;
import ru.gleb.bankapi.model.User;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Component
public class UserDao {

    Map<String, User> repository = new HashMap<>();

    public User create(String firstName, String username, String password) {
        User user = new User();
        user.setId(UUID.randomUUID().toString());
        user.setUsername(username);
        user.setFirstName(firstName);
        user.setPassword(password);
        repository.put(user.getId(), user);
        return user;
    }

    public User findById(String id) {
        User user = repository.get(id);
        if (user != null) {
            return user;
        }
        throw new RuntimeException();
    }

}
