package ru.iteco.uml;

import java.util.UUID;

/**
 * ru.iteco.uml.Factory.
 *
 * @author Ilya_Sukhachev
 */
public class Factory {

    private UUID uuid;
    private String name;

    public UUID getUuid() {
        return uuid;
    }

    protected void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
