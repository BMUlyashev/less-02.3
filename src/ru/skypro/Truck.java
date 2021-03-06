package ru.skypro;

public class Truck extends Transport {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
        checkTrailer();
    }
    private void checkEngine() {

        System.out.println("Проверяем двигатель");
    }

    private void checkTrailer() {

        System.out.println("Проверяем прицеп");
    }

    private void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}
