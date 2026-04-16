#!/bin/bash
# Script per executar l'aplicació Spring Boot
# Visites Mèdiques CRUD

echo "========================================"
echo "Visites Mèdiques - CRUD Application"
echo "========================================"
echo ""
echo "Iniciando aplicació..."
echo ""

# Canviar al directori del projecte
cd "$(dirname "$0")"

# Executar l'aplicació
java -jar target/visites-medicales-1.0.0.jar

echo ""
echo "Aplicació finalitzada."
echo ""
