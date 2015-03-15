package com.todc.openwack.model;


import javax.persistence.*;
import java.io.Serializable;


/**
 * @author Tim O'Donnell (tim@timodonnell.com)
 */
@Entity
@Table(name = "campaign_custom_field_value")
public class CampaignCustomFieldValue implements Serializable {


    // ----------------------------------------------------- Instance Variables


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ack_id")
    private CampaignAcknowledgement acknowledgement;

    @ManyToOne
    @JoinColumn(name = "field_id")
    private CampaignCustomField field;

    @Column(name = "field_value")
    private String value;


    // ------------------------------------------------------ Getters / Setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CampaignAcknowledgement getAcknowledgement() {
        return acknowledgement;
    }

    public void setAcknowledgement(CampaignAcknowledgement acknowledgement) {
        this.acknowledgement = acknowledgement;
    }

    public CampaignCustomField getField() {
        return field;
    }

    public void setField(CampaignCustomField field) {
        this.field = field;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
