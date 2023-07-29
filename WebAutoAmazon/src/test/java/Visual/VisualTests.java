package Visual;

import base.BaseVisualTest;
import com.applitools.eyes.selenium.fluent.Target;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class VisualTests extends BaseVisualTest { //All Ok
    @Test (groups = "Visual")
    public void  testLogoContent(){
        //Baseline was made when i ran this for the first time , now it's compared against the baseline it should pass as it represents the "Logo" content
        eyes.check(Target.window().region(By.id("nav-logo")));
        System.out.println("Visual Test 1");
    }

    @Test (groups = "Visual")
    public void  testLocationContent(){
        // compared to the baseline it should fail as it represents the "location" content
        eyes.check(Target.window().region(By.id("nav-global-location-slot")));
        System.out.println("Visual Test 2");
    }
}
