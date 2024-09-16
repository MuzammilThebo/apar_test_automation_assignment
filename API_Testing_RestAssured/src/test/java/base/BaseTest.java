package base;

import org.testng.annotations.BeforeClass;

import io.restassured.RestAssured;

public class BaseTest {
    @BeforeClass
    public void setup() {
        // Base URL for the API
        RestAssured.baseURI = "https://api.restful-api.dev/objects";
    }
}
