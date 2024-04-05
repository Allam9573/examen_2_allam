create database examen2;

use examen2;

create table cliente(
   dni varchar(20) primary key,
   nombre varchar(20),
   apellido varchar(20),
   correo varchar(20),
   telefono varchar(15)
);

create table direccion(
  idDireccion int auto_increment primary key,
  estado varchar(30),
  ciudad varchar(20),
  calle varchar(20),
  dni varchar(20),
  foreign key(dni) references cliente(dni)
);

create table cuentas(
  numeroCuenta varchar(10) primary key,
  saldo double(10,2),
  fechaApertura date,
  estado tinyint,
  sobregiro tinyint,
  dni varchar(20),
  foreign key(dni) references cliente(dni)
);

create table movimientos(
  idMovimiento int auto_increment primary key,
  numeroCuenta varchar(10),
  tipoMovimiento char(1) check(tipoMovimiento in ('C','D')),
  monto double(10,2),
  fechaMovimiento date,
  foreign key(numeroCuenta) references cuentas(numeroCuenta)
);
  


