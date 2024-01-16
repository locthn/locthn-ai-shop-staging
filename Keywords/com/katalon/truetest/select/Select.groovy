package com.katalon.truetest.select

import org.openqa.selenium.By
import org.openqa.selenium.WebElement
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

class Select {
    
    private Select() {}

    public static void selectOption(TestObject to, String value) {
        try {
			WebUI.selectOptionByLabel(to, value, false)
		} catch (RuntimeException labelErr) {
			try {
				WebUI.selectOptionByValue(to, value, false)
			}
			catch (RuntimeException valueErr) {
				WebElement dropdown = WebUI.findWebElement(to, 10)
				List<WebElement> optionWithNoValue= dropdown.findElements(By.xpath("//option[not(@value)]"))
				List<WebElement> optionWithValue= dropdown.findElements(By.xpath("//option[@value]"))
				// Check if the first option in the dropdown is a description or definition, not a valid option value
				int index = optionWithNoValue.isEmpty() ? optionWithValue.size() - 1 : optionWithValue.size()
				WebUI.selectOptionByIndex(to, index)
			}
		}
    }
}