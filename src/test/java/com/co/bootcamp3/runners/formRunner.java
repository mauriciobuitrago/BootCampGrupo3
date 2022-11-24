package com.co.bootcamp3.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/form.feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        glue = "com.co.bootcamp3.stepsdefinitions"
)
public class formRunner {

}
