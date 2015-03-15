package com.todc.openwack.model;


import javax.persistence.*;
import java.io.Serializable;


/**
 * @author Tim O'Donnell (tim@timodonnell.com)
 */
@Entity
@Table(name = "campaign_custom_field")
public class CampaignCustomField implements Serializable {


    // ----------------------------------------------------- Instance Variables


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "campaign_id")
    private Campaign campaign;

    @Column(name = "label")
    private String label;

    @Column(name = "field_type")
    private int fieldType;

    @Column(name = "field_options")
    private String fieldOptions;

    @Column(name = "sort_order")
    private int sortOrder;


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

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getFieldType() {
        return fieldType;
    }

    public void setFieldType(int fieldType) {
        this.fieldType = fieldType;
    }

    public String getFieldOptions() {
        return fieldOptions;
    }

    public void setFieldOptions(String fieldOptions) {
        this.fieldOptions = fieldOptions;
    }

    public int getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(int sortOrder) {
        this.sortOrder = sortOrder;
    }
}
