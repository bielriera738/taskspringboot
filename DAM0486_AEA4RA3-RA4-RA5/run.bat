@echo off
REM Script per executar l'aplicació Spring Boot
REM Visites Mèdiques CRUD

echo.
echo ========================================
echo Visites Mèdiques - CRUD Application
echo ========================================
echo.
echo Iniciando aplicació...
echo.

REM Canviar al directori del projecte
cd /d "%~dp0"

REM Executar l'aplicació
java -jar target\visites-medicales-1.0.0.jar

echo.
echo Aplicació finalitzada.
echo.
