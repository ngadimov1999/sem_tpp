package com.webshop.simplewebapplication.database.User;

import com.webshop.simplewebapplication.model.Usr;
import org.springframework.stereotype.Service;

@Service
public class UserDAOHib implements UserDAO {

    @Override
    public Usr findByLogin(String login) {
        //TODO: вернуть юзера из бд
        return new Usr(1, "nabi", "123456");
    }
}