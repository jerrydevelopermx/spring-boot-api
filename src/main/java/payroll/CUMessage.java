package payroll;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CUMessage {
    private @Id
    @GeneratedValue
    Long id;
    private String messageID;
    private Integer messageNumber;
    private String emailAddress;
    private Integer departmentID;
    private Long userID;
    private Long customerID;
    private Long subscriberID;
    private String  messageType;
    private String lastAndFirstName;
    private String companyName;
    private String messageSubject;
    private String messageBody;
    private String createdDatime;
    private Integer communicatedTo;
    private String communicatedDatime;
    private Integer level1EscalatedTo;
    private String level1EscalationDatime;
    private Integer level2EscalatedTo;
    private String level2EscalationDatime;
    private Integer modifiedByID;
    private String modifiedDatime;
    private Integer resolvedByID;
    private String  resolvedDatime;
    private Integer approvedByID;
    private String approvedDatime;
    private String resolutionText;
    private String messageStatus;

    public CUMessage() {
    }

    public CUMessage(Integer messageNumber, String emailAddress, Integer departmentID, Long userID, Long customerID, Long subscriberID, String messageType, String lastAndFirstName, String companyName, String messageSubject, String messageBody) {
        this.messageNumber = messageNumber;
        this.emailAddress = emailAddress;
        this.departmentID = departmentID;
        this.userID = userID;
        this.customerID = customerID;
        this.subscriberID = subscriberID;
        this.messageType = messageType;
        this.lastAndFirstName = lastAndFirstName;
        this.companyName = companyName;
        this.messageSubject = messageSubject;
        this.messageBody = messageBody;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessageID() {
        return messageID;
    }

    public void setMessageID(String messageID) {
        this.messageID = messageID;
    }

    public Integer getMessageNumber() {
        return messageNumber;
    }

    public void setMessageNumber(Integer messageNumber) {
        this.messageNumber = messageNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Integer getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(Integer departmentID) {
        this.departmentID = departmentID;
    }

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public Long getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Long customerID) {
        this.customerID = customerID;
    }

    public Long getSubscriberID() {
        return subscriberID;
    }

    public void setSubscriberID(Long subscriberID) {
        this.subscriberID = subscriberID;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public String getLastAndFirstName() {
        return lastAndFirstName;
    }

    public void setLastAndFirstName(String lastAndFirstName) {
        this.lastAndFirstName = lastAndFirstName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getMessageSubject() {
        return messageSubject;
    }

    public void setMessageSubject(String messageSubject) {
        this.messageSubject = messageSubject;
    }

    public String getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }

    public String getCreatedDatime() {
        return createdDatime;
    }

    public void setCreatedDatime(String createdDatime) {
        this.createdDatime = createdDatime;
    }

    public Integer getCommunicatedTo() {
        return communicatedTo;
    }

    public void setCommunicatedTo(Integer communicatedTo) {
        this.communicatedTo = communicatedTo;
    }

    public String getCommunicatedDatime() {
        return communicatedDatime;
    }

    public void setCommunicatedDatime(String communicatedDatime) {
        this.communicatedDatime = communicatedDatime;
    }

    public Integer getLevel1EscalatedTo() {
        return level1EscalatedTo;
    }

    public void setLevel1EscalatedTo(Integer level1EscalatedTo) {
        this.level1EscalatedTo = level1EscalatedTo;
    }

    public String getLevel1EscalationDatime() {
        return level1EscalationDatime;
    }

    public void setLevel1EscalationDatime(String level1EscalationDatime) {
        this.level1EscalationDatime = level1EscalationDatime;
    }

    public Integer getLevel2EscalatedTo() {
        return level2EscalatedTo;
    }

    public void setLevel2EscalatedTo(Integer level2EscalatedTo) {
        this.level2EscalatedTo = level2EscalatedTo;
    }

    public String getLevel2EscalationDatime() {
        return level2EscalationDatime;
    }

    public void setLevel2EscalationDatime(String level2EscalationDatime) {
        this.level2EscalationDatime = level2EscalationDatime;
    }

    public Integer getModifiedByID() {
        return modifiedByID;
    }

    public void setModifiedByID(Integer modifiedByID) {
        this.modifiedByID = modifiedByID;
    }

    public String getModifiedDatime() {
        return modifiedDatime;
    }

    public void setModifiedDatime(String modifiedDatime) {
        this.modifiedDatime = modifiedDatime;
    }

    public Integer getResolvedByID() {
        return resolvedByID;
    }

    public void setResolvedByID(Integer resolvedByID) {
        this.resolvedByID = resolvedByID;
    }

    public String getResolvedDatime() {
        return resolvedDatime;
    }

    public void setResolvedDatime(String resolvedDatime) {
        this.resolvedDatime = resolvedDatime;
    }

    public Integer getApprovedByID() {
        return approvedByID;
    }

    public void setApprovedByID(Integer approvedByID) {
        this.approvedByID = approvedByID;
    }

    public String getApprovedDatime() {
        return approvedDatime;
    }

    public void setApprovedDatime(String approvedDatime) {
        this.approvedDatime = approvedDatime;
    }

    public String getResolutionText() {
        return resolutionText;
    }

    public void setResolutionText(String resolutionText) {
        this.resolutionText = resolutionText;
    }

    public String getMessageStatus() {
        return messageStatus;
    }

    public void setMessageStatus(String messageStatus) {
        this.messageStatus = messageStatus;
    }
}
