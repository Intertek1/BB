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

'Enable this line only when running this test case by itself'
not_run: WebUI.callTestCase(findTestCase('US mobile test/Launch the Birchbox site in the required locale - US (www.staging.birchbox.com)'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/svg_icon__hamburger_menu (1)'))

WebUI.waitForElementVisible(findTestObject('Page_Beauty Box Subscription for Wo/div_Collections (4)'), 0)

WebUI.waitForElementClickable(findTestObject('Page_Beauty Box Subscription for Wo/div_Collections (4)'), 0)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Collections (4)'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Limited Edition Boxes'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Limited Edition Boxes'))

WebUI.delay(3)

WebUI.waitForElementClickable(findTestObject('Page_Shop Limited Edition Boxes/svg_ 2018 Birchbox_icon__svg__'), 0)

WebUI.click(findTestObject('Page_Shop Limited Edition Boxes/svg_ 2018 Birchbox_icon__svg__'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Collections (4)'))

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Shop Limited Edition Boxes/div_Birchbox Discovery Kits'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Shop Limited Edition Boxes/div_Birchbox Discovery Kits'))

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('Page_Birchbox Discovery Kits/svg_ 2018 Birchbox_icon__svg__'), 0)

WebUI.click(findTestObject('Page_Birchbox Discovery Kits/svg_ 2018 Birchbox_icon__svg__'))

WebUI.waitForElementVisible(findTestObject('Page_Beauty Box Subscription for Wo/div_Collections (4)'), 0)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Collections (4)'))

WebUI.click(findTestObject('Object Repository/Page_Birchbox Discovery Kits/div_Birchbox Exclusives'))

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('Page_Shop Birchbox Exclusives/svg_ 2018 Birchbox_icon__svg__'), 0)

WebUI.click(findTestObject('Page_Shop Birchbox Exclusives/svg_ 2018 Birchbox_icon__svg__'))

WebUI.waitForElementVisible(findTestObject('Page_Beauty Box Subscription for Wo/div_Collections (4)'), 0)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Collections (4)'))

WebUI.click(findTestObject('Object Repository/Page_Shop Birchbox Exclusives/div_Best-Sellers'))

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('Page_Shop Best Sellers/svg_ 2018 Birchbox_icon__svg__'), 0)

WebUI.click(findTestObject('Page_Shop Best Sellers/svg_ 2018 Birchbox_icon__svg__'))

WebUI.delay(1)

WebUI.waitForElementClickable(findTestObject('Page_Beauty Box Subscription for Wo/svg_icon__hamburger_menu (1)'), 0)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/svg_icon__hamburger_menu (1)'))

WebUI.waitForElementVisible(findTestObject('Page_Beauty Box Subscription for Wo/div_Collections (4)'), 0)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Collections (4)'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Best Sellers/div_Gifts with Purchase'))

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('Page_Beauty Box Subscription for Wo/svg_icon__hamburger_menu (1)'), 0)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/svg_icon__hamburger_menu (1)'))

WebUI.waitForElementVisible(findTestObject('Page_Beauty Box Subscription for Wo/div_Collections (4)'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Collections (4)'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Page_Shop Best Sellers/div_Gifts with Purchase'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_ARROW'))

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/svg_ 2018 Birchbox_icon__svg__'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/svg_ 2018 Birchbox_icon__svg__'))

WebUI.waitForElementVisible(findTestObject('Page_Beauty Box Subscription for Wo/div_Collections (4)'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Collections (4)'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Page_Shop Best Sellers/div_Gifts with Purchase'), 0)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Love of Color'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Love of Color'))

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('Page_Shop Love of Color/svg_ 2018 Birchbox_icon__svg__'), 0)

WebUI.click(findTestObject('Page_Shop Love of Color/svg_ 2018 Birchbox_icon__svg__'))

WebUI.waitForElementVisible(findTestObject('Page_Beauty Box Subscription for Wo/div_Collections (4)'), 0)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Collections (4)'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Page_Shop Best Sellers/div_Gifts with Purchase'), 0)

WebUI.click(findTestObject('Object Repository/Page_Shop Love of Color/a_PARLOR by Jeff Chastain'))

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('Page_Shop Parlor/svg_ 2018 Birchbox_icon__svg__'), 0)

