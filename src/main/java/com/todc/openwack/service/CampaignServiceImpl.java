package com.todc.openwack.service;


import com.todc.openwack.model.Campaign;
import com.todc.openwack.repository.CampaignRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;


/**
 * @author Tim O'Donnell (tim@timodonnell.com)
 */
@Service
public class CampaignServiceImpl implements CampaignService {


    // ----------------------------------------------------- Instance Variables


    private final CampaignRepository campaignRepository;

    private final EntityManager em;


    // ----------------------------------------------------------- Constructors


    @Autowired
    public CampaignServiceImpl(CampaignRepository campaignRepository, EntityManager em) {
        this.campaignRepository = campaignRepository;
        this.em = em;
    }


    // --------------------------------------------------------- Public Methods


    @Override
    public Campaign getCampaignById(Long id) {
        return campaignRepository.findOne(id);
    }

    @Override
    public List<Campaign> getUnacknowledgedCampaignsForUser(Long userId) {
        Query query = em.createQuery("SELECT c FROM Campaign c JOIN c.acknowledgements a where a.user.id = :userId AND a.acknowledgedAt is null");
        query.setParameter("userId", userId);
        return query.getResultList();
    }

    @Override
    public List<Campaign> getAcknowledgedCampaignsForUser(Long userId) {
        Query query = em.createQuery("SELECT c FROM Campaign c JOIN c.acknowledgements a where a.user.id = :userId AND a.acknowledgedAt is not null");
        query.setParameter("userId", userId);
        return query.getResultList();
    }

}
