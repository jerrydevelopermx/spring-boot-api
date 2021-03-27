package payroll;

public class PageCSSGroup {
    private PageCSSConfig topBar;
    private PageCSSConfig headerMenu;
    private PageCSSRootConfig styledMenu;
    private PageCSSConfig  bottomBar;
    private PageCSSConfig  footerLinks;
    private PageCSSConfig header;
    private PageCSSConfig body;
    private PageCSSRootConfig mobileNavBar;
    private PageCSSRootConfig closeButton;

    public PageCSSConfig getTopBar() {
        return topBar;
    }

    public void setTopBar(PageCSSConfig topBar) {
        this.topBar = topBar;
    }

    public PageCSSConfig getHeaderMenu() {
        return headerMenu;
    }

    public void setHeaderMenu(PageCSSConfig headerMenu) {
        this.headerMenu = headerMenu;
    }

    public PageCSSRootConfig getStyledMenu() {
        return styledMenu;
    }

    public void setStyledMenu(PageCSSRootConfig styledMenu) {
        this.styledMenu = styledMenu;
    }

    public PageCSSConfig getBottomBar() {
        return bottomBar;
    }

    public void setBottomBar(PageCSSConfig bottomBar) {
        this.bottomBar = bottomBar;
    }

    public PageCSSConfig getFooterLinks() {
        return footerLinks;
    }

    public void setFooterLinks(PageCSSConfig footerLinks) {
        this.footerLinks = footerLinks;
    }

    public PageCSSConfig getHeader() {
        return header;
    }

    public void setHeader(PageCSSConfig header) {
        this.header = header;
    }

    public PageCSSConfig getBody() {
        return body;
    }

    public void setBody(PageCSSConfig body) {
        this.body = body;
    }

    public PageCSSRootConfig getMobileNavBar() {
        return mobileNavBar;
    }

    public void setMobileNavBar(PageCSSRootConfig mobileNavBar) {
        this.mobileNavBar = mobileNavBar;
    }

    public PageCSSRootConfig getCloseButton() {
        return closeButton;
    }

    public void setCloseButton(PageCSSRootConfig closeButton) {
        this.closeButton = closeButton;
    }
}
