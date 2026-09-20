package com.spotify.offline;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086 ¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0006H\u0086 ¢\u0006\u0004\b\t\u0010\u0003R\u001a\u0010\u000b\u001a\u00020\n8\u0002X\u0082D¢\u0006\f\n\u0004\b\u000b\u0010\f\u0012\u0004\b\r\u0010\u0003¨\u0006\u000e"}, m24212d2 = {"Lcom/spotify/offline/NativeForegroundObserver;", "", "<init>", "()V", "", "isForeground", "Lp/w2a1;", "onForeground", "(Z)V", "destroy", "", "nThis", "J", "getNThis$annotations", "src_main_java_com_spotify_offline_offline-offline"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class NativeForegroundObserver {
    private final long nThis;

    private static /* synthetic */ void getNThis$annotations() {
    }

    public final native void destroy();

    public final native void onForeground(boolean isForeground);
}
