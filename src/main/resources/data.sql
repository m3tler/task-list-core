INSERT INTO users (first_name, last_name, email, password, role) VALUES ('Dawid', 'Metlerski', 'admin', '$2a$12$AnWZ9o2Wu01I8II40hNyA.aSprKK3jRtYg80xz1NQrqFcQiDEyz1u', 'ADMIN');
INSERT INTO users (first_name, last_name, email, password, role) VALUES ('Dawid', 'Metlerski', 'user', '$2a$12$AnWZ9o2Wu01I8II40hNyA.aSprKK3jRtYg80xz1NQrqFcQiDEyz1u', 'ADMIN');

INSERT INTO tasks (name, is_done, deadline, user_id) VALUES ('Diam id ornare imperdiet', true, '3/25/2023', 1);
INSERT INTO tasks (name, is_done, deadline, user_id) VALUES ('Lectus suspendisse', false, '3/24/2023', 1);
INSERT INTO tasks (name, is_done, deadline, user_id) VALUES ('Sapien non mi integer', false, '3/27/2023', 1);
INSERT INTO tasks (name, is_done, deadline, user_id) VALUES ('Bibendum morbi', false, '3/31/2023', 1);
INSERT INTO tasks (name, is_done, deadline, user_id) VALUES ('Ultrices posuere cubilia curae', false, '3/30/2023', 1);
INSERT INTO tasks (name, is_done, deadline, user_id) VALUES ('Donec semper sapien a', false, '3/26/2023', 2);
INSERT INTO tasks (name, is_done, deadline, user_id) VALUES ('Amet consectetuer adipiscing', false, '3/30/2023', 2);
INSERT INTO tasks (name, is_done, deadline, user_id) VALUES ('Volutpat quam pede', false, '3/29/2023', 2);
INSERT INTO tasks (name, is_done, deadline, user_id) VALUES ('Platea dictumst aliquam augue', true, '3/26/2023', 2);
INSERT INTO tasks (name, is_done, deadline, user_id) VALUES ('Libero ut', true, '3/31/2023', 2);
