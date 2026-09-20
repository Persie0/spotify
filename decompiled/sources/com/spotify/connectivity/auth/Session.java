package com.spotify.connectivity.auth;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m24212d2 = {"Lcom/spotify/connectivity/auth/Session;", "", "", "forceReconnect", "Lp/w2a1;", "tryReconnectNow", "(Z)V", "src_main_java_com_spotify_connectivity_connectivitysdkproducts-connectivitysdkproducts"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface Session {
    void tryReconnectNow(boolean forceReconnect);
}
