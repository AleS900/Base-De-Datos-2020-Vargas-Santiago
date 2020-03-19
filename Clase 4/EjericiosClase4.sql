/*Ejercicio 1*/
select usuario,nombre from usuario
inner join empleado on usuario.idempleado = empleado.idempleado;

/*Ejercicio 2*/
select email as correo from usuario
inner join empleado on usuario.idempleado = empleado.idempleado && usuario.activo=1;

/*Ejercicio 3*/
/*Solamente para publicaciones de Eric G. Coronel Castillo*/
select count(idpublicacion) from publicacion
where autor like 'Eric G. Coronel Castillo';
/*Para las publicaciones de Eric G. Coronel Castillo y Eric G. Coronel C.*/
select count(idpublicacion) from publicacion
where autor like 'Eric G. Coronel C%';

/*Ejercicio4*/
select sum(precio) from venta 
inner join empleado on venta.idempleado= empleado.idempleado && empleado.nombre='EMILIO';
