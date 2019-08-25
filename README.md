# Springboot JAX-RS Rest application demo using jersey


** Following maven command will deploy the spring boot application on embedded tomcat ** 

_mvn clean && mvn spring-boot:run_

** Test GET API call using curl: **

curl 'http://localhost:8080/api/greeting?name=anshuman'

** Sample response **

_Hello anshuman!%_