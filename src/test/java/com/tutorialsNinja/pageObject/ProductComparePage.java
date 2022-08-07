package com.tutorialsNinja.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductComparePage {

	WebDriver ldriver;

	public ProductComparePage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	@FindBy(xpath = "//*[@data-original-title='Compare this Product']")
	WebElement compareProductBtn;

	@FindBy(xpath = "//*[text()='product comparison']")
	WebElement compareProductLink;

	@FindBy(xpath = "//*[@id='list-view']")
	WebElement listOption;

	@FindBy(xpath = "//*[@id='grid-view']")
	WebElement gridOption;

	@FindBy(xpath = "//*[text()='Desktops']")
	WebElement desktopOption;

	@FindBy(xpath = "//*[text()='Show All Desktops']")
	WebElement showDesktopOptionDropDown;

	public void clickCompareProduct() {
		compareProductBtn.click();
	}

	public void clickProductCompareLink() {
		compareProductLink.click();
	}

	public void clickListOption() {
		listOption.click();
	}

	public void clickGridOption() {
		listOption.click();
	}

	public void clickDesktop() {
		desktopOption.click();
	}

	public void clickShowAllDesktop() {
		showDesktopOptionDropDown.click();
	}

}
