package com.spotify.playbacknative;

import android.content.Context;
import android.os.Build;
import kotlin.Metadata;
import p204p.bm51;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m24211d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\tJ\u0016\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0018\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u0011\u001a\u00020\tH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m24212d2 = {"Lcom/spotify/playbacknative/FloatPcmSupportDeviceSet;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "isFloatPcmSupported", "", "manufacturer", "", "version", "", "isFloatPcmSupportedForOboe", "isSamsung", "isSamsungFloatPcmSupported", "isSamsungExperienceSystemFeatureAvailable", "src_main_java_com_spotify_playbacknative_playbacknative-playbacknative"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class FloatPcmSupportDeviceSet {
    private final Context context;

    public FloatPcmSupportDeviceSet(Context context) {
        this.context = context;
    }

    private final boolean isSamsung(String manufacturer) {
        return bm51.m29797h0(manufacturer, "Samsung", true);
    }

    private final boolean isSamsungExperienceSystemFeatureAvailable() {
        return this.context.getPackageManager().hasSystemFeature("com.samsung.feature.samsung_experience_mobile") || this.context.getPackageManager().hasSystemFeature("com.samsung.feature.SAMSUNG_EXPERIENCE");
    }

    private final boolean isSamsungFloatPcmSupported(String manufacturer, int version) {
        return isSamsung(manufacturer) && version >= 31 && isSamsungExperienceSystemFeatureAvailable();
    }

    public final Context getContext() {
        return this.context;
    }

    public final boolean isFloatPcmSupported() {
        return isFloatPcmSupported(Build.MANUFACTURER, Build.VERSION.SDK_INT);
    }

    public final boolean isFloatPcmSupportedForOboe() {
        return isFloatPcmSupportedForOboe(Build.MANUFACTURER, Build.VERSION.SDK_INT);
    }

    public final boolean isFloatPcmSupported(String manufacturer, int version) {
        return isSamsungFloatPcmSupported(manufacturer, version);
    }

    public final boolean isFloatPcmSupportedForOboe(String manufacturer, int version) {
        if (isSamsung(manufacturer)) {
            return isSamsungFloatPcmSupported(manufacturer, version);
        }
        return true;
    }
}
