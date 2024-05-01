package utilities;

import org.openqa.selenium.By;

//By
public class Locators {
public By getId(String locatorValue) {
	return By.id(locatorValue);
}
public By getName(String locatorValue) {
	return By.name(locatorValue);
}
public By getTagName(String locatorValue) {
	return By.tagName(locatorValue);
}
public By getClassName(String locatorValue) {
	return By.className(locatorValue);
}
public By getXpath(String locatorValue) {
	return By.xpath(locatorValue);
}
public By getLinkText(String locatorValue) {
	return By.linkText(locatorValue);
}
public By getPartialLinkText(String locatorValue) {
	return By.partialLinkText(locatorValue);
}
public By getCSSSelector(String locatorValue) {
	return By.cssSelector(locatorValue);
}
}
