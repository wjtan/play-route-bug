package controllers;

import play.mvc.*;
import play.mvc.Http.*;

import views.html.*;

public class HomeController extends Controller {

    public Result index() {
        return ok(index.render("Your new application is ready."));
    }

    public Result show(int value) {
        return ok(index.render("Value: " + value));
    }

    public Result show2(Request req, int value) {
        return ok(index2.render("Value: " + value, req));
    }

}