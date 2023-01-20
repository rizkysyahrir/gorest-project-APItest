package starter.Gorest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

import java.io.File;

public class GetListCommentStepdeps {
    @Steps
    GorestAPI gorestAPI;

    @Given("Get List Comment with valid parameter")
    public void getListCommentWithValidParameter(int page) {
        gorestAPI.getListComments(page);
    }

    @When("Send get list comment request")
    public void sendGetListCommentRequest() {
        SerenityRest.when().get(GorestAPI.GET_LIST_COMMENTS);
    }

    @Then("should return be {int} OK")
    public void shouldReturnBeOK(int OK) {SerenityRest.then().statusCode(OK);
    }

    @Given("Get List Comment with invalid parameter")
    public void getListCommentWithInvalidParameter() {
    }

    @Then("Should return be {int} Ok")
    public void shouldReturnBeOk(int arg0) {
    }

    @And("Validate get list comment json schema")
    public void validateGetListcommentJsonSchema() {
        File json = new File(GorestAPI.JSON_SCHEMA+"/GetListcommentJsonSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }
}
