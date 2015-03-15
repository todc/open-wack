package com.todc.openwack.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


/**
 * @author Tim O'Donnell (tim@timodonnell.com)
 */
@Entity
@Table(name = "user_group")
public class UserGroup implements Serializable {


    // ----------------------------------------------------- Instance Variables


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "user_count")
    private long userCount;

    @ManyToMany(mappedBy = "groups")
    private List<User> users;


    // ------------------------------------------------------ Getters / Setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getUserCount() {
        return userCount;
    }

    public void setUserCount(long userCount) {
        this.userCount = userCount;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
