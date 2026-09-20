package androidx.media3.session.legacy;

import android.media.VolumeProvider;
import android.os.Build;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes3.dex */
public abstract class VolumeProviderCompat {
    public static final int VOLUME_CONTROL_ABSOLUTE = 2;
    public static final int VOLUME_CONTROL_FIXED = 0;
    public static final int VOLUME_CONTROL_RELATIVE = 1;
    private Callback callback;
    private final String controlId;
    private final int controlType;
    private int currentVolume;
    private final int maxVolume;
    private VolumeProvider volumeProviderFwk;

    public static abstract class Callback {
        public abstract void onVolumeChanged(VolumeProviderCompat volumeProviderCompat);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ControlType {
    }

    public VolumeProviderCompat(int i, int i2, int i3) {
        this(i, i2, i3, null);
    }

    public final int getMaxVolume() {
        return this.maxVolume;
    }

    public Object getVolumeProvider() {
        VolumeProviderCompat volumeProviderCompat;
        if (this.volumeProviderFwk != null) {
            volumeProviderCompat = this;
        } else if (Build.VERSION.SDK_INT >= 30) {
            volumeProviderCompat = this;
            volumeProviderCompat.volumeProviderFwk = new VolumeProvider(this.controlType, this.maxVolume, this.currentVolume, this.controlId) { // from class: androidx.media3.session.legacy.VolumeProviderCompat.1
                @Override // android.media.VolumeProvider
                public void onAdjustVolume(int i) {
                    VolumeProviderCompat.this.onAdjustVolume(i);
                }

                @Override // android.media.VolumeProvider
                public void onSetVolumeTo(int i) {
                    VolumeProviderCompat.this.onSetVolumeTo(i);
                }
            };
        } else {
            volumeProviderCompat = this;
            volumeProviderCompat.volumeProviderFwk = new VolumeProvider(volumeProviderCompat.controlType, volumeProviderCompat.maxVolume, volumeProviderCompat.currentVolume) { // from class: androidx.media3.session.legacy.VolumeProviderCompat.2
                @Override // android.media.VolumeProvider
                public void onAdjustVolume(int i) {
                    VolumeProviderCompat.this.onAdjustVolume(i);
                }

                @Override // android.media.VolumeProvider
                public void onSetVolumeTo(int i) {
                    VolumeProviderCompat.this.onSetVolumeTo(i);
                }
            };
        }
        return volumeProviderCompat.volumeProviderFwk;
    }

    public void onAdjustVolume(int i) {
    }

    public void onSetVolumeTo(int i) {
    }

    public void setCallback(Callback callback) {
        this.callback = callback;
    }

    public final void setCurrentVolume(int i) {
        this.currentVolume = i;
        ((VolumeProvider) getVolumeProvider()).setCurrentVolume(i);
        Callback callback = this.callback;
        if (callback != null) {
            callback.onVolumeChanged(this);
        }
    }

    public VolumeProviderCompat(int i, int i2, int i3, String str) {
        this.controlType = i;
        this.maxVolume = i2;
        this.currentVolume = i3;
        this.controlId = str;
    }
}
