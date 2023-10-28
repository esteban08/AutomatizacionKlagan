package stepdefinitions;

import co.com.klagan.questions.question;
import co.com.klagan.tasks.search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

public class stepdefinition {

    @Managed
    private WebDriver myDirver;
    @Before
    public void prepareStage() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Esteban");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(myDirver));
    }

    @Given("^the user enter to page google$")
    public void theUserEnterToPageGoogle() {
        OnStage.theActorInTheSpotlight().attemptsTo(Open.url("https://www.google.com"));
    }

    @When("^The user search Automation word$")
    public void theUserSearchAutomationWord() {
        OnStage.theActorInTheSpotlight().wasAbleTo(search.on());
    }

    @Then("^The user should view year (.*)$")
    public void theUserShouldViewYear(String arg1) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(question.in(), Matchers.containsString(arg1)));
    }
}
