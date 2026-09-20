package com.spotify.eventsender.eventsenderimpl;

import com.spotify.eventsender.api.EventPersistedCallback;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0012¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0096 ¢\u0006\u0004\b\u0005\u0010\u0003J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0096 ¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u000b\u0010\f\u0012\u0004\b\r\u0010\u0003¨\u0006\u000e"}, m24212d2 = {"Lcom/spotify/eventsender/eventsenderimpl/NativeEventPersistedCallback;", "Lcom/spotify/eventsender/api/EventPersistedCallback;", "<init>", "()V", "Lp/w2a1;", "destroy", "", "persistenceResult", "invoke", "(I)V", "", "nThis", "J", "getNThis$annotations", "src_main_java_com_spotify_coreeventsender_eventsenderimpl-eventsenderimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class NativeEventPersistedCallback implements EventPersistedCallback {
    private long nThis;

    private NativeEventPersistedCallback() {
    }

    private static /* synthetic */ void getNThis$annotations() {
    }

    @Override // com.spotify.eventsender.api.EventPersistedCallback
    public native void destroy();

    @Override // com.spotify.eventsender.api.EventPersistedCallback
    public native void invoke(int persistenceResult);
}
