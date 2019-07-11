package com.example.newcameramanager;

import android.view.TextureView;

import com.example.newcameramanager.interfaces.VideoManager;

import java.util.concurrent.atomic.AtomicBoolean;

public class VideoHelper implements VideoManager {
    private AtomicBoolean isRunning = new AtomicBoolean(false);



    @Override
    public void configureManager() {

    }

    @Override
    public void startManager() {

    }

    @Override
    public void stopManager() {

    }

    @Override
    public boolean isRunning() {
        return isRunning.get();
    }

    @Override
    public void runState(TextureView textureView) {

    }
}
