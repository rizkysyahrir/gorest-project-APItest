package starter.Gorest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

import java.io.File;

public class GetSingleCommentStepDef {
    @Steps
    GorestAPI gorestAPI;

    @Given("Get single comment")
    public void getSingleComment() {gorestAPI.getListComments(1);
    }

    @When("Send request to get single comment")
    public void sendRequestToGetSingleComment() {
        SerenityRest.when().get(GorestAPI.GET_SINGLE_COMMENTS);
    }

    @Then("Should return {int} OK")
    public void shouldReturnOK(int OK) {SerenityRest.then().statusCode(OK);
    }

    @And("Validate get single comment with json schema validator")
    public void validateGetSinglecommentWithJsonSchemaValidator() {
        File json = new File(GorestAPI.JSON_SCHEMA+"/GETSinglecommentJsonSchema.json");
        SerenityRest.then().body(JsonSchemaValidator.matchesJsonSchema(json));
    }
}
