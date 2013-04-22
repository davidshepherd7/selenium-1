package org.openqa.selenium.qtwebkit.NativeTests;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.MoveTargetOutOfBoundsException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.testing.Ignore;
import org.openqa.selenium.testing.JUnit4TestBase;
import org.openqa.selenium.testing.JavascriptEnabled;
import org.openqa.selenium.testing.TestUtilities;
import org.openqa.selenium.testing.drivers.WebDriverBuilder;
import org.testng.annotations.BeforeClass;

import static org.openqa.selenium.TestWaiter.waitFor;
import static org.openqa.selenium.WaitingConditions.windowHandleCountToBe;
import static org.openqa.selenium.testing.Ignore.Driver.*;
import static org.openqa.selenium.testing.Ignore.Driver.OPERA_MOBILE;

public class ClickTest extends JUnit4TestBase {


    @Before
     public void setUp() throws Exception {
        driver.get("ClickTestWidget");
    }

    @Test
    public void testCanClickOnAPushButton() {
        driver.findElement(By.id("pushBtn")).click();

        waitFor(WaitingConditions.pageTitleToBe(driver, "CLick Test Window"));
    }

    @Test
    public void testCanClickOnACheckBox() {
        driver.findElement(By.id("checkBox")).click();

        waitFor(WaitingConditions.pageTitleToBe(driver, "CLick Test Window"));
    }

    @Test
    public void testClickingOnButtonInScrollArea() {
        driver.findElement(By.id("btnOnScroll")).click();

        waitFor(WaitingConditions.pageTitleToBe(driver, "CLick Test Window"));
    }
}
