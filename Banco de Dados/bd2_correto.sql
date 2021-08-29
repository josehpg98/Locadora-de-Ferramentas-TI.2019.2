-- Geração de Modelo físico
-- Sql ANSI 2003 - brModelo.



CREATE TABLE tblcidade (
cid_codigo INTEGER PRIMARY KEY,
Nome VARCHAR(50),
UF VARCHAR(2)
)

CREATE TABLE tbllocacao (
loc_codigo INTEGER PRIMARY KEY,
fun_codigo INTEGER,
cli_codigo INTEGER,
data_loc DATE,
data_dev DATE,
valor_total NUMERIC(15.2)
)

CREATE TABLE itemLocado (
ite_codigo INTEGER PRIMARY KEY,
equ_codigo INTEGER,
loc_codigo INTEGER,
Qtde_equipamento INTEGER,
FOREIGN KEY(loc_codigo) REFERENCES tbllocacao (loc_codigo)
)

CREATE TABLE tblequipamento (
equ_codigo INTEGER PRIMARY KEY,
Nome VARCHAR(50),
Marca VARCHAR(30),
Valor NUMERIC(15.2),
estoque INTEGER
)

CREATE TABLE tblfuncionario (
fun_codigo INTEGER PRIMARY KEY,
cid_codigo INTEGER,
Nome VarChar(50),
CPF INTEGER,
Senha VARCHAR(),
Cargo_Func VARCHAR(60 ),
Num_tel VARCHAR(12 ),
FOREIGN KEY(cid_codigo) REFERENCES tblcidade (cid_codigo)
)

CREATE TABLE tblcliente (
cli_codigo INTEGER PRIMARY KEY,
cid_codigo INTEGER,
CPF INTEGER,
Nome VARCHAR(50 ),
RG VARCHAR(10 ),
Data_Nasc. DATE,
Sexo VARCHAR(3),
num_ Tel. VARCHAR(12 ),
Email VARCHAR(70),
Endereço VARCHAR(50),
CEP VARCHAR(8),
Número VARCHAR(5),
Complemento VARCHAR(50),
FOREIGN KEY(cid_codigo) REFERENCES tblcidade (cid_codigo)
)

ALTER TABLE tbllocacao ADD FOREIGN KEY(fun_codigo) REFERENCES tblfuncionario (fun_codigo)
ALTER TABLE tbllocacao ADD FOREIGN KEY(cli_codigo) REFERENCES tblcliente (cli_codigo)
ALTER TABLE itemLocado ADD FOREIGN KEY(equ_codigo) REFERENCES tblequipamento (equ_codigo)
