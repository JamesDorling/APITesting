package api_testing.connection;
import api_testing.config.Config;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConnectionManager {

    private static final String BASEURL = "https://api.openweathermap.org/";
    private static final String ENDPOINT = "data/2.5/weather";

    public static String getConnection() {
        getResponse();
        return getURL();
    }

    public static String getConnection(String cityName) {
        return getURL() + "?q=" + cityName + "&appid=" + Config.getApiKey();
    }

    public static String getConnection(String cityName, String stateCode) {
        return getURL() + "?q=" + cityName + "," + stateCode + "&appid=" + Config.getApiKey();
    }

    public static String getConnection(String cityName, String stateCode, String countryCode) {
        return getURL() + "?q=" + cityName + "," + stateCode + "," + countryCode + "&appid=" + Config.getApiKey();
    }

    public static String getConnection(int cityId) {
        return getURL() + "?id=" + cityId + "&appid=" + Config.getApiKey();
    }

    public static String getConnection(double lat, double lon) {
        return getURL() + "?lat=" + lat + "&lon=" + lon + "&appid=" + Config.getApiKey();
    }

    public static String getConnection(int zipCode, String countryCode) {
        return getURL() + "?zip=" + zipCode + "," + countryCode + "&appid=" + Config.getApiKey();
    }

    public static int getStatusCode() {
        return getResponse().statusCode();
    }

    private static HttpResponse<String> getResponse() {
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(BASEURL + ENDPOINT + "?q=London,uk&appid=" + Config.getApiKey())).build();
        HttpResponse<String> httpResponse = null;
        try {
            httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            //e.printStackTrace();
            System.err.println("There was an error communicating with the API.");
        }
        return httpResponse;
    }

    public static String getURL() {
        return BASEURL + ENDPOINT;
    }

}