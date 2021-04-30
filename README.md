# Agenda - Workshop 2

Spring Boot Agenda - Used for Workshop 2
<br>

# Tech stack
- JDK 11
- Spring Boot 2.3.10

# Configuration

### Pre-requisites

Download and install (make sure you keep these in a directory under your user):
 - JDK 11
 - Apache Maven +3.6.0

### Environment variables

Make sure you have configured the following environment variables:
- JAVA_HOME
- M2_HOME
- M2

### Start Spring boot app
  
  #####Production environment:
  ```
  mvn spring-boot:run -Dspring.profiles.active=prod -Dspring.datasource.url=<YOUR_JDBC_URL> -Dspring.datasource.username=<YOUR_DB_USER> -Dspring.datasource.username=<YOUR_DB_USER> -Dspring.datasource.password=<YOUR_DB_PASSWORD>
 ```
  #####Development environment:
   ```
  mvn spring-boot:run -Dspring.profiles.active=dev -Dspring.datasource.url=<YOUR_JDBC_URL> -Dspring.datasource.username=<YOUR_DB_USER> -Dspring.datasource.username=<YOUR_DB_USER> -Dspring.datasource.password=<YOUR_DB_PASSWORD>
 ```
#####Default or local environment:
   ```
  mvn spring-boot:run
 ```

### Building using Maven

a. In a Terminal go to project location.<br>
b. Run `mvn clean install -Dspring.profiles.active=<dev or prod>`, add at the end `-DskipTests` if you want to skip tests.

##API Documentation
The project uses Swagger to document de API and endpoints. You can test the Swagger UI through the next URLs:

a. For local deployments:
```
  http://127.0.0.1:8080/
  or
  http://127.0.0.1:8080/swagger-ui.html
 ```
 
b. For cloud deployments:
```
  https://FQDN/
  or
  https://FQDN/swagger-ui.html
 ```
 
 
 ## Author
 * **Rogelio Morelos Coronado** - *Full Stack Developer and Cloud Engineer* - [Github](https://github.com/rogeliomorelos) >> [Linkedin](https://www.linkedin.com/in/rogelio-morelos/) >> [Blog](https://devops4fun.io/)

