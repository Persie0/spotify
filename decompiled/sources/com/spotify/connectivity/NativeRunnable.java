package com.spotify.connectivity;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0012¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u0005\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u0004H\u0096 ¢\u0006\u0004\b\u0006\u0010\u0003R\u001c\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\b\u0010\t\u0012\u0004\b\n\u0010\u0003¨\u0006\u000b"}, m24212d2 = {"Lcom/spotify/connectivity/NativeRunnable;", "Ljava/lang/Runnable;", "<init>", "()V", "Lp/w2a1;", "destroy", "run", "", "nThis", "J", "getNThis$annotations", "src_main_java_com_spotify_connectivity_connectivitysdkproductsimpl-connectivitysdkproductsimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class NativeRunnable implements Runnable {
    private long nThis;

    private NativeRunnable() {
    }

    private final native void destroy();

    private static /* synthetic */ void getNThis$annotations() {
    }

    @Override // java.lang.Runnable
    public native void run();
}
