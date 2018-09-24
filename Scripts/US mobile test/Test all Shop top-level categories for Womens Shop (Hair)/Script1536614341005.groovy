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

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/svg_ 2018 Birchbox_icon__svg__'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Hair'))

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Wash  Care'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Shampoos'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Shampoos/svg_ 2018 Birchbox_icon__svg__'))

WebUI.click(findTestObject('Object Repository/Page_Shop Shampoos/div_Hair'))

WebUI.click(findTestObject('Object Repository/Page_Shop Shampoos/div_Wash  Care'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Conditioners'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Conditioners'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Conditioners'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Hair Conditioners/svg_ 2018 Birchbox_icon__svg__'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_Shop Hair Conditioners/div_Hair'))

WebUI.click(findTestObject('Object Repository/Page_Shop Hair Conditioners/div_Wash  Care'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Cleansing Conditioners'), 
    0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Cleansing Conditioners'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Cleansing Conditioners'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Hair Cleansing Conditione/svg_ 2018 Birchbox_icon__svg__'))

WebUI.click(findTestObject('Object Repository/Page_Shop Hair Cleansing Conditione/div_Hair'))

WebUI.click(findTestObject('Object Repository/Page_Shop Hair Cleansing Conditione/div_Treat'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Detanglers'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Detanglers'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Detanglers'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Hair Detanglers/svg_ 2018 Birchbox_icon__svg__'))

WebUI.click(findTestObject('Object Repository/Page_Shop Hair Detanglers/div_Hair'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Shop Hair Detanglers/div_Treat'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Shop Hair Detanglers/div_Treat'), 0)

WebUI.click(findTestObject('Object Repository/Page_Shop Hair Detanglers/div_Treat'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Leave-In Conditioners'), 
    0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Leave-In Conditioners'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Leave-In Conditioners'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Leave-In Conditioners/svg_ 2018 Birchbox_icon__svg__'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Shop Leave-In Conditioners/div_Hair'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Shop Leave-In Conditioners/div_Hair'), 0)

WebUI.click(findTestObject('Object Repository/Page_Shop Leave-In Conditioners/div_Hair'))

WebUI.click(findTestObject('Object Repository/Page_Shop Leave-In Conditioners/div_Treat'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Oils'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Oils'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Oils'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Hair Oils/svg_ 2018 Birchbox_icon__svg__'))

WebUI.click(findTestObject('Object Repository/Page_Shop Hair Oils/div_Hair'))

WebUI.click(findTestObject('Object Repository/Page_Shop Hair Oils/div_Treat'))

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Masks'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Masks'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Masks'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Hair Masks/svg_ 2018 Birchbox_icon__svg__'))

WebUI.click(findTestObject('Object Repository/Page_Shop Hair Masks/div_Hair'))

WebUI.click(findTestObject('Object Repository/Page_Shop Hair Masks/div_Treat'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Pre-Shampoo Treatments'), 
    0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Pre-Shampoo Treatments'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Pre-Shampoo Treatments'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Pre Shampoo Treatment/svg_ 2018 Birchbox_icon__svg__'))

WebUI.click(findTestObject('Object Repository/Page_Shop Pre Shampoo Treatment/div_Hair'))

WebUI.click(findTestObject('Object Repository/Page_Shop Pre Shampoo Treatment/div_Treat'))

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Scalp Treatments  Exfoliator'), 
    0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Scalp Treatments  Exfoliator'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Scalp Treatments  Exfoliator'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Scalp Treatments and Scal/svg_ 2018 Birchbox_icon__svg__'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Shop Scalp Treatments and Scal/div_Hair'), 0)

WebUI.click(findTestObject('Object Repository/Page_Shop Scalp Treatments and Scal/div_Hair'))

WebUI.click(findTestObject('Object Repository/Page_Shop Scalp Treatments and Scal/div_Treat'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Split End Treatments'), 
    0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Split End Treatments'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Split End Treatments'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Split End Treatments/svg_ 2018 Birchbox_icon__svg__'))

WebUI.click(findTestObject('Object Repository/Page_Shop Split End Treatments/div_Hair'))

WebUI.click(findTestObject('Object Repository/Page_Shop Split End Treatments/div_Treat'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Color Treatments'), 
    0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Color Treatments'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Color Treatments'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Hair Color Treatments/svg_ 2018 Birchbox_icon__svg__'))

WebUI.click(findTestObject('Object Repository/Page_Shop Hair Color Treatments/div_Hair'))

WebUI.click(findTestObject('Object Repository/Page_Shop Hair Color Treatments/div_Style'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Texturizers'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Texturizers'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Texturizers'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Texturizers/svg_ 2018 Birchbox_icon__svg__'))

WebUI.click(findTestObject('Object Repository/Page_Shop Texturizers/div_Hair'))

WebUI.click(findTestObject('Object Repository/Page_Shop Texturizers/div_Style'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Blowout Creams  Sprays'), 
    0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Blowout Creams  Sprays'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Blowout Creams  Sprays'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Styling Cremes/svg_ 2018 Birchbox_icon__svg__'))

WebUI.click(findTestObject('Object Repository/Page_Shop Styling Cremes/div_Hair'))

WebUI.click(findTestObject('Object Repository/Page_Shop Styling Cremes/div_Style'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Hairsprays'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Hairsprays'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Hairsprays'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Hairsprays/svg_ 2018 Birchbox_icon__svg__'))

WebUI.click(findTestObject('Object Repository/Page_Shop Hairsprays/div_Hair'))

WebUI.click(findTestObject('Object Repository/Page_Shop Hairsprays/div_Style'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Wave Sprays'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Wave Sprays'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Wave Sprays'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Wave Sprays/svg_ 2018 Birchbox_icon__svg__'))

WebUI.click(findTestObject('Object Repository/Page_Shop Wave Sprays/div_Hair'))

WebUI.click(findTestObject('Object Repository/Page_Shop Wave Sprays/div_Style'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Heat Protectants'), 
    0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Heat Protectants'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Heat Protectants'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Hair Heat Protectants/svg_ 2018 Birchbox_icon__svg__'))

WebUI.click(findTestObject('Object Repository/Page_Shop Hair Heat Protectants/div_Hair'))

WebUI.click(findTestObject('Object Repository/Page_Shop Hair Heat Protectants/div_Style'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Volumizers'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Volumizers'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Volumizers'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Hair Volumizers/svg_ 2018 Birchbox_icon__svg__'))

WebUI.click(findTestObject('Object Repository/Page_Shop Hair Volumizers/div_Hair'))

WebUI.click(findTestObject('Object Repository/Page_Shop Hair Volumizers/div_Style'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Page_Beauty Box Subscription for Wo/a_Air Dry Creams  Sprays'), 0)

WebUI.waitForElementClickable(findTestObject('Page_Beauty Box Subscription for Wo/a_Air Dry Creams  Sprays'), 0)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/a_Air Dry Creams  Sprays'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Hair/svg_ 2018 Birchbox_icon__svg__'))

WebUI.click(findTestObject('Object Repository/Page_Shop Hair/div_Hair'))

WebUI.click(findTestObject('Object Repository/Page_Shop Hair/div_Style'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Curl Creams  Sprays'), 
    0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Curl Creams  Sprays'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Curl Creams  Sprays'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Shop Hair Curl Creams and Hair/svg_ 2018 Birchbox_icon__svg__'))

WebUI.click(findTestObject('Object Repository/Page_Shop Hair Curl Creams and Hair/div_Hair'))

WebUI.click(findTestObject('Object Repository/Page_Shop Hair Curl Creams and Hair/div_Style'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Gels'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Gels'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Gels'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Hair Styling Products from Bir/svg_ 2018 Birchbox_icon__svg__'))

WebUI.click(findTestObject('Object Repository/Page_Hair Styling Products from Bir/div_Hair'))

WebUI.click(findTestObject('Object Repository/Page_Hair Styling Products from Bir/div_Style'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Mousses'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Mousses'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Mousses'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Hair Mousse/svg_ 2018 Birchbox_icon__svg__'))

WebUI.click(findTestObject('Object Repository/Page_Shop Hair Mousse/div_Hair'))

WebUI.click(findTestObject('Object Repository/Page_Shop Hair Mousse/div_Style'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Hot Tools (2)'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Hot Tools (2)'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Hot Tools (2)'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Hair Tools/svg_ 2018 Birchbox_icon__svg__'))

WebUI.click(findTestObject('Object Repository/Page_Shop Hair Tools/div_Hair'))

WebUI.click(findTestObject('Object Repository/Page_Shop Hair Tools/div_Extend'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Dry Shampoos'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Dry Shampoos'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Dry Shampoos'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Dry Shampoos/svg_ 2018 Birchbox_icon__svg__'))

WebUI.click(findTestObject('Object Repository/Page_Shop Dry Shampoos/div_Hair'))

WebUI.click(findTestObject('Object Repository/Page_Shop Dry Shampoos/div_Extend'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Dry Conditioners'), 
    0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Dry Conditioners'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Dry Conditioners'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Dry Conditioners/svg_ 2018 Birchbox_icon__svg__'))

WebUI.click(findTestObject('Object Repository/Page_Shop Dry Conditioners/div_Hair'))

WebUI.click(findTestObject('Object Repository/Page_Shop Dry Conditioners/div_Extend'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Re-styling Creams  Sprays'), 
    0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Re-styling Creams  Sprays'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Re-styling Creams  Sprays'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Hair Restyler Cream  Hair/svg_ 2018 Birchbox_icon__svg__'))

WebUI.click(findTestObject('Object Repository/Page_Shop Hair Restyler Cream  Hair/div_Hair'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Shop Hair Restyler Cream  Hair/div_See all Haircare'), 
    0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Shop Hair Restyler Cream  Hair/div_See all Haircare'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Shop Hair Restyler Cream  Hair/div_See all Haircare'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/svg_ 2018 Birchbox_icon__svg__'))

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Hair'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Best Sellers'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Best Sellers'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Best Sellers'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Hair Best Sellers/svg_ 2018 Birchbox_icon__svg__'))

WebUI.click(findTestObject('Object Repository/Page_Shop Hair Best Sellers/div_Hair'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Shop Hair Best Sellers/a_Hair Sets'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Shop Hair Best Sellers/a_Hair Sets'), 0)

WebUI.click(findTestObject('Object Repository/Page_Shop Hair Best Sellers/a_Hair Sets'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Hair Sets/svg_ 2018 Birchbox_icon__svg__'))

WebUI.click(findTestObject('Object Repository/Page_Shop Hair Sets/div_Hair'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Shop Hair Sets/a_Hair Brushes  Tools'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Shop Hair Sets/a_Hair Brushes  Tools'), 0)

WebUI.click(findTestObject('Object Repository/Page_Shop Hair Sets/a_Hair Brushes  Tools'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Hair Tools/svg_ 2018 Birchbox_icon__svg__'))

WebUI.click(findTestObject('Object Repository/Page_Shop Hair Tools/div_Hair'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Shop Hair Tools/a_Travel Products'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Shop Hair Tools/a_Travel Products'), 0)

WebUI.click(findTestObject('Object Repository/Page_Shop Hair Tools/a_Travel Products'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Travel Size Hair Products/svg_ 2018 Birchbox_icon__svg__'))

WebUI.click(findTestObject('Object Repository/Page_Shop Travel Size Hair Products/div_Hair'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Shop Travel Size Hair Products/a_Gifts with Purchase'), 
    0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Shop Travel Size Hair Products/a_Gifts with Purchase'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Shop Travel Size Hair Products/a_Gifts with Purchase'))

WebUI.delay(2)

