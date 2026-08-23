FROM maven:3.9.7-eclipse-temurin-17 AS build

WORKDIR /app

# Copy dependency definition terlebih dahulu
COPY pom.xml .

# Simpan Maven repository di Docker BuildKit cache
RUN --mount=type=cache,target=/root/.m2 \
    mvn dependency:go-offline -B

#RUN mvn dependency:go-offline

# Baru copy source code
COPY src ./src

# Compile/package menggunakan cache Maven yang sama
RUN --mount=type=cache,target=/root/.m2 \
    mvn clean package -DskipTests -B

FROM eclipse-temurin:17-jre

WORKDIR /app

COPY --from=build /app/target/*.war app.war

EXPOSE 8080

ENTRYPOINT ["java","-jar","app.war"]