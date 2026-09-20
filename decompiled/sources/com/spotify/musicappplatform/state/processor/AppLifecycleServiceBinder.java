package com.spotify.musicappplatform.state.processor;

import androidx.annotation.Keep;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002¨\u0006\u0003"}, m24212d2 = {"Lcom/spotify/musicappplatform/state/processor/AppLifecycleServiceBinder;", "", "TEST", "src_main_java_com_spotify_musicappplatform_state_processor-processor"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class AppLifecycleServiceBinder {

    @Keep
    public static final AppLifecycleServiceBinder TEST;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AppLifecycleServiceBinder[] f6094a;

    static {
        AppLifecycleServiceBinder appLifecycleServiceBinder = new AppLifecycleServiceBinder("TEST", 0);
        TEST = appLifecycleServiceBinder;
        f6094a = new AppLifecycleServiceBinder[]{appLifecycleServiceBinder};
    }

    public static AppLifecycleServiceBinder valueOf(String str) {
        return (AppLifecycleServiceBinder) Enum.valueOf(AppLifecycleServiceBinder.class, str);
    }

    public static AppLifecycleServiceBinder[] values() {
        return (AppLifecycleServiceBinder[]) f6094a.clone();
    }
}
