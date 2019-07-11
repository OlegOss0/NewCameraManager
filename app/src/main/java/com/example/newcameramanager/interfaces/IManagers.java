package com.example.newcameramanager.interfaces;

public interface IManagers {

    void configureManager();

    void startManager();

    void stopManager();

    default boolean isRunning() {
        return false;
    }
}
