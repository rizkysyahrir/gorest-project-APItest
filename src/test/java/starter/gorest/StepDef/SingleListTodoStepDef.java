package starter.gorest.StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.gorest.GorestAPI;
import starter.gorest.Utils.Constant;

import java.io.File;

public class SingleListTodoStepDef {

    @Steps
    GorestAPI gorestAPI;

    @Given("Get single list todo with valid id {int}")
    public void getSingleListTodoWithValidId(int id) {
        gorestAPI.getSingleListTodoswithId(id);
    }

    @Given("Get single list todo with valid user_id {int}")
    public void getSingleListTodoWithValidUser_Id(int user_id) {
        gorestAPI.getSingleListTodosWithUserId(user_id);
    }

    @When("Send request get single list todo id")
    public void sendRequestGetSingleListTodoId() {
        SerenityRest.when().get(GorestAPI.GET_SINGLE_LIST_TODOS_ID);
    }

    @When("Send request get single list todo user_id")
    public void sendRequestGetSingleListTodoUserId() {
        SerenityRest.when().get(GorestAPI.GET_SINGLE_LIST_TODOS_USER_ID);
    }

    @And("Validate json schema single list todo")
    public void validateJsonSchemaSingleListTodo() {
        File jsonSchema = new File(Constant.JSON_SCHEMA_SINGLE_LIST_TODO + "/SingleListTodoSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }

    //Negative Case
    @Given("Get single list todo with invalid id {string}")
    public void getSingleListTodoWithInvalidIdId(String id) {
        gorestAPI.getSingleListTodoswithInvalidId(id);
    }
}
