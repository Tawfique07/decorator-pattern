// Decorator: Splitting Search Results Across Multiple Pages
class PaginatedWebPageDecorator implements WebPage {
    private WebPage webPage;
    private int resultsPerPage;

    public PaginatedWebPageDecorator(WebPage webPage, int resultsPerPage) {
        this.webPage = webPage;
        this.resultsPerPage = resultsPerPage;
    }

    @Override
    public void display() {
        webPage.display();
        paginateResults();
    }

    private void paginateResults() {
        System.out.println("Paginating search results with " + resultsPerPage + " results per page");
    }
}