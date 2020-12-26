package payroll;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Replenishment {
    private @Id
    @GeneratedValue
    Long id;
    private String replenishmentOrderNr;
    private String departmentID;
    private String supplierID;
    private String repGenDatime;
    private String repPlacedDatime;
    private String repOrderStatus;
    private Integer repLineItemNr;
    private String productID;
    private String supplierProductID;
    private Double quantityOrdered;
    private Double quantityReceived;
    private Double estimatedUnitCost;
    private Double actualUnitCost;
    private String dateFulfilled;
    private String repLIStatus;

    public Replenishment() {
    }

    public Replenishment(String replenishmentOrderNr, String departmentID, String supplierID, String repGenDatime, String repPlacedDatime, String repOrderStatus, Integer repLineItemNr, String productID, String supplierProductID, Double quantityOrdered, Double quantityReceived, Double estimatedUnitCost, Double actualUnitCost, String dateFulfilled, String repLIStatus) {
        this.replenishmentOrderNr = replenishmentOrderNr;
        this.departmentID = departmentID;
        this.supplierID = supplierID;
        this.repGenDatime = repGenDatime;
        this.repPlacedDatime = repPlacedDatime;
        this.repOrderStatus = repOrderStatus;
        this.repLineItemNr = repLineItemNr;
        this.productID = productID;
        this.supplierProductID = supplierProductID;
        this.quantityOrdered = quantityOrdered;
        this.quantityReceived = quantityReceived;
        this.estimatedUnitCost = estimatedUnitCost;
        this.actualUnitCost = actualUnitCost;
        this.dateFulfilled = dateFulfilled;
        this.repLIStatus = repLIStatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReplenishmentOrderNr() {
        return replenishmentOrderNr;
    }

    public void setReplenishmentOrderNr(String replenishmentOrderNr) {
        this.replenishmentOrderNr = replenishmentOrderNr;
    }

    public String getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(String departmentID) {
        this.departmentID = departmentID;
    }

    public String getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(String supplierID) {
        this.supplierID = supplierID;
    }

    public String getRepGenDatime() {
        return repGenDatime;
    }

    public void setRepGenDatime(String repGenDatime) {
        this.repGenDatime = repGenDatime;
    }

    public String getRepPlacedDatime() {
        return repPlacedDatime;
    }

    public void setRepPlacedDatime(String repPlacedDatime) {
        this.repPlacedDatime = repPlacedDatime;
    }

    public String getRepOrderStatus() {
        return repOrderStatus;
    }

    public void setRepOrderStatus(String repOrderStatus) {
        this.repOrderStatus = repOrderStatus;
    }

    public Integer getRepLineItemNr() {
        return repLineItemNr;
    }

    public void setRepLineItemNr(Integer repLineItemNr) {
        this.repLineItemNr = repLineItemNr;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getSupplierProductID() {
        return supplierProductID;
    }

    public void setSupplierProductID(String supplierProductID) {
        this.supplierProductID = supplierProductID;
    }

    public Double getQuantityOrdered() {
        return quantityOrdered;
    }

    public void setQuantityOrdered(Double quantityOrdered) {
        this.quantityOrdered = quantityOrdered;
    }

    public Double getQuantityReceived() {
        return quantityReceived;
    }

    public void setQuantityReceived(Double quantityReceived) {
        this.quantityReceived = quantityReceived;
    }

    public Double getEstimatedUnitCost() {
        return estimatedUnitCost;
    }

    public void setEstimatedUnitCost(Double estimatedUnitCost) {
        this.estimatedUnitCost = estimatedUnitCost;
    }

    public Double getActualUnitCost() {
        return actualUnitCost;
    }

    public void setActualUnitCost(Double actualUnitCost) {
        this.actualUnitCost = actualUnitCost;
    }

    public String getDateFulfilled() {
        return dateFulfilled;
    }

    public void setDateFulfilled(String dateFulfilled) {
        this.dateFulfilled = dateFulfilled;
    }

    public String getRepLIStatus() {
        return repLIStatus;
    }

    public void setRepLIStatus(String repLIStatus) {
        this.repLIStatus = repLIStatus;
    }

    @Override
    public String toString() {
        return "Replenishment{" +
                "id=" + id +
                ", replenishmentOrderNr='" + replenishmentOrderNr + '\'' +
                ", departmentID='" + departmentID + '\'' +
                ", supplierID='" + supplierID + '\'' +
                ", repGenDatime='" + repGenDatime + '\'' +
                ", repPlacedDatime='" + repPlacedDatime + '\'' +
                ", repOrderStatus='" + repOrderStatus + '\'' +
                ", repLineItemNr=" + repLineItemNr +
                ", productID='" + productID + '\'' +
                ", supplierProductID='" + supplierProductID + '\'' +
                ", quantityOrdered=" + quantityOrdered +
                ", quantityReceived=" + quantityReceived +
                ", estimatedUnitCost=" + estimatedUnitCost +
                ", actualUnitCost=" + actualUnitCost +
                ", dateFulfilled='" + dateFulfilled + '\'' +
                ", repLIStatus='" + repLIStatus + '\'' +
                '}';
    }
}
