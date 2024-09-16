package tests;

import base.BaseTest;
import io.restassured.response.Response;
import models.Device;
import models.DeviceData;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class DeviceApiTests extends BaseTest {

    @Test
    public void addNewDeviceTest() {
        // Create a device object for the request payload
        Device newDevice = new Device(
                "Apple Max Pro 1TB",
                new DeviceData(2023, 7999.99, "Apple ARM A7", "1 TB")
        );

        // Send POST request to add the new device and get the response
        Response response = given()
                .contentType("application/json")
                .body(newDevice)
                .when()
                .post()
                .then()
                .statusCode(200)
                .body("name", equalTo("Apple Max Pro 1TB"))
                .body("data.year", equalTo(2023))
                .body("data.price", equalTo(7999.99f))
                .extract()
                .response();

        // Validate that 'id' and 'createdAt' are not null
        String id = response.path("id");
        String createdAt = response.path("createdAt");

        Assert.assertNotNull(id, "ID should not be null");
        Assert.assertNotNull(createdAt, "createdAt should not be null");
    }
}
