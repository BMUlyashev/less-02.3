package ru.skypro;

public class ServiceStation {

    public void check(RepairWorks transport) {
        if (transport != null) {
            transport.check();
        }
    }
}
