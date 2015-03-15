CREATE TABLE campaign_custom_field (
  id            SERIAL,
  campaign_id   NUMERIC,
  label         TEXT,
  field_type    TINYINT,
  field_options TEXT,
  sort_order    INT,

  PRIMARY KEY (id)
);