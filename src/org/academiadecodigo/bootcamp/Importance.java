package org.academiadecodigo.bootcamp;

public enum Importance {
    LOW(1),
    MEDIUM(2),
    HIGH(3);

    private int value;

    private Importance(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
