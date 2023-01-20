package starter.Gorest;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import java.io.File;

public class GorestAPI {
    public static String USER_ID;
    public static final String URL = "https://gorest.co.in";
    public static final String DIR = System.getProperty("user.dir");
    public static final String JSON_REQ_BODY = DIR+"/src/test/resources/JSON/RequestBody";
    public static final String JSON_SCHEMA = DIR+"/src/test/resources/JSON/JsonSchema";
    public static final String POST_CREATE_COMMENTS = URL+"/public/v2/comments";
    public static final String GET_LIST_COMMENTS = URL+"/public/v2/comments?page={page}";
    public static final String GET_SINGLE_COMMENTS = URL+"/public/v2/comments/{id}";
    public static final String PUT_UPDATE_COMMENTS = URL+"/public/v2/comments/{id}";
    public static final String DELETE_COMMENTS = URL+"/public/v2/comments/{id}";



    @Step("Get list comments")
    public void getListComments (int page){SerenityRest.given().pathParam("page",page);}
    @Step("Get single comments")
    public void getSingleComments (int id){SerenityRest.given().pathParam("id",id);}
    @Step("Post create comments")
    public void postCreateComments (File json){SerenityRest.given().contentType(ContentType.JSON).body(json);}
    @Step("Put update comments")
    public void putUpdateComments(int id,File json){
        SerenityRest.given()
                    .pathParam("id",id)
                    .contentType(ContentType.JSON)
                    .body(json);}
    @Step("Delete comments")
    public void deleteComments(int id){SerenityRest.given().pathParam("id",id);}

    @Step("Put update comments invalid id")
    public void putUpdateCommentInvalidId(int id,File json){
        SerenityRest.given()
                .pathParam("id",id)
                .contentType(ContentType.JSON)
                .body(json);}


}
