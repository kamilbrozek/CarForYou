INSERT INTO Users(login, password, isActive, email, registerDate, lastLogin, role) VALUES
  (
    'admin',
    'password',
    true,
    'admin@test.com',
    TO_DATE('19/12/2020', 'DD/MM/YYYY'),
    null,
    (SELECT role_id FROM Roles WHERE roleName='ADMIN')
  );

