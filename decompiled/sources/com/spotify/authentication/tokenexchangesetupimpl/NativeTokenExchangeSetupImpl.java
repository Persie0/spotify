package com.spotify.authentication.tokenexchangesetupimpl;

import com.spotify.authentication.accountssetup.NativeAccountsSetup;
import com.spotify.authentication.oauthsetup.NativeOAuthSetup;
import com.spotify.authentication.tokenexchangesetup.NativeTokenExchangeSetup;
import com.spotify.concurrency.async.NativeTimerManagerThread;
import com.spotify.connectivity.NativeAuthenticatedScopeAPI;
import com.spotify.cosmos.cosmosimpl.NativeRouter;
import kotlin.Metadata;
import p204p.ixi0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\u0018\u0000 \f2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0096 ¢\u0006\u0004\b\u0005\u0010\u0003R$\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m24212d2 = {"Lcom/spotify/authentication/tokenexchangesetupimpl/NativeTokenExchangeSetupImpl;", "Lcom/spotify/authentication/tokenexchangesetup/NativeTokenExchangeSetup;", "<init>", "()V", "Lp/w2a1;", "destroy", "", "value", "nThis", "J", "getNThis", "()J", "Companion", "p/ixi0", "src_main_java_com_spotify_authentication_tokenexchangesetupimpl-tokenexchangesetupimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class NativeTokenExchangeSetupImpl implements NativeTokenExchangeSetup {
    public static final ixi0 Companion = new ixi0();
    private long nThis;

    public static final native NativeTokenExchangeSetupImpl create(TokenExchangeConfiguration tokenExchangeConfiguration, NativeAuthenticatedScopeAPI nativeAuthenticatedScopeAPI, NativeAccountsSetup nativeAccountsSetup, NativeOAuthSetup nativeOAuthSetup, NativeTimerManagerThread nativeTimerManagerThread, NativeRouter nativeRouter);

    @Override // com.spotify.authentication.tokenexchangesetup.NativeTokenExchangeSetup
    public native void destroy();

    @Override // com.spotify.authentication.tokenexchangesetup.NativeTokenExchangeSetup
    public long getNThis() {
        return this.nThis;
    }
}
