CREATE TABLE campaign_email (
  id                SERIAL,
  campaign_id       NUMERIC,
  subject           VARCHAR(255),
  from_address      VARCHAR(255),
  reply_to_address  VARCHAR(255),
  message_text      MEDIUMTEXT,
  message_html      MEDIUMTEXT,

  created_at        DATETIME,
  created_by        NUMERIC,
  updated_at        DATETIME,
  updated_by        NUMERIC,

  PRIMARY KEY (id)
);