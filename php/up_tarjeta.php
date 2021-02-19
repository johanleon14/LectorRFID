<?php
include("php/conectar.php");


$tipo = $_POST['tipo'];
$estado = $_POST['estado'];
$cod_Tarjeta = $_POST['codTarjeta'];





    //echo "Connected successfully";
    $query = "UPDATE Tarjeta SET tipo='$tipo', estado='$estado' WHERE codTarjeta='$cod_Tarjeta';";
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