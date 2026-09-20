package com.spotify.nowplayingmini.nowplayingmini;

import androidx.annotation.Keep;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m24212d2 = {"Lcom/spotify/nowplayingmini/nowplayingmini/NowPlayingMiniMode;", "", "Empty", "Default", "Podcast", "Greenroom", "Endless", "ReinventFree", "Ad", "src_main_java_com_spotify_nowplayingmini_nowplayingmini-nowplayingmini"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class NowPlayingMiniMode {

    /* JADX INFO: renamed from: Ad */
    @Keep
    public static final NowPlayingMiniMode f6333Ad;

    @Keep
    public static final NowPlayingMiniMode Default;

    @Keep
    public static final NowPlayingMiniMode Empty;

    @Keep
    public static final NowPlayingMiniMode Endless;

    @Keep
    public static final NowPlayingMiniMode Greenroom;

    @Keep
    public static final NowPlayingMiniMode Podcast;

    @Keep
    public static final NowPlayingMiniMode ReinventFree;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ NowPlayingMiniMode[] f6334a;

    static {
        NowPlayingMiniMode nowPlayingMiniMode = new NowPlayingMiniMode("Empty", 0);
        Empty = nowPlayingMiniMode;
        NowPlayingMiniMode nowPlayingMiniMode2 = new NowPlayingMiniMode("Default", 1);
        Default = nowPlayingMiniMode2;
        NowPlayingMiniMode nowPlayingMiniMode3 = new NowPlayingMiniMode("Podcast", 2);
        Podcast = nowPlayingMiniMode3;
        NowPlayingMiniMode nowPlayingMiniMode4 = new NowPlayingMiniMode("Greenroom", 3);
        Greenroom = nowPlayingMiniMode4;
        NowPlayingMiniMode nowPlayingMiniMode5 = new NowPlayingMiniMode("Endless", 4);
        Endless = nowPlayingMiniMode5;
        NowPlayingMiniMode nowPlayingMiniMode6 = new NowPlayingMiniMode("ReinventFree", 5);
        ReinventFree = nowPlayingMiniMode6;
        NowPlayingMiniMode nowPlayingMiniMode7 = new NowPlayingMiniMode("Ad", 6);
        f6333Ad = nowPlayingMiniMode7;
        f6334a = new NowPlayingMiniMode[]{nowPlayingMiniMode, nowPlayingMiniMode2, nowPlayingMiniMode3, nowPlayingMiniMode4, nowPlayingMiniMode5, nowPlayingMiniMode6, nowPlayingMiniMode7};
    }

    public static NowPlayingMiniMode valueOf(String str) {
        return (NowPlayingMiniMode) Enum.valueOf(NowPlayingMiniMode.class, str);
    }

    public static NowPlayingMiniMode[] values() {
        return (NowPlayingMiniMode[]) f6334a.clone();
    }
}
