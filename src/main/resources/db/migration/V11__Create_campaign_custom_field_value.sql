CREATE TABLE campaign_custom_field_value (
  id            SERIAL,
  ack_id        NUMERIC,
  field_id      NUMERIC,
  field_value   TEXT,

  PRIMARY KEY (id)
);