package com.co.bootcamp3.stepsdefinitions;

import com.co.bootcamp3.tasks.FormFill;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class formStepsdefinition {
    @Managed
    WebDriver histBrowser;
    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Grupo3");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(histBrowser));
    }
    @Given("ingresar a la pagina de bonigarcia.dev")
    public void ingresarALaPaginaDeBonigarciaDev() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://bonigarcia.dev/selenium-webdriver-java/web-form.html"));
    }
    @When("diligenciar los campos del formulario")
    public void diligenciarLosCamposDelFormulario() {
        OnStage.theActorInTheSpotlight().attemptsTo(FormFill.fill());
    }
    @Then("registro completo del formulario")
    public void registroCompletoDelFormulario() {

    }

}
