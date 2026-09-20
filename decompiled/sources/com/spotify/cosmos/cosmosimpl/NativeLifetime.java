package com.spotify.cosmos.cosmosimpl;

import com.spotify.cosmos.cosmos.Lifetime;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0012¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0086 ¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u000b\u0010\f\u0012\u0004\b\r\u0010\u0003¨\u0006\u000e"}, m24212d2 = {"Lcom/spotify/cosmos/cosmosimpl/NativeLifetime;", "Lcom/spotify/cosmos/cosmos/Lifetime;", "<init>", "()V", "Lp/w2a1;", "destroy", "release", "Ljava/util/concurrent/atomic/AtomicBoolean;", "destroyed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "", "nThis", "J", "getNThis$annotations", "src_main_java_com_spotify_cosmos_cosmosimpl-cosmosimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class NativeLifetime implements Lifetime {
    private final AtomicBoolean destroyed = new AtomicBoolean();
    private long nThis;

    private NativeLifetime() {
    }

    private static /* synthetic */ void getNThis$annotations() {
    }

    public final native void destroy();

    @Override // com.spotify.cosmos.cosmos.Lifetime
    public void release() {
        if (this.destroyed.compareAndSet(false, true)) {
            destroy();
        }
    }
}
