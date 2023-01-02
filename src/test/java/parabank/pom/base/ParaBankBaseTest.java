package parabank.pom.base;

import org.openqa.selenium.WebDriver;

import java.util.Properties;

// Two things will be in this base class. (1) Set up the Browser for test. (2) Reading Values for properties Text file.

public class ParaBankBaseTest {

    protected static WebDriver driver; //Web browser initialization
    private Properties properties;     //Web browser initialization

    //Creating constructor for reading the properties text files value form its path.
    public ParaBankBaseTest(){
        String filePath = System.getProperty("user.dir") + ""
    }
}
