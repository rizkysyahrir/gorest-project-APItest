package starter.gorest.StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.gorest.GorestAPI;
import starter.gorest.Utils.Constant;
import starter.gorest.Utils.GorestResponses;

import java.io.File;

import static org.hamcrest.Matchers.equalTo;

public class ListTodoStepDef {

    @Steps
    GorestAPI gorestAPI;


    @Given("Get list todo")
    public void getListTodoWithPagePage() {gorestAPI.setGetListTodos();
    }

    @When("Send request get list todo")
    public void sendRequestGetListTodo() { SerenityRest.when().get(GorestAPI.GET_LIST_TODOS);
    }

    @Then("Should return status code {int}")
    public void shouldReturnStatusCode(int ok) {
        SerenityRest.then().statusCode(ok);
    }


    @And("Validate json schema list todo")
    public void validateJsonSchemaListTodo() {
        File jsonSchema = new File(Constant.JSON_SCHEMA_LIST_TODO+"/ListTodoSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }

}
