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
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

'Store the current date and time'
date = new Date()

'Store the date and time in the format month/day/year/hour/minute'
datetimeMMddyyhhmm = date.format('MMddyyhhmm')

'Create a unique email address using the formatted date and time'
uniqueUSEmail = (('birchbox.intertek+us' + datetimeMMddyyhhmm) + '@gmail.com')

WebUI.delay(2)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/a_Join (1)'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/button_Get Your September Box'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Password_PC browser'))

WebUI.setText(findTestObject('Page_Beauty Box Subscription for Wo/input_firstName (1)'), 'Peter')

WebUI.setText(findTestObject('Page_Beauty Box Subscription for Wo/input_lastName (1)'), 'Gibbons')

WebUI.setText(findTestObject('Page_Beauty Box Subscription for Wo/input_emailAddress (1)'), uniqueUSEmail)

WebUI.setEncryptedText(findTestObject('Page_Beauty Box Subscription for Wo/input_password (2)'), 'yrXHdmw+Di/576oxJz3/0g==')

WebUI.scrollToPosition(0, 99999)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/button_Next'))

WebUI.setText(findTestObject('Page_Beauty Box Subscription for Wo/input_shipping.firstName (1)'), 'Bill')

WebUI.setText(findTestObject('Page_Beauty Box Subscription for Wo/input_shipping.lastName (1)'), 'Lumbergh')

WebUI.setText(findTestObject('Page_Beauty Box Subscription for Wo/input_shipping.streetAddress1 (1)'), '4683 Chabot Drive')

WebUI.setText(findTestObject('Page_Beauty Box Subscription for Wo/input_shipping.streetAddress2 (1)'), 'Suite 200')

WebUI.setText(findTestObject('Page_Beauty Box Subscription for Wo/input_shipping.city (1)'), 'Pleasanton')

WebUI.selectOptionByValue(findTestObject('Page_Beauty Box Subscription for Wo/select_AAACAEAFAKALAMAPARAZCAC (1)'), 'California', 
    true)

WebUI.setText(findTestObject('Page_Beauty Box Subscription for Wo/input_shipping.postCode (1)'), '94588')

WebUI.setText(findTestObject('Page_Beauty Box Subscription for Wo/input_payment.creditCardNumber (1)'), '5100081112223332')

WebUI.selectOptionByValue(findTestObject('Page_Beauty Box Subscription for Wo/select_01020304050607080910111 (1)'), '10', 
    true)

WebUI.selectOptionByValue(findTestObject('Page_Beauty Box Subscription for Wo/select_16171819202122232425262 (1)'), '20', 
    true)

WebUI.setText(findTestObject('Page_Beauty Box Subscription for Wo/input_payment.cvv (1)'), '737')

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/button_Review Your Order (1)'))

WebUI.waitForPageLoad(0)

WebUI.comment('Test - Check for correct sales tax calculation and currency symbol')

'Get the string for the total amount and store it into the variable "dollar_amount"'
dollar_amount = WebUI.getText(findTestObject('Page_Beauty Box Subscription for Wo/div_subtotal_PC'), FailureHandling.STOP_ON_FAILURE)

'Check the string against a regex for the correct U.S. currency format'
WebUI.verifyMatch(dollar_amount, '^\\$[0-9]+\\.[0-9]{2}$', true)

'Get the string for the total amount and store it into the variable "dollar_amount"'
dollar_amount = WebUI.getText(findTestObject('Page_Beauty Box Subscription for Wo/div_shipping_PC'), FailureHandling.STOP_ON_FAILURE)

'Check the string against a regex for the correct U.S. currency format'
WebUI.verifyMatch(dollar_amount, '^\\$[0-9]+\\.[0-9]{2}$|(?i)^FREE$', true)

'Get the string for the total amount and store it into the variable "dollar_amount"'
dollar_amount = WebUI.getText(findTestObject('Page_Beauty Box Subscription for Wo/div_tax_PC'), FailureHandling.STOP_ON_FAILURE)

'Check the string against a regex for the correct U.S. currency format'
WebUI.verifyMatch(dollar_amount, '^\\$[0-9]+\\.[0-9]{2}$', true)

'Get the string for the total amount and store it into the variable "dollar_amount"'
dollar_amount = WebUI.getText(findTestObject('Page_Beauty Box Subscription for Wo/div_total_PC'), FailureHandling.STOP_ON_FAILURE)

'Check the string against a regex for the correct U.S. currency format'
WebUI.verifyMatch(dollar_amount, '^\\$[0-9]+\\.[0-9]{2}$', true)

WebUI.delay(18)

WebUI.scrollToPosition(0, 99999)

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('Page_Beauty Box Subscription for Wo/button_Confirm Subscription (1)'), 0)

