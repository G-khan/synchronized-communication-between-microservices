## Simple Synchronous Communication Example with Service Discovery

Demo project for Microservice Synchronous communication using Kotlin, Spring Boot, Service Discovery Eureka, Eureka Client & FeignClient

![enter image description here](https://cdn-images-1.medium.com/max/800/1*BB3G8KmqWn5W3m3A7KtKOg.png)


## Requirements
1.  Java - 1.11.x
2.  Gradle- 3.x.x
3. Clone the [Service Discovery click it.](https://github.com/G-khan/synchronized-communication-between-microservices) 

**Step 1: Running the Service Discovery**
Open the service discovery path then,
Type the following command in your terminal to run the service discovery

     ./gradlew bootRun
    

**Step 2: Running the Payment Service** 
Open the this project path then payment-service folder,
Run the project with gradle:

     ./gradlew bootRun

**Step 3: Running the Payment Service** 
Open the this project path then banking-service folder,
Run the project with gradle:

     ./gradlew bootRun
     

Check the link of eureka-server for seeing the registered services: http://localhost:8761/

## Rest APIs

The app defines following for APIs.

    POST http://localhost:8081/api/v1/payment
    
    {
          "paymentType":"credit card",
          "bankId":"123213213213213321"
    }
