public class Car extends Transport{
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку на машине");
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель на машине");
    }
    @Override
    public void service() {
        updateTyre();
        checkEngine();
    }

}