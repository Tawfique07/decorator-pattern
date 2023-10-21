public class Main {
    public static void main(String[] args) {
        // Create a basic web page
        WebPage basicPage = new BasicWebPage();

        // Add authentication and pagination decorators
        WebPage authenticatedPage = new AuthenticatedWebPageDecorator(basicPage);
        WebPage paginatedPage = new PaginatedWebPageDecorator(authenticatedPage, 10);

        // Display the decorated web page
        paginatedPage.display();
    }
}
