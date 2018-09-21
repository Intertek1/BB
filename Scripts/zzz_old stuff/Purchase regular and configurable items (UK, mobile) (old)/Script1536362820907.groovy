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

'Enable this line only when running this test case by itself'
not_run: WebUI.openBrowser('')

'Enable this line only when running this test case by itself on a PC'
not_run: WebUI.setViewPortSize(400, 900)

'Enable this line only when running this test case by itself'
not_run: WebUI.navigateToUrl('https://www.staging.birchbox.co.uk/')

WebUI.waitForElementClickable(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_barNarrow__menu___3BAeI ut'), 0)

'Tap the hamburger menu'
WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_barNarrow__menu___3BAeI ut'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Make-Up'))

'Navigate to the makeup category'
WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/a_All Make-Up'))

WebUI.comment('Load multiple pages of content which should ensure that the product the script is looking for is listed')

WebUI.click(findTestObject('Page_Make-Up/div_Load More Products'))

WebUI.click(findTestObject('Page_Make-Up/div_Load More Products'))

WebUI.click(findTestObject('Page_Make-Up/div_Load More Products'))

WebUI.click(findTestObject('Page_Make-Up/div_Load More Products'))

WebUI.click(findTestObject('Page_Make-Up/div_Load More Products'))

WebUI.click(findTestObject('Page_Make-Up/div_Load More Products'))

WebUI.click(findTestObject('Page_Make-Up/div_Load More Products'))

WebUI.click(findTestObject('Page_Make-Up/div_Load More Products'))

WebUI.click(findTestObject('Page_Make-Up/div_Load More Products'))

WebUI.click(findTestObject('Page_Make-Up/div_Load More Products'))

WebUI.click(findTestObject('Page_Make-Up/div_Load More Products'))

WebUI.scrollToElement(findTestObject('Page_Make-Up/div_Benefit Roller Lash28420.5'), 0)

WebUI.click(findTestObject('Object Repository/Page_Make-Up/a_Benefit Roller Lash'))

WebUI.scrollToElement(findTestObject('Page_Benefit Roller Lash/div_Add to Basket 20.50'), 0)

WebUI.click(findTestObject('Page_Benefit Roller Lash/div_Add to Basket 20.50'))

'Tap the hamburger menu'
WebUI.click(findTestObject('Page_Benefit Roller Lash/div_barNarrow__menu___3BAeI ut'))

WebUI.click(findTestObject('Page_Benefit Roller Lash/div_Make-Up'))

WebUI.click(findTestObject('Page_Benefit Roller Lash/a_All Make-Up'))

WebUI.comment('Load multiple pages of content which should ensure that the product the script is looking for is listed')

WebUI.click(findTestObject('Page_Make-Up/div_Load More Products'))

WebUI.click(findTestObject('Page_Make-Up/div_Load More Products'))

WebUI.click(findTestObject('Page_Make-Up/div_Load More Products'))

WebUI.click(findTestObject('Page_Make-Up/div_Load More Products'))

WebUI.click(findTestObject('Page_Make-Up/div_Load More Products'))

WebUI.click(findTestObject('Page_Make-Up/div_Load More Products'))

WebUI.click(findTestObject('Page_Make-Up/div_Load More Products'))

WebUI.click(findTestObject('Page_Make-Up/div_Load More Products'))

WebUI.click(findTestObject('Page_Make-Up/div_Load More Products'))

WebUI.scrollToElement(findTestObject('Page_Make-Up/a_Caudalie Vinoperfect Radianc'), 0)

WebUI.click(findTestObject('Page_Make-Up/a_Caudalie Vinoperfect Radianc'))

WebUI.click(findTestObject('Page_Caudalie Vinoperfect Radiance/img_image__absolute___2DQnl ut'))

WebUI.click(findTestObject('Page_Caudalie Vinoperfect Radiance/div_Add to Basket 27.00'))

WebUI.click(findTestObject('Page_Caudalie Vinoperfect Radiance/svg_icon__svg___cc1CR utilitie'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/a_Checkout'))

WebUI.comment('Add the item to the favorites and purchase it from there')

'Click the favorites icon (heart)'
WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/svg_icon__svg___cc1CR utilitie'))

'Select the "My Favorites" list'
WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/svg_icon__svg___cc1CR utilitie_4'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Continue'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/svg_icon__svg___cc1CR utilitie_2'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_TestFirstName TestLastName'))

not_run: WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Continue'))

not_run: WebUI.closeBrowser()

