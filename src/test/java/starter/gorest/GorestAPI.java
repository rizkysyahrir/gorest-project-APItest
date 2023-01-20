package starter.gorest;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.gorest.Utils.Constant;

import java.io.File;

public class GorestAPI {

    public static String GET_LIST_TODOS = Constant.BASE_URL + "/public/v2/todos"; //untuk URL get list todos
    public static String GET_SINGLE_LIST_TODOS_ID = Constant.BASE_URL + "/public/v2/todos/{id}"; //untuk URL get single list todos
    public static String GET_SINGLE_LIST_TODOS_USER_ID = Constant.BASE_URL + "/public/v2/todos/{user_id}"; //untuk URL get single list todos
    public static String POST_CREATE_TODOS = Constant.BASE_URL + "/public/v2/todos"; //untuk URL post create todos
    public static String PUT_UPDATE_TODOS = Constant.BASE_URL + "/public/v2/todos/{id}"; //untuk URL put update todos
    public static String DELETE_TODOS = Constant.BASE_URL + "/public/v2/todos/{id}"; //untuk URL delete todos

    //METHOD
    @Step("Get list todos") //Untuk get list todos
    public void setGetListTodos() {
        SerenityRest.given();
    }

    @Step("Get single list todos with id") //Untuk get single list todos id
    public void getSingleListTodoswithId(int id) {
        SerenityRest.given().pathParam("id", id);
    }

    @Step("Get single list todos with invalid id") //Untuk get single list todos invalid id
    public void getSingleListTodoswithInvalidId(String id) {
        SerenityRest.given().pathParam("id", id);
    }

    @Step("Get single list todos with user_id") //Untuk get single list todos user_id
    public void getSingleListTodosWithUserId(int user_id) {
        SerenityRest.given().pathParam("user_id",user_id);
    }

    @Step("Post create todos")
    public void postCreateTodo(File json) {
        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(json);
    }

    @Step("Put update todos")
    public void putUpdateTodo(int id, File json) {
        SerenityRest.given().pathParam("id", id)
                .contentType(ContentType.JSON)
                .body(json);
    }

    @Step("Delete todos")
    public void deleteTodo(int id) {
        SerenityRest.given().pathParam("id", id);
    }

    @Step("Delete todos with invalid id")
    public void deleteTodoInvalid(String id) {
        SerenityRest.given().pathParam("id", id);
    }

}
