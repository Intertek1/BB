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

WebUI.waitForElementClickable(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Enter delivery address'), 0)

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Enter delivery address'))

WebUI.delay(3)

WebUI.waitForPageLoad(0)

WebUI.setText(findTestObject('Page_Birchbox Join the UKs 1 beauty/input_firstName (4)'), 'Bob')

WebUI.setText(findTestObject('Page_Birchbox Join the UKs 1 beauty/input_lastName (4)'), 'Slydell')

WebUI.setText(findTestObject('Page_Birchbox Join the UKs 1 beauty/input_company'), 'Initek')

WebUI.setText(findTestObject('Page_Birchbox Join the UKs 1 beauty/input_streetAddress1'), '97 Neville Street')

WebUI.setText(findTestObject('Page_Birchbox Join the UKs 1 beauty/input_streetAddress2'), 'Suite 200')

WebUI.setText(findTestObject('Page_Birchbox Join the UKs 1 beauty/input_city'), 'IBSTOCK')

WebUI.selectOptionByValue(findTestObject('Page_Birchbox Join the UKs 1 beauty/select_AberdeenshireAlderneyAn (4)'), 'Leicestershire', 
    true)

WebUI.setText(findTestObject('Page_Birchbox Join the UKs 1 beauty/input_postCode'), 'LE672RB')

WebUI.setText(findTestObject('Page_Birchbox Join the UKs 1 beauty/input_telephone'), '07918304943')

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/button_Continue (3)'))

WebUI.delay(10)

