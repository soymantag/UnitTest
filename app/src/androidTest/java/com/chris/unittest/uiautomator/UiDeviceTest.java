package com.chris.unittest.uiautomator;

import android.os.RemoteException;
import android.support.test.InstrumentationRegistry;
import android.support.test.uiautomator.UiAutomatorTestCase;
import android.support.test.uiautomator.UiDevice;

import java.io.File;

/**
 * Email: suoyiman@163.coom
 */
public class UiDeviceTest extends UiAutomatorTestCase{
    /*@Test
    public void testPress() throws UiObjectNotFoundException {
        UiDevice uiDevice= UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        //uiDevice.pressMenu();

//        uiDevice.pressKeyCode(KeyEvent.KEYCODE_A);//a
//        uiDevice.pressKeyCode(KeyEvent.KEYCODE_B);//b
//        uiDevice.pressKeyCode(KeyEvent.KEYCODE_C,1);//C
//
//        uiDevice.click(300,1100);
//        int h=uiDevice.getDisplayHeight();
//        int w=uiDevice.getDisplayWidth();
//        uiDevice.click(h,w);

        UiObject appmenu = new UiObject(new UiSelector().description("Apps"));
        Rect rect = appmenu.getBounds();
        System.out.println(">>"+rect.left+rect.top+rect.right+rect.bottom);
        rect.centerX();
        rect.centerY();

        while(true);
    }*/
    public void testDragAndSwipe(){
        //1step=5ms

        UiDevice uiDevice=UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());

//        //[536,184][712,382]
//        int startX,startY,endX,endY,steps;
//        startX=(712-536)/2+536;
//        startY=(382-184)/2+184;
//        endX=startX+100;
//        endY=startY;
//        steps=400;
//
////        uiDevice.drag(startX,startY,endX,endY,steps);
//
//        int h=uiDevice.getDisplayHeight();
//        int w=uiDevice.getDisplayWidth();
//        uiDevice.swipe(w-50,h/2,50,h/2,10);

//        Point p1 =new Point(10,10);
//        Point p2 = new Point(10,100);
//        Point p3 = new Point(100,100);
//        Point p4 = new Point();
//        p4.x=100;
//        p4.y=10;
//        Point[] pp={p1,p2,p3,p4};
//        uiDevice.swipe(pp,50);
    }
    public void testOrientation() throws RemoteException {
//        UiDevice uiDevice= UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
//        if(uiDevice.isNaturalOrientation()){
//            uiDevice.setOrientationLeft();
//        }
//        uiDevice.setOrientationNatural();
//        int ori = uiDevice.getDisplayRotation();
//        if(ori== Surface.ROTATION_0){
//
//        }
//        if(ori== Surface.ROTATION_90){
//
//        }
//        if(ori== Surface.ROTATION_180){
//
//        }
//        if(ori== Surface.ROTATION_270){
//
//        }
//        while (true);
    }
    public void testWakeupAndSleep() throws RemoteException {
//        if(UiDevice.getInstance(InstrumentationRegistry.getInstrumentation()).isScreenOn()){
//            UiDevice.getInstance(InstrumentationRegistry.getInstrumentation()).sleep();
//        }else{
//            UiDevice.getInstance(InstrumentationRegistry.getInstrumentation()).wakeUp();
//        }

    }
    public void testScreen(){
        UiDevice uiDevice=UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        if(!uiDevice.takeScreenshot(new File("/data/local/tmp/"))){
            while (true);
        }
    }
    public void testIdle(){
        UiDevice uiDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        uiDevice.click(100,100);
        uiDevice.waitForIdle(2000);//2s
    }
}
