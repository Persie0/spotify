package com.spotify.connectivity;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0012¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0086 ¢\u0006\u0004\b\u0005\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\u0006H\u0096 ¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0096 ¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0096 ¢\u0006\u0004\b\r\u0010\fR\u001c\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0011\u0010\u0003¨\u0006\u0012"}, m24212d2 = {"Lcom/spotify/connectivity/NativeConnectivityPolicyProvider;", "Lcom/spotify/connectivity/ConnectivityPolicyProvider;", "<init>", "()V", "Lp/w2a1;", "destroy", "Lcom/spotify/connectivity/ConnectivityPolicy;", "getConnectivityPolicy", "()Lcom/spotify/connectivity/ConnectivityPolicy;", "Lcom/spotify/connectivity/ConnectivityPolicyProvider$Observer;", "observer", "addObserver", "(Lcom/spotify/connectivity/ConnectivityPolicyProvider$Observer;)V", "removeObserver", "", "nThis", "J", "getNThis$annotations", "src_main_java_com_spotify_connectivity_connectivitysdkproductsimpl-connectivitysdkproductsimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class NativeConnectivityPolicyProvider implements ConnectivityPolicyProvider {
    private long nThis;

    private NativeConnectivityPolicyProvider() {
    }

    private static /* synthetic */ void getNThis$annotations() {
    }

    @Override // com.spotify.connectivity.ConnectivityPolicyProvider
    public native void addObserver(ConnectivityPolicyProvider.Observer observer);

    public final native void destroy();

    @Override // com.spotify.connectivity.ConnectivityPolicyProvider
    public native ConnectivityPolicy getConnectivityPolicy();

    @Override // com.spotify.connectivity.ConnectivityPolicyProvider
    public native void removeObserver(ConnectivityPolicyProvider.Observer observer);
}
