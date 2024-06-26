package core;

public class Website {
    private static int counter = 1;
    private int websiteId;
    private String url;

    public Website(String url) {
        this.websiteId = counter++;
        this.url = url;
    }

    // Getters and setters
    public int getWebsiteId() {
        return websiteId;
    }

    public void setWebsiteId(int websiteId) {
        this.websiteId = websiteId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

