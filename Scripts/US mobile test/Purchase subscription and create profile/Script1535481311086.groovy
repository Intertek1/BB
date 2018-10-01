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

'Store the current date and time'
date = new Date()

'Store the date and time in the format month/day/year/hour/minute'
datetimeMMddyyhhmm = date.format('MMddyyhhmm')

'Create a unique email address using the formatted date and time'
uniqueUSEmail = (('birchbox.intertek+us' + datetimeMMddyyhhmm) + '@gmail.com')

'Enable this line only when running this test suite by itself'
not_run: WebUI.callTestCase(findTestCase('US mobile test/Launch the Birchbox site in the required locale - US (www.staging.birchbox.com)'), 
    [:], FailureHandling.STOP_ON_FAILURE)

'Tap the hamburger menu'
WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/svg_icon__hamburger_menu (1)'))

WebUI.comment('Test - Navigate to the subscription page and initiate a purchase')

WebUI.delay(1)

'Tap "Subscribe"'
WebUI.waitForElementVisible(findTestObject('Page_Beauty Box Subscription for Wo/a_Join'), 0)

'Tap "Subscribe"'
WebUI.waitForElementClickable(findTestObject('Page_Beauty Box Subscription for Wo/a_Join'), 0)

'Tap "Subscribe"'
WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/a_Join'))

WebUI.delay(2)

'Tap the button that starts with the words "Get your"'
WebUI.waitForElementVisible(findTestObject('Page_Beauty Box Subscription for Wo/button_Get Your September Box'), 0)

'Tap the button that starts with the words "Get your"'
WebUI.waitForElementClickable(findTestObject('Page_Beauty Box Subscription for Wo/button_Get Your September Box'), 0)

'Tap the button that starts with the words "Get your"'
WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/button_Get Your September Box'))

WebUI.delay(4)

WebUI.comment('Register as a new user')

'Causes the UI to display the password requirements before entering the password in the form, otherwise the following error occurs: "invalid element state: Element is not currently interactable and may not be manipulated."'
WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Password (7)'))

