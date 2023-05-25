package app.revanced.all.screenrecord.removerestriction;

import android.media.AudioAttributes;

public class RemoveScreenrecordRestrictionPatch {
    // Member of AudioAttributes.Builder
    public static AudioAttributes.Builder setAllowedCapturePolicy(AudioAttributes.Builder builder, int capturePolicy) {
        // No operation
        return builder;
    }

    // Member of AudioManager static class
    public static void setAllowedCapturePolicy(int capturePolicy) {
        // No operation
    }
}
