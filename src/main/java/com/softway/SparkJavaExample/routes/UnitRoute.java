
package com.softway.SparkJavaExample.routes;

import static spark.Spark.*;

import spark.Request;
import spark.RouteGroup;

public class UnitRoute implements RouteGroup {
    @Override
    public void addRoutes() {
        get("/unit", (request, response) -> {
            // Show something
            return request.requestMethod() + " Unit";
        });        

        post("/unit", (request, response) -> {
            // Show something
            return request.requestMethod() + " Unit";
        });        

        put("/unit", (request, response) -> {
            // Show something
            return request.requestMethod() + " Unit";
        });        

        patch("/unit", (request, response) -> {
            // Show something
            return request.requestMethod() + " Unit";
        });        

        delete("/unit", (request, response) -> {
            // Show something
            return request.requestMethod() + " Unit";
        });        

        options("/unit", (request, response) -> {
            // Show something
            return request.requestMethod() + " Unit";
        });        

    }  
}
