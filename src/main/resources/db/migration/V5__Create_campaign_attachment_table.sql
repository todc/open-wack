CREATE TABLE campaign_attachment (
  id                SERIAL,
  campaign_id       NUMERIC,
  filename          VARCHAR(255),
  filesize          NUMERIC,
  filetype          VARCHAR(255),

  created_at        DATETIME,
  created_by        NUMERIC,

  PRIMARY KEY (id)
);