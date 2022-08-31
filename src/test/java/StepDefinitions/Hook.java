package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import lombok.extern.slf4j.Slf4j;
import static StepDefinitions.LocalWebDriverManager.getDriver;
import static StepDefinitions.LocalWebDriverManager.quitDriver;

@Slf4j
public class Hook {
    @Before
    public void startBrowser() {
        getDriver().get(PropertyReader.getConfigProperty("url"));
    }

    @After
    public void driverTearDown() {
        log.info("Quitting the driver");
        quitDriver();
    }
}
