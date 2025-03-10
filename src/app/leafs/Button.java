package app.leafs;
import app.StyledComponent;

public class Button extends StyledComponent {
    private String label;

    private String onClickFunction;

    public Button(String label, String style, String onClickFunction) {
        super(style);
        this.label = label;
        this.onClickFunction = onClickFunction;
    }

    @Override
    public void render(StringBuilder html, int depth) {
        html.append("  ".repeat(depth))
                .append("<button style='").append(style)
                .append("' onclick=\"").append(onClickFunction)
                .append("\">")
                .append(label)
                .append("</button>\n");
    }

    public void click(){
        System.out.println("Botão clicado!");
    }
}
