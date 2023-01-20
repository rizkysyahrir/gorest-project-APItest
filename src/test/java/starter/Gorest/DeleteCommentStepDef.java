package starter.Gorest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

public class DeleteCommentStepDef {
    @Steps
    GorestAPI gorestAPI;

    @Given("Delete comment using valid id <id>")
    public void deleteCommentUsingValidIdId(int id) {gorestAPI.deleteComments(id);
    }

    @When("Send delete comment request")
    public void sendDeleteCommentRequest() {
        SerenityRest.when().delete(GorestAPI.DELETE_COMMENTS+"?access-token=c1eb430c177c806c7e49755ebb6a05cd25c5e338d46a1169a2a5a43c1fa35007");
    }

    @Then("Status code should be {int} Not Found")
    public void statusCodeShouldBeNotFound(int NotFound) {
        SerenityRest.then().statusCode(NotFound);
    }


    @Given("Delete comment using invalid id <id>")
    public void deleteCommentUsingInvalidIdId(int id) {gorestAPI.deleteComments(id);
    }


}
