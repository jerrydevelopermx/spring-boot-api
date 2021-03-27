package payroll;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Product {
    private @Id
    @GeneratedValue
    Long id;
    private String productNumber;
    private Integer departmentID;
    private String  productSKU;
    private String productEAN;
    private String productShortName;
    private String productDescription;
    private Integer prodCategoryCode;
    private Integer prodSubcategoryCode;
    private String brandCode;
    private String modelCode;
    private String yearCode;
    private String styleCode;
    private String genderCode;
    private String packagingCode;
    private String materialCode;
    private String colorCode;
    private String sizeCode;
    private String flavorCode;
    private String attribMask;
    private String attributeMapCode;
    private String prodUOMCode;
    private String prodUnitsInStockNumber;
    private String inventoryCostMethod;
    private String prodUnitCostAmount;
    private Double prodMSRPAmount;
    private Double prodUnitPriceAmount;
    private String prodCurrencyType;
    private Integer prodDiscountType;
    private String prodDiscountCondition;
    private Double prodDiscountNumber;
    private Double prodPriceCorrectionFactor;
    private Double prodUnitsOnOrder;
    private String prodReplenishType;
    private Double prodUISThresholdNumber;
    private Integer pendReplenOrderNumber;
    private Integer prodRankingType;
    private String  prodStatus;
    private Integer prodLocation1Text;
    private Integer prodLocation2Text;
    private String prodSpecifications;
    private String prodNotes;
    private String prodDefaultContentLink;
    private String prodDefaultHoverLink;
    private String supplier1ID;
    private String supplier1ProdID;
    private String supplier2ID;
    private String supplier2ProdID;
    private Boolean isCampaigning;
    private String campaignID;
    private Integer gridPromotedPositionIndex;
    private Integer gridDefaulPositiontIndex;
    private String prodPriorityNumber;

    private String galleryImg1;
    private String galleryImg2;
    private String galleryImg3;
    private String galleryImg4;
    private String galleryImg5;


    public Product() {
    }

    public Product(Integer departmentID, String productNumber, String productSKU, String productShortName, String productDescription,
                   Integer prodCategoryCode, Integer prodSubcategoryCode, String brandCode, String modelCode, String yearCode, String styleCode,
                   String genderCode, String packagingCode, String materialCode,
                   String colorCode, String sizeCode, String flavorCode, String prodDefaultContentLink, String prodDefaultHoverLink, String galleryImg1,
                   String galleryImg2, String galleryImg3, String galleryImg4, String galleryImg5, Boolean isCampaigning) {
        this.departmentID = departmentID;
        this.productNumber = productNumber;
        this.productSKU = productSKU;
        this.productShortName = productShortName;
        this.productDescription = productDescription;
        this.prodCategoryCode = prodCategoryCode;
        this.prodSubcategoryCode = prodSubcategoryCode;
        this.brandCode = brandCode;
        this.modelCode = modelCode;
        this.yearCode = yearCode;
        this.styleCode = styleCode;
        this.genderCode = genderCode;
        this.packagingCode = packagingCode;
        this.materialCode = materialCode;
        this.colorCode = colorCode;
        this.sizeCode = sizeCode;
        this.flavorCode = flavorCode;
        this.prodDefaultContentLink = prodDefaultContentLink;
        this.prodDefaultHoverLink = prodDefaultHoverLink;
        this.galleryImg1 = galleryImg1;
        this.galleryImg2 = galleryImg2;
        this.galleryImg3 = galleryImg3;
        this.galleryImg4 = galleryImg4;
        this.galleryImg5 = galleryImg5;
        this.isCampaigning = isCampaigning;
    }

    public Product(Integer departmentID, String productNumber, String productSKU, String productShortName, String productDescription, Integer prodCategoryCode, Integer prodSubcategoryCode, String brandCode, String modelCode, String yearCode, String styleCode, String genderCode, String packagingCode, String materialCode, String colorCode, String sizeCode, String flavorCode) {
        this.departmentID = departmentID;
        this.productNumber = productNumber;
        this.productSKU = productSKU;
        this.productShortName = productShortName;
        this.productDescription = productDescription;
        this.prodCategoryCode = prodCategoryCode;
        this.prodSubcategoryCode = prodSubcategoryCode;
        this.brandCode = brandCode;
        this.modelCode = modelCode;
        this.yearCode = yearCode;
        this.styleCode = styleCode;
        this.genderCode = genderCode;
        this.packagingCode = packagingCode;
        this.materialCode = materialCode;
        this.colorCode = colorCode;
        this.sizeCode = sizeCode;
        this.flavorCode = flavorCode;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    public Integer getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(Integer departmentID) {
        this.departmentID = departmentID;
    }

    public String getProductSKU() {
        return productSKU;
    }

    public void setProductSKU(String productSKU) {
        this.productSKU = productSKU;
    }

    public String getProductEAN() {
        return productEAN;
    }

    public void setProductEAN(String productEAN) {
        this.productEAN = productEAN;
    }

    public String getProductShortName() {
        return productShortName;
    }

    public void setProductShortName(String productShortName) {
        this.productShortName = productShortName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public Integer getProdCategoryCode() {
        return prodCategoryCode;
    }

    public void setProdCategoryCode(Integer prodCategoryCode) {
        this.prodCategoryCode = prodCategoryCode;
    }

    public Integer getProdSubcategoryCode() {
        return prodSubcategoryCode;
    }

    public void setProdSubcategoryCode(Integer prodSubcategoryCode) {
        this.prodSubcategoryCode = prodSubcategoryCode;
    }

    public String getBrandCode() {
        return brandCode;
    }

    public void setBrandCode(String brandCode) {
        this.brandCode = brandCode;
    }

    public String getModelCode() {
        return modelCode;
    }

    public void setModelCode(String modelCode) {
        this.modelCode = modelCode;
    }

    public String getYearCode() {
        return yearCode;
    }

    public void setYearCode(String yearCode) {
        this.yearCode = yearCode;
    }

    public String getStyleCode() {
        return styleCode;
    }

    public void setStyleCode(String styleCode) {
        this.styleCode = styleCode;
    }

    public String getGenderCode() {
        return genderCode;
    }

    public void setGenderCode(String genderCode) {
        this.genderCode = genderCode;
    }

    public String getPackagingCode() {
        return packagingCode;
    }

    public void setPackagingCode(String packagingCode) {
        this.packagingCode = packagingCode;
    }

    public String getMaterialCode() {
        return materialCode;
    }

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode;
    }

    public String getColorCode() {
        return colorCode;
    }

    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }

    public String getSizeCode() {
        return sizeCode;
    }

    public void setSizeCode(String sizeCode) {
        this.sizeCode = sizeCode;
    }

    public String getFlavorCode() {
        return flavorCode;
    }

    public void setFlavorCode(String flavorCode) {
        this.flavorCode = flavorCode;
    }

    public String getAttribMask() {
        return attribMask;
    }

    public void setAttribMask(String attribMask) {
        this.attribMask = attribMask;
    }

    public String getAttributeMapCode() {
        return attributeMapCode;
    }

    public void setAttributeMapCode(String attributeMapCode) {
        this.attributeMapCode = attributeMapCode;
    }

    public String getProdUOMCode() {
        return prodUOMCode;
    }

    public void setProdUOMCode(String prodUOMCode) {
        this.prodUOMCode = prodUOMCode;
    }

    public String getProdUnitsInStockNumber() {
        return prodUnitsInStockNumber;
    }

    public void setProdUnitsInStockNumber(String prodUnitsInStockNumber) {
        this.prodUnitsInStockNumber = prodUnitsInStockNumber;
    }

    public String getInventoryCostMethod() {
        return inventoryCostMethod;
    }

    public void setInventoryCostMethod(String inventoryCostMethod) {
        this.inventoryCostMethod = inventoryCostMethod;
    }

    public String getProdUnitCostAmount() {
        return prodUnitCostAmount;
    }

    public void setProdUnitCostAmount(String prodUnitCostAmount) {
        this.prodUnitCostAmount = prodUnitCostAmount;
    }

    public Double getProdMSRPAmount() {
        return prodMSRPAmount;
    }

    public void setProdMSRPAmount(Double prodMSRPAmount) {
        this.prodMSRPAmount = prodMSRPAmount;
    }

    public Double getProdUnitPriceAmount() {
        return prodUnitPriceAmount;
    }

    public void setProdUnitPriceAmount(Double prodUnitPriceAmount) {
        this.prodUnitPriceAmount = prodUnitPriceAmount;
    }

    public String getProdCurrencyType() {
        return prodCurrencyType;
    }

    public void setProdCurrencyType(String prodCurrencyType) {
        this.prodCurrencyType = prodCurrencyType;
    }

    public Integer getProdDiscountType() {
        return prodDiscountType;
    }

    public void setProdDiscountType(Integer prodDiscountType) {
        this.prodDiscountType = prodDiscountType;
    }

    public String getProdDiscountCondition() {
        return prodDiscountCondition;
    }

    public void setProdDiscountCondition(String prodDiscountCondition) {
        this.prodDiscountCondition = prodDiscountCondition;
    }

    public Double getProdDiscountNumber() {
        return prodDiscountNumber;
    }

    public void setProdDiscountNumber(Double prodDiscountNumber) {
        this.prodDiscountNumber = prodDiscountNumber;
    }

    public Double getProdPriceCorrectionFactor() {
        return prodPriceCorrectionFactor;
    }

    public void setProdPriceCorrectionFactor(Double prodPriceCorrectionFactor) {
        this.prodPriceCorrectionFactor = prodPriceCorrectionFactor;
    }

    public Double getProdUnitsOnOrder() {
        return prodUnitsOnOrder;
    }

    public void setProdUnitsOnOrder(Double prodUnitsOnOrder) {
        this.prodUnitsOnOrder = prodUnitsOnOrder;
    }

    public String getProdReplenishType() {
        return prodReplenishType;
    }

    public void setProdReplenishType(String prodReplenishType) {
        this.prodReplenishType = prodReplenishType;
    }

    public Double getProdUISThresholdNumber() {
        return prodUISThresholdNumber;
    }

    public void setProdUISThresholdNumber(Double prodUISThresholdNumber) {
        this.prodUISThresholdNumber = prodUISThresholdNumber;
    }

    public Integer getPendReplenOrderNumber() {
        return pendReplenOrderNumber;
    }

    public void setPendReplenOrderNumber(Integer pendReplenOrderNumber) {
        this.pendReplenOrderNumber = pendReplenOrderNumber;
    }

    public Integer getProdRankingType() {
        return prodRankingType;
    }

    public void setProdRankingType(Integer prodRankingType) {
        this.prodRankingType = prodRankingType;
    }

    public String getProdStatus() {
        return prodStatus;
    }

    public void setProdStatus(String prodStatus) {
        this.prodStatus = prodStatus;
    }

    public Integer getProdLocation1Text() {
        return prodLocation1Text;
    }

    public void setProdLocation1Text(Integer prodLocation1Text) {
        this.prodLocation1Text = prodLocation1Text;
    }

    public Integer getProdLocation2Text() {
        return prodLocation2Text;
    }

    public void setProdLocation2Text(Integer prodLocation2Text) {
        this.prodLocation2Text = prodLocation2Text;
    }

    public String getProdSpecifications() {
        return prodSpecifications;
    }

    public void setProdSpecifications(String prodSpecifications) {
        this.prodSpecifications = prodSpecifications;
    }

    public String getProdNotes() {
        return prodNotes;
    }

    public void setProdNotes(String prodNotes) {
        this.prodNotes = prodNotes;
    }

    public String getProdDefaultContentLink() {
        return prodDefaultContentLink;
    }

    public void setProdDefaultContentLink(String prodDefaultContentLink) {
        this.prodDefaultContentLink = prodDefaultContentLink;
    }

    public String getProdDefaultHoverLink() {
        return prodDefaultHoverLink;
    }

    public void setProdDefaultHoverLink(String prodDefaultHoverLink) {
        this.prodDefaultHoverLink = prodDefaultHoverLink;
    }

    public String getSupplier1ID() {
        return supplier1ID;
    }

    public void setSupplier1ID(String supplier1ID) {
        this.supplier1ID = supplier1ID;
    }

    public String getSupplier1ProdID() {
        return supplier1ProdID;
    }

    public void setSupplier1ProdID(String supplier1ProdID) {
        this.supplier1ProdID = supplier1ProdID;
    }

    public String getSupplier2ID() {
        return supplier2ID;
    }

    public void setSupplier2ID(String supplier2ID) {
        this.supplier2ID = supplier2ID;
    }

    public String getSupplier2ProdID() {
        return supplier2ProdID;
    }

    public void setSupplier2ProdID(String supplier2ProdID) {
        this.supplier2ProdID = supplier2ProdID;
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

    public Integer getGridPromotedPositionIndex() {
        return gridPromotedPositionIndex;
    }

    public void setGridPromotedPositionIndex(Integer gridPromotedPositionIndex) {
        this.gridPromotedPositionIndex = gridPromotedPositionIndex;
    }

    public Integer getGridDefaulPositiontIndex() {
        return gridDefaulPositiontIndex;
    }

    public void setGridDefaulPositiontIndex(Integer gridDefaulPositiontIndex) {
        this.gridDefaulPositiontIndex = gridDefaulPositiontIndex;
    }

    public String getProdPriorityNumber() {
        return prodPriorityNumber;
    }

    public void setProdPriorityNumber(String prodPriorityNumber) {
        this.prodPriorityNumber = prodPriorityNumber;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productNumber='" + productNumber + '\'' +
                ", departmentID='" + departmentID + '\'' +
                ", productSKU='" + productSKU + '\'' +
                ", productEAN='" + productEAN + '\'' +
                ", productShortName='" + productShortName + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", prodCategoryCode=" + prodCategoryCode +
                ", prodSubcategoryCode=" + prodSubcategoryCode +
                ", brandCode='" + brandCode + '\'' +
                ", modelCode='" + modelCode + '\'' +
                ", yearCode='" + yearCode + '\'' +
                ", styleCode='" + styleCode + '\'' +
                ", genderCode='" + genderCode + '\'' +
                ", packagingCode='" + packagingCode + '\'' +
                ", materialCode='" + materialCode + '\'' +
                ", colorCode='" + colorCode + '\'' +
                ", sizeCode='" + sizeCode + '\'' +
                ", flavorCode='" + flavorCode + '\'' +
                ", attribMask='" + attribMask + '\'' +
                ", attributeMapCode='" + attributeMapCode + '\'' +
                ", prodUOMCode='" + prodUOMCode + '\'' +
                ", prodUnitsInStockNumber='" + prodUnitsInStockNumber + '\'' +
                ", inventoryCostMethod='" + inventoryCostMethod + '\'' +
                ", prodUnitCostAmount='" + prodUnitCostAmount + '\'' +
                ", prodMSRPAmount=" + prodMSRPAmount +
                ", prodUnitPriceAmount=" + prodUnitPriceAmount +
                ", prodCurrencyType='" + prodCurrencyType + '\'' +
                ", prodDiscountType=" + prodDiscountType +
                ", prodDiscountCondition='" + prodDiscountCondition + '\'' +
                ", prodDiscountNumber=" + prodDiscountNumber +
                ", prodPriceCorrectionFactor=" + prodPriceCorrectionFactor +
                ", prodUnitsOnOrder=" + prodUnitsOnOrder +
                ", prodReplenishType='" + prodReplenishType + '\'' +
                ", prodUISThresholdNumber=" + prodUISThresholdNumber +
                ", pendReplenOrderNumber=" + pendReplenOrderNumber +
                ", prodRankingType=" + prodRankingType +
                ", prodStatus='" + prodStatus + '\'' +
                ", prodLocation1Text=" + prodLocation1Text +
                ", prodLocation2Text=" + prodLocation2Text +
                ", prodSpecifications='" + prodSpecifications + '\'' +
                ", prodNotes='" + prodNotes + '\'' +
                ", prodDefaultContentLink='" + prodDefaultContentLink + '\'' +
                ", prodDefaultHoverLink='" + prodDefaultHoverLink + '\'' +
                ", supplier1ID='" + supplier1ID + '\'' +
                ", supplier1ProdID='" + supplier1ProdID + '\'' +
                ", supplier2ID='" + supplier2ID + '\'' +
                ", supplier2ProdID='" + supplier2ProdID + '\'' +
                ", isCampaigning=" + isCampaigning +
                ", campaignID='" + campaignID + '\'' +
                ", gridPromotedPositionIndex=" + gridPromotedPositionIndex +
                ", gridDefaulPositiontIndex=" + gridDefaulPositiontIndex +
                ", prodPriorityNumber='" + prodPriorityNumber + '\'' +
                '}';
    }
}
