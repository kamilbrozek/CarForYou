CREATE TABLE Users (
    user_id INT(50) NOT NULL,
    login VARCHAR(100) NOT NULL,
    password VARCHAR(50) NOT NULL,
    isActive boolean,
    email VARCHAR(100) NOT NULL,
    registerDate DATE,
    lastlogin DATE,
    PRIMARY KEY(user_id)
);

CREATE TABLE Roles (
  role_id INT(50) NOT NULL,
  user_id INT(50) NOT NULL,
  roleName VARCHAR(50) NOT NULL,
  PRIMARY KEY (user_role_id),
  FOREIGN KEY (user_id) REFERENCES users (user_id)
);


-- Insert basic user and role

INSERT INTO Users(login, password, isActive, email, registerDate)
  VALUES ("ADMIN","Secret@123", true, "admin@admin.com", current_date())
  WHERE NOT EXISTS (SELECT * FROM Users WHERE login ="ADMIN")

