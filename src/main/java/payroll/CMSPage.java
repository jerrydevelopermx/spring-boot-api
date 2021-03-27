package payroll;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class CMSPage {

    private Long id;
    private String name;
    private String logo;
    private String description;
    private String blogLink;
    private PageFooter footer;
    private PageImage[] slides;
    private PageImage[] offers;
    private PageStyles styles;


    public CMSPage() {
    }

    public CMSPage(Long id, String name, String logo, String description, String blogLink, PageFooter footer) {
        this.id = id;
        this.name = name;
        this.logo = logo;
        this.description = description;
        this.blogLink = blogLink;
        this.footer = footer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBlogLink() {
        return blogLink;
    }

    public void setBlogLink(String blogLink) {
        this.blogLink = blogLink;
    }

    public PageFooter getFooter() {
        return footer;
    }

    public void setFooter(PageFooter footer) {
        this.footer = footer;
    }

    public PageImage[] getSlides() {
        return slides;
    }

    public void setSlides(PageImage[] slides) {
        this.slides = slides;
    }

    public PageImage[] getOffers() {
        return offers;
    }

    public void setOffers(PageImage[] offers) {
        this.offers = offers;
    }

    public PageStyles getStyles() {
        return styles;
    }

    public void setStyles(PageStyles styles) {
        this.styles = styles;
    }
}
