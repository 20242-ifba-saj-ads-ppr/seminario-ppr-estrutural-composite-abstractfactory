package app.composites;

public class Card extends BaseComposite {
    private String title;

    public Card(String title, String style) {
        super(style);
        this.title = title;
    }

    @Override
    protected String getOpeningTag() {
        return "<div class='card' style='" + style + "'>\n  <h2>" + title + "</h2>";
    }

    @Override
    protected String getClosingTag() {
        return "</div>";
    }
}
