package ru.iteco.uml;

/**
 * ru.iteco.uml.MetalLeg.
 *
 * @author Ilya_Sukhachev
 */
public class MetalLeg implements Leg {

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
