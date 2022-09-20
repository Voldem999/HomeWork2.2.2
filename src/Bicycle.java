public class Bicycle extends Transport {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        for (int i = 0; i < getWheelsCount(); i++) {
        System.out.println("Меняем покрышку велосипеда");
    }}

    @Override
    public void service() {
        System.out.println("Обслуживаем " + getModelName());
        updateTyre();

    }

}