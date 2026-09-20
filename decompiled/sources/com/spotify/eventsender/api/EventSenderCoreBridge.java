package com.spotify.eventsender.api;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J3\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, m24212d2 = {"Lcom/spotify/eventsender/api/EventSenderCoreBridge;", "", "", "eventName", "payload", "overrideUserName", "Lcom/spotify/eventsender/api/EventPersistedCallback;", "callback", "", "send", "([B[B[BLcom/spotify/eventsender/api/EventPersistedCallback;)I", "Lp/w2a1;", "queueMetricsDataSnapshotForSending", "([B[B)V", "src_main_java_com_spotify_coreeventsender_eventsender-eventsender"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface EventSenderCoreBridge {
    void queueMetricsDataSnapshotForSending(byte[] eventName, byte[] payload);

    int send(byte[] eventName, byte[] payload, byte[] overrideUserName, EventPersistedCallback callback);
}
