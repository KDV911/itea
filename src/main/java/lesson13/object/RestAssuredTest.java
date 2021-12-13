package lesson13.object;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class RestAssuredTest {

    public  String baseUrl = "https://swapi.dev/api/";

//    @BeforeTest
//    public void configuration()
//    {
//        RestAssured.baseURI ="https://swapi.dev/api/";
//        RestAssured.proxy("", 13);
//        RestAssured.certificate("cert","pass");
//        RestAssured.basic("login", "pass");
//    }



    RequestSpecification requestSpecification = new RequestSpecBuilder()
            .setBaseUri(baseUrl)
            .setContentType(ContentType.JSON)
            .setBasePath("planets/1")
            .build();

    ResponseSpecification responseSpecification = new ResponseSpecBuilder()
            .expectStatusCode(200)
            .expectResponseTime(lessThan(5000L))
            .build();



    @Test
    public void restAssuredTest()
    {
        given()
                .spec(requestSpecification)
        .when()
                .post()
        .then()
                .spec(responseSpecification)
                .body("name", equalTo("Tatooine"))
                .body("films", hasItem("https://swapi.dev/api/films/1/"));
    }
}
