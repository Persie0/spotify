package com.spotify.connectivity.auth;

import com.spotify.authentication.credentials.UnencryptedCredentials;
import com.spotify.authentication.oauthsetup.NativeOAuthSetup;
import com.spotify.concurrency.async.NativeTimerManagerThread;
import com.spotify.esperanto.esperanto.Transport;
import java.util.Map;
import kotlin.Metadata;
import p204p.exi0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0001\u001fB\t\b\u0012¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0096 ¢\u0006\u0004\b\u0006\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u0005H\u0086 ¢\u0006\u0004\b\u0007\u0010\u0004J\u0010\u0010\b\u001a\u00020\u0005H\u0086 ¢\u0006\u0004\b\b\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0096 ¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u000e\u001a\u00020\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0015\u001a\u00020\u00148Æ\u0001¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u00020\u00198Æ\u0001¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, m24212d2 = {"Lcom/spotify/connectivity/auth/NativeSession;", "Lcom/spotify/connectivity/auth/NativeSessionAPI;", "Lcom/spotify/connectivity/auth/Session;", "<init>", "()V", "Lp/w2a1;", "destroy", "blockingLogout", "prepareForShutdown", "", "forceReconnect", "tryReconnectNow", "(Z)V", "", "nThis", "J", "getNThis", "()J", "setNThis", "(J)V", "", "canonicalUsername", "Ljava/lang/String;", "getCanonicalUsername", "()Ljava/lang/String;", "Lcom/spotify/esperanto/esperanto/Transport;", "internalTransportToNative", "Lcom/spotify/esperanto/esperanto/Transport;", "getInternalTransportToNative", "()Lcom/spotify/esperanto/esperanto/Transport;", "Companion", "p/exi0", "src_main_java_com_spotify_connectivity_connectivitysdkproductsimpl-connectivitysdkproductsimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class NativeSession implements NativeSessionAPI, Session {
    public static final exi0 Companion = new exi0();
    private final String canonicalUsername;
    private final Transport internalTransportToNative;
    private long nThis;

    private NativeSession() {
    }

    public static final native NativeSession createNativeSessionWithoutAp(NativeTimerManagerThread nativeTimerManagerThread, UnencryptedCredentials unencryptedCredentials, NativeOAuthSetup nativeOAuthSetup, Map<String, String> map, String str);

    public final native void blockingLogout();

    @Override // com.spotify.connectivity.auth.NativeSessionAPI
    public native void destroy();

    public final native String getCanonicalUsername();

    public final native Transport getInternalTransportToNative();

    @Override // com.spotify.connectivity.auth.NativeSessionAPI
    public long getNThis() {
        return this.nThis;
    }

    public final native void prepareForShutdown();

    public void setNThis(long j) {
        this.nThis = j;
    }

    @Override // com.spotify.connectivity.auth.Session
    public native void tryReconnectNow(boolean forceReconnect);
}
