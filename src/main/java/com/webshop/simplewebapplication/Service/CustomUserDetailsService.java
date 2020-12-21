package com.webshop.simplewebapplication.Service;

import com.webshop.simplewebapplication.database.User.UserDAO;
import com.webshop.simplewebapplication.model.Usr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private UserDAO userDao;
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Usr usr = userDao.findByLogin(userName);
        if (usr == null) {
            throw new UsernameNotFoundException("Unknown user: "+userName);
        }
        UserDetails user = User.builder()
                .username(usr.getLogin())
                .password(usr.getPassword())
                .roles("USER")
                .build();
        return user;
    }
}