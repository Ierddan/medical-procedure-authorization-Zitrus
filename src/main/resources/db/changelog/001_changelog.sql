CREATE TABLE MEDICAL_PROCEDURE (
  ID_MEDICAL_PROCEDURE INT NOT NULL,
  COD_MEDICAL_PROCEDURE INT NOT NULL,
  AGE INT NOT NULL,
  GENDER CHAR NOT NULL,
  ALLOWED VARCHAR(3) NOT NULL,
  constraint PK_MEDICAL_PROCEDURE primary key (ID_MEDICAL_PROCEDURE)
);

INSERT INTO MEDICAL_PROCEDURE (ID_MEDICAL_PROCEDURE,COD_MEDICAL_PROCEDURE, AGE, GENDER, ALLOWED)
VALUES (1,4567, 20, "M", "YES");
INSERT INTO MEDICAL_PROCEDURE (ID_MEDICAL_PROCEDURE,COD_MEDICAL_PROCEDURE, AGE, GENDER, ALLOWED)
VALUES (2,6789, 10, "M", "YES");
INSERT INTO MEDICAL_PROCEDURE (ID_MEDICAL_PROCEDURE,COD_MEDICAL_PROCEDURE, AGE, GENDER, ALLOWED)
VALUES (3,1234, 20, "M", "YES");
INSERT INTO MEDICAL_PROCEDURE (ID_MEDICAL_PROCEDURE,COD_MEDICAL_PROCEDURE, AGE, GENDER, ALLOWED)
VALUES (4,4567, 30, "F", "YES");