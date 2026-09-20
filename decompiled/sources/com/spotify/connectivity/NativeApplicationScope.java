package com.spotify.connectivity;

import com.spotify.concurrency.async.NativeTimerManagerThread;
import com.spotify.connectivity.auth.CredentialsStorage;
import com.spotify.connectivity.trafficsetup.NativeTrafficSetup;
import com.spotify.cosmos.cosmosimpl.NativeRouter;
import com.spotify.esperanto.esperanto.Transport;
import com.spotify.fileaccess.fileio.NativeFileIO;
import kotlin.Metadata;
import p204p.jwi0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u001aB\t\b\u0012¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0096 ¢\u0006\u0004\b\u0006\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u0005H\u0096 ¢\u0006\u0004\b\u0007\u0010\u0004J \u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0086 ¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u0086 ¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\rH\u0086 ¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\rH\u0086 ¢\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\rH\u0086 ¢\u0006\u0004\b\u0012\u0010\u000fR$\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, m24212d2 = {"Lcom/spotify/connectivity/NativeApplicationScope;", "Lcom/spotify/connectivity/NativeApplicationScopeAPI;", "Lcom/spotify/connectivity/ApplicationScope;", "<init>", "()V", "Lp/w2a1;", "destroy", "prepareForShutdown", "", "foreground", "playing", "setAppState", "(ZZ)V", "Lcom/spotify/esperanto/esperanto/Transport;", "getNativeLogin5Transport", "()Lcom/spotify/esperanto/esperanto/Transport;", "getNativeAuthStorageTransport", "getNativeHostsProviderTransport", "getNativeTransport", "", "value", "nThis", "J", "getNThis", "()J", "Companion", "p/jwi0", "src_main_java_com_spotify_connectivity_connectivitysdkproductsimpl-connectivitysdkproductsimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class NativeApplicationScope implements NativeApplicationScopeAPI, ApplicationScope {
    public static final jwi0 Companion = new jwi0();
    private long nThis;

    private NativeApplicationScope() {
    }

    public static final native NativeApplicationScope create(NativeTimerManagerThread nativeTimerManagerThread, NativeRouter nativeRouter, AnalyticsDelegate analyticsDelegate, ConnectionTypeProvider connectionTypeProvider, ConnectivityPolicyProvider connectivityPolicyProvider, CredentialsStorage credentialsStorage, ApplicationScopeConfiguration applicationScopeConfiguration, Transport transport, NativeTrafficSetup nativeTrafficSetup, NativeFileIO nativeFileIO);

    @Override // com.spotify.connectivity.NativeApplicationScopeAPI
    public native void destroy();

    @Override // com.spotify.connectivity.NativeApplicationScopeAPI
    public long getNThis() {
        return this.nThis;
    }

    public final native Transport getNativeAuthStorageTransport();

    public final native Transport getNativeHostsProviderTransport();

    public final native Transport getNativeLogin5Transport();

    public final native Transport getNativeTransport();

    @Override // com.spotify.connectivity.ApplicationScope
    public native void prepareForShutdown();

    public final native void setAppState(boolean foreground, boolean playing);
}
