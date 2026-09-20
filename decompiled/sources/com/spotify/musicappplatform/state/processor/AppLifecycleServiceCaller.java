package com.spotify.musicappplatform.state.processor;

import androidx.annotation.Keep;
import kotlin.Metadata;
import p204p.lzv;
import p204p.nzv;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, m24212d2 = {"Lcom/spotify/musicappplatform/state/processor/AppLifecycleServiceCaller;", "", "<init>", "(Ljava/lang/String;I)V", "IDLE_SHUTDOWN_TIME", "ACTION_URL_OPEN", "MEDIA_BUTTON_FOREGROUND", "MEDIA_BUTTON_BACKGROUND", "PREPARE_ALARM", "CLIENT_WANTS_SERVICE_TO_DIE", "REQUEST_WIDGET_UPDATE", "WIDGET_PLAYER_SKIP_PREV", "WIDGET_PLAYER_PAUSE", "WIDGET_PLAYER_RESUME", "WIDGET_PLAYER_SKIP_NEXT", "STOP_SERVICE", "src_main_java_com_spotify_musicappplatform_state_processor-processor"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public enum AppLifecycleServiceCaller {
    IDLE_SHUTDOWN_TIME,
    ACTION_URL_OPEN,
    MEDIA_BUTTON_FOREGROUND,
    MEDIA_BUTTON_BACKGROUND,
    PREPARE_ALARM,
    CLIENT_WANTS_SERVICE_TO_DIE,
    REQUEST_WIDGET_UPDATE,
    WIDGET_PLAYER_SKIP_PREV,
    WIDGET_PLAYER_PAUSE,
    WIDGET_PLAYER_RESUME,
    WIDGET_PLAYER_SKIP_NEXT,
    STOP_SERVICE;

    private static final /* synthetic */ lzv $ENTRIES = new nzv(values());

    public static lzv getEntries() {
        return $ENTRIES;
    }
}
