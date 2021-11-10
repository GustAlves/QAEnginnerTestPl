package br.alves.pages;

import static br.alves.core.DriverFactory.getDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import br.alves.core.BasePage;
import br.alves.core.DriverFactory;

public class PageShoppingCart extends BasePage {
	WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 20);

	public void clickRemoveProduct() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'REMOVE')]")));
		clickButton(By.xpath("//a[contains(text(),'REMOVE')]"));
	}

	public void clickIncreaseQuantityOfProducts() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".plus")));
		clickButton(By.cssSelector(".plus"));
	}

	public void clickReduceQuantityOfProducts() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".minus")));
		clickButton(By.xpath(".minus"));
	} // INICIO Validações para cesta de compras

	public String validatePurchasedItem() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//tr[@id='product']/td[2]/a/h3)[2]")));
		return getDriver().findElement(By.xpath("(//tr[@id='product']/td[2]/a/h3)[2]")).getText();
	}

	public String validateColorItem() {
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("(//tr[@id='product']/td[2]/a/label[2]/span)[2]")));
		return getDriver().findElement(By.xpath("(//tr[@id='product']/td[2]/a/label[2]/span)[2]")).getText();
	}

	public String validateTotal() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".totalValue")));
		return getDriver().findElement(By.cssSelector(".totalValue")).getText();
	}

	public String validateEmptyBasket() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='shoppingCart']/div/label")));
		return getDriver().findElement(By.xpath("//div[@id='shoppingCart']/div/label")).getText();
	}
}
