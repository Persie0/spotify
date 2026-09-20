package com.spotify.authentication.oauthsetupimpl;

import com.spotify.authentication.credentials.UnencryptedCredentials;
import com.spotify.authentication.login5.Login5Configuration;
import com.spotify.authentication.login5setup.NativeLogin5Setup;
import com.spotify.authentication.oauth.AccessToken;
import com.spotify.authentication.oauthsetup.NativeOAuthSetup;
import com.spotify.concurrency.async.NativeTimerManagerThread;
import com.spotify.connectivity.NativeApplicationScopeAPI;
import com.spotify.cosmos.cosmosimpl.NativeRouter;
import com.spotify.esperanto.esperanto.Transport;
import kotlin.Metadata;
import p204p.vwi0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0096 ¢\u0006\u0004\b\u0005\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086 ¢\u0006\u0004\b\u0007\u0010\bR$\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m24212d2 = {"Lcom/spotify/authentication/oauthsetupimpl/NativeOAuthSetupImpl;", "Lcom/spotify/authentication/oauthsetup/NativeOAuthSetup;", "<init>", "()V", "Lp/w2a1;", "destroy", "Lcom/spotify/esperanto/esperanto/Transport;", "getNativeTransport", "()Lcom/spotify/esperanto/esperanto/Transport;", "", "value", "nThis", "J", "getNThis", "()J", "Companion", "p/vwi0", "src_main_java_com_spotify_authentication_oauthsetupimpl-oauthsetupimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class NativeOAuthSetupImpl implements NativeOAuthSetup {
    public static final vwi0 Companion = new vwi0();
    private long nThis;

    public static final native NativeOAuthSetupImpl create(Login5Configuration login5Configuration, NativeTimerManagerThread nativeTimerManagerThread, NativeLogin5Setup nativeLogin5Setup, AccessToken accessToken, UnencryptedCredentials unencryptedCredentials, NativeRouter nativeRouter, NativeApplicationScopeAPI nativeApplicationScopeAPI);

    @Override // com.spotify.authentication.oauthsetup.NativeOAuthSetup
    public native void destroy();

    @Override // com.spotify.authentication.oauthsetup.NativeOAuthSetup
    public long getNThis() {
        return this.nThis;
    }

    public final native Transport getNativeTransport();
}
