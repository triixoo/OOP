package Homework4;

public class RenaultEngine extends Engine {
    double extraTurboEnergy;
    double efficiency = 0.27;

    public RenaultEngine(double engineVolume, int cylinderAmount, double engineWeight, double extraTurboEnergy) {
        super(engineVolume, cylinderAmount, engineWeight);
        this.extraTurboEnergy = extraTurboEnergy;
    }
    public RenaultEngine(){
    }

    @Override
    double efficiency() {
        return efficiency;
    }

    @Override
    double throttleEnergy() {
        return engineVolume * cylinderAmount * 110 + extraTurboEnergy;
    }

    @Override
    double breakEnergy() {
        return engineWeight * 2.1;
    }
}
class Vyvod {
    public static void main(String[] args) {
        Engine[] engines = new Engine[10];
        engines[0] = new FerrariEngine(4.5, 12, 150);
        engines[1] = new FerrariEngine(5.2, 12, 230);
        engines[2] = new FerrariEngine(7.0, 12, 230);
        engines[3] = new FerrariEngine(6.3, 12, 400);
        engines[4] = new FerrariEngine(4.0, 12, 380);
        engines[5] = new RenaultEngine(2.0, 4, 120, 50);
        engines[6] = new RenaultEngine(2.5, 4, 243, 60);
        engines[7] = new RenaultEngine(3.0, 6, 199, 70);
        engines[8] = new RenaultEngine(2.2, 4, 213, 55);
        engines[9] = new RenaultEngine(2.8, 6, 220, 65);
        for (Engine engine : engines) {
            if (engine instanceof FerrariEngine) {
                System.out.println("Ferrari Max Speed: " + engine.getMaxSpeed());
            } else if (engine instanceof RenaultEngine) {
                System.out.println("Renault Max Speed: " + engine.getMaxSpeed());
            }
        }
    }
}