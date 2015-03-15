CREATE TABLE campaign_acknowledgement (
  id              SERIAL,
  campaign_id     NUMERIC,
  user_id         NUMERIC,
  acknowledged_at DATETIME,
  ip_address      VARCHAR(255),
  created_at      DATETIME,

  PRIMARY KEY (id)
);