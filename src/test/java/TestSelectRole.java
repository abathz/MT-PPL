
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abathz
 */
public class TestSelectRole {
  
  private String admin, initiator, participant;
  
  public TestSelectRole(){}
  
  @Before
  public void setUp () {
    this.admin = "a";
    this.initiator = "i";
    this.participant = "p";
  }
  
  @Test
  public void SelectRoleSuccess () {
    assertTrue("Select Role Admin Success!", "a".equals(this.admin));
    assertTrue("Select Role Initiator Success!", "i".equals(this.initiator));
    assertTrue("Select Role Participant Success!", "p".equals(this.participant));
  }
  
  @Test
  public void SelectRoleFailed () {
    assertFalse("Must select 1 role! Try Again", this.admin != "");
  }
  
  @AfterClass
  public static void tearDown () {
    System.out.println("Test Select Role Completed!");
  }
  
}
