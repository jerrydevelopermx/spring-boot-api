package payroll;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class User {

    private @Id @GeneratedValue Long id;
    private Integer departmentID;
    private String username;
    private String password;
    private String userAlias;
    private String avatarPhotoLink;
    private String userType;
    private Boolean isLegalPerson;
    private String userLastName;
    private String userFirstName;
    private String address1Text;
    private String address2Text;
    private String cityName;
    private String stateCode;
    private Integer postalCode;
    private String countryCode;
    private Integer landlineNumber;
    private Integer faxNumber;
    private Integer cellPhoneNumber;
    private String alternateEmail;
    private String website;
    private String userIDType;
    private Integer userIDNumber;
    private String userDOBDate;
    private String userTaxCode;
    private Integer userTaxCUITL;
    private Boolean isStore;
    private Boolean isStoreContact;
    private Boolean isSupplier;
    private Boolean isSupplierContact;
    private Boolean isShipper;
    private Boolean isShipperContact;
    private Boolean isPymntChannel;
    private Boolean isPymntChContact;
    private Boolean isMember;
    private Boolean isCustomer;
    private Boolean isSubscriber;
    private Boolean isBlogger;
    private String userFacebookLink;
    private String userTwitterLink;
    private String userInstagramLink;
    private String userPinterestLink;
    private String subscriptionEmail;
    private String createdByID;
    private String createdDatime;
    private String modifByID;
    private String modifDatime;
    private String userStatus;

    public User() {

    }

    public User(Integer departmentID, String username, String password, String userAlias, String avatarPhotoLink, String userType, Boolean isLegalPerson, String userLastName, String userFirstName, String address1Text, String address2Text, String cityName, String stateCode, Integer postalCode, String countryCode, Integer landlineNumber, Integer faxNumber, Integer cellPhoneNumber, String alternateEmail, String website) {
        this.departmentID = departmentID;
        this.username = username;
        this.password = password;
        this.userAlias = userAlias;
        this.avatarPhotoLink = avatarPhotoLink;
        this.userType = userType;
        this.isLegalPerson = isLegalPerson;
        this.userLastName = userLastName;
        this.userFirstName = userFirstName;
        this.address1Text = address1Text;
        this.address2Text = address2Text;
        this.cityName = cityName;
        this.stateCode = stateCode;
        this.postalCode = postalCode;
        this.countryCode = countryCode;
        this.landlineNumber = landlineNumber;
        this.faxNumber = faxNumber;
        this.cellPhoneNumber = cellPhoneNumber;
        this.alternateEmail = alternateEmail;
        this.website = website;
    }

    public User(Integer departmentID, String username, String password, String userAlias, String avatarPhotoLink, String userType, Boolean isLegalPerson, String userLastName, String userFirstName, String address1Text, String address2Text, String cityName, String stateCode, Integer postalCode, String countryCode, Integer landlineNumber, Integer faxNumber, Integer cellPhoneNumber, String alternateEmail, String website, Boolean isStore, Boolean isSupplier, Boolean isShipper, Boolean isPymntChannel, Boolean isMember, Boolean isCustomer, Boolean isSubscriber, Boolean isBlogger) {
        this.departmentID = departmentID;
        this.username = username;
        this.password = password;
        this.userAlias = userAlias;
        this.avatarPhotoLink = avatarPhotoLink;
        this.userType = userType;
        this.isLegalPerson = isLegalPerson;
        this.userLastName = userLastName;
        this.userFirstName = userFirstName;
        this.address1Text = address1Text;
        this.address2Text = address2Text;
        this.cityName = cityName;
        this.stateCode = stateCode;
        this.postalCode = postalCode;
        this.countryCode = countryCode;
        this.landlineNumber = landlineNumber;
        this.faxNumber = faxNumber;
        this.cellPhoneNumber = cellPhoneNumber;
        this.alternateEmail = alternateEmail;
        this.website = website;
        this.isStore = isStore;
        this.isSupplier = isSupplier;
        this.isShipper = isShipper;
        this.isPymntChannel = isPymntChannel;
        this.isMember = isMember;
        this.isCustomer = isCustomer;
        this.isSubscriber = isSubscriber;
        this.isBlogger = isBlogger;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(Integer departmentID) {
        this.departmentID = departmentID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserAlias() {
        return userAlias;
    }

    public void setUserAlias(String userAlias) {
        this.userAlias = userAlias;
    }

    public String getAvatarPhotoLink() {
        return avatarPhotoLink;
    }

    public void setAvatarPhotoLink(String avatarPhotoLink) {
        this.avatarPhotoLink = avatarPhotoLink;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public Boolean getLegalPerson() {
        return isLegalPerson;
    }

    public void setLegalPerson(Boolean legalPerson) {
        isLegalPerson = legalPerson;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getAddress1Text() {
        return address1Text;
    }

    public void setAddress1Text(String address1Text) {
        this.address1Text = address1Text;
    }

    public String getAddress2Text() {
        return address2Text;
    }

    public void setAddress2Text(String address2Text) {
        this.address2Text = address2Text;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public Integer getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Integer postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Integer getLandlineNumber() {
        return landlineNumber;
    }

    public void setLandlineNumber(Integer landlineNumber) {
        this.landlineNumber = landlineNumber;
    }

    public Integer getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(Integer faxNumber) {
        this.faxNumber = faxNumber;
    }

    public Integer getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public void setCellPhoneNumber(Integer cellPhoneNumber) {
        this.cellPhoneNumber = cellPhoneNumber;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getUserIDType() {
        return userIDType;
    }

    public void setUserIDType(String userIDType) {
        this.userIDType = userIDType;
    }

    public Integer getUserIDNumber() {
        return userIDNumber;
    }

    public void setUserIDNumber(Integer userIDNumber) {
        this.userIDNumber = userIDNumber;
    }

    public String getUserDOBDate() {
        return userDOBDate;
    }

    public void setUserDOBDate(String userDOBDate) {
        this.userDOBDate = userDOBDate;
    }

    public String getUserTaxCode() {
        return userTaxCode;
    }

    public void setUserTaxCode(String userTaxCode) {
        this.userTaxCode = userTaxCode;
    }

    public Integer getUserTaxCUITL() {
        return userTaxCUITL;
    }

    public void setUserTaxCUITL(Integer userTaxCUITL) {
        this.userTaxCUITL = userTaxCUITL;
    }

    public Boolean getStore() {
        return isStore;
    }

    public void setStore(Boolean store) {
        isStore = store;
    }

    public Boolean getStoreContact() {
        return isStoreContact;
    }

    public void setStoreContact(Boolean storeContact) {
        isStoreContact = storeContact;
    }

    public Boolean getSupplier() {
        return isSupplier;
    }

    public void setSupplier(Boolean supplier) {
        isSupplier = supplier;
    }

    public Boolean getSupplierContact() {
        return isSupplierContact;
    }

    public void setSupplierContact(Boolean supplierContact) {
        isSupplierContact = supplierContact;
    }

    public Boolean getShipper() {
        return isShipper;
    }

    public void setShipper(Boolean shipper) {
        isShipper = shipper;
    }

    public Boolean getShipperContact() {
        return isShipperContact;
    }

    public void setShipperContact(Boolean shipperContact) {
        isShipperContact = shipperContact;
    }

    public Boolean getPymntChannel() {
        return isPymntChannel;
    }

    public void setPymntChannel(Boolean pymntChannel) {
        isPymntChannel = pymntChannel;
    }

    public Boolean getPymntChContact() {
        return isPymntChContact;
    }

    public void setPymntChContact(Boolean pymntChContact) {
        isPymntChContact = pymntChContact;
    }

    public Boolean getMember() {
        return isMember;
    }

    public void setMember(Boolean member) {
        isMember = member;
    }

    public Boolean getCustomer() {
        return isCustomer;
    }

    public void setCustomer(Boolean customer) {
        isCustomer = customer;
    }

    public Boolean getSubscriber() {
        return isSubscriber;
    }

    public void setSubscriber(Boolean subscriber) {
        isSubscriber = subscriber;
    }

    public Boolean getBlogger() {
        return isBlogger;
    }

    public void setBlogger(Boolean blogger) {
        isBlogger = blogger;
    }

    public String getUserFacebookLink() {
        return userFacebookLink;
    }

    public void setUserFacebookLink(String userFacebookLink) {
        this.userFacebookLink = userFacebookLink;
    }

    public String getUserTwitterLink() {
        return userTwitterLink;
    }

    public void setUserTwitterLink(String userTwitterLink) {
        this.userTwitterLink = userTwitterLink;
    }

    public String getUserInstagramLink() {
        return userInstagramLink;
    }

    public void setUserInstagramLink(String userInstagramLink) {
        this.userInstagramLink = userInstagramLink;
    }

    public String getUserPinterestLink() {
        return userPinterestLink;
    }

    public void setUserPinterestLink(String userPinterestLink) {
        this.userPinterestLink = userPinterestLink;
    }

    public String getSubscriptionEmail() {
        return subscriptionEmail;
    }

    public void setSubscriptionEmail(String subscriptionEmail) {
        this.subscriptionEmail = subscriptionEmail;
    }

    public String getCreatedByID() {
        return createdByID;
    }

    public void setCreatedByID(String createdByID) {
        this.createdByID = createdByID;
    }

    public String getCreatedDatime() {
        return createdDatime;
    }

    public void setCreatedDatime(String createdDatime) {
        this.createdDatime = createdDatime;
    }

    public String getModifByID() {
        return modifByID;
    }

    public void setModifByID(String modifByID) {
        this.modifByID = modifByID;
    }

    public String getModifDatime() {
        return modifDatime;
    }

    public void setModifDatime(String modifDatime) {
        this.modifDatime = modifDatime;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + id +
                ", departmentID=" + departmentID +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", userAlias='" + userAlias + '\'' +
                ", avatarPhotoLink='" + avatarPhotoLink + '\'' +
                ", userType='" + userType + '\'' +
                ", isLegalPerson=" + isLegalPerson +
                ", userLastName='" + userLastName + '\'' +
                ", userFirstName='" + userFirstName + '\'' +
                ", address1Text='" + address1Text + '\'' +
                ", address2Text='" + address2Text + '\'' +
                ", cityName='" + cityName + '\'' +
                ", stateCode='" + stateCode + '\'' +
                ", postalCode=" + postalCode +
                ", countryCode='" + countryCode + '\'' +
                ", landlineNumber=" + landlineNumber +
                ", faxNumber=" + faxNumber +
                ", cellPhoneNumber=" + cellPhoneNumber +
                ", alternateEmail='" + alternateEmail + '\'' +
                ", website='" + website + '\'' +
                ", userIDType='" + userIDType + '\'' +
                ", userIDNumber=" + userIDNumber +
                ", userDOBDate='" + userDOBDate + '\'' +
                ", userTaxCode='" + userTaxCode + '\'' +
                ", userTaxCUITL=" + userTaxCUITL +
                ", isStore=" + isStore +
                ", isStoreContact=" + isStoreContact +
                ", isSupplier=" + isSupplier +
                ", isSupplierContact=" + isSupplierContact +
                ", isShipper=" + isShipper +
                ", isShipperContact=" + isShipperContact +
                ", isPymntChannel=" + isPymntChannel +
                ", isPymntChContact=" + isPymntChContact +
                ", isMember=" + isMember +
                ", isCustomer=" + isCustomer +
                ", isSubscriber=" + isSubscriber +
                ", isBlogger=" + isBlogger +
                ", userFacebookLink='" + userFacebookLink + '\'' +
                ", userTwitterLink='" + userTwitterLink + '\'' +
                ", userInstagramLink='" + userInstagramLink + '\'' +
                ", userPinterestLink='" + userPinterestLink + '\'' +
                ", subscriptionEmail='" + subscriptionEmail + '\'' +
                ", createdByID='" + createdByID + '\'' +
                ", createdDatime='" + createdDatime + '\'' +
                ", modifByID='" + modifByID + '\'' +
                ", modifDatime='" + modifDatime + '\'' +
                ", userStatus='" + userStatus + '\'' +
                '}';
    }
}
