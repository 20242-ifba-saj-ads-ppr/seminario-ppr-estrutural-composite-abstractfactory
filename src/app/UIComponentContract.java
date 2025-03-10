package app;

import java.util.List;
import java.util.Optional;

public interface UIComponentContract {
    void render(StringBuilder html, int depth);
    boolean addComponent(UIComponentContract component);
    boolean removeComponent(UIComponentContract component);
    List<UIComponentContract> getChildren();
    Optional<UIComponentContract> getParent();
    void setParent(UIComponentContract parent);
}
