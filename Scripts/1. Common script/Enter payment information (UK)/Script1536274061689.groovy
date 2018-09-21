import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.waitForElementClickable(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Add payment information'), 0)

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Add payment information'))

WebUI.delay(3)

WebUI.waitForPageLoad(0)

WebUI.setText(findTestObject('Page_Birchbox Join the UKs 1 beauty/input_creditCardNumber'), '5100081112223332')

WebUI.selectOptionByValue(findTestObject('Page_Birchbox Join the UKs 1 beauty/select_01020304050607080910111 (4)'), '10', 
    true)

WebUI.selectOptionByValue(findTestObject('Page_Birchbox Join the UKs 1 beauty/select_16171819202122232425262 (4)'), '20', 
    true)

WebUI.setText(findTestObject('Page_Birchbox Join the UKs 1 beauty/input_cvv'), '737')

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Save for future use'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/button_Continue (3)'))

WebUI.delay(5)

WebUI.waitForPageLoad(0)

WebUI.waitForElementVisible(findTestObject('Page_Birchbox Join the UKs 1 beauty/button_Continue (3)'), 0)

WebUI.waitForElementClickable(findTestObject('Page_Birchbox Join the UKs 1 beauty/button_Continue (3)'), 0)

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/button_Continue (3)'))

WebUI.delay(2)

'Depending on the credit card number used, a "Backend Fetch Failed" error might display at this point'
WebUI.verifyElementNotPresent(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_503Backend fetch failed'), 0)

