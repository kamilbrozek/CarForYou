CREATE TABLE Roles (
  role_id SERIAL NOT NULL PRIMARY KEY ,
  roleName VARCHAR(50) NOT NULL
);

CREATE TABLE Users (
    user_id SERIAL NOT NULL PRIMARY KEY ,
    login VARCHAR(100) NOT NULL,
    password VARCHAR(50) NOT NULL,
    isActive boolean,
    email VARCHAR(100) NOT NULL,
    registerDate DATE,
    lastlogin DATE,
    role INTEGER,
    FOREIGN KEY (role) REFERENCES Roles (role_id)
);


CREATE TABLE Cars (
  car_id SERIAL NOT NULL PRIMARY KEY ,
  carMake VARCHAR(50),
  model VARCHAR(50),
  odometer INT,
  productionYear INT,
  registration VARCHAR(30),
  engineCapacity FLOAT,
  enginePower INT,
  powerWindows BOOLEAN,
  onBoardCompuber BOOLEAN,
  electricDoorMirrors BOOLEAN,
  heatedMirrrors BOOLEAN,
  seats INT,
  doors INT,
  transmission VARCHAR(15),
  airConditioned VARCHAR(1),
  carStatus VARCHAR(1)
);

CREATE TABLE Customers(
  customer_id SERIAL NOT NULL PRIMARY KEY ,
  firstName VARCHAR(50),
  lastName VARCHAR(50),
  documentType VARCHAR(1),
  documentNumber VARCHAR(30),
  phone VARCHAR(20)

);

CREATE TABLE Locations(
  location_id SERIAL NOT NULL PRIMARY KEY ,
  country VARCHAR(50),
  city VARCHAR(50),
  zipcode VARCHAR(50),
  street VARCHAR(50),
  buildingNumber VARCHAR(10),
  additionalInfo VARCHAR(100)
);

CREATE TABLE Reservations(
  reservation_id SERIAL NOT NULL PRIMARY KEY ,
  car INT NOT NULL,
  driver INT NOT NULL,
  additionalDriver INT,
  createdBy INT NOT NULL,
  startDate DATE,
  startLocation INT,
  startOdometer INT,
  endDate DATE,
  endLocation INT,
  endOdometer INT,
  netPrice DECIMAL,
  status VARCHAR(1),
  FOREIGN KEY (car) REFERENCES Cars (car_id),
  FOREIGN KEY (driver) REFERENCES Customers(customer_id),
  FOREIGN KEY (additionalDriver) REFERENCES Customers(customer_id),
  FOREIGN KEY (createdBy) REFERENCES Users(user_id),
  FOREIGN KEY (startLocation) REFERENCES Locations(location_id),
  FOREIGN KEY (endLocation) REFERENCES Locations(location_id)
);


CREATE TABLE Documents(
  document_id SERIAL NOT NULL PRIMARY KEY 
);




INSERT INTO Roles(roleName) VALUES 
  ('ADMIN'),
  ('Regular'),
  ('Client');