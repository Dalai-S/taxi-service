# Taxi Service 
  Task: create a taxi service. This project include driver authentification with other functionality Which will be received by him after logging in. 
To use this application you need to create new driver and log in, after you are able to: 
  - display all drivers, cars, manufacturers
  - add driver to car 
  - create new car and manufacturer

## Architecture
3 Layers: 
  - Dao
  - Service
  - Controllers  

## Technologies 
  - Tomcat
  - MySQL 
  - JDBC 
  - Servlet
  - JSP 
  - JSTL 
  - HTML, CSS

## Setup
1. Configure Apache Tomcat
  - Use taxi_service:war exploded
  - Leave Application contex : "/" 
2. Install MySQL and MySQL Workbench
3. Then in MySQL Workbench create and open new connection with your credentials or use the existing one, open src/main/resources/init_db.sql, File->Open SQL script and execute this script Query->Execute.
4. In the /util/ConnectionUtil.java class set the USERNAME and PASSWORD properties to the ones you specified when installing MySQL:
( dbProperties.put ("user", "root");
dbProperties.put ("password", "1111"); )
5. After starting the project, click on "Create a new Driver" to add the first driver.