WebUI.waitForElementClickable(findTestObject('Page_Beauty Box Subscription for Wo/button_Confirm Subscription (1)'), 0)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/button_Confirm Subscription (1)'))

WebUI.delay(12)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Go to your profile (2)'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Go to your profile (2)'))

WebUI.waitForElementClickable(findTestObject('Page_Beauty Box Subscription for Wo/div_Normal (2)'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Normal (2)'))

WebUI.waitForElementClickable(findTestObject('Page_Beauty Box Subscription for Wo/div_Acne (2)'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Acne (2)'))

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Aging (2)'))

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Cellulite (2)'))

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Dark spots or uneven skin (2)'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Dark spots or uneven skin (2)'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Undereye circlespuffiness (2)'))

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Redness or rosacea (2)'))

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Sensitivity (2)'))

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Stretch marks'))

WebUI.scrollToElement(findTestObject('Page_Beauty Box Subscription for Wo/div_Stretch marks'), 0)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Sun protection'))

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Other (2)'))

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Next (2)'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Fair (2)'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Fair (2)'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Brown (2)'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Brown (2)'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Thick (2)'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Thick (2)'))

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Fine (2)'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Fine (2)'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Straight (2)'))

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Wavy (2)'))

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Curly (2)'))

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Frizzy (2)'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Frizzy (2)'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Kinky (2)'))

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Dry'))

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Normal (3)'))

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Oily'))

WebUI.scrollToElement(findTestObject('Page_Beauty Box Subscription for Wo/div_Oily'), 0)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Too short for a ponytail'))

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Next (2)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Chemically treat (2)'))

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Chemically treat (2)'))

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Color treat (2)'))

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Style with a curling iron (2)'))

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Blow dry frequently (2)'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Blow dry frequently (2)'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Straighten with a flat iro (2)'))

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Air dry most of the time (2)'))

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Next (2)'))

WebUI.delay(3)

WebUI.waitForElementClickable(findTestObject('Page_Beauty Box Subscription for Wo/div_Newbie'), 0)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Newbie'))

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('Page_Beauty Box Subscription for Wo/div_Adventurous'), 0)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Adventurous'))

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Classic'))

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Trendy'))

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Low-maintenance'))

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Next (2)'))

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('Page_Beauty Box Subscription for Wo/div_Bath and Body'), 0)

WebUI.waitForElementClickable(findTestObject('Page_Beauty Box Subscription for Wo/div_Bath and Body'), 0)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Bath and Body'))

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Fragrance'))

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Haircare'))

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Makeup'))

WebUI.scrollToElement(findTestObject('Page_Beauty Box Subscription for Wo/div_Makeup'), 0)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Skincare'))

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Next (2)'))

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('Page_Beauty Box Subscription for Wo/div_Anytime'), 0)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Anytime'))

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('Page_Beauty Box Subscription for Wo/div_Yes please'), 0)

WebUI.waitForElementClickable(findTestObject('Page_Beauty Box Subscription for Wo/div_Yes please'), 0)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Yes please'))

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('Page_Beauty Box Subscription for Wo/div_Beauty-related tools'), 0)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Beauty-related tools'))

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Organic and natural products'))

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Small accessories'))

WebUI.scrollToElement(findTestObject('Page_Beauty Box Subscription for Wo/div_Wellness-related items'), 0)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Wellness-related items'))

WebUI.scrollToElement(findTestObject('Page_Beauty Box Subscription for Wo/div_Products for a mom'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Next (2)'))

WebUI.comment('Issue - Not sure how to enter the date of birth at this point, so the script just selects the Next button')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Next (2)'))

WebUI.waitForElementClickable(findTestObject('Page_Beauty Box Subscription for Wo/div_Other race'), 0)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Other race'))

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('Page_Beauty Box Subscription for Wo/div_Under 36000'), 0)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Under 36000'))

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('Page_Beauty Box Subscription for Wo/div_I want lots of beauty samples'), 0)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_I want lots of beauty samples'))

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Id like to experiment'))

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_I dont have time'))

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_I want to receive'))

WebUI.scrollToElement(findTestObject('Page_Beauty Box Subscription for Wo/div_I want to receive'), 0)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Its hard'))

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Next (2)'))

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('Page_Beauty Box Subscription for Wo/div_How did you hear about Bir'), 0)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_How did you hear about Bir'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Page_Beauty Box Subscription for Wo/div_Friend family or coworker_'), 0)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Friend family or coworker_'))

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Given to me as a gift_boxI'))

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Search (e.g. Google Bing)_'))

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Facebook_boxInput__topCent'))

WebUI.scrollToElement(findTestObject('Page_Beauty Box Subscription for Wo/div_Facebook_boxInput__topCent'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Next (2)'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Close (2)'))

