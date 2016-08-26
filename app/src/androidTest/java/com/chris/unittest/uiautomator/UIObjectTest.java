package com.chris.unittest.uiautomator;

import android.support.test.InstrumentationRegistry;
import android.support.test.uiautomator.UiAutomatorTestCase;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;

/**
 * Email: suoyiman@163.coom
 */
public class UIObjectTest extends UiAutomatorTestCase{
    public void testClick() throws UiObjectNotFoundException {
        UiDevice uiDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        UiObject appmenu = new UiObject(new UiSelector().description("Apps"));
        //googleMenu.click();
        appmenu.clickAndWaitForNewWindow();//default 5000ms
        sleep(3000);
        uiDevice.pressBack();
        sleep(3000);
        appmenu.clickTopLeft();
        sleep(3000);
        uiDevice.pressBack();
        sleep(3000);
        appmenu.longClick();
        sleep(3000);
        uiDevice.pressBack();
    }
}
