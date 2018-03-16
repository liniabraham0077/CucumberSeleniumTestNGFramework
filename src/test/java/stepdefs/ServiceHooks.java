package stepdefs;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class ServiceHooks {
    @Before
    public void initializeTest(){
        System.out.println("cuke before");
    }
 
    @After
    public void embedScreenshot(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
            	System.out.println("cuke after failed");
            } catch (Exception e) {
                e.printStackTrace();
            }
           
        }
        else
        	System.out.println("cuke after");
    }
}
