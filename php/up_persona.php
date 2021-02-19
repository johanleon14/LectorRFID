<?php
include("php/conectar.php");


$nombre = $_POST['nombre'];
$apellido = $_POST['apellido'];
$cedula = $_POST['cedula'];





    //echo "Connected successfully";
    $query = "UPDATE persona SET nombre='$nombre', apellido='$apellido' WHERE cedula='$cedula';";
    $execute = mysqli_query($conn, $query);
    /* $conexion es la variable de la conexión a la BD */
    if (!$execute) {
        echo "Error de BD, no se pudo consultar la base de datos\n";
        echo "Error MySQL: ' . mysql_error()";
        exit;
    }else{
        echo "exitoup";
    }

   

?>