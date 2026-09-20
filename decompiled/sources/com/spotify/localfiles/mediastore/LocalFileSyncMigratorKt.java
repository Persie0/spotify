package com.spotify.localfiles.mediastore;

import java.util.Locale;
import kotlin.Metadata;
import p204p.wl51;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m24212d2 = {"ONE_HOUR", "", "audioMimeType", "", "displayName", "src_main_java_com_spotify_localfiles_mediastore-mediastore"}, m24213k = 2, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class LocalFileSyncMigratorKt {
    private static final int ONE_HOUR = 3600000;

    /* JADX INFO: Access modifiers changed from: private */
    public static final String audioMimeType(String str) {
        String lowerCase = wl51.m88482f1('.', str, "").toLowerCase(Locale.ROOT);
        switch (lowerCase.hashCode()) {
            case 106458:
                return !lowerCase.equals("m4a") ? "audio/mpeg" : "audio/mp4";
            case 106473:
                return !lowerCase.equals("m4p") ? "audio/mpeg" : "audio/mp4";
            case 108272:
                lowerCase.equals("mp3");
                return "audio/mpeg";
            case 108273:
                return !lowerCase.equals("mp4") ? "audio/mpeg" : "audio/mp4";
            default:
                return "audio/mpeg";
        }
    }
}
