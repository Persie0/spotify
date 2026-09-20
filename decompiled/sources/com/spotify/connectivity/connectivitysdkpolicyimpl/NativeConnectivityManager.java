package com.spotify.connectivity.connectivitysdkpolicyimpl;

import com.spotify.connectivity.AnalyticsDelegate;
import com.spotify.connectivity.ConnectionType;
import com.spotify.connectivity.Scheduler;
import com.spotify.connectivity.connectivitysdkpolicy.ConnectivityManager;
import com.spotify.cosmos.cosmosimpl.NativeRouter;
import kotlin.Metadata;
import p204p.mwi0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0018\u0018\u0000 $2\u00020\u0001:\u0001%B\t\b\u0012¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0096 ¢\u0006\u0004\b\u0005\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\u0006H\u0096 ¢\u0006\u0004\b\u0007\u0010\bJ \u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0096 ¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0011\u0010\u0003R\u001b\u0010\u0012\u001a\u00020\n8Ö\u0001X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R,\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n8Ö\u0001@Ö\u0001X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\u0014\"\u0004\b\u0017\u0010\u0018R,\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n8Ö\u0001@Ö\u0001X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0018R,\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n8Ö\u0001@Ö\u0001X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0018R,\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n8Ö\u0001@Ö\u0001X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0018R,\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n8Ö\u0001@Ö\u0001X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0013\u001a\u0004\b\u001f\u0010\u0014\"\u0004\b \u0010\u0018R,\u0010!\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n8Ö\u0001@Ö\u0001X\u0096\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0013\u001a\u0004\b\"\u0010\u0014\"\u0004\b#\u0010\u0018¨\u0006&"}, m24212d2 = {"Lcom/spotify/connectivity/connectivitysdkpolicyimpl/NativeConnectivityManager;", "Lcom/spotify/connectivity/connectivitysdkpolicy/ConnectivityManager;", "<init>", "()V", "Lp/w2a1;", "destroy", "Lcom/spotify/connectivity/ConnectionType;", "getConnectionType", "()Lcom/spotify/connectivity/ConnectionType;", "connectionType", "", "roaming", "setConnectionType", "(Lcom/spotify/connectivity/ConnectionType;Z)V", "", "nThis", "J", "getNThis$annotations", "isRoaming", "Z", "()Z", "value", "isNetworkAllowed", "setNetworkAllowed", "(Z)V", "isNetworkAllowedIfRoaming", "setNetworkAllowedIfRoaming", "isSyncAllowedOverCellular", "setSyncAllowedOverCellular", "isSyncAllowedOverWifi", "setSyncAllowedOverWifi", "isBackground", "setBackground", "keepAliveNetwork", "getKeepAliveNetwork", "setKeepAliveNetwork", "Companion", "p/mwi0", "src_main_java_com_spotify_connectivity_connectivitysdkpolicyimpl-connectivitysdkpolicyimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class NativeConnectivityManager implements ConnectivityManager {
    public static final mwi0 Companion = new mwi0();
    private boolean isBackground;
    private boolean isNetworkAllowed;
    private boolean isNetworkAllowedIfRoaming;
    private final boolean isRoaming;
    private boolean isSyncAllowedOverCellular;
    private boolean isSyncAllowedOverWifi;
    private boolean keepAliveNetwork;
    private long nThis;

    private NativeConnectivityManager() {
    }

    public static final native NativeConnectivityManager create(NativeRouter nativeRouter, Scheduler scheduler, AnalyticsDelegate analyticsDelegate, boolean z);

    private static /* synthetic */ void getNThis$annotations() {
    }

    @Override // com.spotify.connectivity.connectivitysdkpolicy.ConnectivityManager
    public native void destroy();

    @Override // com.spotify.connectivity.connectivitysdkpolicy.ConnectivityManager
    public native ConnectionType getConnectionType();

    @Override // com.spotify.connectivity.connectivitysdkpolicy.ConnectivityManager
    public native boolean getKeepAliveNetwork();

    @Override // com.spotify.connectivity.connectivitysdkpolicy.ConnectivityManager
    public native boolean isBackground();

    @Override // com.spotify.connectivity.connectivitysdkpolicy.ConnectivityManager
    public native boolean isNetworkAllowed();

    @Override // com.spotify.connectivity.connectivitysdkpolicy.ConnectivityManager
    public native boolean isNetworkAllowedIfRoaming();

    @Override // com.spotify.connectivity.connectivitysdkpolicy.ConnectivityManager
    public native boolean isRoaming();

    @Override // com.spotify.connectivity.connectivitysdkpolicy.ConnectivityManager
    public native boolean isSyncAllowedOverCellular();

    @Override // com.spotify.connectivity.connectivitysdkpolicy.ConnectivityManager
    public native boolean isSyncAllowedOverWifi();

    @Override // com.spotify.connectivity.connectivitysdkpolicy.ConnectivityManager
    public native void setBackground(boolean z);

    @Override // com.spotify.connectivity.connectivitysdkpolicy.ConnectivityManager
    public native void setConnectionType(ConnectionType connectionType, boolean roaming);

    @Override // com.spotify.connectivity.connectivitysdkpolicy.ConnectivityManager
    public native void setKeepAliveNetwork(boolean z);

    @Override // com.spotify.connectivity.connectivitysdkpolicy.ConnectivityManager
    public native void setNetworkAllowed(boolean z);

    @Override // com.spotify.connectivity.connectivitysdkpolicy.ConnectivityManager
    public native void setNetworkAllowedIfRoaming(boolean z);

    @Override // com.spotify.connectivity.connectivitysdkpolicy.ConnectivityManager
    public native void setSyncAllowedOverCellular(boolean z);

    @Override // com.spotify.connectivity.connectivitysdkpolicy.ConnectivityManager
    public native void setSyncAllowedOverWifi(boolean z);
}
