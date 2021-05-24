package ru.iteco.uml;

/**
 * ru.iteco.uml.Table.
 *
 * @author Ilya_Sukhachev
 */
public class Table implements Furniture {

    private int length;
    private int width;
    private int weight;
    private Iterable<Leg> legs;
    private Factory factory;

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public Iterable<Leg> getLegs() {
        return legs;
    }

    @Override
    public void setLegs(Iterable<Leg> legs) {
        this.legs = legs;
    }

    @Override
    public Factory getFactory() {
        return factory;
    }

    @Override
    public void setFactory(Factory factory) {
        this.factory = factory;
    }
}
