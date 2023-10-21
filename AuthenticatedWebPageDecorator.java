// Decorator: Restricting Access to Authorized Users
class AuthenticatedWebPageDecorator implements WebPage {
    private WebPage webPage;

    public AuthenticatedWebPageDecorator(WebPage webPage) {
        this.webPage = webPage;
    }

    @Override
    public void display() {
        authenticateUser();
        webPage.display();
    }

    private void authenticateUser() {
        System.out.println("User authentication check");
    }
}
