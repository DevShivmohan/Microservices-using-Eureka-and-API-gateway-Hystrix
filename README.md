# Microservices-using-Eureka-and-API-gateway-Hystrix
Microservices using Eureka and API gateway also use Hystrix to maintain service down time and real time monitoring

**Dependency needed for microservices services**
- Eureka client and Spring cloud also add its version
```
<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
</dependency>

<dependencyManagement>
		<dependencies>
			<dependency>
				<groupId>org.springframework.cloud</groupId>
				<artifactId>spring-cloud-dependencies</artifactId>
				<version>${spring-cloud.version}</version>
				<type>pom</type>
				<scope>import</scope>
			</dependency>
		</dependencies>
	</dependencyManagement>
  
  <properties>
		<java.version>17</java.version>
		<spring-cloud.version>2021.0.0</spring-cloud.version> // this line only
	</properties>
```


**Dependency needed for Eureka server**

- Eureka server and Spring cloud also its version

```

<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-netflix-eureka-server</artifactId>
</dependency>

<dependencyManagement>
		<dependencies>
			<dependency>
				<groupId>org.springframework.cloud</groupId>
				<artifactId>spring-cloud-dependencies</artifactId>
				<version>${spring-cloud.version}</version>
				<type>pom</type>
				<scope>import</scope>
			</dependency>
		</dependencies>
	</dependencyManagement>
  
  <properties>
		<java.version>17</java.version>
		<spring-cloud.version>2021.0.0</spring-cloud.version> // this line only
	</properties> 

```

**Dependency needed for API gateway**
- Cloude gateway
- Eureka client
- Netflix-hystrix
- cloud gateway starter
- Circuit breaker reacter
- actuator

```
<properties>
		<java.version>17</java.version>
		<spring-cloud.version>2021.0.0</spring-cloud.version>
	</properties>
  
<dependencyManagement>
		<dependencies>
			<dependency>
				<groupId>org.springframework.cloud</groupId>
				<artifactId>spring-cloud-dependencies</artifactId>
				<version>${spring-cloud.version}</version>
				<type>pom</type>
				<scope>import</scope>
			</dependency>
		</dependencies>
	</dependencyManagement>
  
  <dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
		</dependency>
    
    <dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-netflix-hystrix</artifactId>
			<version>2.2.9.RELEASE</version>
		</dependency>
    
  <dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-gateway</artifactId>
		</dependency>
    
    <dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-circuitbreaker-reactor-resilience4j</artifactId>
		</dependency>
    
    <dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-actuator</artifactId>
		</dependency>
  
  ```
