package com.spotify.cosmos.cosmosimpl;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0012¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0086 ¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\u0004H\u0086 ¢\u0006\u0004\b\u0007\u0010\u0003R\u001c\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\t\u0010\n\u0012\u0004\b\u000b\u0010\u0003¨\u0006\f"}, m24212d2 = {"Lcom/spotify/cosmos/cosmosimpl/NativeRunnable;", "Ljava/lang/Runnable;", "<init>", "()V", "Lp/w2a1;", "destroy", "run", "internalRun", "", "nThis", "J", "getNThis$annotations", "src_main_java_com_spotify_cosmos_cosmosimpl-cosmosimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class NativeRunnable implements Runnable {
    private long nThis;

    private NativeRunnable() {
    }

    private static /* synthetic */ void getNThis$annotations() {
    }

    public final native void destroy();

    public final native void internalRun();

    @Override // java.lang.Runnable
    public void run() {
        internalRun();
        destroy();
    }
}
