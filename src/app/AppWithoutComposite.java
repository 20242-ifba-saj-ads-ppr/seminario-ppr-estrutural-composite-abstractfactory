package app;

import java.util.ArrayList;
import java.util.List;

public class AppWithoutComposite {
    public static void main(String[] args) {
        var buttons = new ArrayList<Button>();
        var images = new ArrayList<Image>();

        var button1 = new Button("Send");
        var button2 = new Button("Cancel");
        var image = new Image("logo.png");

        buttons.add(button1);
        buttons.add(button2);
        images.add(image);

        Form form = new Form();
        System.out.println(form.render(buttons, images));
    }
}

class Button {
    private final String text;

    public Button(String text) {
        this.text = text;
    }

    public String renderBtn() {
        return "<button>" + text + "</button>";
    }
}

class Image {
    private final String src;

    public Image(String src) {
        this.src = src;
    }

    public String renderImg() {
        return "<img src='" + src + "' />";
    }
}

class Form {
    public String render(List<Button> buttons, List<Image> images) {
        StringBuilder html = new StringBuilder("<form>");
        for (Button button : buttons) {
            html.append(button.renderBtn());
        }
        for (Image image : images) {
            html.append(image.renderImg());
        }
        html.append("</form>");
        return html.toString();
    }
}
