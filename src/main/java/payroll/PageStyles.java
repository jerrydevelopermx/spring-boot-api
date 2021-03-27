package payroll;

public class PageStyles {
    private PageCSSConfig body;
    private PageCSSGroup header;
    private PageCSSGroup footer;
    private PageCSSGroup modalStyles;

    public PageCSSConfig getBody() {
        return body;
    }

    public void setBody(PageCSSConfig body) {
        this.body = body;
    }

    public PageCSSGroup getHeader() {
        return header;
    }

    public void setHeader(PageCSSGroup header) {
        this.header = header;
    }

    public PageCSSGroup getFooter() {
        return footer;
    }

    public void setFooter(PageCSSGroup footer) {
        this.footer = footer;
    }

    public PageCSSGroup getModalStyles() {
        return modalStyles;
    }

    public void setModalStyles(PageCSSGroup modalStyles) {
        this.modalStyles = modalStyles;
    }
}
