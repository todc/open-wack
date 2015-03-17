INSERT INTO user VALUES (1, 'admin', '$2a$10$yC8jHjXIFXp6lh1K9ksfZuwTV4e9EUEBq8ZLOO/b.aaMB.88rf/E6', 'admin@example.com', 'Admin User', null);

INSERT INTO user_role VALUES (1, 'ADMIN');
INSERT INTO user_role VALUES (2, 'STAFF');

INSERT INTO user2user_role VALUES (1, 1);

INSERT INTO campaign VALUES (1, 'Test Campaign 1', 0, null, null, NOW(), 1);
INSERT INTO campaign VALUES (2, 'Test Campaign 2', 0, null, null, NOW(), 1);
INSERT INTO campaign VALUES (3, 'Test Campaign 3', 0, null, null, NOW(), 1);

INSERT INTO campaign_acknowledgements VALUES (1, 1, 1, null, null, NOW());
INSERT INTO campaign_acknowledgements VALUES (2, 2, 1, NOW(), '10.0.0.1', NOW());
INSERT INTO campaign_acknowledgements VALUES (3, 3, 1, null, null, NOW());