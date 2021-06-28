# learning-spring
 A simple Spring Boot application, displays room vacancy status for a hotel along with the guest information.\
 An API request can be made at `api/reservations` to get the reservations related data in JSON format. 

 Information is stored in an embedded database for now, but a remote database can be used too.`data.sql` \
 and `schema.sql` define the database.

 A docker image can be built using the `Dockerfile`, I have already pushed an image on [Docker Hub].

 Useful links:\
 [Spring annotations]\
 [Ways to run a Spring Boot app]\
 [docker: “build” requires 1 argument. See 'docker build --help']\
 [denied: requested access to the resource is denied : docker]

[Docker Hub]: https://hub.docker.com/r/kanadn/learning-spring
[Spring annotations]: https://www.educba.com/spring-boot-annotations/?source=leftnav
[Ways to run a Spring Boot app]: https://howtoprogram.xyz/2016/10/11/run-spring-boot-application/
[docker: “build” requires 1 argument. See 'docker build --help']: https://stackoverflow.com/q/28996907/11423025
[denied: requested access to the resource is denied : docker]: https://stackoverflow.com/a/44982036