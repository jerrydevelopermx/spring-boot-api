package payroll;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Campaign {
    private @Id
    @GeneratedValue
    Long id;
    private String campaignNumber;
    private Integer departmentID;
    private String productID;
    private String campaignType;
    private String campaignOccurrence;
    private Integer gridPositionIndex;
    private String promotedFromDatime;
    private String promotedToDatime;
    private String campaignStatus;

    public Campaign() {
    }

    public Campaign(String campaignNumber, Integer departmentID, String campaignOccurrence, Integer gridPositionIndex, String promotedFromDatime, String promotedToDatime, String campaignStatus) {
        this.campaignNumber = campaignNumber;
        this.departmentID = departmentID;
        this.campaignOccurrence = campaignOccurrence;
        this.gridPositionIndex = gridPositionIndex;
        this.promotedFromDatime = promotedFromDatime;
        this.promotedToDatime = promotedToDatime;
        this.campaignStatus = campaignStatus;
    }

    public Campaign(String campaignNumber, Integer departmentID, String productID, String campaignType, String campaignOccurrence, Integer gridPositionIndex, String promotedFromDatime, String promotedToDatime, String campaignStatus) {
        this.campaignNumber = campaignNumber;
        this.departmentID = departmentID;
        this.productID = productID;
        this.campaignType = campaignType;
        this.campaignOccurrence = campaignOccurrence;
        this.gridPositionIndex = gridPositionIndex;
        this.promotedFromDatime = promotedFromDatime;
        this.promotedToDatime = promotedToDatime;
        this.campaignStatus = campaignStatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCampaignNumber() {
        return campaignNumber;
    }

    public void setCampaignNumber(String campaignNumber) {
        this.campaignNumber = campaignNumber;
    }

    public Integer getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(Integer departmentID) {
        this.departmentID = departmentID;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getCampaignType() {
        return campaignType;
    }

    public void setCampaignType(String campaignType) {
        this.campaignType = campaignType;
    }

    public String getCampaignOccurrence() {
        return campaignOccurrence;
    }

    public void setCampaignOccurrence(String campaignOccurrence) {
        this.campaignOccurrence = campaignOccurrence;
    }

    public Integer getGridPositionIndex() {
        return gridPositionIndex;
    }

    public void setGridPositionIndex(Integer gridPositionIndex) {
        this.gridPositionIndex = gridPositionIndex;
    }

    public String getPromotedFromDatime() {
        return promotedFromDatime;
    }

    public void setPromotedFromDatime(String promotedFromDatime) {
        this.promotedFromDatime = promotedFromDatime;
    }

    public String getPromotedToDatime() {
        return promotedToDatime;
    }

    public void setPromotedToDatime(String promotedToDatime) {
        this.promotedToDatime = promotedToDatime;
    }

    public String getCampaignStatus() {
        return campaignStatus;
    }

    public void setCampaignStatus(String campaignStatus) {
        this.campaignStatus = campaignStatus;
    }

    @Override
    public String toString() {
        return "Campaign{" +
                "id=" + id +
                ", campaignNumber='" + campaignNumber + '\'' +
                ", departmentID='" + departmentID + '\'' +
                ", productID='" + productID + '\'' +
                ", campaignType='" + campaignType + '\'' +
                ", campaignOccurrence='" + campaignOccurrence + '\'' +
                ", gridPositionIndex=" + gridPositionIndex +
                ", promotedFromDatime='" + promotedFromDatime + '\'' +
                ", promotedToDatime='" + promotedToDatime + '\'' +
                ", campaignStatus='" + campaignStatus + '\'' +
                '}';
    }
}
