package com.example.newcameramanager.interfaces;

import android.view.TextureView;

public interface VideoManager extends IManagers {
    enum WorkState{IDLE, CAPTURE_TO_PHOTO, TRANSLATION_VIDEO, SCREEN_SHARING, STATIC_IMAGE_TRANSLATE}

    void runState(TextureView textureView);

}
