CREATE TABLE professor (
	prof_nome CHAR(60) PRIMARY KEY NOT NULL,
	prof_email CHAR(60),
	prof_sala CHAR(20)
);

CREATE TABLE disciplina (
	disc_id CHAR(20) PRIMARY KEY NOT NULL,
	disc_nome CHAR(60),
	fk_prof_nome CHAR(60),
	disc_adicionais CHAR(512),
	FOREIGN KEY (fk_prof_nome) REFERENCES professor(prof_nome)
		ON DELETE RESTRICT
		ON UPDATE CASCADE
);

CREATE TABLE bibliografia (
	fk_disc_id CHAR(20) PRIMARY KEY NOT NULL,
	bib_texto CHAR(200),
	FOREIGN KEY (fk_disc_id) REFERENCES disciplina(disc_id) 
		ON DELETE CASCADE
);

CREATE TABLE evento (
	event_id INTEGER PRIMARY KEY AUTOINCREMENT,
	event_local CHAR(50),
	event_datahora DATETIME,
	fk_disc_id CHAR(20),
	FOREIGN KEY (fk_disc_id) REFERENCES disciplina(disc_id)
		ON DELETE CASCADE
);

CREATE TABLE controle_disciplina (
        disc_id CHAR(20) PRIMARY KEY NOT NULL,
        notas FLOAT(2,3),
        nro_faltas INTEGER(2),
        tarefas_adicionais CHAR(50),
        fk_disc_id CHAR(20),
        FOREIGN KEY (fk_disc_id) REFERENCES disciplina(disc_id)
        ON DELETE CASCADE
);