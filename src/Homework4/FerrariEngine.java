package Homework4;

public class FerrariEngine extends Engine {
    double efficiency = 0.25;
    public FerrariEngine(double engineVolume, int cylinderAmount, double engineWeight) {
        super(engineVolume, cylinderAmount, engineWeight);
    }
    public FerrariEngine() {
    }

    @Override
    double efficiency() {
        return efficiency;
    }

    @Override
    double throttleEnergy() {
        return engineVolume * cylinderAmount * 100;
    }

    @Override
    double breakEnergy() {
        return engineWeight * 2 ;
    }
}
