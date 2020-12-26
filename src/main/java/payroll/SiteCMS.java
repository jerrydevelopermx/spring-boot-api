package payroll;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SiteCMS {
    private @Id
    @GeneratedValue
    Long siteID;
    private String siteLogoLink;
    private String siteBodyColorRGB;
    private String siteBodyFontColorText;
    private String siteFontNameText;
    private String siteMainColorRGB;
    private String siteMainFontColorText;
            
    private String siteTitleText;
    private String siteMetaDescriptionText;
    private String blogLink;
    private String slide1DefaultLink;
    private String slide2DefaultLink;
    private String slide3DefaultLink;
    private String slide4DefaultLink;
    private String slide5DefaultLink;
    private String event1DefaultLink;
    private String event2DefaultLink;
    private String event3DefaultLink;
    private String tourDefaultLink;
    private String siteFacebookLink;
    private String siteTwitterLink;
    private String siteInstagramLink;
    private String sitePinterestLink;
    private String siteCopyright;

    private String ourServMissionJson;
    private String ourServWhoWeRJson;
    private String ourServBoardJson;
    private String ourServFeaturesJson;
    private String ourServMmbshipJson;
    private String contactUsJson;
    private String footerHistoryJson;
    private String sitePoliciesJson;
    private String siteMembersPolicyJson;
    private String siteCustomrsPolicyJson;
    private String siteVisitorsPolicyJson;

    public SiteCMS() {
    }

    public SiteCMS(String siteLogoLink, String siteBodyColorRGB, String siteBodyFontColorText, String siteFontNameText, String siteMainColorRGB, String siteMainFontColorText) {
        this.siteLogoLink = siteLogoLink;
        this.siteBodyColorRGB = siteBodyColorRGB;
        this.siteBodyFontColorText = siteBodyFontColorText;
        this.siteFontNameText = siteFontNameText;
        this.siteMainColorRGB = siteMainColorRGB;
        this.siteMainFontColorText = siteMainFontColorText;
    }

    public Long getSiteID() {
        return siteID;
    }

    public void setSiteID(Long siteID) {
        this.siteID = siteID;
    }

    public String getSiteLogoLink() {
        return siteLogoLink;
    }

    public void setSiteLogoLink(String siteLogoLink) {
        this.siteLogoLink = siteLogoLink;
    }

    public String getSiteBodyColorRGB() {
        return siteBodyColorRGB;
    }

    public void setSiteBodyColorRGB(String siteBodyColorRGB) {
        this.siteBodyColorRGB = siteBodyColorRGB;
    }

    public String getSiteBodyFontColorText() {
        return siteBodyFontColorText;
    }

    public void setSiteBodyFontColorText(String siteBodyFontColorText) {
        this.siteBodyFontColorText = siteBodyFontColorText;
    }

    public String getSiteFontNameText() {
        return siteFontNameText;
    }

    public void setSiteFontNameText(String siteFontNameText) {
        this.siteFontNameText = siteFontNameText;
    }

    public String getSiteMainColorRGB() {
        return siteMainColorRGB;
    }

    public void setSiteMainColorRGB(String siteMainColorRGB) {
        this.siteMainColorRGB = siteMainColorRGB;
    }

    public String getSiteMainFontColorText() {
        return siteMainFontColorText;
    }

    public void setSiteMainFontColorText(String siteMainFontColorText) {
        this.siteMainFontColorText = siteMainFontColorText;
    }

    public String getSiteTitleText() {
        return siteTitleText;
    }

    public void setSiteTitleText(String siteTitleText) {
        this.siteTitleText = siteTitleText;
    }

    public String getSiteMetaDescriptionText() {
        return siteMetaDescriptionText;
    }

    public void setSiteMetaDescriptionText(String siteMetaDescriptionText) {
        this.siteMetaDescriptionText = siteMetaDescriptionText;
    }

    public String getBlogLink() {
        return blogLink;
    }

    public void setBlogLink(String blogLink) {
        this.blogLink = blogLink;
    }

    public String getSlide1DefaultLink() {
        return slide1DefaultLink;
    }

    public void setSlide1DefaultLink(String slide1DefaultLink) {
        this.slide1DefaultLink = slide1DefaultLink;
    }

    public String getSlide2DefaultLink() {
        return slide2DefaultLink;
    }

    public void setSlide2DefaultLink(String slide2DefaultLink) {
        this.slide2DefaultLink = slide2DefaultLink;
    }

    public String getSlide3DefaultLink() {
        return slide3DefaultLink;
    }

    public void setSlide3DefaultLink(String slide3DefaultLink) {
        this.slide3DefaultLink = slide3DefaultLink;
    }

    public String getSlide4DefaultLink() {
        return slide4DefaultLink;
    }

    public void setSlide4DefaultLink(String slide4DefaultLink) {
        this.slide4DefaultLink = slide4DefaultLink;
    }

    public String getSlide5DefaultLink() {
        return slide5DefaultLink;
    }

    public void setSlide5DefaultLink(String slide5DefaultLink) {
        this.slide5DefaultLink = slide5DefaultLink;
    }

    public String getEvent1DefaultLink() {
        return event1DefaultLink;
    }

    public void setEvent1DefaultLink(String event1DefaultLink) {
        this.event1DefaultLink = event1DefaultLink;
    }

    public String getEvent2DefaultLink() {
        return event2DefaultLink;
    }

    public void setEvent2DefaultLink(String event2DefaultLink) {
        this.event2DefaultLink = event2DefaultLink;
    }

    public String getEvent3DefaultLink() {
        return event3DefaultLink;
    }

    public void setEvent3DefaultLink(String event3DefaultLink) {
        this.event3DefaultLink = event3DefaultLink;
    }

    public String getTourDefaultLink() {
        return tourDefaultLink;
    }

    public void setTourDefaultLink(String tourDefaultLink) {
        this.tourDefaultLink = tourDefaultLink;
    }

    public String getSiteFacebookLink() {
        return siteFacebookLink;
    }

    public void setSiteFacebookLink(String siteFacebookLink) {
        this.siteFacebookLink = siteFacebookLink;
    }

    public String getSiteTwitterLink() {
        return siteTwitterLink;
    }

    public void setSiteTwitterLink(String siteTwitterLink) {
        this.siteTwitterLink = siteTwitterLink;
    }

    public String getSiteInstagramLink() {
        return siteInstagramLink;
    }

    public void setSiteInstagramLink(String siteInstagramLink) {
        this.siteInstagramLink = siteInstagramLink;
    }

    public String getSitePinterestLink() {
        return sitePinterestLink;
    }

    public void setSitePinterestLink(String sitePinterestLink) {
        this.sitePinterestLink = sitePinterestLink;
    }

    public String getSiteCopyright() {
        return siteCopyright;
    }

    public void setSiteCopyright(String siteCopyright) {
        this.siteCopyright = siteCopyright;
    }

    public String getOurServMissionJson() {
        return ourServMissionJson;
    }

    public void setOurServMissionJson(String ourServMissionJson) {
        this.ourServMissionJson = ourServMissionJson;
    }

    public String getOurServWhoWeRJson() {
        return ourServWhoWeRJson;
    }

    public void setOurServWhoWeRJson(String ourServWhoWeRJson) {
        this.ourServWhoWeRJson = ourServWhoWeRJson;
    }

    public String getOurServBoardJson() {
        return ourServBoardJson;
    }

    public void setOurServBoardJson(String ourServBoardJson) {
        this.ourServBoardJson = ourServBoardJson;
    }

    public String getOurServFeaturesJson() {
        return ourServFeaturesJson;
    }

    public void setOurServFeaturesJson(String ourServFeaturesJson) {
        this.ourServFeaturesJson = ourServFeaturesJson;
    }

    public String getOurServMmbshipJson() {
        return ourServMmbshipJson;
    }

    public void setOurServMmbshipJson(String ourServMmbshipJson) {
        this.ourServMmbshipJson = ourServMmbshipJson;
    }

    public String getContactUsJson() {
        return contactUsJson;
    }

    public void setContactUsJson(String contactUsJson) {
        this.contactUsJson = contactUsJson;
    }

    public String getFooterHistoryJson() {
        return footerHistoryJson;
    }

    public void setFooterHistoryJson(String footerHistoryJson) {
        this.footerHistoryJson = footerHistoryJson;
    }

    public String getSitePoliciesJson() {
        return sitePoliciesJson;
    }

    public void setSitePoliciesJson(String sitePoliciesJson) {
        this.sitePoliciesJson = sitePoliciesJson;
    }

    public String getSiteMembersPolicyJson() {
        return siteMembersPolicyJson;
    }

    public void setSiteMembersPolicyJson(String siteMembersPolicyJson) {
        this.siteMembersPolicyJson = siteMembersPolicyJson;
    }

    public String getSiteCustomrsPolicyJson() {
        return siteCustomrsPolicyJson;
    }

    public void setSiteCustomrsPolicyJson(String siteCustomrsPolicyJson) {
        this.siteCustomrsPolicyJson = siteCustomrsPolicyJson;
    }

    public String getSiteVisitorsPolicyJson() {
        return siteVisitorsPolicyJson;
    }

    public void setSiteVisitorsPolicyJson(String siteVisitorsPolicyJson) {
        this.siteVisitorsPolicyJson = siteVisitorsPolicyJson;
    }

    @Override
    public String toString() {
        return "SiteCMS{" +
                "siteID=" + siteID +
                ", siteLogoLink='" + siteLogoLink + '\'' +
                ", siteBodyColorRGB='" + siteBodyColorRGB + '\'' +
                ", siteBodyFontColorText='" + siteBodyFontColorText + '\'' +
                ", siteFontNameText='" + siteFontNameText + '\'' +
                ", siteMainColorRGB='" + siteMainColorRGB + '\'' +
                ", siteMainFontColorText='" + siteMainFontColorText + '\'' +
                ", siteTitleText='" + siteTitleText + '\'' +
                ", siteMetaDescriptionText='" + siteMetaDescriptionText + '\'' +
                ", blogLink='" + blogLink + '\'' +
                ", slide1DefaultLink='" + slide1DefaultLink + '\'' +
                ", slide2DefaultLink='" + slide2DefaultLink + '\'' +
                ", slide3DefaultLink='" + slide3DefaultLink + '\'' +
                ", slide4DefaultLink='" + slide4DefaultLink + '\'' +
                ", slide5DefaultLink='" + slide5DefaultLink + '\'' +
                ", event1DefaultLink='" + event1DefaultLink + '\'' +
                ", event2DefaultLink='" + event2DefaultLink + '\'' +
                ", event3DefaultLink='" + event3DefaultLink + '\'' +
                ", tourDefaultLink='" + tourDefaultLink + '\'' +
                ", siteFacebookLink='" + siteFacebookLink + '\'' +
                ", siteTwitterLink='" + siteTwitterLink + '\'' +
                ", siteInstagramLink='" + siteInstagramLink + '\'' +
                ", sitePinterestLink='" + sitePinterestLink + '\'' +
                ", siteCopyright='" + siteCopyright + '\'' +
                ", ourServMissionJson='" + ourServMissionJson + '\'' +
                ", ourServWhoWeRJson='" + ourServWhoWeRJson + '\'' +
                ", ourServBoardJson='" + ourServBoardJson + '\'' +
                ", ourServFeaturesJson='" + ourServFeaturesJson + '\'' +
                ", ourServMmbshipJson='" + ourServMmbshipJson + '\'' +
                ", contactUsJson='" + contactUsJson + '\'' +
                ", footerHistoryJson='" + footerHistoryJson + '\'' +
                ", sitePoliciesJson='" + sitePoliciesJson + '\'' +
                ", siteMembersPolicyJson='" + siteMembersPolicyJson + '\'' +
                ", siteCustomrsPolicyJson='" + siteCustomrsPolicyJson + '\'' +
                ", siteVisitorsPolicyJson='" + siteVisitorsPolicyJson + '\'' +
                '}';
    }
}
