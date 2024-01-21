package api.endpoints;

import api.payload.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

// UserEndPoints.java
// Created for to perform Create, Read, Update, and Delete requests of the user API
public class UserEndPoints {
    public static Response createUser(User payload) {
        return given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(payload)
                .when()
                .post(Routes.post_url);

    }
    public static Response readUser(String userName) {
        return given()
                .pathParam("username", userName)
                .when()
                .get(Routes.get_url);

    }
    public static Response updateUser(String userName, User payload) {
        return given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .pathParam("username", userName)
                .body(payload)
                .when()
                .put(Routes.update_url);

    }
    public static Response delete(String userName) {
        return given()
                .pathParam("username", userName)
                .when()
                .delete(Routes.delete_url);

    }

}
