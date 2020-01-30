package hdcseledemo2020;

import org.testng.annotations.Test;

public class TestNGdemo {
  @Test(priority=1) //annotation // No Duplicate Methods // @test atleast one is mandatory 
  public void launch() 
  {System.out.println("code for Launch");
  }
  @Test(priority=2 , enable =false)
  public void register() {System.out.println("code for Launch");
  }
  @Test
  public void login() {System.out.println("code for login");
  }
}
