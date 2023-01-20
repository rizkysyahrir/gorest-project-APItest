package starter.gorest.Utils;

public class Constant {

    public static  String BASE_URL ="https://gorest.co.in"; //ini base url
    public static final String DIR = System.getProperty("user.dir"); //ini untuk mendapatkan sitem properti location project


    //Ini Path Json Schema
    public static String JSON_SCHEMA_CREATE_TODO = DIR+"/src/test/resources/JSON/JsonSchema/CreateTodoSchema"; //untuk path JSON Schema Create User
    public static String JSON_SCHEMA_LIST_TODO = DIR+"/src/test/resources/JSON/JsonSchema/ListTodoSchema"; //untuk path JSON Schema List User
    public static String JSON_SCHEMA_SINGLE_LIST_TODO = DIR+"/src/test/resources/JSON/JsonSchema/SingleListTodoSchema"; //untuk path JSON Schema List User    public static String JSON_SCHEMA_UPDATE_TODO = DIR+"/src/test/resources/JSON/JsonSchema/UpdateTodoSchema"; //untuk path JSON Schema Update User


    //Ini Path Json Request
    public static String JSON_REQUEST_CREATE_TODO = DIR + "/src/test/resources/JSON/Request/CreateTodo"; //untuk path json Request Create User
    public static String JSON_REQUEST_UPDATE_TODO = DIR+"/src/test/resources/JSON/Request/UpdateTodo"; //untuk path json Request Update User
    
}
