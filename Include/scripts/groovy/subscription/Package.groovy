package subscription;
import internal.GlobalVariable;
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint;
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase;
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData;
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject;
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject;

import com.kms.katalon.core.annotation.Keyword;
import com.kms.katalon.core.checkpoint.Checkpoint;
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords;
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords;
import com.kms.katalon.core.model.FailureHandling;
import com.kms.katalon.core.testcase.TestCase;
import com.kms.katalon.core.testdata.TestData;
import com.kms.katalon.core.testobject.TestObject;
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords;
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords;
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords;
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class Package {


	public void selectCountry(String country) {
		if (WebUI.getText(findTestObject('Object Repository/Subscription/Package/countryName_button')) != country) {
			WebUI.click(findTestObject('Object Repository/Subscription/Package/countryName_button'));
			WebUI.click(findTestObject('Object Repository/Subscription/Package/'+country+'_button'));
			WebUI.waitForPageLoad(30);
		}
		WebUI.verifyTextPresent(country, false);
	}

	@Given("user navigate to the website EN")
	public void user_navigate_to_the_website_en() {
		WebUI.openBrowser("https://subscribe.stctv.com/sa-ar");
		WebUI.maximizeWindow()
		WebUI.waitForPageLoad(30);
		
		//change the language to English
		WebUI.click(findTestObject('Object Repository/Subscription/Package/translation_button'));
		WebUI.waitForPageLoad(30);
		WebUI.verifyTextPresent("العربية", false);
	}

	@When("the user is redirected to KSA EN page")
	public void the_user_is_redirected_to_KSA_EN_page(){
		selectCountry("KSA");
	}

	@Then("the subscription package for ksa should be correct")
	public void the_subscription_package_for_ksa_should_be_correct(){
		//		//check price and currency for all package
		WebUI.verifyElementText(findTestObject('Object Repository/Subscription/Package/CurrencyLite_label'), '15 SAR/month', FailureHandling.STOP_ON_FAILURE);
		WebUI.verifyElementText(findTestObject('Object Repository/Subscription/Package/CurrencyClassic_label'), '25 SAR/month', FailureHandling.STOP_ON_FAILURE);
		WebUI.verifyElementText(findTestObject('Object Repository/Subscription/Package/CurrencyPremium_label'), '60 SAR/month', FailureHandling.STOP_ON_FAILURE);
	}
	
	@When ("the user is redirected to Baharin EN page")
	public void the_user_is_redirected_to_Baharin_EN_page() {
		selectCountry("Bahrain");
	}
	
	@Then ("the subscription package for bahrain should be correct")
	public void the_subscription_package_for_bahrain_should_be_correct() {
		//check price and currency for all package
		WebUI.verifyElementText(findTestObject('Object Repository/Subscription/Package/CurrencyLite_label'), '2 BHD/month', FailureHandling.STOP_ON_FAILURE);
		WebUI.verifyElementText(findTestObject('Object Repository/Subscription/Package/CurrencyClassic_label'), '3 BHD/month', FailureHandling.STOP_ON_FAILURE);
		WebUI.verifyElementText(findTestObject('Object Repository/Subscription/Package/CurrencyPremium_label'), '6 BHD/month', FailureHandling.STOP_ON_FAILURE);
	}
	
	@When ("the user is redirected to kuwait EN page")
	public void the_user_is_redirected_to_kuwait_EN_page() {
		selectCountry("Kuwait");
	}
	
	@Then ("the subscription package for kuwait should be correct")
	public void the_subscription_package_for_kuwait_should_be_correct() {
		//check price and currency for all package
		WebUI.verifyElementText(findTestObject('Object Repository/Subscription/Package/CurrencyLite_label'), '1.2 KWD/month', FailureHandling.STOP_ON_FAILURE);
		WebUI.verifyElementText(findTestObject('Object Repository/Subscription/Package/CurrencyClassic_label'), '2.5 KWD/month', FailureHandling.STOP_ON_FAILURE);
		WebUI.verifyElementText(findTestObject('Object Repository/Subscription/Package/CurrencyPremium_label'), '4.8 KWD/month', FailureHandling.STOP_ON_FAILURE);
	}
}