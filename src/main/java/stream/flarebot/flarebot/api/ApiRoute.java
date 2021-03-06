package stream.flarebot.flarebot.api;

import stream.flarebot.flarebot.FlareBot;

import static stream.flarebot.flarebot.api.Method.GET;
import static stream.flarebot.flarebot.api.Method.PATCH;
import static stream.flarebot.flarebot.api.Method.POST;
import static stream.flarebot.flarebot.api.Method.PUT;

public enum ApiRoute {

    // Root route
    COMMANDS(POST, "commands"),
    DATA(POST, "data-ping"),

    // Guild route
    UPDATE_PREFIX(PATCH, "guild/prefix"),

    // Guild/options route
    GET_OPTIONS_AUTOMODD(GET, "guild/options/automod"),
    GET_OPTIONS_LANGUAGE(GET, "guild/options/language"),

    // Debug route
    LOAD_TIME(PUT, "debug/load-time");

    private Method method;
    private String route;

    ApiRoute(Method method, String route) {
        this.method = method;
        this.route = route;
    }

    public Method getMethod() {
        return this.method;
    }

    public String getRoute() {
        return this.route;
    }

    public String getFullUrl() {
        return FlareBot.FLAREBOT_API + route;
    }
}
