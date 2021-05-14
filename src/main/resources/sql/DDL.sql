
CREATE TABLE IF NOT EXISTS friend
(
    id           int primary key auto_increment,
    name         varchar(50),
    last_name    varchar(100),
    birthday     date,
    phone_number varchar(15)
);