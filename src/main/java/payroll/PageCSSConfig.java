package payroll;

public class PageCSSConfig {
    private String background;
    private String backgroundColor;
    private String fontFamily;
    private String color;

    public PageCSSConfig() {
    }

    public PageCSSConfig(String background, String backgroundColor, String fontFamily, String color) {
        this.background = background;
        this.backgroundColor = backgroundColor;
        this.fontFamily = fontFamily;
        this.color = color;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
