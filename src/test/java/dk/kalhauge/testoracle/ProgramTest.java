package dk.kalhauge.testoracle;

import org.junit.Test;
import static org.junit.Assert.*;

public class ProgramTest {
  
  @Test
  public void testOracleDriverPresent() throws Exception {
    Class.forName("oracle.jdbc.driver.OracleDriver");
    }
  }
