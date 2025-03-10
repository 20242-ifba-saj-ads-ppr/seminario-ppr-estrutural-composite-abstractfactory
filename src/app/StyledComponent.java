package app;

import java.util.List;
import java.util.Optional;

public abstract class StyledComponent implements UIComponentContract {
    protected UIComponentContract parent;
    protected String style;

    public StyledComponent(String style) {
        this.style = style;
    }

    @Override
    public Optional<UIComponentContract> getParent() {
        return Optional.ofNullable(parent);
    }

    @Override
    public void setParent(UIComponentContract parent) {
        this.parent = parent;
    }

    @Override
    public boolean addComponent(UIComponentContract component) {
        return false;
    }

    @Override
    public boolean removeComponent(UIComponentContract component) {
        return false;
    }

    @Override
    public List<UIComponentContract> getChildren() {
        return List.of();
    }

}
