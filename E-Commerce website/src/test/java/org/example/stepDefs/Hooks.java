package org.example.stepDefs;

import io.cucumber.java.Before;
import org.openqa.selenium.edge.EdgeDriver;

public class Hooks
{
    public static EdgeDriver driver;
    @Before
    public void setUp()
    {
        driver = new EdgeDriver();
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

    }
}
