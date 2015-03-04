# db-test
This is an example project for including Oracle jdbc driver in a maven project

To include `ojdbc7.jar` in your Maven project, add the following to your `pom.xml` file:

```xml
  <dependencies>
    <dependency>
      <groupId>com.oracle</groupId>
      <artifactId>ojdbc7</artifactId>
      <version>12.1.0.2</version>
    </dependency>
  </dependencies>
  <repositories>
    <repository>
      <id>dk.cphbusiness</id>
      <name>Cphbusiness</name>
      <url>http://datdb.cphbusiness.dk:8080/repository</url>
      <releases>
        <enabled>true</enabled>
        <updatePolicy>always</updatePolicy>
        <checksumPolicy>fail</checksumPolicy>
      </releases>
      <layout>default</layout>		
    </repository>
  </repositories>
```
