package com.spotify.core.core;

import java.util.Locale;
import kotlin.Metadata;
import p204p.lzv;
import p204p.nzv;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010\u0016\u001a\u00020\u0017H\u0096\u0080\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0018"}, m24212d2 = {"Lcom/spotify/core/core/DeviceType;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "COMPUTER", "TABLET", "SMARTPHONE", "SPEAKER", "TV", "AVR", "STB", "AUDIODONGLE", "GAMECONSOLE", "CASTVIDEO", "CASTAUDIO", "AUTOMOBILE", "SMARTWATCH", "CHROMEBOOK", "toString", "", "src_main_java_com_spotify_core_core-core"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public enum DeviceType {
    COMPUTER(1),
    TABLET(2),
    SMARTPHONE(3),
    SPEAKER(4),
    TV(5),
    AVR(6),
    STB(7),
    AUDIODONGLE(8),
    GAMECONSOLE(9),
    CASTVIDEO(10),
    CASTAUDIO(11),
    AUTOMOBILE(12),
    SMARTWATCH(13),
    CHROMEBOOK(14);

    private static final /* synthetic */ lzv $ENTRIES = new nzv(values());
    private final int value;

    DeviceType(int i) {
        this.value = i;
    }

    public static lzv getEntries() {
        return $ENTRIES;
    }

    public final int getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    public String toString() {
        return name().toLowerCase(Locale.US);
    }
}
