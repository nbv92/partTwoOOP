package transport;

public abstract class TrailerAuto extends EngineAuto {

    public TrailerAuto(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        super.check();
    }

    @Override
    public void checkEngine() {
        super.checkEngine();
        checkTrailer();
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
