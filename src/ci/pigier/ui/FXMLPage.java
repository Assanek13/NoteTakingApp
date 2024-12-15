package ci.pigier.ui;

public enum FXMLPage {
    LIST("/ci/pigier/ui/list.fxml");

    private final String page;

    FXMLPage(String page) {
        this.page = page;
    }

    public String getPage() {
        return page;
    }
}
