package br.alves.pages;

import static br.alves.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.alves.core.BasePage;
import br.alves.core.DriverFactory;

public class PageSeeOffer extends BasePage {
	WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 20);

	public void clickButtonSeeOffer() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("see_offer_btn")));
		clickButton(By.id("see_offer_btn"));
	}

	public void selectColor(String color) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='bunny']")));
		
		switch (color.toUpperCase()) {
		case "AZUL":
			clickButton((By.xpath("//span[@id='bunny']")));
			break;
		case "PRETO":
			clickButton((By.xpath("//div[2]/div/div/div[2]")));
			break;
		case "CINZA":
			clickButton((By.xpath("(//span[@id='bunny'])[3]")));
			break;
		case "ROXO":
			clickButton((By.xpath("(//span[@id='bunny'])[4]")));
			break;
		case "VERMELHO":
			clickButton((By.xpath("(//span[@id='bunny'])[5]")));
			break;
		case "AMARELO":
			clickButton((By.xpath("(//span[@id='bunny'])[6]")));
			break;
		}
	}

	public void clickButtonADDToCart() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("save_to_cart")));
		clickButton(By.name("save_to_cart"));
	}

	public void clickShoppingBasket() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("menuCart")));
		clickButton(By.id("menuCart"));
	}

	public void clickCheckOutPopUp() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("checkOutPopUp")));
		clickButton(By.id("checkOutPopUp"));
	} // INICIO Validações para especificações de produto "LAPTOPS"

	public String validateCustomization() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//article[2]/div/label[2]")));
		return getDriver().findElement(By.xpath("//article[2]/div/label[2]")).getText();
	}

	public String validateDisplay() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[2]/label[2]")));
		return getDriver().findElement(By.xpath("//div[2]/label[2]")).getText();
	}

	public String validateDisplayResolution() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[3]/label[2]")));
		return getDriver().findElement(By.xpath("//div[3]/label[2]")).getText();
	}

	public String validateDisplaySize() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[4]/label[2]")));
		return getDriver().findElement(By.xpath("//div[4]/label[2]")).getText();
	}

	public String validateMemory() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[5]/label[2]")));
		return getDriver().findElement(By.xpath("//div[5]/label[2]")).getText();
	}

	public String validateOperatingSystem() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[6]/label[2]")));
		return getDriver().findElement(By.xpath("//div[6]/label[2]")).getText();
	}

	public String validateProcessor() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[7]")));
		return getDriver().findElement(By.xpath("//div[7]")).getText();
	}

	public String validateTouchScreen() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[8]/label[2]")));
		return getDriver().findElement(By.xpath("//div[8]/label[2]")).getText();
	}

	public String validateWeight() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[9]/label[2]")));
		return getDriver().findElement(By.xpath("//div[9]/label[2]")).getText();
	}
}
