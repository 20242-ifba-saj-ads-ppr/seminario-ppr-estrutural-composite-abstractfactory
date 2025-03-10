package app.composites;

public class Panel extends BaseComposite {
    public Panel(String style) {
        super(style);
    }

    @Override
    protected String getOpeningTag() {
        return "<div class='panel' style='" + style + "'>";
    }

    @Override
    protected String getClosingTag() {
        return "</div>";
    }
}
