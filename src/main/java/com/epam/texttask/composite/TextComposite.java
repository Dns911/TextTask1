package com.epam.texttask.composite;

import java.util.ArrayList;
import java.util.List;

public class TextComposite implements TextComponent {
    private GroupType type;
    private List<TextComponent> textComponents = new ArrayList<>();

    public TextComposite() {
    }

    public boolean add(TextComponent textComponent) {
        return textComponents.add(textComponent);
    }

    public boolean remove(Object o) {
        return textComponents.remove(o);
    }

    public void setType(GroupType type) {
        this.type = type;
    }

    @Override
    public int count() {
        int counter = 0;
        for (TextComponent textComponent :
                textComponents) {
            counter += textComponent.count();
        }
        return counter;
    }
}
