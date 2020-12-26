package payroll;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Department {
    private @Id
    @GeneratedValue
    Long id;
    private String departmentID;
    private Integer departmentNumber;
    private String departmentName;
    private String userID;
    private String contactID;
    private Integer deptCategoryNumber;
    private String deptStatus;
    private String placeHolderSinceDate;
    private String placeHolderThruDate;
    private String placeHolderType;
    private String placeHolderCode;
    private String contractLink;
    private String CreatedByID;
    private String CreatedDatime;
    private String ModifiedByID;
    private String ModifiedDatime;
    private String deptDefaultImageLink;
    private String deptLogoLink;
    private Boolean isCampaigning;
    private String campaignID;
    private String gridDefaultPositionIndex;
    private Integer gridPromotedPositionIndex;
    private Integer deptPriorityNumber;


    public Department() {
    }

    public Department(String departmentName, Integer deptCategoryNumber) {
        this.departmentName = departmentName;
        this.deptCategoryNumber = deptCategoryNumber;
    }

    public Department(String departmentID, Integer departmentNumber, String departmentName, Integer deptCategoryNumber, String deptStatus, String placeHolderSinceDate, String placeHolderThruDate, String placeHolderType, String placeHolderCode, String contractLink, String createdByID, String createdDatime, String modifiedByID, String modifiedDatime) {
        this.departmentID = departmentID;
        this.departmentNumber = departmentNumber;
        this.departmentName = departmentName;
        this.deptCategoryNumber = deptCategoryNumber;
        this.deptStatus = deptStatus;
        this.placeHolderSinceDate = placeHolderSinceDate;
        this.placeHolderThruDate = placeHolderThruDate;
        this.placeHolderType = placeHolderType;
        this.placeHolderCode = placeHolderCode;
        this.contractLink = contractLink;
        CreatedByID = createdByID;
        CreatedDatime = createdDatime;
        ModifiedByID = modifiedByID;
        ModifiedDatime = modifiedDatime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(String departmentID) {
        this.departmentID = departmentID;
    }

    public Integer getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(Integer departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getContactID() {
        return contactID;
    }

    public void setContactID(String contactID) {
        this.contactID = contactID;
    }

    public Integer getDeptCategoryNumber() {
        return deptCategoryNumber;
    }

    public void setDeptCategoryNumber(Integer deptCategoryNumber) {
        this.deptCategoryNumber = deptCategoryNumber;
    }

    public String getDeptStatus() {
        return deptStatus;
    }

    public void setDeptStatus(String deptStatus) {
        this.deptStatus = deptStatus;
    }

    public String getPlaceHolderSinceDate() {
        return placeHolderSinceDate;
    }

    public void setPlaceHolderSinceDate(String placeHolderSinceDate) {
        this.placeHolderSinceDate = placeHolderSinceDate;
    }

    public String getPlaceHolderThruDate() {
        return placeHolderThruDate;
    }

    public void setPlaceHolderThruDate(String placeHolderThruDate) {
        this.placeHolderThruDate = placeHolderThruDate;
    }

    public String getPlaceHolderType() {
        return placeHolderType;
    }

    public void setPlaceHolderType(String placeHolderType) {
        this.placeHolderType = placeHolderType;
    }

    public String getPlaceHolderCode() {
        return placeHolderCode;
    }

    public void setPlaceHolderCode(String placeHolderCode) {
        this.placeHolderCode = placeHolderCode;
    }

    public String getContractLink() {
        return contractLink;
    }

    public void setContractLink(String contractLink) {
        this.contractLink = contractLink;
    }

    public String getCreatedByID() {
        return CreatedByID;
    }

    public void setCreatedByID(String createdByID) {
        CreatedByID = createdByID;
    }

    public String getCreatedDatime() {
        return CreatedDatime;
    }

    public void setCreatedDatime(String createdDatime) {
        CreatedDatime = createdDatime;
    }

    public String getModifiedByID() {
        return ModifiedByID;
    }

    public void setModifiedByID(String modifiedByID) {
        ModifiedByID = modifiedByID;
    }

    public String getModifiedDatime() {
        return ModifiedDatime;
    }

    public void setModifiedDatime(String modifiedDatime) {
        ModifiedDatime = modifiedDatime;
    }

    public String getDeptDefaultImageLink() {
        return deptDefaultImageLink;
    }

    public void setDeptDefaultImageLink(String deptDefaultImageLink) {
        this.deptDefaultImageLink = deptDefaultImageLink;
    }

    public String getDeptLogoLink() {
        return deptLogoLink;
    }

    public void setDeptLogoLink(String deptLogoLink) {
        this.deptLogoLink = deptLogoLink;
    }

    public Boolean getCampaigning() {
        return isCampaigning;
    }

    public void setCampaigning(Boolean campaigning) {
        isCampaigning = campaigning;
    }

    public String getCampaignID() {
        return campaignID;
    }

    public void setCampaignID(String campaignID) {
        this.campaignID = campaignID;
    }

    public String getGridDefaultPositionIndex() {
        return gridDefaultPositionIndex;
    }

    public void setGridDefaultPositionIndex(String gridDefaultPositionIndex) {
        this.gridDefaultPositionIndex = gridDefaultPositionIndex;
    }

    public Integer getGridPromotedPositionIndex() {
        return gridPromotedPositionIndex;
    }

    public void setGridPromotedPositionIndex(Integer gridPromotedPositionIndex) {
        this.gridPromotedPositionIndex = gridPromotedPositionIndex;
    }

    public Integer getDeptPriorityNumber() {
        return deptPriorityNumber;
    }

    public void setDeptPriorityNumber(Integer deptPriorityNumber) {
        this.deptPriorityNumber = deptPriorityNumber;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentID='" + departmentID + '\'' +
                ", departmentNumber=" + departmentNumber +
                ", departmentName='" + departmentName + '\'' +
                ", userID='" + userID + '\'' +
                ", contactID='" + contactID + '\'' +
                ", deptCategoryNumber=" + deptCategoryNumber +
                ", deptStatus='" + deptStatus + '\'' +
                ", placeHolderSinceDate='" + placeHolderSinceDate + '\'' +
                ", placeHolderThruDate='" + placeHolderThruDate + '\'' +
                ", placeHolderType='" + placeHolderType + '\'' +
                ", placeHolderCode='" + placeHolderCode + '\'' +
                ", contractLink='" + contractLink + '\'' +
                ", CreatedByID='" + CreatedByID + '\'' +
                ", CreatedDatime='" + CreatedDatime + '\'' +
                ", ModifiedByID='" + ModifiedByID + '\'' +
                ", ModifiedDatime='" + ModifiedDatime + '\'' +
                ", deptDefaultImageLink='" + deptDefaultImageLink + '\'' +
                ", deptLogoLink='" + deptLogoLink + '\'' +
                ", isCampaigning=" + isCampaigning +
                ", campaignID='" + campaignID + '\'' +
                ", gridDefaultPositionIndex='" + gridDefaultPositionIndex + '\'' +
                ", gridPromotedPositionIndex=" + gridPromotedPositionIndex +
                ", deptPriorityNumber=" + deptPriorityNumber +
                '}';
    }
}
