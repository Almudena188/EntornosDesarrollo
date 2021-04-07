SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS cursan;
DROP TABLE IF EXISTS hacen;
DROP TABLE IF EXISTS realizan;
DROP TABLE IF EXISTS ALUMNOS;
DROP TABLE IF EXISTS elaboran;
DROP TABLE IF EXISTS profesores;
DROP TABLE IF EXISTS asignaturas;
DROP TABLE IF EXISTS Examenes;
DROP TABLE IF EXISTS Practicas;




/* Create Tables */

CREATE TABLE ALUMNOS
(
	num_alu int NOT NULL,
	nombre char(30),
	grupo char,
	PRIMARY KEY (num_alu)
);


CREATE TABLE asignaturas
(
	numAsig int NOT NULL,
	nombre varchar(30),
	PRIMARY KEY (numAsig)
);


CREATE TABLE cursan
(
	num_alu int NOT NULL,
	numAsig int NOT NULL,
	trimestre int
);


CREATE TABLE elaboran
(
	codPracticas int NOT NULL,
	numProf int NOT NULL,
	fecha date
);


CREATE TABLE Examenes
(
	numExam int NOT NULL,
	numPreguntas int,
	fecha date,
	PRIMARY KEY (numExam)
);


CREATE TABLE hacen
(
	num_alu int NOT NULL,
	numExam int NOT NULL,
	nota decimal
);


CREATE TABLE Practicas
(
	codPracticas int NOT NULL,
	titulo varchar(30),
	nivel int,
	PRIMARY KEY (codPracticas)
);


CREATE TABLE profesores
(
	numProf int NOT NULL,
	nombre varbinary(30),
	numAsig int NOT NULL,
	PRIMARY KEY (numProf)
);


CREATE TABLE realizan
(
	num_alu int NOT NULL,
	codPracticas int NOT NULL,
	nota decimal,
	fecha date
);



/* Create Foreign Keys */

ALTER TABLE cursan
	ADD FOREIGN KEY (num_alu)
	REFERENCES ALUMNOS (num_alu)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE hacen
	ADD FOREIGN KEY (num_alu)
	REFERENCES ALUMNOS (num_alu)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE realizan
	ADD FOREIGN KEY (num_alu)
	REFERENCES ALUMNOS (num_alu)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE cursan
	ADD FOREIGN KEY (numAsig)
	REFERENCES asignaturas (numAsig)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE profesores
	ADD CONSTRAINT Imparten FOREIGN KEY (numAsig)
	REFERENCES asignaturas (numAsig)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE hacen
	ADD FOREIGN KEY (numExam)
	REFERENCES Examenes (numExam)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE elaboran
	ADD FOREIGN KEY (codPracticas)
	REFERENCES Practicas (codPracticas)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE realizan
	ADD FOREIGN KEY (codPracticas)
	REFERENCES Practicas (codPracticas)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE elaboran
	ADD FOREIGN KEY (numProf)
	REFERENCES profesores (numProf)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