WebUI.click(findTestObject('Page_Shop Parlor/svg_ 2018 Birchbox_icon__svg__'))

WebUI.waitForElementVisible(findTestObject('Page_Beauty Box Subscription for Wo/div_Collections (4)'), 0)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Collections (4)'))

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Page_Shop Best Sellers/div_Gifts with Purchase'), 0)

WebUI.click(findTestObject('Object Repository/Page_Shop Parlor/a_Lifestyle'))

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Shop Lifestyle Products/svg_ 2018 Birchbox_icon__svg__'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Shop Lifestyle Products/svg_ 2018 Birchbox_icon__svg__'))

WebUI.waitForElementVisible(findTestObject('Page_Beauty Box Subscription for Wo/div_Collections (4)'), 0)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Collections (4)'))

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Page_Shop Best Sellers/div_Gifts with Purchase'), 0)

WebUI.click(findTestObject('Object Repository/Page_Shop Lifestyle Products/a_Nails'))

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Shop Nails/svg_ 2018 Birchbox_icon__svg__'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Shop Nails/svg_ 2018 Birchbox_icon__svg__'))

WebUI.waitForElementVisible(findTestObject('Page_Beauty Box Subscription for Wo/div_Collections (4)'), 0)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Collections (4)'))

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Page_Shop Best Sellers/div_Gifts with Purchase'), 0)

WebUI.click(findTestObject('Object Repository/Page_Shop Nails/a_Fragrance'))

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Shop Fragrance/svg_ 2018 Birchbox_icon__svg__'), 0)

WebUI.click(findTestObject('Object Repository/Page_Shop Fragrance/svg_ 2018 Birchbox_icon__svg__'))

WebUI.waitForElementVisible(findTestObject('Page_Beauty Box Subscription for Wo/div_Collections (4)'), 0)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Collections (4)'))

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Page_Shop Best Sellers/div_Gifts with Purchase'), 0)

WebUI.click(findTestObject('Object Repository/Page_Shop Fragrance/a_Value Sets'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Holiday Gifts/svg_ 2018 Birchbox_icon__svg__'))

WebUI.waitForElementVisible(findTestObject('Page_Beauty Box Subscription for Wo/div_Collections (4)'), 0)

WebUI.waitForElementClickable(findTestObject('Page_Beauty Box Subscription for Wo/div_Collections (4)'), 0)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Collections (4)'))

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Page_Shop Best Sellers/div_Gifts with Purchase'), 0)

WebUI.click(findTestObject('Object Repository/Page_Shop Holiday Gifts/a_25 and Under'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Shop 25 and Under/svg_ 2018 Birchbox_icon__svg__'))

WebUI.waitForElementVisible(findTestObject('Page_Beauty Box Subscription for Wo/div_Collections (4)'), 0)

WebUI.waitForElementClickable(findTestObject('Page_Beauty Box Subscription for Wo/div_Collections (4)'), 0)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Collections (4)'))

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Page_Shop Best Sellers/div_Gifts with Purchase'), 0)

WebUI.click(findTestObject('Object Repository/Page_Shop 25 and Under/a_Sale'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Sale/svg_ 2018 Birchbox_icon__svg__'))

WebUI.waitForElementVisible(findTestObject('Page_Beauty Box Subscription for Wo/div_Collections (4)'), 0)

WebUI.waitForElementClickable(findTestObject('Page_Beauty Box Subscription for Wo/div_Collections (4)'), 0)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Collections (4)'))

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Page_Shop Best Sellers/div_Gifts with Purchase'), 0)

WebUI.click(findTestObject('Object Repository/Page_Shop Sale/a_Shop by brand'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/svg_ 2018 Birchbox_icon__svg__'))

WebUI.waitForElementVisible(findTestObject('Page_Beauty Box Subscription for Wo/div_Collections (4)'), 0)

WebUI.waitForElementClickable(findTestObject('Page_Beauty Box Subscription for Wo/div_Collections (4)'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Collections (4)'))

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Page_Shop Best Sellers/div_Gifts with Purchase'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Whats New'))

