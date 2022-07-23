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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://staging.radyalabs.id:7008/login')

WebUI.setText(findTestObject('Object Repository/input_LOGISTIC OPERATION PORTAL_app_login_f_a564cc'), 'sa')

WebUI.setEncryptedText(findTestObject('Object Repository/input_LOGISTIC OPERATION PORTAL_ant-input n_179a44'), 'OyqPNYkJe4LEt+jNUgtSAg==')

WebUI.click(findTestObject('Object Repository/button_MASUK'))

WebUI.click(findTestObject('Object Repository/div_Master Data'))

WebUI.click(findTestObject('Object Repository/a_General'))

WebUI.click(findTestObject('Object Repository/div_Cabang'))

WebUI.click(findTestObject('Object Repository/button_Edit'))

WebUI.setText(findTestObject('Object Repository/input_Kode Cabang_ant-input ng-tns-c126-43 _e65089'), 'Testing123')

WebUI.setText(findTestObject('Object Repository/input_Nama Cabang_ant-input ng-tns-c126-44 _a242a7'), 'PT. Tiaraa')

WebUI.setText(findTestObject('Object Repository/input_Penanggung Jawab_ant-input ng-tns-c12_ed564c'), 'Tiaraa')

WebUI.setText(findTestObject('Object Repository/input_Email Penanggung Jawab_ant-input ng-t_7f7d35'), 'tiara@mail.id')

WebUI.click(findTestObject('Object Repository/button_Simpan'))

WebUI.click(findTestObject('Object Repository/th_Kode Cabang'))

