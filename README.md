# Behavioral Design Patterns in Java

This repository demonstrates two key **Behavioral Design Patterns** implemented in Java:

1. **Chain of Responsibility** — "Tech Support Request Handler"
2. **Command Pattern** — "Smart Home Remote Control"

---

## Project 1: Tech Support Request Handler (Chain of Responsibility)

### Description
Simulates a tech support system where issues are passed through different levels of support — FAQ Bot, Junior Support, and Senior Engineer — until resolved or escalated.

### Design Pattern
- **Chain of Responsibility** — allows request processing by a chain of handlers.

### How It Works
Each handler can:
- Handle the issue
- Or forward it to the next handler in the chain


###  Run
![image](https://github.com/user-attachments/assets/f1af9acf-525e-413b-8e85-69979603fce2)

---

## Project 2: Smart Home Remote Control (Command Pattern)

### Description
The Command pattern encapsulates requests as objects, allowing for decoupling between the invoker and the receiver, as well as support for undo, redo, and macro actions.

This project models a smart home remote control system:

Lights

Thermostat

Door locks

Each button on the remote represents a command that can be executed and undone.

### Structure
**Interfaces**

Command — interface with execute() and undo() methods

**Invoker**

SmartHomeRemoteControl — stores command slots and handles execution

**Devices (Receivers)**

Light, Thermostat, DoorLock

**Concrete Commands**

TurnOnLightCommand

TurnOffLightCommand

SetThermostatCommand

LockDoorsCommand

### Bonus: Macro Commands
MacroCommand — accepts a list of commands and executes them as one

Example: Goodnight Mode turns off the lights, lowers the temperature, and locks the doors

### Design Pattern
- **Command Pattern** — decouples the object that invokes an operation from the one that knows how to perform it.

### Run
![image](https://github.com/user-attachments/assets/eef1f733-f88b-42d1-a080-39e3a49fa0ef)




