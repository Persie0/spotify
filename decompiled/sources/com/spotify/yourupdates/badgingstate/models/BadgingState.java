package com.spotify.yourupdates.badgingstate.models;

import androidx.annotation.Keep;
import kotlin.Metadata;
import p204p.lzv;
import p204p.nzv;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m24212d2 = {"Lcom/spotify/yourupdates/badgingstate/models/BadgingState;", "", "<init>", "(Ljava/lang/String;I)V", "SHOW_BADGE", "HIDE_BADGE", "src_main_java_com_spotify_yourupdates_badgingstate-badgingstate"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public enum BadgingState {
    SHOW_BADGE,
    HIDE_BADGE;

    private static final /* synthetic */ lzv $ENTRIES = new nzv(values());

    public static lzv getEntries() {
        return $ENTRIES;
    }
}
