package com.spotify.eventsender.eventsender;

import java.io.IOException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m24212d2 = {"Lcom/spotify/eventsender/eventsender/MissingTransportException;", "Ljava/io/IOException;", "<init>", "()V", "src_main_java_com_spotify_eventsender_eventsender-eventsender"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class MissingTransportException extends IOException {
    public MissingTransportException() {
        super("No HTTP transport available.");
    }
}
