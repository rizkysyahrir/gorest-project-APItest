package starter.gorest.StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.gorest.GorestAPI;

public class DeleteTodoStepDef {

    @Steps
    GorestAPI gorestAPI;

    @Given("Delete todo with valid id {int}")
    public void deleteTodoWithValidId(int id) {
        gorestAPI.deleteTodo(id);
    }

    @When("Send request delete todo")
    public void sendRequestDeleteTodo() {
        SerenityRest.when().delete(GorestAPI.DELETE_TODOS);
    }

    @Given("Delete todo with invalid id {string}")
    public void deleteTodoWithInvalidIdId(String id) {gorestAPI.deleteTodoInvalid(id);
    }
}
