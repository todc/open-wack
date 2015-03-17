package com.todc.openwack.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;


/**
 * @author Tim O'Donnell (tim@timodonnell.com)
 */
@Entity
@Table(name = "campaign_acknowledgements")
public class CampaignAcknowledgement implements Serializable {


    // ----------------------------------------------------- Instance Variables


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "campaign_id")
    private Campaign campaign;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "acknowledged_at")
    private Date acknowledgedAt;

    @Column(name = "ip_address")
    private String ipAddress;

    @OneToMany(mappedBy = "acknowledgement")
    private List<CampaignCustomFieldValue> customFieldValues;

    @Column(name = "created_at")
    private Date createdAt;


    // ------------------------------------------------------ Getters / Setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Campaign getCampaign() {
        return campaign;
    }

    public void setCampaign(Campaign campaign) {
        this.campaign = campaign;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getAcknowledgedAt() {
        return acknowledgedAt;
    }

    public void setAcknowledgedAt(Date acknowledgedAt) {
        this.acknowledgedAt = acknowledgedAt;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public List<CampaignCustomFieldValue> getCustomFieldValues() {
        return customFieldValues;
    }

    public void setCustomFieldValues(List<CampaignCustomFieldValue> customFieldValues) {
        this.customFieldValues = customFieldValues;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
