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
A smart home simulation where a remote control triggers commands for smart devices like lights and thermostats.

### Design Pattern
- **Command Pattern** — decouples the object that invokes an operation from the one that knows how to perform it.

### Structure

### Features
- Execute and undo commands
- Assign commands dynamically to slots

### Run
![image](https://github.com/user-attachments/assets/f79b22de-f690-46db-a042-090560bced31)



