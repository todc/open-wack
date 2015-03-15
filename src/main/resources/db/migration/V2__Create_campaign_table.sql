CREATE TABLE campaign (
  id              SERIAL,
  name            VARCHAR(255),
  send_ack_email  TINYINT,
  ack_email_recip VARCHAR(255),
  ack_page_html   MEDIUMTEXT,

  created_at      DATETIME,
  created_by      NUMERIC,

  PRIMARY KEY (id)
);