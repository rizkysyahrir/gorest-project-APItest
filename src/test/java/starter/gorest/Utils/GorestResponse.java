package starter.gorest.Utils;

import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import starter.gorest.GorestAPI;

import java.io.File;

import static org.hamcrest.Matchers.equalTo;

public class GorestResponse {

    public static String PAGE = "page";
    public static String EMAIL = "email";
    public static String STATUS = "status";
    public static String NAME = "name";
    public static String GENDER = "gender";
    public static String JOB = "job";
    public static String DATA_ID = "'data.id'";
    public static String ID_REG = "'id'";
    public static String TOKEN = "token";

    public static String  MESSAGE = "message";
    public static String FIELD = "email";

}
