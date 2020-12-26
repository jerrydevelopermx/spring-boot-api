package payroll;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class SiteContent {
    private @Id
    @GeneratedValue
    Long id;
    private String sectionId;
    private String title;
    private Integer pageId;
    @Column(columnDefinition="TEXT")
    private String content;

    public SiteContent() {
    }

    public SiteContent(String sectionId, String title, Integer pageId, String content) {
        this.sectionId = sectionId;
        this.title = title;
        this.pageId = pageId;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPageId() {
        return pageId;
    }

    public void setPageId(Integer pageId) {
        this.pageId = pageId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "SiteContent{" +
                "id=" + id +
                ", sectionId='" + sectionId + '\'' +
                ", title='" + title + '\'' +
                ", pageId=" + pageId +
                ", content='" + content + '\'' +
                '}';
    }
}
