package com.todc.openwack.repository;


import com.todc.openwack.model.Campaign;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * @author Tim O'Donnell (tim@timodonnell.com)
 */
public interface CampaignRepository extends JpaRepository<Campaign, Long> {

}
