DROP TABLE IF EXISTS Persona;

CREATE TABLE Persona (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  nombre VARCHAR(250) NOT NULL,
  apellidos VARCHAR(250) NOT NULL,
  detalle VARCHAR(250) DEFAULT NULL
);

INSERT INTO Persona (nombre, apellidos,detalle) VALUES
  ('Aliko', 'Dangote', 'Industrial de caminos'),
  ('Bill', 'Gates', 'zEmprendedor de tecnologia'),
  ('Bill2', 'Gates', 'b_Emprendedor de tecnologia'),
  ('Bill3', 'Gates', 'a_Emprendedor de tecnologia'),
  ('Folrunsho', 'Alakija', 'Magnate del aceite');