DROP TABLE molecule CASCADE CONSTRAINTS;
DROP TABLE mass CASCADE CONSTRAINTS;
DROP TABLE acidity CASCADE CONSTRAINTS;
DROP TABLE state CASCADE CONSTRAINTS;
DROP TABLE warning CASCADE CONSTRAINTS;

CREATE TABLE molecule (
	name varchar2(35 char) NOT NULL,
	chemical_formula varchar2(15 char) NOT NULL,
	density number(9,4),
	average_melting_point number(9,4),
	solubility_in_water number(9,4),
	acidity number(9,4),
	hazard_statements varchar2(35 char),
	note varchar2(25 char) NOT NULL,
	PRIMARY KEY (name)
);

CREATE TABLE mass (
	chemical_formula varchar2(15 char) NOT NULL,
	molar_mass number(14,4),
	PRIMARY KEY (chemical_formula)
);

CREATE TABLE acidity (
	acidity varchar2(10 char) NOT NULL,
	maxpka number(7,2) NOT NULL,
	minpka number(7,2) NOT NULL,
	note varchar2(30 char),
	PRIMARY KEY (acidity)
);

CREATE TABLE state (
	state varchar2(10 char) NOT NULL,
	maxmp number(7,2) NOT NULL,
	minmp number(7,2) NOT NULL,
	note varchar2(30 char),
	PRIMARY KEY (state)
);

CREATE TABLE warning (
	hazard_statements varchar2(20 char) NOT NULL,
	description varchar2(50 char) NOT NULL,
	PRIMARY KEY (hazard_statements)
);

ALTER TABLE molecule ADD FOREIGN KEY (hazard_statements) REFERENCES warning(hazard_statements);


--
-- insert into warning
--

insert into warning values	('H319',	'causes serious eye irritaion(GHS)');
insert into warning values	('H304',	'may be fatal if swalloed and enters airways(GHS)');
insert into warning values  ('toxic',   'toxic');
insert into warning values  ('NFPA704_3_1_0', 'short exposure could cause.. injury(health3)');
insert into warning values  ('NFPA704_0_1_0', 'requires considerable preheating..(flammability1)');

--
-- insert into molecules
--

insert into molecule values ('L-ascorbic acid', 'C6H8O6',    1.65,		191,	330,	4.1,	null,	        'nutrient');
insert into molecule values ('acetone',         'C3H6O',	  0.7845,	-94.7,	null,	19.2,	'H319',	        'solvent');
insert into molecule values ('alanine',         'C3H7NO2',   1.424,	258,	167.2,	24.08,	null,       	'nutrient');
insert into molecule values ('dodecane',        'C12H26',	  0.7495,	-9.65,	null,	null,   'H304',     	'solvent');
insert into molecule values ('citric acid',     'C6H8O7',	  1.665,	156,	1174.3,	3.13,   'H319',     	'nutrient');
insert into molecule values ('d-glucose',       'C6H12O6',    1.54,    148,    909,     null,  'NFPA704_0_1_0','blood sugar');
insert into molecule values ('sucrose',         'C12H22O11',  1.587,   null,   186,     null,  'NFPA704_0_1_0','table sugar');
insert into molecule values ('starch',          'C6nH10nO5n',  1.5,    null,   null,     null,  null,          'energy store of plants');
insert into molecule values ('acetylene',       'C2H2',        0.001,  -80.8,  null,     25,    null,          'welding');
insert into molecule values ('p-benzoquinone',  'C6H4O2',      1.318,   115,   null,     null,'toxic',         'synthesis');
insert into molecule values ('catechol',        'C6H6O2',      1.344,   105,    430,     9.48, 'NFPA704_3_1_0','pesticide');

--
-- insert into mass
--

insert into mass values ('C6H8O6',	176.12);
insert into mass values ('C3H6O',   58.08);
insert into mass values ('C3H7NO2',	89.09);
insert into mass values ('C12H26',	170.34);
insert into mass values ('C6H8O7',	192.12);
insert into mass values ('C6H12O6',	180.16);
insert into mass values ('C12H22O11',	342.3);
insert into mass values ('C6nH10nO5n',	null);
insert into mass values ('C2H2',	26.04);
insert into mass values ('C6H4O2',	108.1);
insert into mass values ('C6H6O2',	110.1);

--
-- insert into acidity
--

insert into acidity values ('acidic',	13.99,	1,'more acidic than water');
insert into acidity values ('neutral',	14,	   14,'the same acidity as water');
insert into acidity values ('basic',	60,	14.01,'more base than water');

--
-- insert into state
--

insert into state values ('gas',	9.99,	-300, 'gas at room temperature');
insert into state values ('liquid',	25,	    10,   'liquid at room temperature');
insert into state values ('solid',	300,	25.01,'solid at room temperature');
--
-- commit;
--

commit;
