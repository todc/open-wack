CREATE TABLE user (
  id           SERIAL,
  username     VARCHAR(255),
  email        VARCHAR(255),
  fullname     VARCHAR(255),
  manager_id   NUMERIC,

  PRIMARY KEY (id)
);

CREATE INDEX indx_username ON user(username);