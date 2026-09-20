package com.spotify.eventsender.api;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, m24212d2 = {"Lcom/spotify/eventsender/api/EventPersistedCallback;", "", "", "persistenceResult", "Lp/w2a1;", "invoke", "(I)V", "destroy", "()V", "src_main_java_com_spotify_coreeventsender_eventsender-eventsender"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface EventPersistedCallback {
    void destroy();

    void invoke(int persistenceResult);
}
