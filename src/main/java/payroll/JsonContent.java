package payroll;

import javax.persistence.Column;

public class JsonContent {
    @Column(columnDefinition="TEXT")
    String content;

    public JsonContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
