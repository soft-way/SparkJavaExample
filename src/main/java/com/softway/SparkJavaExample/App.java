
package com.softway.SparkJavaExample;

import static spark.Spark.*;
import com.softway.SparkJavaExample.routes.UnitRoute;

public class App {
    public static void main(String[] args) {
        path("", new UnitRoute());
    }
}
