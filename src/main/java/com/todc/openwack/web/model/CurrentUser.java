package com.todc.openwack.web.model;


import com.todc.openwack.model.User;
import org.springframework.security.core.authority.AuthorityUtils;


/**
 * @author Tim O'Donnell (tim@timodonnell.com)
 */
public class CurrentUser extends org.springframework.security.core.userdetails.User {

    private User user;

    public CurrentUser(User user) {
        super(user.getUsername(), user.getPasswordHash(), AuthorityUtils.createAuthorityList("USER"));
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public Long getId() {
        return user.getId();
    }

}
