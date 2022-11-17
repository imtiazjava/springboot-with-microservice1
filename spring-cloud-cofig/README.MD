STEP1:
CREATE THE NEW REPOSITORY IN GIT

STEP2:
CREATE THE application.yaml file
eureka:
  client:
    register-with-eureka: true
    fetch-registry: true
    service-url:
      defaultZone: http://localhost:8761/eureka/
  instance:
    hostname: localhost