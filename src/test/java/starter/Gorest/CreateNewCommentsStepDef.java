package starter.Gorest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.Utils.GorestResponses;

import java.io.File;

import static org.hamcrest.Matchers.equalTo;

public class CreateNewCommentsStepDef {
    @Steps
    GorestAPI gorestAPI;
    @Given("Create new comments with valid json")
    public void createNewCommentsWithValidJson() {
        File json = new File(GorestAPI.JSON_REQ_BODY+"/CreateNewCommentsJson.json");
        gorestAPI.postCreateComments(json);
    }
    @And("Set Authentication")
    public void setAuthentication() {
        SerenityRest.given()
                .headers("Authorization","Bearer c1eb430c177c806c7e49755ebb6a05cd25c5e338d46a1169a2a5a43c1fa35007");
    }

    @When("send create request new comments and set authentication")
    public void sendCreateRequestNewCommentsAndSetAuthentication() {
        SerenityRest.when()
                .post(GorestAPI.POST_CREATE_COMMENTS+"?access-token=c1eb430c177c806c7e49755ebb6a05cd25c5e338d46a1169a2a5a43c1fa35007");
    }

    @Then("API should return response {int} Created")
    public void apiShouldReturnResponseCreated(int created) {
        SerenityRest.then().statusCode(created);
    }

    @And("API should return body page post_id {int}, name {string}, email {string}, body {string}")
    public void apiShouldReturnBodyPagePost_idNameEmailBody(int post_id, String name, String email, String body) {
        SerenityRest.then()
                .body(GorestResponses.POST_ID,equalTo(post_id))
                .body(GorestResponses.NAME,equalTo(name))
                .body(GorestResponses.EMAIL,equalTo(email))
                .body(GorestResponses.BODY,equalTo(body));
    }

    @Given("Create new comment without authorization")
    public void createNewCommentWithoutAuthorization() {
    }

    @When("send create request")
    public void sendCreateRequest() {
    }

    @Then("API should return response {int} Unauthorized")
    public void apiShouldReturnResponseUnauthorized(int arg0) {
    }

    @And("API should return body eror message {string}")
    public void apiShouldReturnBodyErorMessage(String arg0) {
    }

    @Given("Create new comment with authorization")
    public void createNewCommentWithAuthorization() {
    }

    @Then("API should return response {int} Unprocessable Entity")
    public void apiShouldReturnResponseUnprocessableEntity(int arg0) {
    }

    @Given("Create new comment without name")
    public void createNewCommentWithoutName() {
    }

    @Given("Create new comment without body")
    public void createNewCommentWithoutBody() {
    }

    @Given("Create new comments with invalid name \\(input Spec. Char)")
    public void createNewCommentsWithInvalidNameInputSpecChar() {
    }

    @When("send create request new comments")
    public void sendCreateRequestNewComments() {
    }
}
