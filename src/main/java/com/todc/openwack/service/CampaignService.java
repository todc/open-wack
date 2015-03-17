package com.todc.openwack.service;


import com.todc.openwack.model.Campaign;

import java.util.List;


/**
 * @author Tim O'Donnell (tim@timodonnell.com)
 */
public interface CampaignService {

    public Campaign getCampaignById(Long campaignId);

    public List<Campaign> getUnacknowledgedCampaignsForUser(Long userId);

    public List<Campaign> getAcknowledgedCampaignsForUser(Long userId);

}
