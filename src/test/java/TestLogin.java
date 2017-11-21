

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author abathz
 */
import com.mscheduler.controller.UserController;
import com.mscheduler.model.User;
import org.junit.*;
import static org.junit.Assert.*;

public class TestLogin{
  
  private User user = new User();
  private UserController uc = UserController.getInstance();
  private String emailAdmin;
  private String emailAdmin1;
  
  public TestLogin (){}

  @Before
  public void setUp() {
    this.user.setEmail("admin@ms.com");
    this.user.setPassword("admin");
  }

  @Test
  public void TestLoginSuccess() {
    assertTrue("Login Success!", this.user.checkLoginDb(this.user).equals("2"));
  }
  
  @Test
  public void TestLoginFailed() {
    assertTrue("Login Failed!", this.user.checkLoginDb(this.user).equals("0"));
  }
  
  @AfterClass
  public static void tearDown() {
    System.out.println("Test Login Completed!");
  }
}
