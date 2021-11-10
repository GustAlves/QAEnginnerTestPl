import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import br.alves.core.DriverFactory;
import br.alves.pages.PageHome;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty", monochrome = true)
public class Runner {

	private static PageHome page = new PageHome();

	@Rule
	public static TestName testName = new TestName();

	@BeforeClass
	public static void acessarSite() throws InterruptedException {
		page.accessHomeScreen();
		Thread.sleep(5000);
	}

	@AfterClass
	public static void finalizaTudo() throws IOException {
		DriverFactory.killDriver();
	}
}