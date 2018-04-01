package ua.artcode.webproj.model;

/**
 * Created by serhii on 25.03.18.
 */
public class MyMessage {

    private String title;
    private String body;

    public MyMessage() {
    }

    public MyMessage(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
