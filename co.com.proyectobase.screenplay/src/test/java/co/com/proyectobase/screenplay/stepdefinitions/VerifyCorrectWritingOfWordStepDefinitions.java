package co.com.proyectobase.screenplay.stepdefinitions;

import co.com.proyectobase.screenplay.questions.ClickOn;
import co.com.proyectobase.screenplay.questions.ObtainedResult;
import co.com.proyectobase.screenplay.tasks.DiligenceWord;
import co.com.proyectobase.screenplay.tasks.OpenWeb;
import co.com.proyectobase.screenplay.questions.VerifyWord;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static org.hamcrest.Matchers.equalTo;

public class VerifyCorrectWritingOfWordStepDefinitions {

    WebDriver driver = Serenity.getWebdriverManager().getCurrentDriver();

    //Method that prepares the initial configuration
    @Before
    public void configuracionInicial() {
        setTheStage(new OnlineCast());
    }

    //Steps
    @Given("^the user enters the google page$")
    public void the_user_enters_the_google_page(){
        OnStage.theActorCalled("User").wasAbleTo(OpenWeb.googlePage());
    }

    @When("^diligence the word pruebaz in google search$")
    public void diligence_the_word_pruebaz_in_google_search(){
        OnStage.theActorCalled("User").attemptsTo(DiligenceWord.testsCorrectly());
    }

    @Then("^verify that the correct word (.*) is loaded in the browser$")
    public void verify_that_the_correct_word_pruebas_is_loaded_in_the_browser(String expectedWord)  {
        OnStage.theActorCalled("User").should(GivenWhenThen.seeThat(VerifyWord.correctWriting(), equalTo(expectedWord)));
    }

    @Then("^click on the correct word pruebas$")
    public void click_on_the_correct_word_pruebas()  {
        OnStage.theActorCalled("User").should(GivenWhenThen.seeThat(ClickOn.wordCorrect()));
    }

    @Then("^verify that the results obtained are greater than six$")
    public void verify_that_the_results_obtained_are_greater_than_six(){
        OnStage.theActorCalled("User").should(GivenWhenThen.seeThat(ObtainedResult.greaterThanSix(), equalTo(true)));
    }
}
