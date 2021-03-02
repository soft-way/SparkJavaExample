
package com.softway.SparkJavaExample.routes;

import static spark.Spark.*;

import spark.Request;
import spark.Response;
import spark.RouteGroup;

public class UnitRoute implements RouteGroup {
    @Override
    public void addRoutes() {
        get("/units", (req, res) -> {
            // Show something
            return UnitList(req, res);
        });        

        get("/units/:unit_id", (req, res) -> {
            // Show something
            return UnitList(req, res, req.params(":unit_id"));
        });        

        post("/units", (req, res) -> {
            // Show something
            return UnitList(req, res);
        });        

        put("/units", (req, res) -> {
            // Show something
            return req.requestMethod() + " Unit";
        });        

        patch("/units", (req, res) -> {
            // Show something
            return req.requestMethod() + " Unit";
        });        

        delete("/units", (req, res) -> {
            // Show something
            return req.requestMethod() + " Unit";
        });        

        options("/units", (req, res) -> {
            // Show something
            return req.requestMethod() + " Unit";
        });        

    }

    private String UnitList(Request req, Response res) {
        return "List all units";
    }

    private String UnitList(Request req, Response res, String unit_id) {
        return "List unit " + unit_id;
    }

}
