package ru.gleb.bankapi.service;

import ru.gleb.bankapi.model.User;

public class UserService {
    public User createUser(String name, String password) {

        User client = new User();
        client.setFirstname(name);
        client.setPassword(password);
        return client;
    }
}

