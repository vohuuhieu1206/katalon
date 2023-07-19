import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

def emailMap = [
	account1: [email: 'hieu@gmail.com', passs: '1234'],
	account2: [email: 'vo@gmail.com', passs: '1234'],
	account3: [email: 'huu@gmail.com', passs: '1234'],
	account4: [email: 'thi@gmail.com', passs: '1234'],
	account5: [email: 'nguyeno@gmail.com', pass: '1234']]

WebUI.openBrowser('https://auto2023.myshopify.com/account/login')
WebUI.maximizeWindow()
for(def i=0; i<5; i++) {
	WebUI.setText(findTestObject('Object Repository/Buoi3/input_email'), emailMap.account1.email)
}
WebUI.setText(findTestObject('Object Repository/Buoi3/input_password'), emailMap.account1.pass)
WebUI.click(findTestObject('Object Repository/Buoi3/btn_signin'))
WebUI.takeScreenshot('Data\\Signin.png')