package app.leafs;

import app.StyledComponent;

public class TextField extends StyledComponent {
    private String placeholder;
    private String value = "";

    public TextField(String placeholder, String style) {
        super(style);
        this.placeholder = placeholder;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public void render(StringBuilder html, int depth) {
        html.append("  ".repeat(depth))
                .append("<input type='text' value='").append(value)
                .append("' placeholder='").append(placeholder)
                .append("' style='").append(style).append("'/>\n");
    }
}
