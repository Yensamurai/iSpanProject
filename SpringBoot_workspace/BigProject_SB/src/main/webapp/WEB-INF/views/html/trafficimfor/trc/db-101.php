﻿<?php
include("db.php");
$sql="SELECT * FROM thr_n_imm WHERE ID = 4";
$result = $conn->query($sql);
if ($result->num_rows > 0) {
	while($row = $result->fetch_assoc()) {
        echo $row["TrainNo"];
    }
} else {
    echo "0 results";
}
$conn->close();
?>
