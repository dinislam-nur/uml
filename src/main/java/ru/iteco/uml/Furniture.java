package ru.iteco.uml;

/**
 * IFurniture.
 *
 * @author Ilya_Sukhachev
 */
public interface Furniture {
    int getLength();

    void setLength(int length);

    int getWidth();

    void setWidth(int width);

    int getWeight();

    void setWeight(int weight);

    Iterable<Leg> getLegs();

    void setLegs(Iterable<Leg> legs);

    Factory getFactory();

    void setFactory(Factory factory);
}
