package ru.iteco.uml;

/**
 * ru.iteco.uml.WoodenLeg.
 *
 * @author Ilya_Sukhachev
 */
public class WoodenLeg implements Leg {

    protected int height;

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public void setHeight(int height) {
        this.height = height;
    }
}
