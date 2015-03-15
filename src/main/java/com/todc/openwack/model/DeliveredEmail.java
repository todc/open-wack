package com.todc.openwack.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * @author Tim O'Donnell (tim@timodonnell.com)
 */
@Entity
@Table(name = "campaign_email_delivery")
public class DeliveredEmail implements Serializable {


    // ----------------------------------------------------- Instance Variables


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "email_id")
    private CampaignEmail email;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User recipient;

    @Column(name = "delivered_at")
    private Date deliveredAt;


    // ------------------------------------------------------ Getters / Setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CampaignEmail getEmail() {
        return email;
    }

    public void setEmail(CampaignEmail email) {
        this.email = email;
    }

    public User getRecipient() {
        return recipient;
    }

    public void setRecipient(User recipient) {
        this.recipient = recipient;
    }

    public Date getDeliveredAt() {
        return deliveredAt;
    }

    public void setDeliveredAt(Date deliveredAt) {
        this.deliveredAt = deliveredAt;
    }
}
