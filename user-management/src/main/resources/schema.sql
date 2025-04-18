CREATE TABLE IF NOT EXISTS UserId (
                                      uuid VARCHAR(255) PRIMARY KEY
    );
CREATE TABLE IF NOT EXISTS AdminId (
                                       uuid VARCHAR(255) PRIMARY KEY
    );



CREATE TABLE IF NOT EXISTS users (
                       user_id VARCHAR(255) NOT NULL PRIMARY KEY ,
                       username VARCHAR(255) NOT NULL,
                       email VARCHAR(255) NOT NULL,
                       password VARCHAR(255) NOT NULL,
                       balance DOUBLE PRECISION NOT NULL
);
CREATE TABLE IF NOT EXISTS admins (
                        admin_id VARCHAR(255) NOT NULL PRIMARY KEY,
                        username VARCHAR(255),
                        password VARCHAR(255)
);