import commands.*;
import devices.*;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        Thermostat thermostat = new Thermostat();

        Command lightOn = new TurnOnLightCommand(light);
        Command setTemp = new SetThermostatCommand(thermostat, 22);

        SmartHomeRemoteControl remote = new SmartHomeRemoteControl();

        remote.setCommand("light", lightOn);
        remote.setCommand("thermostat", setTemp);

        remote.pressButton("light");
        remote.pressButton("thermostat");

        System.out.println("Undo last command:");
        remote.undoButton();

        System.out.println("Undo another command:");
        remote.undoButton();
    }
}
