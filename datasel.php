<?php
	$op = $_POST["op"];
	$val= $_POST["val"];
//	$op = "uploadSchedulinginfo";
//	$val = "";	
	
	if($op = $uploadSchedulinginfo"){
		$val = $_POST["val"];
		$cmd = "java -classpath /var/www/cgi-bin:/var/www/cgi-bin/mysql-connector-java-5.1.23-bin.jar TimeSystem.server $op $val";

	}else{
		$day =  $_POST["day"];
		$time = $_POST["time"];
		$skill= $_POST["skill"];
                $cmd = "java -classpath /var/www/cgi-bin:/var/www/cgi-bin/mysql-connector-java-5.1.23-bin.jar TimeSystem.server $op $day $time $skill";		
		
		

	}

	

	//print($cmd);
	$str = shell_exec($cmd);
	print($str);
?>
