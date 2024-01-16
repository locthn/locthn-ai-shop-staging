import com.katalon.truetest.select.Select as Select
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.model.FailureHandling

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Navigate to Page home --> navigate to Page parabank overview htm'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/parabank/overview.htm')

'step 2: Login at Page parabank overview htm'

'--> At login page input username'

testObj = findTestObject('AI-Generated/Page_parabank_index_htm/input_username')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/parabank/index.htm/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, GlobalVariable.username)

'--> At login page input password'

testObj = findTestObject('AI-Generated/Page_parabank_index_htm/input_password')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/parabank/index.htm/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, GlobalVariable.password)

'--> At login page submit login form'

testObj = findTestObject('AI-Generated/Page_parabank_index_htm/form_login_info')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/parabank/index.htm/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.submit(testObj)

'--> Wait for login action to be completed'

WebUI.delay(15)

'step 3: At Page parabank overview htm click on hyperlink parabank openaccount htm --> navigate to Page parabank openaccount htm'

testObj = findTestObject('AI-Generated/Page_parabank_overview_htm/hyperlink_parabank_openaccount_htm')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/parabank/overview.htm/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 4: At Page parabank openaccount htm select on select type'

testObj = findTestObject('AI-Generated/Page_parabank_openaccount_htm/select_type')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/parabank/openaccount.htm/?(?:#.*)?(?:\\?.*)?$', true)

Select.selectOption(testObj, '1')

'step 5: At Page parabank openaccount htm select on select fromaccountid'

testObj = findTestObject('AI-Generated/Page_parabank_openaccount_htm/select_fromaccountid')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/parabank/openaccount.htm/?(?:#.*)?(?:\\?.*)?$', true)

Select.selectOption(testObj, '1')

'step 6: At Page parabank openaccount htm submit on form object'

testObj = findTestObject('AI-Generated/Page_parabank_openaccount_htm/form_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/parabank/openaccount.htm/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.submit(testObj)

'step 7: At Page parabank openaccount htm click on hyperlink parabank transfer htm --> navigate to Page parabank transfer htm'

testObj = findTestObject('AI-Generated/Page_parabank_openaccount_htm/hyperlink_parabank_transfer_htm')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/parabank/openaccount.htm/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 8: Add visual checkpoint at Page parabank transfer htm'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00001_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
