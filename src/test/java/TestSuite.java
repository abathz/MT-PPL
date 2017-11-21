
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author abathz
 */
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)

@SuiteClasses({
  TestLogin.class,
  TestSelectRole.class,
  TestAdminHelp.class,
  TestAdminSelectedHelp.class,
  TestAdminViewListUser.class,
  TestAdminDeleteUser.class,
  TestInitiatorHelp.class,
  TestInitiatorSelectedHelp.class,
  TestInitiatorViewListMeeting.class,
  TestParticipantHelp.class,
  TestParticipantSelectedHelp.class,
  TestParticipantViewListInvitation.class,
  TestLogout.class,
  TestExit.class
})

public class TestSuite {
}
