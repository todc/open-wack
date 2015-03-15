CREATE TABLE campaign_owner (
  campaign_id   NUMERIC,
  user_id       NUMERIC,

  PRIMARY KEY (campaign_id, user_id)
);