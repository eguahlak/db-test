package dk.cphbusiness.testoracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Program {
  
  public static void main(String[] args) throws Exception {
    Class.forName("oracle.jdbc.driver.OracleDriver");
    try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@datdb.cphbusiness.dk:1521:DAT", "aka", "aka")) {
      PreparedStatement statement = connection.prepareStatement("select * from AKA.PETS");
      ResultSet results = statement.executeQuery();
      while (results.next()) {
        System.out.println(">> "+results.getString(2)+" "+results.getString(3));
        }
      }
    }
  
  }
