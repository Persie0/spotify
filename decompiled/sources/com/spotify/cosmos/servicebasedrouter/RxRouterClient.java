package com.spotify.cosmos.servicebasedrouter;

import com.spotify.cosmos.rxrouter.RxRouter;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u00002\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\t\u0010\u0003J\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0015¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0015¢\u0006\u0004\b\u0012\u0010\u0003R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m24212d2 = {"Lcom/spotify/cosmos/servicebasedrouter/RxRouterClient;", "", "<init>", "()V", "Lp/w2a1;", "connect", "", "isStarted", "()Z", "disconnect", "Lcom/spotify/cosmos/servicebasedrouter/RxRouterClient$Listener;", "l", "setListener", "(Lcom/spotify/cosmos/servicebasedrouter/RxRouterClient$Listener;)V", "Lcom/spotify/cosmos/rxrouter/RxRouter;", "rxRouter", "notifyOnConnected", "(Lcom/spotify/cosmos/rxrouter/RxRouter;)V", "notifyOnDisconnected", "listener", "Lcom/spotify/cosmos/servicebasedrouter/RxRouterClient$Listener;", "started", "Z", "Listener", "src_main_java_com_spotify_cosmos_servicebasedrouter-servicebasedrouter"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public abstract class RxRouterClient {
    private Listener listener;
    private boolean started;

    @Metadata(m24211d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, m24212d2 = {"Lcom/spotify/cosmos/servicebasedrouter/RxRouterClient$Listener;", "", "Lcom/spotify/cosmos/rxrouter/RxRouter;", "r", "Lp/w2a1;", "onConnected", "(Lcom/spotify/cosmos/rxrouter/RxRouter;)V", "onDisconnected", "()V", "src_main_java_com_spotify_cosmos_servicebasedrouter-servicebasedrouter"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public interface Listener {
        void onConnected(RxRouter r);

        void onDisconnected();
    }

    public void connect() {
        if (this.started) {
            throw new IllegalStateException("Check failed.");
        }
        this.started = true;
    }

    public void disconnect() {
        if (!this.started) {
            throw new IllegalStateException("Check failed.");
        }
        this.started = false;
        notifyOnDisconnected();
    }

    /* JADX INFO: renamed from: isStarted, reason: from getter */
    public final boolean getStarted() {
        return this.started;
    }

    public void notifyOnConnected(RxRouter rxRouter) {
        Listener listener = this.listener;
        if (listener != null) {
            listener.onConnected(rxRouter);
        }
    }

    public void notifyOnDisconnected() {
        Listener listener = this.listener;
        if (listener != null) {
            listener.onDisconnected();
        }
    }

    public void setListener(Listener l) {
        this.listener = l;
    }
}
