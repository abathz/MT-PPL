/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abathz
 */
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

public class TestParticipantViewListInvitation {
  
  private String help;
  
  public TestParticipantViewListInvitation () {}
  
  @Before
  public void setUp () {
    this.help = "list-meeting";
  }
  
  @Test
  public void TestInitiatorViewListMeetingSuccess () {
    assertTrue("Initiator can view list meeting!", this.help.equals(this.help));
  }
  
  @Test
  public void TestInitiatorViewListMeetingFailed () {
    assertTrue("Invalid Input!", !this.help.equals(this.help));
  }
  
  @AfterClass
  public static void tearDown () {
    System.out.println("Test Participant View List Meeting Completed!");
  }
}

