package payroll;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Event {
    private @Id
    @GeneratedValue
    Long id;
    private String username;
    private String userType;
    private Integer departmentID;
    private String fullName;
    private Integer cellPhoneNumber;
    private String userStatus;

    private String eventDatime;
    private String eventCategory;
    private String eventType;
    private String activity;
    private Long originatorID;
    private String eventStart;
    private String eventEnd;
    private String eventOutcome;
    private String deviceName;
    private String deviceIPaddress;
    private String eventSeverity;
    private String eventStatus;
    private String eventRetention;

    public Event() {
    }

    public Event(String eventDatime, String eventCategory, String eventType, String activity, Long originatorID, String eventStart, String eventEnd, String eventOutcome, String deviceName, String deviceIPaddress, String eventSeverity, String eventStatus, String eventRetention) {
        this.eventDatime = eventDatime;
        this.eventCategory = eventCategory;
        this.eventType = eventType;
        this.activity = activity;
        this.originatorID = originatorID;
        this.eventStart = eventStart;
        this.eventEnd = eventEnd;
        this.eventOutcome = eventOutcome;
        this.deviceName = deviceName;
        this.deviceIPaddress = deviceIPaddress;
        this.eventSeverity = eventSeverity;
        this.eventStatus = eventStatus;
        this.eventRetention = eventRetention;
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

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public Integer getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(Integer departmentID) {
        this.departmentID = departmentID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public void setCellPhoneNumber(Integer cellPhoneNumber) {
        this.cellPhoneNumber = cellPhoneNumber;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    public String getEventDatime() {
        return eventDatime;
    }

    public void setEventDatime(String eventDatime) {
        this.eventDatime = eventDatime;
    }

    public String getEventCategory() {
        return eventCategory;
    }

    public void setEventCategory(String eventCategory) {
        this.eventCategory = eventCategory;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public Long getOriginatorID() {
        return originatorID;
    }

    public void setOriginatorID(Long originatorID) {
        this.originatorID = originatorID;
    }

    public String getEventStart() {
        return eventStart;
    }

    public void setEventStart(String eventStart) {
        this.eventStart = eventStart;
    }

    public String getEventEnd() {
        return eventEnd;
    }

    public void setEventEnd(String eventEnd) {
        this.eventEnd = eventEnd;
    }

    public String getEventOutcome() {
        return eventOutcome;
    }

    public void setEventOutcome(String eventOutcome) {
        this.eventOutcome = eventOutcome;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceIPaddress() {
        return deviceIPaddress;
    }

    public void setDeviceIPaddress(String deviceIPaddress) {
        this.deviceIPaddress = deviceIPaddress;
    }

    public String getEventSeverity() {
        return eventSeverity;
    }

    public void setEventSeverity(String eventSeverity) {
        this.eventSeverity = eventSeverity;
    }

    public String getEventStatus() {
        return eventStatus;
    }

    public void setEventStatus(String eventStatus) {
        this.eventStatus = eventStatus;
    }

    public String getEventRetention() {
        return eventRetention;
    }

    public void setEventRetention(String eventRetention) {
        this.eventRetention = eventRetention;
    }
}
