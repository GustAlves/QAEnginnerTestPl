package br.alves.pages;

import static br.alves.core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import br.alves.core.BasePage;
import br.alves.core.DriverFactory;

public class PageHome extends BasePage {

	public void accessHomeScreen() {
		getDriver().get("https://advantageonlineshopping.com/#/");
		DriverFactory.getDriver().manage().window().maximize();
	}

	public void clickSearch() {
		getDriver().get("https://advantageonlineshopping.com/#/");
		DriverFactory.getDriver().manage().window().maximize();
	}

	public void clickButtonByText(String texto) {
		clickButton(By.xpath("//a[contains(text(),\'" + texto + "')]"));
	}

}