CREATE TABLE users (
	username VARCHAR(50) NOT NULL,
 	password VARCHAR(50) NOT NULL,
 	enabled BOOLEAN NOT NULL DEFAULT false,
 	PRIMARY KEY (username)
);
CREATE TABLE authorities (
	username VARCHAR(50) NOT NULL,
 	authority VARCHAR(50) NOT NULL,
 	PRIMARY KEY (username)
);