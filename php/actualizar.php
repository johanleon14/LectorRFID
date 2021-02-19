<?php
include("php/conectar.php");

$tabla = $_POST['tabla'];

if ($tabla == '') {
    echo "se econtraron campos vacios";
} else {
    //echo "Connected successfully";
    $query = "SELECT * FROM ".$tabla.";";
    $execute = mysqli_query($conn, $query);
    /* $conexion es la variable de la conexión a la BD */
    if (!$execute) {
        echo "Error de BD, no se pudo consultar la base de datos\n";
        echo "Error MySQL: ' . mysql_error()";
        exit;
    }

    $i = 0;
    $rawdata = array();
    while ($row = mysqli_fetch_array($execute)) {
        $rawdata[$i] = $row;
        $i++;
    }
    if ($rawdata[0] == "") {
        $rawdata[0] = "vacio";
    }


    echo $json_info = json_encode($rawdata);
}
