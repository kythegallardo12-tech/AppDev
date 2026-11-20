package com.example.myapplication;

import android.view.View;

import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

/**
 * Keeps content from being hidden behind the status bar / title bar,
 * navigation bar, and keyboard. (Apps targeting Android 15+ are drawn edge-to-edge.)
 */
public final class InsetsHelper {

    private InsetsHelper() {
    }

    public static void applySystemBarPadding(View root) {
        ViewCompat.setOnApplyWindowInsetsListener(root, (v, windowInsets) -> {
            Insets bars = windowInsets.getInsets(
                    WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.ime());
            // bars.top already includes the title bar (action bar) height.
            v.setPadding(bars.left, bars.top, bars.right, bars.bottom);
            return WindowInsetsCompat.CONSUMED;
        });
    }
}
