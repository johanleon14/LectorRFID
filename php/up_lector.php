<?php
include("php/conectar.php");



$Ubicacion = $_POST['Ubicacion'];
$cod_lec = $_POST['cod_lec'];





    //echo "Connected successfully";
    $query = "UPDATE Lector SET  Ubicacion='$Ubicacion' WHERE cod_lec='$cod_lec'";
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