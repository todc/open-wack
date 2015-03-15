CREATE TABLE user_group (
  id          SERIAL,
  name        VARCHAR(255),
  user_count  NUMERIC,

  PRIMARY KEY (id)
);

CREATE TABLE user2user_group (
  group_id   NUMERIC,
  user_id    NUMERIC,

  PRIMARY KEY (group_id, user_id)
);