package com.todc.openwack.service;


import com.todc.openwack.model.User;
import org.springframework.stereotype.Service;


/**
 * @author Tim O'Donnell (tim@timodonnell.com)
 */
public interface UserService {

    public User getUserById(Long id);

    public User getUserByUsername(String username);

}
