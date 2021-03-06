package ru.skypro;

public class Car extends Transport {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
    }

    private void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    private void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}