WebUI.setText(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/input_firstName (4)'), 'Peter')

WebUI.setText(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/input_lastName (4)'), 'Gibbons')

WebUI.setText(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/input_emailAddress (4)'), uniqueUSEmail)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/input_password (5)'), 'yrXHdmw+Di/576oxJz3/0g==')

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/button_Next (3)'))

WebUI.comment('Enter shipping and credit card information')

WebUI.setText(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/input_shipping.firstName (2)'), 'Bill')

WebUI.setText(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/input_shipping.lastName (2)'), 'Lumbergh')

WebUI.setText(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/input_shipping.streetAddress1 (2)'), 
    '4683 Chabot Drive')

WebUI.setText(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/input_shipping.streetAddress2 (2)'), 
    'Suite 200')

WebUI.setText(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/input_shipping.city (2)'), 'Pleasanton')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/select_AAACAEAFAKALAMAPARAZCAC (3)'), 
    'California', true)

WebUI.setText(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/input_shipping.postCode (2)'), '94588')

WebUI.setText(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/input_payment.creditCardNumber (2)'), 
    '4977949494949497')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/select_01020304050607080910111 (3)'), 
    '10', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/select_16171819202122232425262 (3)'), 
    '20', true)

WebUI.setText(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/input_payment.cvv (2)'), '737')

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/button_Review Your Order (2)'))

WebUI.delay(10)

WebUI.comment('Test - Check for correct sales tax calculation and currency symbol')

'Get the string for the total amount and store it into the variable "dollar_amount"'
dollar_amount = WebUI.getText(findTestObject('Page_Beauty Box Subscription for Wo/div_checkout_total'), FailureHandling.STOP_ON_FAILURE)

'Check the string against a regex for the correct U.S. currency format'
WebUI.verifyMatch(dollar_amount, '^\\$[0-9]+\\.[0-9]{2}$', true)

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/button_Confirm Subscription (2)'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/button_Confirm Subscription (2)'))

WebUI.delay(2)

WebUI.comment('Test - Fill in profile as directed when you subscribed')

'This while loop doesn\'t seem to work'
not_run: while (!(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Go to your profile (2)'))) {
}

WebUI.delay(15)

'Can\'t get this statement to work properly to catch a 503 error'
WebUI.verifyElementNotPresent(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_503Backend fetch failed'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Go to your profile (2)'))

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_SkinComplexion concerns co (2)'))

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

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Close (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Beauty Style (2)'))

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Beauty Style (2)'))

WebUI.waitForElementClickable(findTestObject('Page_Beauty Box Subscription for Wo/div_Newbie Ill take all the he (2)'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Newbie Ill take all the he (2)'))

WebUI.waitForElementClickable(findTestObject('Page_Beauty Box Subscription for Wo/div_Adventurous Ill try any pr (2)'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Adventurous Ill try any pr (2)'))

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Classic I tend towards the (2)'))

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Trendy Im the first to pic (2)'))

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Low-maintenance I often ke (2)'))

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Next (2)'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Page_Beauty Box Subscription for Wo/div_Bath and body (2)'), 0)

WebUI.waitForElementClickable(findTestObject('Page_Beauty Box Subscription for Wo/div_Bath and body (2)'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Bath and body (2)'))

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Fragrance (2)'))

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Haircare (2)'))

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Makeup (3)'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Makeup (3)'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Skincare (2)'))

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Next (2)'))

WebUI.delay(1)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Anytime (2)'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Anytime (2)'))

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('Page_Beauty Box Subscription for Wo/div_Yes please (2)'), 0)

WebUI.waitForElementClickable(findTestObject('Page_Beauty Box Subscription for Wo/div_Yes please (2)'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Yes please (2)'))

WebUI.delay(1)

WebUI.waitForElementClickable(findTestObject('Page_Beauty Box Subscription for Wo/div_Beauty-related tools (2)'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Beauty-related tools (2)'))

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Organic and natural produc (2)'))

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Small accessories (2)'))

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Wellness-related items (2)'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Wellness-related items (2)'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Products for a mom (2)'))

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Close (1)'))

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_More About You...and all t (2)'))

WebUI.comment('Issue - Not sure how to enter the date of birth at this point, so the script just selects the Next button')

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Next (2)'))

WebUI.waitForElementClickable(findTestObject('Page_Beauty Box Subscription for Wo/div_Other race ethnicity or an (2)'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Other race ethnicity or an (2)'))

WebUI.delay(1)

WebUI.waitForElementClickable(findTestObject('Page_Beauty Box Subscription for Wo/div_Under 36000 (2)'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Under 36000 (2)'))

WebUI.delay(1)

WebUI.waitForElementClickable(findTestObject('Page_Beauty Box Subscription for Wo/div_I want lots of beauty samp (2)'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_I want lots of beauty samp (2)'))

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Id like to experiment with (2)'))

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_I dont have time to shop f (2)'))

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_I want to receive relevant (2)'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_I want to receive relevant (2)'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Its hard to buy high-end b (2)'))

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Other (2)'))

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Next (2)'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Friend family or coworker (2)'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Friend family or coworker (2)'))

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Given to me as a gift (2)'))

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Search (e.g. Google Bing) (2)'))

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Facebook (2)'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Facebook (2)'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Instagram (2)'))

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Youtube (2)'))

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Other social media (e.g. T (2)'))

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_TV advertising'))

WebUI.scrollToElement(findTestObject('Page_Beauty Box Subscription for Wo/div_TV advertising'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Podcasts'))

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Other advertising (banner'))

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Partnership - other (e.g.'))

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Personality I follow (e.g.'))

WebUI.scrollToElement(findTestObject('Page_Beauty Box Subscription for Wo/div_Personality I follow (e.g.'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Media coverage (e.g. artic'))

WebUI.scrollToElement(findTestObject('Page_Beauty Box Subscription for Wo/div_Other (2)'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Birchbox physical store (N'))

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Other (2)'))

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Close (1)'))

'Select the Birchbox button to return to the home screen'
WebUI.waitForElementClickable(findTestObject('Page_Beauty Box Subscription for Wo/svg_icon__Birchbox'), 0)

'Select the Birchbox button to return to the home screen'
WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/svg_icon__Birchbox'))

