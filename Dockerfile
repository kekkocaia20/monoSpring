# Usa l'immagine di OpenJDK 17 come base
FROM openjdk:17-jdk-slim

# Imposta la directory di lavoro
WORKDIR /app

# Copia il file JAR prodotto da Maven nella directory di lavoro
COPY target/monoSpring-0.0.1-SNAPSHOT.jar app.jar

# Espone la porta su cui la tua applicazione ascolta
EXPOSE 8097

# Comando per eseguire l'applicazione
ENTRYPOINT ["java", "-jar", "app.jar"]


