CREATE TABLE campaign_email_delivery (
  id             SERIAL,
  email_id       NUMERIC,
  user_id        NUMERIC,
  delivered_at   DATETIME,

  PRIMARY KEY (id)
);