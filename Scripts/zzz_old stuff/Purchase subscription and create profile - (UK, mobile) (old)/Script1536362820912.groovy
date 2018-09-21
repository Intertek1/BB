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

WebUI.comment('Create a unique email address')

'Store the current date and time'
date = new Date()

'Store the date and time in the format month/day/year/hour/minute'
datetimeMMddyyhhmm = date.format('MMddyyhhmm')

'Create a unique email address using the formatted date and time'
uniqueUKEmail = (('birchbox.intertek+uk' + datetimeMMddyyhhmm) + '@gmail.com')

'Enable this line only when running this test case by itself'
not_run: WebUI.openBrowser('')

'Enable this line only when running this test case by itself on a PC'
not_run: WebUI.setViewPortSize(400, 900)

'Enable this line only when running this test case by itself'
not_run: WebUI.navigateToUrl('http://www.staging.birchbox.co.uk/')

'Dismiss the blue notification at the top'
WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_cookieNotice__remove___2-T'))

WebUI.comment('Test - Navigate to the subscription page and initiate a purchase')

'Tap the hamburger menu'
WebUI.waitForElementClickable(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_barNarrow__menu___3BAeI ut'), 0)

'Tap the hamburger menu'
WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_barNarrow__menu___3BAeI ut'))

WebUI.waitForElementVisible(findTestObject('Page_Birchbox Join the UKs 1 beauty/a_Subscribe'), 0)

'Tap "Subscríbe"'
WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/a_Subscribe'))

WebUI.delay(10)

WebUI.comment('Issue - The next line doesn\'t work sometimes')

'Tap "Get your box"'
WebUI.click(findTestObject('Page_The UKs No.1 Beauty Box/input_button__default___1Nv1u (4)'))

WebUI.comment('Issue - The script sometimes has difficulty scrolling to this next button')

'Scroll to the bottom of the screen'
WebUI.scrollToPosition(0, 99999)

'Allow the user time to manually scroll to the button if the scrolling doesn\'t work'
WebUI.delay(20)

'Tap "Checkout"'
WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/a_Checkout'))

WebUI.comment('Register as a new user')

'Causes the UI to display the password requirements before entering the password in the form, otherwise the following error occurs: "invalid element state: Element is not currently interactable and may not be manipulated."'
WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Password'))

WebUI.setText(findTestObject('Page_Birchbox Join the UKs 1 beauty/input_firstName'), 'Milton')

WebUI.setText(findTestObject('Page_Birchbox Join the UKs 1 beauty/input_lastName'), 'Waddams')

WebUI.setText(findTestObject('Page_Birchbox Join the UKs 1 beauty/input_emailAddress'), uniqueUKEmail)

WebUI.setEncryptedText(findTestObject('Page_Birchbox Join the UKs 1 beauty/input_password'), 'yrXHdmw+Di/576oxJz3/0g==')

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_No I dont want to receive'))

WebUI.scrollToElement(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Next'), 0)

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Next'))

WebUI.comment('Enter shipping information')

WebUI.setText(findTestObject('Page_Birchbox Join the UKs 1 beauty/input_shipping.streetAddress1'), '97 Neville Street')

WebUI.setText(findTestObject('Page_Birchbox Join the UKs 1 beauty/input_shipping.city'), 'IBSTOCK')

WebUI.selectOptionByValue(findTestObject('Page_Birchbox Join the UKs 1 beauty/select_AberdeenshireAlderneyAn'), 'Leicestershire', 
    true)

WebUI.setText(findTestObject('Page_Birchbox Join the UKs 1 beauty/input_shipping.postCode'), 'LE672RB')

WebUI.setText(findTestObject('Page_Birchbox Join the UKs 1 beauty/input_shipping.telephone'), '07918304943')

WebUI.setText(findTestObject('Page_Birchbox Join the UKs 1 beauty/input_payment.creditCardNumber'), '2223520443560010')

WebUI.selectOptionByValue(findTestObject('Page_Birchbox Join the UKs 1 beauty/select_01020304050607080910111'), '10', true)

WebUI.selectOptionByValue(findTestObject('Page_Birchbox Join the UKs 1 beauty/select_16171819202122232425262'), '20', true)

WebUI.setText(findTestObject('Page_Birchbox Join the UKs 1 beauty/input_payment.cvv'), '737')

WebUI.comment('Issue - After selecting the following button, a "503: Backend fetch failed" error often displays on the website.  Not sure why this is, but it never occurs when filling out the form manually and selecting the button.')

'Select "Review Your Order"'
WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Review Your Order'))

WebUI.comment('Issue - The following line is not working properly - Might be an iframe issue')

'Regex that checks for a \'£\' sign, followed by at least one number, a decimal, then exactly two numbers'
not_run: WebUI.verifyTextPresent('£[0-9]+\\.[0-9]{2}', false)

'Scroll to the bottom of the screen'
WebUI.scrollToPosition(0, 99999)

'Select "Place Order and Pay"'
WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/input_button__default___1Nv1u'))

WebUI.comment('Test - Fill in Profile as directed when you subscribed')

WebUI.comment('Issue - Script fails just past this point')

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/a_Go to my Beauty Profile'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_SkinComplexion concerns co'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Normal'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Acne'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Ageing'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Eye puffiness or dark circ'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Hyperpigmentation or dark '))

WebUI.scrollToElement(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Hyperpigmentation or dark'), 0)

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Pores'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Redness rosacea or eczema'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Sensitivity'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Stretch marks'))

WebUI.scrollToElement(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Stretch marks'), 0)

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Sun protection'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Next_1'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Fair  Light'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Yes - only for my face'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Brown'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Afro'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Chemically-treated  colour'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Dry'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Fine'))

WebUI.scrollToElement(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Fine'), 0)

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Frizzy'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Heat-treated'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Oily'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Thick'))

WebUI.scrollToElement(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Thick'), 0)

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Prone to scalp sensitivity'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Too short for a ponytail'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Next_1'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Brown'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Adventurous I love experim'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Newbie Ill take all the he'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Very Id love to try more'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Yes'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Next_1'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Make me feel pampered'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Make me feel more confiden'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Help me try new products'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Help me try new styles'))

WebUI.scrollToElement(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Help me try new styles'), 0)

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Help me find products that'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Help me learn new beauty s'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Close'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/svg_icon__svg___cc1CR utilitie_1'))

