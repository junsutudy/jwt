DROP TABLE IF EXISTS users;

CREATE TABLE users
(

    primary key (id),
    id          bigint      NOT NULL AUTO_INCREMENT,
    username    varchar(20) NOT NULL,
    email       varchar(50) NOT NULL,
    profile_url varchar(1000),
    created_at  timestamp default NOW(),
    updated_at  timestamp default NOW()
)
