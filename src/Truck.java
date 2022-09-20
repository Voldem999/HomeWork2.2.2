public class Truck extends Transport {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

   @Override
   public void updateTyre() {
       for (int i = 0; i < getWheelsCount(); i++) {
           System.out.println("Меняем покрышку на грузовике");
       }}
    public void checkEngine() {
        System.out.println("Проверяем двигатель на грузовике");
    }
    public void checkTrailer() {
        System.out.println("Проверяем прицеп на грузовике");
    }
    @Override
    public void service() {
        System.out.println("Обслуживаем " + getModelName());
        updateTyre();
        checkEngine();
        checkTrailer();
    }
}
