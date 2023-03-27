INSERT INTO users (first_name, last_name, email, password, role) VALUES ('Dawid', 'Metlerski', 'admin', '$2a$12$AnWZ9o2Wu01I8II40hNyA.aSprKK3jRtYg80xz1NQrqFcQiDEyz1u', 'ADMIN');

INSERT INTO tasks (name, is_done, deadline, user_id) VALUES ('Zadzwonić do znajomego', false, '2021-02-08 09:10:00', 1);
INSERT INTO tasks (name, is_done, deadline, user_id) VALUES ('Spotkanie z Adamem', true, '2021-02-08 09:24:00', 1);
INSERT INTO tasks (name, is_done, deadline, user_id) VALUES ('Kupić prezent', false, '2021-12-05 12:25:00', 1);

