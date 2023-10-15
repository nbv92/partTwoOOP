package transport;

import service.Serviceable;

public abstract class Auto implements Serviceable {
    private final String modelName;
    private final int wheelsCount;

    protected Auto(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public void updateTyre() {
            System.out.println("Меняем покрышку");
    }
    @Override
    public void check() {
        for (int i= 0; i < wheelsCount; i++) {
            updateTyre();
        }
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }
}
