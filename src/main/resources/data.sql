INSERT INTO users (first_name, last_name, email, password, role) VALUES ('Dawid', 'Metlerski', 'admin', '$2a$12$AnWZ9o2Wu01I8II40hNyA.aSprKK3jRtYg80xz1NQrqFcQiDEyz1u', 'ADMIN');
INSERT INTO users (first_name, last_name, email, password, role) VALUES ('Dawid', 'Metlerski', 'user', '$2a$12$AnWZ9o2Wu01I8II40hNyA.aSprKK3jRtYg80xz1NQrqFcQiDEyz1u', 'ADMIN');

INSERT INTO tasks (name, is_done, deadline, user_id) VALUES ('Diam id ornare imperdiet', true, '2023-03-25', 1);
INSERT INTO tasks (name, is_done, deadline, user_id) VALUES ('Lectus suspendisse', false, '2023-03-24', 1);
INSERT INTO tasks (name, is_done, deadline, user_id) VALUES ('Sapien non mi integer', false, '2023-03-27', 1);
INSERT INTO tasks (name, is_done, deadline, user_id) VALUES ('Bibendum morbi', false, '2023-04-20', 1);
INSERT INTO tasks (name, is_done, deadline, user_id) VALUES ('Ultrices posuere cubilia curae', false, '2023-04-30', 1);
INSERT INTO tasks (name, is_done, deadline, user_id) VALUES ('Donec semper sapien a', false, '2023-03-26', 2);
INSERT INTO tasks (name, is_done, deadline, user_id) VALUES ('Amet consectetuer adipiscing', false, '2023-04-30', 2);
INSERT INTO tasks (name, is_done, deadline, user_id) VALUES ('Volutpat quam pede', false, '2023-04-29', 2);
INSERT INTO tasks (name, is_done, deadline, user_id) VALUES ('Platea dictumst aliquam augue', true, '2023-03-26', 2);
INSERT INTO tasks (name, is_done, deadline, user_id) VALUES ('Libero ut', true, '2023-04-21', 2);
