package payroll;

public class PageFooter {
    private String copyright;
    private PageSocial[] social;

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public PageSocial[] getSocial() {
        return social;
    }

    public void setSocial(PageSocial[] social) {
        this.social = social;
    }
}
