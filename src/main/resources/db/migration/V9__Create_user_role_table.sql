CREATE TABLE user_role (
  id     SERIAL,
  name   VARCHAR(255),

  PRIMARY KEY (id)
);

CREATE TABLE user2user_role (
  user_id   NUMERIC,
  role_id   NUMERIC,

  PRIMARY KEY (role_id, user_id)
);