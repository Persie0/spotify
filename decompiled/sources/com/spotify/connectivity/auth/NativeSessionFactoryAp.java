package com.spotify.connectivity.auth;

import com.spotify.authentication.credentials.UnencryptedCredentials;
import com.spotify.authentication.login5setup.NativeLogin5Setup;
import com.spotify.authentication.oauthsetup.NativeOAuthSetup;
import com.spotify.concurrency.async.NativeTimerManagerThread;
import com.spotify.connectivity.AnalyticsDelegate;
import com.spotify.connectivity.ConnectionTypeProvider;
import com.spotify.connectivity.ConnectivityPolicyProvider;
import com.spotify.connectivity.NativeApplicationScope;
import java.util.Map;
import kotlin.Metadata;
import p204p.fxi0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u0005\u0010\u0003R\u001c\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u0007\u0010\b\u0012\u0004\b\t\u0010\u0003¨\u0006\f"}, m24212d2 = {"Lcom/spotify/connectivity/auth/NativeSessionFactoryAp;", "", "<init>", "()V", "Lp/w2a1;", "destroy", "", "nThis", "J", "getNThis$annotations", "Companion", "p/fxi0", "src_main_java_com_spotify_connectivity_connectivitysdkproductsimpl-connectivitysdkproductsimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class NativeSessionFactoryAp {
    public static final fxi0 Companion = new fxi0();
    private long nThis;

    private NativeSessionFactoryAp() {
    }

    public static final native NativeSession create(NativeLoginControllerConfiguration nativeLoginControllerConfiguration, NativeTimerManagerThread nativeTimerManagerThread, NativeApplicationScope nativeApplicationScope, AnalyticsDelegate analyticsDelegate, ConnectivityPolicyProvider connectivityPolicyProvider, ConnectionTypeProvider connectionTypeProvider, CredentialsStorage credentialsStorage, UnencryptedCredentials unencryptedCredentials, NativeLogin5Setup nativeLogin5Setup, NativeOAuthSetup nativeOAuthSetup, Map<String, String> map, NativeLoginOptions nativeLoginOptions, String str);

    private final native void destroy();

    private static /* synthetic */ void getNThis$annotations() {
    }
}
