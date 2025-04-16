package commands;

import devices.DoorLock;

public class LockDoorsCommand implements Command {
    private DoorLock lock;

    public LockDoorsCommand(DoorLock lock) {
        this.lock = lock;
    }

    @Override
    public void execute() {
        lock.lock();
    }

    @Override
    public void undo() {
        lock.unlock();
    }
}

