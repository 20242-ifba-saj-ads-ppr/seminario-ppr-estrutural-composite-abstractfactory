package app.leafs;

import app.StyledComponent;

public class Image extends StyledComponent {
    private String src;
    private String alt;

    public Image(String src, String alt, String style) {
        super(style);
        this.src = src;
        this.alt = alt;
    }

    @Override
    public void render(StringBuilder html, int depth) {
        html.append("  ".repeat(depth))
                .append("<img src='").append(src)
                .append("' alt='").append(alt)
                .append("' style='").append(style).append("'/>\n");
    }
}
