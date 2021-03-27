package payroll;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ProdSubcategory {
    private @Id
    @GeneratedValue
    Long id;
    private Integer prodSubcategoryCode;
    private Integer prodCategoryCode;
    private String prodSubcategoryName;
    private String prodSubcategoryText;
    private Boolean prodSubcategoryStatus;

    public ProdSubcategory() {
    }

    public ProdSubcategory(Integer prodSubcategoryCode, Integer prodCategoryCode, String prodSubcategoryName, String prodSubcategoryText, Boolean prodSubcategoryStatus) {
        this.prodSubcategoryCode = prodSubcategoryCode;
        this.prodCategoryCode = prodCategoryCode;
        this.prodSubcategoryName = prodSubcategoryName;
        this.prodSubcategoryText = prodSubcategoryText;
        this.prodSubcategoryStatus = prodSubcategoryStatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getProdSubcategoryCode() {
        return prodSubcategoryCode;
    }

    public void setProdSubcategoryCode(Integer prodSubcategoryCode) {
        this.prodSubcategoryCode = prodSubcategoryCode;
    }

    public Integer getProdCategoryCode() {
        return prodCategoryCode;
    }

    public void setProdCategoryCode(Integer prodCategoryCode) {
        this.prodCategoryCode = prodCategoryCode;
    }

    public String getProdSubcategoryName() {
        return prodSubcategoryName;
    }

    public void setProdSubcategoryName(String prodSubcategoryName) {
        this.prodSubcategoryName = prodSubcategoryName;
    }

    public String getProdSubcategoryText() {
        return prodSubcategoryText;
    }

    public void setProdSubcategoryText(String prodSubcategoryText) {
        this.prodSubcategoryText = prodSubcategoryText;
    }

    public Boolean getProdSubcategoryStatus() {
        return prodSubcategoryStatus;
    }

    public void setProdSubcategoryStatus(Boolean prodSubcategoryStatus) {
        this.prodSubcategoryStatus = prodSubcategoryStatus;
    }
}
