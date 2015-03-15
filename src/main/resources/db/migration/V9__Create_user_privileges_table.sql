CREATE TABLE user_privilege (
  id          SERIAL,
  name        VARCHAR(255),

  PRIMARY KEY (id)
);

CREATE TABLE user2user_privilege (
  privilege_id   NUMERIC,
  user_id        NUMERIC,

  PRIMARY KEY (privilege_id, user_id)
);