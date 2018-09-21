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

Mobile.startApplication('C:\\Users\\vbrooks\\Downloads\\Birchbox_2.10.1.apk', true)

int device_height = Mobile.getDeviceHeight()

int device_width = Mobile.getDeviceWidth()

int startY = device_height / 2

int endY = device_height / 2

int startX = device_width * 0.6

int endX = device_width * 0.4

Mobile.comment('swipe exactly 7 times right to left')

for (int x = 1; x < 7; x++) {
    Mobile.swipe(startX, startY, endX, endY)

    Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)
}

Mobile.tap(findTestObject('Android/android.widget.Button0 - SIGN IN'), 0)

Mobile.setText(findTestObject('Android/android.widget.EditText0 - Email'), 'birchbox.intertek+us08172018@gmail.com', 0)

Mobile.setText(findTestObject('Android/android.widget.EditText1'), 'Sentry670', 0)

Mobile.tap(findTestObject('Android/android.widget.TextView5 - SIGN IN'), 0)

Mobile.closeApplication()

