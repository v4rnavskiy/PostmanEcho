package ru.netology.postmanecho;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

class MobileBankTestAPIPost {
    @Test
    void shouldReturnSomeData() {
        given()
                .baseUri("https://postman-echo.com")
                .body("when I start to understand something")
        .when()
                .post("/post")
        .then()
                .statusCode(200)
                .body("data", equalTo("when I start to understand something?"))
        ;

    }
}
