# Usando imagem com JDK 18
FROM eclipse-temurin:18-jdk

# Criando diretório para o app
WORKDIR /app

# Copiando o arquivo JAR (ajustar nome se necessário)
COPY target/*.jar app.jar

# Expondo a porta 8080
EXPOSE 8080

# Comando para rodar o JAR
CMD ["java", "-jar", "app.jar"]




