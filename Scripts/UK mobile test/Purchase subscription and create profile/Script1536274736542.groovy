import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

WebUI.callTestCase(findTestCase('UK mobile test/Launch browser to UK site and close cookie notification'), [:], FailureHandling.STOP_ON_FAILURE)

'Store the current date and time'
date = new Date()

'Store the date and time in the format month/day/year/hour/minute'
datetimeMMddyyhhmm = date.format('MMddyyhhmm')

'Create a unique email address using the formatted date and time'
uniqueUKEmail = (('birchbox.intertek+uk' + datetimeMMddyyhhmm) + '@gmail.com')

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/svg_icon__svg___hamburger_menu'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/a_Subscribe (3)'))

WebUI.waitForPageLoad(0)

WebUI.delay(4)

WebUI.scrollToPosition(0, 600)

WebUI.click(findTestObject('Page_The UKs No.1 Beauty Box/button_GET YOUR BOX (2)'))

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/a_Checkout (3)'))

WebUI.delay(2)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Password (3)'))

WebUI.setText(findTestObject('Page_Birchbox Join the UKs 1 beauty/input_firstName (3)'), 'Tom')

WebUI.setText(findTestObject('Page_Birchbox Join the UKs 1 beauty/input_lastName (3)'), 'Smykowski')

WebUI.setText(findTestObject('Page_Birchbox Join the UKs 1 beauty/input_emailAddress (3)'), uniqueUKEmail)

WebUI.setEncryptedText(findTestObject('Page_Birchbox Join the UKs 1 beauty/input_password (3)'), 'yrXHdmw+Di/576oxJz3/0g==')

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_No I dont want to receive (3)'))

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('Page_Birchbox Join the UKs 1 beauty/button_Next (3)'), 0)

WebUI.scrollToElement(findTestObject('Page_Birchbox Join the UKs 1 beauty/button_Next (3)'), 0)

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/button_Next (3)'))

WebUI.setText(findTestObject('Page_Birchbox Join the UKs 1 beauty/input_shipping.streetAddress1 (3)'), '13 Netherpark Crescent')

WebUI.setText(findTestObject('Page_Birchbox Join the UKs 1 beauty/input_shipping.city (3)'), 'Steppingley')

WebUI.selectOptionByValue(findTestObject('Page_Birchbox Join the UKs 1 beauty/select_AberdeenshireAlderneyAn (3)'), 'Bedfordshire', 
    true)

WebUI.setText(findTestObject('Page_Birchbox Join the UKs 1 beauty/input_shipping.postCode (3)'), 'MK458BA')

WebUI.setText(findTestObject('Page_Birchbox Join the UKs 1 beauty/input_shipping.telephone (3)'), '07076228354')

WebUI.setText(findTestObject('Page_Birchbox Join the UKs 1 beauty/input_payment.creditCardNumber (3)'), '4977949494949497')

WebUI.selectOptionByValue(findTestObject('Page_Birchbox Join the UKs 1 beauty/select_01020304050607080910111 (3)'), '10', 
    true)

WebUI.selectOptionByValue(findTestObject('Page_Birchbox Join the UKs 1 beauty/select_16171819202122232425262 (3)'), '20', 
    true)

WebUI.setText(findTestObject('Page_Birchbox Join the UKs 1 beauty/input_payment.cvv (3)'), '737')

WebUI.waitForElementClickable(findTestObject('Page_Birchbox Join the UKs 1 beauty/button_Review Your Order (2)'), 0)

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/button_Review Your Order (2)'))

WebUI.delay(4)

WebUI.waitForElementClickable(findTestObject('Page_Birchbox Join the UKs 1 beauty/button_Place Order and Pay (2)'), 0)

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/button_Place Order and Pay (2)'))

WebUI.delay(46)

WebUI.verifyElementNotPresent(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_503Backend fetch failed'), 0)

WebUI.waitForElementClickable(findTestObject('Page_Birchbox Join the UKs 1 beauty/a_Go to my Beauty Profile'), 0)

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/a_Go to my Beauty Profile'))

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_SkinComplexion concerns co (3)'), 
    0)

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_SkinComplexion concerns co (3)'))

WebUI.waitForElementClickable(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Normal (3)'), 0)

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Normal (3)'))

WebUI.waitForElementClickable(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Acne (3)'), 0)

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Acne (3)'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Ageing (3)'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Eye puffiness or dark circ (3)'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Hyperpigmentation or dark (3)'))

WebUI.scrollToElement(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Hyperpigmentation or dark (3)'), 0)

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Pores (3)'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Redness rosacea or eczema (3)'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Sensitivity (3)'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Stretch marks (3)'))

WebUI.scrollToElement(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Stretch marks (3)'), 0)

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Sun protection (3)'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Next (3)'))

WebUI.waitForElementClickable(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Fair  Light (3)'), 0)

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Fair  Light (3)'))

WebUI.waitForElementClickable(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_No (2)'), 0)

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_No (2)'))

WebUI.waitForElementClickable(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Other (2)'), 0)

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Other (2)'))

WebUI.waitForElementClickable(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Straight (2)'), 0)

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Straight (2)'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Chemically-treated  colour (3)'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Dry (3)'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Fine (3)'))

WebUI.scrollToElement(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Fine (3)'), 0)

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Frizzy (3)'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Heat-treated (3)'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Oily (3)'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Thick (3)'))

WebUI.scrollToElement(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Thick (3)'), 0)

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Prone to scalp sensitivity (3)'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Too short for a ponytail (3)'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Next (3)'))

WebUI.waitForElementClickable(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Brown (3)'), 0)

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Brown (3)'))

WebUI.waitForElementClickable(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Adventurous I love experim (3)'), 
    0)

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Adventurous I love experim (3)'))

WebUI.waitForElementClickable(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Newbie Ill take all the he (3)'), 
    0)

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Newbie Ill take all the he (3)'))

WebUI.waitForElementClickable(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_No thanks. (2)'), 0)

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_No thanks. (2)'))

WebUI.waitForElementClickable(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_No (2)'), 0)

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_No (2)'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Next (3)'))

WebUI.waitForElementClickable(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Make me feel pampered (3)'), 0)

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Make me feel pampered (3)'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Make me feel more confiden (3)'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Help me try new products (3)'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Help me try new styles (3)'))

WebUI.scrollToElement(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Help me try new styles (3)'), 0)

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Help me find products that (3)'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Help me learn new beauty s (3)'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Close (3)'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/svg_icon__svg___Birchbox_icon'))

