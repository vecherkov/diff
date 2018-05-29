INSERT INTO users (username, password, enabled) VALUES ('admin', '{noop}admin', true);
INSERT INTO users (username, password, enabled) VALUES ('artem', '{noop}artem', true);
INSERT INTO authorities (username, authority) VALUES ('admin', 'administrator');
INSERT INTO authorities (username, authority) VALUES ('artem', 'administrator');