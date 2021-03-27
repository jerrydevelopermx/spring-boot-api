package payroll;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ProdCategory {
    private @Id
    @GeneratedValue
    Long id;
    private Integer prodCategoryCode;
    private String prodCategoryName;
    private String prodCategoryText;
    private Boolean prodCategoryStatus;

    public ProdCategory() {
    }

    public ProdCategory(Integer prodCategoryCode, String prodCategoryName, String prodCategoryText, Boolean prodCategoryStatus) {
        this.prodCategoryCode = prodCategoryCode;
        this.prodCategoryName = prodCategoryName;
        this.prodCategoryText = prodCategoryText;
        this.prodCategoryStatus = prodCategoryStatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getProdCategoryCode() {
        return prodCategoryCode;
    }

    public void setProdCategoryCode(Integer prodCategoryCode) {
        this.prodCategoryCode = prodCategoryCode;
    }

    public String getProdCategoryName() {
        return prodCategoryName;
    }

    public void setProdCategoryName(String prodCategoryName) {
        this.prodCategoryName = prodCategoryName;
    }

    public String getProdCategoryText() {
        return prodCategoryText;
    }

    public void setProdCategoryText(String prodCategoryText) {
        this.prodCategoryText = prodCategoryText;
    }

    public Boolean getProdCategoryStatus() {
        return prodCategoryStatus;
    }

    public void setProdCategoryStatus(Boolean prodCategoryStatus) {
        this.prodCategoryStatus = prodCategoryStatus;
    }
}
