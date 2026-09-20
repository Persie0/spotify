package com.spotify.eventsender.api;

import com.spotify.voiceassistants.playermodels.SearchEndpointResponseKt;
import kotlin.Metadata;
import p204p.lzv;
import p204p.nzv;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m24212d2 = {"Lcom/spotify/eventsender/api/PersistenceResult;", "", "<init>", "(Ljava/lang/String;I)V", SearchEndpointResponseKt.RESULT_SUCCESS, "FAILED_DISK_FULL", "FAILED_CORRUPTION", "FAILED_PERMISSION_ERROR", "FAILED_OTHER_ERROR", "src_main_java_com_spotify_coreeventsender_eventsender-eventsender"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public enum PersistenceResult {
    SUCCESS,
    FAILED_DISK_FULL,
    FAILED_CORRUPTION,
    FAILED_PERMISSION_ERROR,
    FAILED_OTHER_ERROR;

    private static final /* synthetic */ lzv $ENTRIES = new nzv(values());

    public static lzv getEntries() {
        return $ENTRIES;
    }
}
