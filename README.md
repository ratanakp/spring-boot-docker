# spring-boot-docker
1. Import to your IDE (I recommend IntelliJ Idea)
2. Clean and Install the project
3. Build Docker Image as following command:
  $ docker build -f Dockerfile -t docker-spring-boot .
4. Run that image as following command:
  $ docker run -d -p 8088:8080 --name spring-boot docker-spring-boot
  or
  $ docker run -p 8088:8080 --name spring-boot1 docker-spring-boot
5. Finally go to your browser ==> http://localhost:8088/api/v1/hello
