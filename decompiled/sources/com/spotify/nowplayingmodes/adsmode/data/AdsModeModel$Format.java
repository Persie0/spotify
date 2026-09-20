package com.spotify.nowplayingmodes.adsmode.data;

import kotlin.Metadata;
import p204p.klh;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m24212d2 = {"com/spotify/nowplayingmodes/adsmode/data/AdsModeModel$Format", "", "Lcom/spotify/nowplayingmodes/adsmode/data/AdsModeModel$Format;", "VIDEO_AD_VERTICAL", "VIDEO_AD_HORIZONTAL", "AUDIO_AD", "src_main_java_com_spotify_nowplayingmodes_adsmode-adsmode"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public enum AdsModeModel$Format {
    VIDEO_AD_VERTICAL("video"),
    VIDEO_AD_HORIZONTAL("video"),
    AUDIO_AD("audio");


    /* JADX INFO: renamed from: a */
    public final String f6349a;

    AdsModeModel$Format(String str) {
        this.f6349a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m16006a(AdsModeModel$Product adsModeModel$Product) {
        return klh.m56834f(this.f6349a, "_", adsModeModel$Product.f6351a);
    }
}
