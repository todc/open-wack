package com.todc.openwack.service;


import com.todc.openwack.model.User;
import com.todc.openwack.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author Tim O'Donnell (tim@timodonnell.com)
 */
@Service
public class UserServiceImpl implements UserService {


    // ----------------------------------------------------- Instance Variables


    private final UserRepository userRepository;


    // ----------------------------------------------------------- Constructors


    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    // --------------------------------------------------------- Public Methods


    @Override
    public User getUserByid(Long id) {
        return userRepository.findOne(id);
    }

    @Override
    public User getUserByUsername(String username) {
        return userRepository.findOneByUsername(username);
    }
}
