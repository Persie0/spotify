package com.spotify.eventsender.eventsenderimpl;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0086 ¢\u0006\u0004\b\u0003\u0010\u0004J*\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0086 ¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m24212d2 = {"Lcom/spotify/eventsender/eventsenderimpl/NativeEventSender;", "", "Lp/w2a1;", "destroy", "()V", "", "event_name", "", "event_bytes", "owner_override", "", "send", "(Ljava/lang/String;[BLjava/lang/String;)I", "src_main_java_com_spotify_coreeventsender_eventsenderimpl-eventsenderimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class NativeEventSender {
    public static final native NativeEventSender create();

    public final native void destroy();

    public final native int send(String event_name, byte[] event_bytes, String owner_override);
}
