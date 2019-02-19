# Spring Microservice Sample

Cette exemple contient 4 microservice détaillé comme suit:

 - **streamlink_boond_config** : Serveur **spring cloud config** contient la partie config des autres services
 > Spring Cloud Config provides server-side and client-side support for externalized configuration in a distributed system. With the Config Server, 
 you have a central place to manage external properties for applications across all environments.
 - **streamlink_boond_registry**: Serveur **eureka** responsable de l'enregistrement et de la decouverte des
 microservices
 >Eureka is a REST (Representational State Transfer) based service that is primarily used in the AWS cloud for locating services for the purpose of load balancing and failover of middle-tier servers. We call this service, the Eureka Server. Eureka also comes with a Java-based client component, the Eureka Client, which makes interactions with the service much easier. The client also has a built-in load balancer that does basic round-robin load balancing. At Netflix, a much more sophisticated load balancer wraps Eureka to provide weighted load balancing based on several factors like traffic, resource usage, error conditions etc to provide superior resiliency.
 - **streamlink_boond_gateway**: Serveur **ZUUL** Le point d'entré vers 
 les différents Microservice 
 > Zuul is an edge service that provides dynamic routing, monitoring, resiliency, security, and more.
 - **streamlink_boond_service**: Contient la partie métier de notre application 
 (api rest , accés base de données etc)
 > **streamlink_boond_service** va contenir ce qui est déja en place dans l'application déja crée ,avec le 
 mise à jour ,bien sur ,que va avoir le modéle suite à votre developpement
 
 A Prévoir aussi : 
  - **streamlink_boond_communication** : Contient tous les opération (envoi de mail, sms ,communication)
  
  Tous les commandes passées à ce service doivent être via une queue (**RabbitMQ**)  pour ne pas perdre des 
  commandes à cause de la non disponiblité de service 
  
  - **streamlink_boond_oauth**: Serveur d'authoriszation respectant le protocole Oauth2 
 
 
 
 
 
  

