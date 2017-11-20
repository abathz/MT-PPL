

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author abathz
 */
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.*;

public class TestRunner {

  public static void main(String[] args) {
    Result result = JUnitCore.runClasses(TestSuite.class);

    System.out.println("");
    
    printCompletedTest(result);
    printFailureTest(result);
    
    System.out.println("All tests finished successfully...");
  }

  public static void printCompletedTest (Result result) {
    System.out.println("Completed Test: " + (result.getRunCount() - result.getFailureCount()));
  }

  public static void printFailureTest(Result result) {
    int i = 1;
    System.out.println("Failed Test: ");
    if (result.getFailureCount() == 0) {
      System.out.println("Not Found Failed Test!\n");
    } else {
      for (Failure failure : result.getFailures()) {
        System.out.println(i + ". " + failure.toString());
        i++;
      }
      System.out.println("");
    }
  }
}
