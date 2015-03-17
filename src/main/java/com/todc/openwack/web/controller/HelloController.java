package com.todc.openwack.web.controller;


import com.todc.openwack.model.Campaign;
import com.todc.openwack.service.CampaignService;
import com.todc.openwack.web.model.CurrentUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author Tim O'Donnell (tim@timodonnell.com)
 */
@RestController
public class HelloController {

    @Autowired
    private CampaignService campaignService;

    @RequestMapping("/")
    public ModelAndView index(Authentication authentication) {
        CurrentUser currentUser = (CurrentUser)authentication.getPrincipal();

        List<Campaign> acknowledged = campaignService.getAcknowledgedCampaignsForUser(currentUser.getId());
        List<Campaign> unacknowledged = campaignService.getUnacknowledgedCampaignsForUser(currentUser.getId());

        Map<String,Object> model = new HashMap<String, Object>();
        model.put("acknowledged", acknowledged);
        model.put("unacknowledged", unacknowledged);

        return new ModelAndView("home", model);
    }

    @RequestMapping("/home")
    public ModelAndView home() {
        return new ModelAndView("home");
    }

}
