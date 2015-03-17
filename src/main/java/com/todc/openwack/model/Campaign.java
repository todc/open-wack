package com.todc.openwack.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;


/**
 * @author Tim O'Donnell (tim@timodonnell.com)
 */
@Entity
@Table(name = "campaign")
public class Campaign implements Serializable {


    // ----------------------------------------------------- Instance Variables


    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToMany(mappedBy = "ownedCampaigns")
    private List<User> owners;

    @OneToMany(mappedBy = "campaign")
    private List<CampaignAcknowledgement> acknowledgements;

    @Column(name = "send_ack_email")
    private boolean ackReceiptsEnabled;

    @Column(name = "ack_email_recip")
    private String ackReceiptRecipients;

    @Column(name = "ack_page_html")
    private String ackPageHtml;

    @Column(name = "created_at")
    private Date createdAt;

    @ManyToOne
    @JoinColumn(name = "created_by")
    private User createdBy;


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

    public List<User> getOwners() {
        return owners;
    }

    public void setOwners(List<User> owners) {
        this.owners = owners;
    }

    public List<CampaignAcknowledgement> getAcknowledgements() {
        return acknowledgements;
    }

    public void setAcknowledgements(List<CampaignAcknowledgement> acknowledgements) {
        this.acknowledgements = acknowledgements;
    }

    public boolean isAckReceiptsEnabled() {
        return ackReceiptsEnabled;
    }

    public void setAckReceiptsEnabled(boolean ackReceiptsEnabled) {
        this.ackReceiptsEnabled = ackReceiptsEnabled;
    }

    public String getAckReceiptRecipients() {
        return ackReceiptRecipients;
    }

    public void setAckReceiptRecipients(String ackReceiptRecipients) {
        this.ackReceiptRecipients = ackReceiptRecipients;
    }

    public String getAckPageHtml() {
        return ackPageHtml;
    }

    public void setAckPageHtml(String ackPageHtml) {
        this.ackPageHtml = ackPageHtml;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }
}
