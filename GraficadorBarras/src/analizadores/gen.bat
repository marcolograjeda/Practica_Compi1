SET JFLEX_HOME= C:\libs\jflex-1.7.0
cd F:\Universidad\USAC\2019\Vacaciones\Compiladores 1\Lab\HojaTrabajo1\src\analizadores
java -jar %JFLEX_HOME%\jflex-1.7.0.jar --encoding utf-8 Lexico_Reportes.jflex
pause

SET CUP_HOME= C:\libs\CUP
cd F:\Universidad\USAC\2019\2 Semestre\Compi 1\Practica_Compi1\GraficadorBarras\src\analizadores
java -jar %CUP_HOME%\java-cup-11b.jar Sintactico_Reportes.cup
pause
