package com.spotify.connectivity.connectivitysdkpolicy;

import com.spotify.connectivity.ConnectionType;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u00020\t8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u000e\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u00020\t8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0014\u001a\u00020\t8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u000e\"\u0004\b\u0015\u0010\u0011R\u001c\u0010\u0016\u001a\u00020\t8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u000e\"\u0004\b\u0017\u0010\u0011R\u001c\u0010\u0018\u001a\u00020\t8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0011R\u001c\u0010\u001c\u001a\u00020\t8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u000e\"\u0004\b\u001b\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001dÀ\u0006\u0001"}, m24212d2 = {"Lcom/spotify/connectivity/connectivitysdkpolicy/ConnectivityManager;", "", "Lp/w2a1;", "destroy", "()V", "Lcom/spotify/connectivity/ConnectionType;", "getConnectionType", "()Lcom/spotify/connectivity/ConnectionType;", "connectionType", "", "roaming", "setConnectionType", "(Lcom/spotify/connectivity/ConnectionType;Z)V", "isRoaming", "()Z", "isNetworkAllowed", "setNetworkAllowed", "(Z)V", "isNetworkAllowedIfRoaming", "setNetworkAllowedIfRoaming", "isSyncAllowedOverCellular", "setSyncAllowedOverCellular", "isSyncAllowedOverWifi", "setSyncAllowedOverWifi", "isBackground", "setBackground", "getKeepAliveNetwork", "setKeepAliveNetwork", "keepAliveNetwork", "src_main_java_com_spotify_connectivity_connectivitysdkpolicy-connectivitysdkpolicy"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface ConnectivityManager {
    void destroy();

    ConnectionType getConnectionType();

    boolean getKeepAliveNetwork();

    boolean isBackground();

    boolean isNetworkAllowed();

    boolean isNetworkAllowedIfRoaming();

    boolean isRoaming();

    boolean isSyncAllowedOverCellular();

    boolean isSyncAllowedOverWifi();

    void setBackground(boolean z);

    void setConnectionType(ConnectionType connectionType, boolean roaming);

    void setKeepAliveNetwork(boolean z);

    void setNetworkAllowed(boolean z);

    void setNetworkAllowedIfRoaming(boolean z);

    void setSyncAllowedOverCellular(boolean z);

    void setSyncAllowedOverWifi(boolean z);
}
