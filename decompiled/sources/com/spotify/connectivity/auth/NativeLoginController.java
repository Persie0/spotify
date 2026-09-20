package com.spotify.connectivity.auth;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0012¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0086 ¢\u0006\u0004\b\u0005\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u0004H\u0086 ¢\u0006\u0004\b\u0006\u0010\u0003J\u0010\u0010\b\u001a\u00020\u0007H\u0086 ¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0096 ¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0096 ¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0015\u0010\u0003¨\u0006\u0016"}, m24212d2 = {"Lcom/spotify/connectivity/auth/NativeLoginController;", "Lcom/spotify/connectivity/auth/LoginController;", "<init>", "()V", "Lp/w2a1;", "destroy", "prepareForShutdown", "Lcom/spotify/connectivity/auth/NativeSession;", "stealNativeSession", "()Lcom/spotify/connectivity/auth/NativeSession;", "", "forceReconnect", "tryReconnectNow", "(Z)V", "Lcom/spotify/connectivity/auth/LoginControllerDelegate;", "delegate", "setDelegate", "(Lcom/spotify/connectivity/auth/LoginControllerDelegate;)V", "", "nThis", "J", "getNThis$annotations", "src_main_java_com_spotify_connectivity_connectivitysdkproductsimpl-connectivitysdkproductsimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class NativeLoginController implements LoginController {
    private long nThis;

    private NativeLoginController() {
    }

    private static /* synthetic */ void getNThis$annotations() {
    }

    public final native void destroy();

    public final native void prepareForShutdown();

    @Override // com.spotify.connectivity.auth.LoginController
    public native void setDelegate(LoginControllerDelegate delegate);

    public final native NativeSession stealNativeSession();

    @Override // com.spotify.connectivity.auth.LoginController
    public native void tryReconnectNow(boolean forceReconnect);
}
