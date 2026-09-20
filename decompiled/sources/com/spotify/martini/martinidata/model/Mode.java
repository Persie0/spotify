package com.spotify.martini.martinidata.model;

import androidx.annotation.Keep;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m24212d2 = {"Lcom/spotify/martini/martinidata/model/Mode;", "", "MARTINI", "TASTE_PROFILE", "TOP_STORIES", "PROMPTABLE_SECTION", "SONG_DNA_CREDITS", "SONG_DNA_SAMPLES", "SONG_DNA_OTHER", "src_main_java_com_spotify_martini_martinidata-martinidata"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class Mode {

    @Keep
    public static final Mode MARTINI;

    @Keep
    public static final Mode PROMPTABLE_SECTION;

    @Keep
    public static final Mode SONG_DNA_CREDITS;

    @Keep
    public static final Mode SONG_DNA_OTHER;

    @Keep
    public static final Mode SONG_DNA_SAMPLES;

    @Keep
    public static final Mode TASTE_PROFILE;

    @Keep
    public static final Mode TOP_STORIES;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ Mode[] f5433a;

    static {
        Mode mode = new Mode("MARTINI", 0);
        MARTINI = mode;
        Mode mode2 = new Mode("TASTE_PROFILE", 1);
        TASTE_PROFILE = mode2;
        Mode mode3 = new Mode("TOP_STORIES", 2);
        TOP_STORIES = mode3;
        Mode mode4 = new Mode("PROMPTABLE_SECTION", 3);
        PROMPTABLE_SECTION = mode4;
        Mode mode5 = new Mode("SONG_DNA_CREDITS", 4);
        SONG_DNA_CREDITS = mode5;
        Mode mode6 = new Mode("SONG_DNA_SAMPLES", 5);
        SONG_DNA_SAMPLES = mode6;
        Mode mode7 = new Mode("SONG_DNA_OTHER", 6);
        SONG_DNA_OTHER = mode7;
        f5433a = new Mode[]{mode, mode2, mode3, mode4, mode5, mode6, mode7};
    }

    public static Mode valueOf(String str) {
        return (Mode) Enum.valueOf(Mode.class, str);
    }

    public static Mode[] values() {
        return (Mode[]) f5433a.clone();
    }
}
