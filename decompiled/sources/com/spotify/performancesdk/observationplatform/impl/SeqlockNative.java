package com.spotify.performancesdk.observationplatform.impl;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0087 ¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m24212d2 = {"Lcom/spotify/performancesdk/observationplatform/impl/SeqlockNative;", "", "", "address", "", "value", "Lp/w2a1;", "storeSequenceRelease", "(JI)V", "loadSequenceAcquire", "(J)I", "src_main_java_com_spotify_performancesdk_observationplatform_impl-impl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class SeqlockNative {
    public static final native int loadSequenceAcquire(long address);

    public static final native void storeSequenceRelease(long address, int value);
}
