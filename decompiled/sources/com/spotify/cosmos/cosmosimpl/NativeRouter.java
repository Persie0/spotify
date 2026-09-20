package com.spotify.cosmos.cosmosimpl;

import com.spotify.cosmos.cosmos.Lifetime;
import com.spotify.cosmos.cosmos.Request;
import com.spotify.cosmos.cosmos.ResolveCallback;
import com.spotify.cosmos.cosmos.Router;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0096 ¢\u0006\u0004\b\u0005\u0010\u0003J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0086 ¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004H\u0086 ¢\u0006\u0004\b\n\u0010\u0003J \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0096 ¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0015\u0010\u0003¨\u0006\u0017"}, m24212d2 = {"Lcom/spotify/cosmos/cosmosimpl/NativeRouter;", "Lcom/spotify/cosmos/cosmos/Router;", "<init>", "()V", "Lp/w2a1;", "destroy", "Lcom/spotify/cosmos/cosmosimpl/Scheduler;", "scheduler", "initializeScheduling", "(Lcom/spotify/cosmos/cosmosimpl/Scheduler;)V", "deinitializeScheduling", "Lcom/spotify/cosmos/cosmos/Request;", "request", "Lcom/spotify/cosmos/cosmos/ResolveCallback;", "callback", "Lcom/spotify/cosmos/cosmos/Lifetime;", "resolve", "(Lcom/spotify/cosmos/cosmos/Request;Lcom/spotify/cosmos/cosmos/ResolveCallback;)Lcom/spotify/cosmos/cosmos/Lifetime;", "", "nThis", "J", "getNThis$annotations", "Companion", "src_main_java_com_spotify_cosmos_cosmosimpl-cosmosimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class NativeRouter implements Router {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long nThis;

    @Metadata(m24211d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0083 ¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m24212d2 = {"Lcom/spotify/cosmos/cosmosimpl/NativeRouter$Companion;", "", "<init>", "()V", "Lcom/spotify/cosmos/cosmosimpl/NativeRouter;", "router", "Lp/w2a1;", "initializeRouter", "(Lcom/spotify/cosmos/cosmosimpl/NativeRouter;)V", "create", "()Lcom/spotify/cosmos/cosmosimpl/NativeRouter;", "src_main_java_com_spotify_cosmos_cosmosimpl-cosmosimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void initializeRouter(NativeRouter router) {
            NativeRouter.initializeRouter(router);
        }

        public final NativeRouter create() {
            return NativeRouter.create();
        }

        private Companion() {
        }
    }

    public NativeRouter() {
        INSTANCE.initializeRouter(this);
    }

    public static final native NativeRouter create();

    private static /* synthetic */ void getNThis$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void initializeRouter(NativeRouter nativeRouter);

    public final native void deinitializeScheduling();

    @Override // com.spotify.cosmos.cosmos.Router
    public native void destroy();

    public final native void initializeScheduling(Scheduler scheduler);

    @Override // com.spotify.cosmos.cosmos.Router
    public native Lifetime resolve(Request request, ResolveCallback callback);
}
