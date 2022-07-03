# edit hosts file if test on the same computer
- 127.0.0.1 node1
- 127.0.0.1 node2

# build & run
- ./mvnw clean install
- java -jar -Dspring.profiles.active=node1 target/xxx.jar
- java -jar -Dspring.profiels.active=node2 target/xxx.jar


# if need authentication
- https://stackoverflow.com/questions/50971891/how-to-secure-spring-cloud-eureka-service-with-basic-auth