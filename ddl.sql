USE brimwnbovlwuasr2q03z;

CREATE TABLE Ninja(
	id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255),
    rango VARCHAR(255),
    aldea VARCHAR(255)
);

CREATE TABLE Mision(
	id INT AUTO_INCREMENT PRIMARY KEY,
    descripcion VARCHAR(255),
    rango VARCHAR(255),
    recompensa VARCHAR(255)
);

CREATE TABLE Mision_Ninja(
	id INT AUTO_INCREMENT PRIMARY KEY,
    id_ninja INT,
    id_mision INT,
    fecha_inicio VARCHAR(255),
    fecha_fin VARCHAR(255),
	FOREIGN KEY(id_ninja) REFERENCES Ninja(id),
    FOREIGN KEY(id_mision) REFERENCES Mision(id)
);

CREATE TABLE Asignacion_mision(
	id INT AUTO_INCREMENT PRIMARY KEY,
    id_ninja INT,
    id_mision INT,
    fecha_inicio VARCHAR(255),
    FOREIGN KEY(id_ninja) REFERENCES Ninja(id),
    FOREIGN KEY(id_mision) REFERENCES Mision(id)
);

CREATE TABLE Habilidad(
	id INT AUTO_INCREMENT PRIMARY KEY,
    id_ninja INT,
    nombre VARCHAR(255),
    descripcion VARCHAR(255),
    FOREIGN KEY(id_ninja) REFERENCES Ninja(id)
);

INSERT INTO Ninja (nombre, rango, aldea) VALUES
('Naruto Uzumaki', 'Hokage', 'Konoha'),
('Sasuke Uchiha', 'Jonin', 'Konoha'),
('Sakura Haruno', 'Jonin', 'Konoha'),
('Kakashi Hatake', 'Jonin', 'Konoha'),
('Gaara', 'Kazekage', 'Sunagakure');

INSERT INTO Mision (descripcion, rango, recompensa) VALUES
('Rescatar al Daimyo', 'A', '100000 Ryo'),
('Infiltración en la guarida de Akatsuki', 'S', '500000 Ryo'),
('Escolta de suministros a la frontera', 'C', '5000 Ryo'),
('Capturar bandidos en el País del Río', 'B', '50000 Ryo'),
('Exploración de ruinas antiguas', 'A', '200000 Ryo');

INSERT INTO Mision_Ninja (id_ninja, id_mision, fecha_inicio, fecha_fin) VALUES
(1, 1, '2023-10-26', '2023-11-02'),
(2, 2, '2023-11-05', '2023-11-15'),
(3, 3, '2023-11-10', '2023-11-12'),
(4, 4, '2023-11-18', '2023-11-25'),
(5, 5, '2023-11-20', '2023-11-30'),
(1, 5, '2023-11-20', null);

INSERT INTO Asignacion_mision (id_ninja, id_mision, fecha_inicio) VALUES
(1, 1, '2023-10-25'),
(2, 2, '2023-11-04'),
(3, 3, '2023-11-09'),
(4, 4, '2023-11-17'),
(5, 5, '2023-11-19');

INSERT INTO Habilidad (id_ninja, nombre, descripcion) VALUES
(1, 'Rasengan', 'Técnica de esfera de chakra concentrado'),
(2, 'Chidori', 'Técnica de rayo de chakra concentrado'),
(3, 'Curación de Chakra', 'Habilidad médica para curar heridas'),
(4, 'Sharingan', 'Habilidad ocular que permite copiar técnicas'),
(5, 'Manipulación de Arena', 'Control sobre la arena para atacar y defender');