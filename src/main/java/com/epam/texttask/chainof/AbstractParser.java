package com.epam.texttask.chainof;

import com.epam.texttask.composite.TextComposite;

public abstract class AbstractParser {
    protected AbstractParser successor;

    public AbstractParser getSuccessor() {
        return successor;
    }

    public void setSuccessor(AbstractParser successor) {
        this.successor = successor;
    }
    public abstract TextComposite parse(String str);
}
