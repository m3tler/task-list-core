DROP TABLE IF EXISTS tasks;
DROP TABLE IF EXISTS users;

CREATE TABLE tasks (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255),
    is_done BOOLEAN,
    deadline TIMESTAMP
);

CREATE TABLE users (
    id SERIAL  PRIMARY KEY,
    first_name VARCHAR(255),
    last_name VARCHAR(255),
    email VARCHAR(255),
    password VARCHAR(255),
    role VARCHAR(5)
);