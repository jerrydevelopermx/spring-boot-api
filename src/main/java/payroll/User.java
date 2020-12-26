package payroll;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class User {
    private @Id @GeneratedValue Long id;
    private String username;
    private String password;
    private String userType;
    private Boolean isLegalPerson;
    private String userLastName;
    private String userFirstName;
    private String address1Text;
    private String address2Text;
    private String cityName;
    private String stateCode;
    private String postalCode;
    private String countryCode;
    private String landlineNumber;
    private String faxNumber;
    private String cellPhoneNumber;
    private String userEmail;
    private String website;
    private String userIDType;
    private String userIDNumber;
    private String userDOBDate;
    private String userTaxCode;
    private String userTaxCUITL;
    private Boolean isStore;
    private Boolean isStoreContact;
    private Boolean isCustomer;
    private Boolean isSupplier;
    private Boolean isShipper;
    private Boolean isMember;
    private String userFacebookLink;
    private String userTwitterLink;
    private String userInstagramLink;
    private String userPinterestLink;
    private String subscriptionEmail;
    private String userStatus;
    private String createdDatime;
    private String modifByID;
    private String modifDatime;

    public  User(){}

    public User(String userFirstName, String userLastName, String userEmail, String address1Text, String address2Text, String userStatus ){
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.userEmail = userEmail;
        this.address1Text = address1Text;
        this.address2Text = address2Text;
        this.userStatus = userStatus;
    }

    public User(String username, String userFirstName, String userLastName, String userStatus, String userType,String createdDatime, String modifDatime, String modifByID){
        this.username = username;
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.userType = userType;
        this.userStatus = userStatus;
        this.createdDatime = createdDatime;
        this.modifDatime = modifDatime;
        this.modifByID = modifByID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getLandlineNumber() {
        return landlineNumber;
    }

    public void setLandlineNumber(String landlineNumber) {
        this.landlineNumber = landlineNumber;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public String getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public void setCellPhoneNumber(String cellPhoneNumber) {
        this.cellPhoneNumber = cellPhoneNumber;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
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

    public String getUserIDNumber() {
        return userIDNumber;
    }

    public void setUserIDNumber(String userIDNumber) {
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

    public String getUserTaxCUITL() {
        return userTaxCUITL;
    }

    public void setUserTaxCUITL(String userTaxCUITL) {
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

    public Boolean getCustomer() {
        return isCustomer;
    }

    public void setCustomer(Boolean customer) {
        isCustomer = customer;
    }

    public Boolean getSupplier() {
        return isSupplier;
    }

    public void setSupplier(Boolean supplier) {
        isSupplier = supplier;
    }

    public Boolean getShipper() {
        return isShipper;
    }

    public void setShipper(Boolean shipper) {
        isShipper = shipper;
    }

    public Boolean getMember() {
        return isMember;
    }

    public void setMember(Boolean member) {
        isMember = member;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return id.equals(user.id) &&
                username.equals(user.username) &&
                password.equals(user.password) &&
                userType.equals(user.userType) &&
                isLegalPerson.equals(user.isLegalPerson) &&
                userLastName.equals(user.userLastName) &&
                userFirstName.equals(user.userFirstName) &&
                address1Text.equals(user.address1Text) &&
                address2Text.equals(user.address2Text) &&
                cityName.equals(user.cityName) &&
                stateCode.equals(user.stateCode) &&
                postalCode.equals(user.postalCode) &&
                countryCode.equals(user.countryCode) &&
                landlineNumber.equals(user.landlineNumber) &&
                faxNumber.equals(user.faxNumber) &&
                cellPhoneNumber.equals(user.cellPhoneNumber) &&
                userEmail.equals(user.userEmail) &&
                website.equals(user.website) &&
                userIDType.equals(user.userIDType) &&
                userIDNumber.equals(user.userIDNumber) &&
                userDOBDate.equals(user.userDOBDate) &&
                userTaxCode.equals(user.userTaxCode) &&
                userTaxCUITL.equals(user.userTaxCUITL) &&
                isStore.equals(user.isStore) &&
                isStoreContact.equals(user.isStoreContact) &&
                isCustomer.equals(user.isCustomer) &&
                isSupplier.equals(user.isSupplier) &&
                isShipper.equals(user.isShipper) &&
                isMember.equals(user.isMember) &&
                Objects.equals(userFacebookLink, user.userFacebookLink) &&
                Objects.equals(userTwitterLink, user.userTwitterLink) &&
                Objects.equals(userInstagramLink, user.userInstagramLink) &&
                Objects.equals(userPinterestLink, user.userPinterestLink) &&
                Objects.equals(subscriptionEmail, user.subscriptionEmail) &&
                Objects.equals(userStatus, user.userStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, userType, isLegalPerson, userLastName, userFirstName, address1Text, address2Text, cityName, stateCode, postalCode, countryCode, landlineNumber, faxNumber, cellPhoneNumber, userEmail, website, userIDType, userIDNumber, userDOBDate, userTaxCode, userTaxCUITL, isStore, isStoreContact, isCustomer, isSupplier, isShipper, isMember, userFacebookLink, userTwitterLink, userInstagramLink, userPinterestLink, subscriptionEmail, userStatus);
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

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", userType='" + userType + '\'' +
                ", isLegalPerson=" + isLegalPerson +
                ", userLastName='" + userLastName + '\'' +
                ", userFirstName='" + userFirstName + '\'' +
                ", address1Text='" + address1Text + '\'' +
                ", address2Text='" + address2Text + '\'' +
                ", cityName='" + cityName + '\'' +
                ", stateCode='" + stateCode + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", landlineNumber='" + landlineNumber + '\'' +
                ", faxNumber='" + faxNumber + '\'' +
                ", cellPhoneNumber='" + cellPhoneNumber + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", website='" + website + '\'' +
                ", userIDType='" + userIDType + '\'' +
                ", userIDNumber='" + userIDNumber + '\'' +
                ", userDOBDate='" + userDOBDate + '\'' +
                ", userTaxCode='" + userTaxCode + '\'' +
                ", userTaxCUITL='" + userTaxCUITL + '\'' +
                ", isStore=" + isStore +
                ", isStoreContact=" + isStoreContact +
                ", isCustomer=" + isCustomer +
                ", isSupplier=" + isSupplier +
                ", isShipper=" + isShipper +
                ", isMember=" + isMember +
                ", userFacebookLink='" + userFacebookLink + '\'' +
                ", userTwitterLink='" + userTwitterLink + '\'' +
                ", userInstagramLink='" + userInstagramLink + '\'' +
                ", userPinterestLink='" + userPinterestLink + '\'' +
                ", subscriptionEmail='" + subscriptionEmail + '\'' +
                ", userStatus='" + userStatus + '\'' +
                '}';
    }
}
