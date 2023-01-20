package starter.Gorest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

import java.io.File;

public class PutUpdateCommentSteps {
    @Steps
    GorestAPI gorestAPI;

    @Given("Put update comment on body comment using valid id {int} and authenticated")
    public void putUpdateCommentOnBodyCommentUsingValidIdAndAuthenticated(int id){
        File json = new File(GorestAPI.JSON_REQ_BODY+"/PUTUpdateCommentValidId.json");
        gorestAPI.putUpdateComments(id, json);
    }
    @When("Send put update comment request")
    public void sendPutUpdateCommentRequest(){
        SerenityRest.when().put(GorestAPI.PUT_UPDATE_COMMENTS+"?access-token=2765d45f58a9cbdd2e7002df3e796dd890102283fc74e446d85f6841826e3fcf");
    }
    @Then("Response body code should be {int} OK")
    public void responseBoodyCodeShouldBeOk(int OK){
        SerenityRest.then().statusCode(OK);
    }

    // Scenario 2
    @Given("Put update comment on body comment using invalid id {int}")
    public void putUpdateCommentOnBodyCommentUsingInvalidId(int id) {
        File json = new File(GorestAPI.JSON_REQ_BODY+"/PUTUpdateCommentValidId.json");
        gorestAPI.putUpdateCommentInvalidId(id, json);
    }
    

    // Scenario 3
    @Given("Put update comment with id {int} empty email input on body json")
    public void putUpdateCommentWithEmptyEmailInputOnBodyJson(int id) {
        File json = new File(GorestAPI.JSON_REQ_BODY+"/PUTUpdateCommentEmptyEmail.json");
        gorestAPI.putUpdateComments(id, json);
    }


    @Then("Should return {int} not found")
    public void shouldReturnNotFound(int NotFound) {SerenityRest.then().statusCode(NotFound);
        
    }

    @Then("Response body code should be {int} Unprocessable Entity")
    public void responseBodyCodeShouldBeUnprocessableEntity(int arg0) {
    }
}
