package com.co.booking.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/servicepagenavigationbar.feature",
        snippets = SnippetType.CAMELCASE,
        glue = "com.co.booking.stepsdefinitions"
)
public class servicePageNavigationBarRunner {
}
