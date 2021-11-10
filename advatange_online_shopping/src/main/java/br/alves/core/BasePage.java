package br.alves.core;

import static br.alves.core.DriverFactory.getDriver;

import org.openqa.selenium.By;

public class BasePage {

	public void clickButton(By by) {
		getDriver().findElement(by).click();
	}

	public void write(By by, String texto) {
		getDriver().findElement(by).clear();
		getDriver().findElement(by).sendKeys(texto);
	}

	public void write(String id_campo, String texto) {
		write(By.id(id_campo), texto);
	}

}