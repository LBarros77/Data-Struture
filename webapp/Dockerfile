From tomcat:9.0
RUN rm -rf /usr/local/tomcat/webapps/*
COPY ./target/employee-producer-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war
CMD ["catalina.sh","run"]
