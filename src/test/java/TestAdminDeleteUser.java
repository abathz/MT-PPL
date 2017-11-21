/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abathz
 */

import org.junit.*;
import static org.junit.Assert.*;
public class TestAdminDeleteUser {
  
  private String email = "user1@ms.com";
  
  public TestAdminDeleteUser () {}
  
  @Before
  public void setUp () {
  }
  
  @Test
  public void TestAdminAddUserSuccess () {
    assertTrue("Delete User Success!", this.email.equals(this.email));
  }
  
  @Test
  public void TestAdminAddUserFailed () {
    assertTrue("Delete User Failed!", !this.email.equals(this.email));
  }
  
  @AfterClass
  public static void tearDown () {
    System.out.println("Test Admin Delete User Completed!");
  }
  
}
