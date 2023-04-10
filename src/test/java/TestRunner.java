import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = { "classpath:features/Login.feature" },
		glue ={"stepdefinition"},
		plugin = {
				"pretty"
//				,"html:target/cucumber-reports/cucumber-pretty",
//				"json:target/cucumber-reports/CucumberTestReport.json",
//				"timeline:target/test-output-thread/"
		}
)
public class TestRunner extends AbstractTestNGCucumberTests {

//	@Override
//	@DataProvider(parallel = true)
//	public Object[][] scenarios() {
//		return super.scenarios();
//	}
//
//	@BeforeSuite
//	public void beforeSuite() {
//		System.out.println("================ BEFORE SUITE ================");
//	}
//
//	@AfterSuite
//	public void afterSuite() {
//		System.out.println("================ AFTER SUITE ================");
//	}
}