package com.todc.openwack.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


/**
 * @author Tim O'Donnell (tim@timodonnell.com)
 */
@Entity
@Table(name = "user")
public class User implements Serializable {


    // ----------------------------------------------------- Instance Variables


    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column(name = "username", unique = true, nullable = false)
    private String username;

    @Column(name = "password_hash")
    private String passwordHash;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "fullname")
    private String fullname;

    @ManyToOne
    @JoinColumn(name = "manager_id")
    private User manager;

    @ManyToMany
    @JoinTable(
        name = "campaign_owner",
        joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "id")},
        inverseJoinColumns = {@JoinColumn(name = "campaign_id", referencedColumnName = "id")}
    )
    private List<Campaign> ownedCampaigns;

    @ManyToMany
    @JoinTable(
        name = "user2user_group",
        joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "id")},
        inverseJoinColumns = {@JoinColumn(name = "group_id", referencedColumnName = "id")}
    )
    private List<UserGroup> groups;

    @ManyToMany
    @JoinTable(
        name = "user2user_group",
        joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "id")},
        inverseJoinColumns = {@JoinColumn(name = "group_id", referencedColumnName = "id")}
    )
    private List<UserPrivilege> privileges;


    // ------------------------------------------------------ Getters / Setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public User getManager() {
        return manager;
    }

    public void setManager(User manager) {
        this.manager = manager;
    }

    public List<Campaign> getOwnedCampaigns() {
        return ownedCampaigns;
    }

    public void setOwnedCampaigns(List<Campaign> ownedCampaigns) {
        this.ownedCampaigns = ownedCampaigns;
    }

    public List<UserGroup> getGroups() {
        return groups;
    }

    public void setGroups(List<UserGroup> groups) {
        this.groups = groups;
    }

    public List<UserPrivilege> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(List<UserPrivilege> privileges) {
        this.privileges = privileges;
    }


    // --------------------------------------------------------- Public Methods

}
