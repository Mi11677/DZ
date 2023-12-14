create database Academy
use Academy

/* Группы (Groups)
■ Идентификатор (Id). Уникальный идентификатор группы.
▷ Тип данных — int.
▷ Авто приращение.
▷ Не может содержать null-значения.
▷ Первичный ключ.

 Название (Name). Название группы.
▷ Тип данных — nvarchar(10).
▷ Не может содержать null-значения.
▷ Не может быть пустым.
▷ Должно быть уникальным

Рейтинг (Rating). Рейтинг группы.
▷Тип данных int.
▷ Не может содержать null-значения.
▷ Должно быть в диапазоне от 0 до 5.

Курс (Year). Курс (год) на котором обучается группа.
▷Тип данных int.
▷ Не может содержать null-значения.
▷ Должно быть в диапазоне от 1 до 5*/

create table Groups
(
	id int not null primary key identity(1,1),
	Name nvarchar(10) not null check(Name <> '') unique,
	Rating int not null check(Rating >=0 and Rating <=5),
	Year int not null check(Year >=1 and Year <=5)
)

/*2. Кафедры (Departments)
■ Идентификатор (Id). Уникальный идентификатор кафедры.
▷ тип данных int
▷ Авто приращение.
▷ Не может содержать null-значения.
▷ Первичный ключ.
■ Финансирование (Financing). Фонд финансирования кафедры.
▷ Тип данных money.
▷ Не может содержать null-значения.
▷ Не может быть меньше 0.
▷ Значение по умолчанию 0
■ Название (Name). Название кафедры.
▷ Тип данных nvarchar(100)
▷ Не может содержать null-значения.
▷ Не может быть пустым.
▷ Должно быть уникальным*/

create table Departmens
(
	id int not null primary key identity (1,1),
	Financing money not null default 0 check (Financing >=0),
	Name nvarchar(100) not null check(Name <> '') unique
)

/*3. Факультеты (Faculties)
■ Идентификатор (Id). Уникальный идентификатор факультета.
▷ Тип данных int.
▷ Авто приращение.
▷ Не может содержать null-значения.
▷ Первичный ключ.
■ Название (Name). Название факультета.
▷ Тип данных nvarchar(100).
▷ Не может содержать null-значения.
▷ Не может быть пустым.
▷ Должно быть уникальным*/

create table Faculties
(
	id int not null primary key identity(1,1),
	Name nvarchar(100) not null check(Name <> '') unique
)

/*4. Преподаватели (Teachers)
■ Идентификатор (Id). Уникальный идентификатор преподавателя.
▷ Тип данных int.
▷ Авто приращение.
▷ Не может содержать null-значения.
▷ Первичный ключ.
■ Дата трудоустройства (EmploymentDate). Дата приема 
преподавателя на работу.
▷ Тип данных date.
▷ Не может содержать null-значения.
▷ Не может быть меньше 01.01.1990.
■ Имя (Name). Имя преподавателя.
▷ Тип данных nvarchar(max).
▷ Не может содержать null-значения.
▷ Не может быть пустым.
■ Надбавка (Premium). Надбавка преподавателя.
▷ Тип данных money.
▷ Не может содержать null-значения.
▷ Не может быть меньше 0.
▷ Значение по умолчанию 0.
■ Ставка (Salary). Ставка преподавателя.
▷ Тип данных money.
▷ Не может содержать null-значения.
▷ Не может быть меньше либо равно 0.
■ Фамилия (Surname). Фамилия преподавателя.
▷ Тип данных nvarchar(max).
▷ Не может содержать null-значения.
▷ Не может быть пустым.*/

create table Teachers
(
	id int not null primary key identity(1,1),
	EmploymentDate date not null check (EmploymentDate >='1990-01-01'),
	Name nvarchar(max) not null check (Name <> ''),
	Premium money not null default 0 check(Premium >=0),
	Salary money not null check (Salary >0),
	Surname nvarchar(max) not null check (Surname <> '')
)
