package devices;

public class Thermostat {
    private int currentTemp = 20;
    private int previousTemp;

    public void setTemperature(int temp) {
        previousTemp = currentTemp;
        currentTemp = temp;
        System.out.println("[Thermostat] Setting temperature to " + temp + "°C");
    }

    public void undoTemperature() {
        currentTemp = previousTemp;
        System.out.println("[Thermostat] Reverting to previous temperature: " + currentTemp + "°C");
    }
}
