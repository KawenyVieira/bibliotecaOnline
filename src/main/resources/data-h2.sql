CREATE TABLE IF NOT EXISTS users (
    id           PRIMARY KEY auto_increment,
    first_name   VARCHAR NOT NULL,
    birth        DATE NOT NULL);

CREATE TABLE IF NOT EXISTS record (
    id                  PRIMARY KEY auto_increment,
    title               VARCHAR(255) NOT NULL,
    author              VARCHAR(255),
    publishing_company  VARCHAR(255),
    date_publication    TIMESTAMP,
    date_creation       TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    date_updated        TIMESTAMP,
    users_creation_id   INT,

    CONSTRAINT record_fk_users
        FOREIGN KEY (users_creation_id)
            REFERENCES users(id));
