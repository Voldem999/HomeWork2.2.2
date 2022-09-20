public class Car extends Transport{
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

   @Override
   public void updateTyre() {
       for (int i = 0; i < getWheelsCount(); i++){
        System.out.println("Меняем покрышку на машине");
    }}
    public void checkEngine() {
        System.out.println("Проверяем двигатель на машине");
    }
    @Override
    public void service() {
        System.out.println("Обслуживаем " + getModelName());
        updateTyre();
        checkEngine();
    }

}