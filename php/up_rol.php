<?php
include("php/conectar.php");


$NombreRol = $_POST['NombreRol'];
$Facultad = $_POST['Facultad'];
$programa = $_POST['programa'];
$idRol = $_POST['idRol'];




    //echo "Connected successfully";
    $query = "UPDATE Rol SET Nombre='$NombreRol', Facultad='$Facultad', programa='$programa' WHERE idRol='$idRol';";
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