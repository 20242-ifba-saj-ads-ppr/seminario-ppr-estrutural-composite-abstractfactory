package app.composites;

import app.StyledComponent;
import app.UIComponentContract;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseComposite extends StyledComponent
{
    protected List<UIComponentContract> children = new ArrayList<>();

    public BaseComposite(String style) {
        super(style);
    }

    @Override
    public boolean addComponent(UIComponentContract component) {
        component.setParent(this);
        return children.add(component);
    }

    @Override
    public boolean removeComponent(UIComponentContract component) {
        if (children.remove(component)) {
            component.setParent(null);
            return true;
        }
        return false;
    }

    @Override
    public List<UIComponentContract> getChildren() {
        return children;
    }

    @Override
    public void render(StringBuilder html, int depth) {
        html.append("  ".repeat(depth))
                .append(getOpeningTag())
                .append("\n");

        for (UIComponentContract component : children) {
            component.render(html, depth + 1);
        }

        html.append("  ".repeat(depth))
                .append(getClosingTag())
                .append("\n");
    }

    protected abstract String getOpeningTag();
    protected abstract String getClosingTag();
}
