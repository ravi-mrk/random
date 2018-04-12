Since we are considering to execute this program directly on command line, it is advisable to have  a java 1.8+ version and maven 3.3.6+ version.

I am using a docker container with preinstalled dependencies to make my program run hostOS independent.

Build Image with below command:
    docker build -t jpmc-project .

Run the Docker container using:
    docker run -itd --rm --name jpmc-reports -v "$(pwd)":/usr/src/maven jpmc-project


Get into the container using:
    docker exec -it jpmc-reports bash

Then execute the Maven Build:
    mvn clean package -Dmaven.test.skip
    
    
And then after the build artifacts are generated, we can see the Selling and Buying report generated with a sample data year 2018 using commands:
    "java -jar target/report-engine.jar -IRR" (Inward Ranked Report)
    "java -jar target/report-engine.jar -ISR" (Inward trade report
    "java -jar target/report-engine.jar -ORR" (Outward Ranked Report)
    "java -jar target/report-engine.jar -OSR" (Outward trade Report)
