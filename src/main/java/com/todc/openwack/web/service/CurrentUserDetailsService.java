package com.todc.openwack.web.service;


import com.todc.openwack.model.User;
import com.todc.openwack.service.UserService;
import com.todc.openwack.web.model.CurrentUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class CurrentUserDetailsService implements UserDetailsService {


    // ----------------------------------------------------- Instance Variables


    private final UserService userService;


    // ----------------------------------------------------------- Constructors


    @Autowired
    public CurrentUserDetailsService(UserService userService) {
        this.userService = userService;
    }


    // --------------------------------------------------------- Public Methods


    @Override
    public CurrentUser loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userService.getUserByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException(String.format("User with username=%s was not found", username));
        }

        return new CurrentUser(user);
    }
}
