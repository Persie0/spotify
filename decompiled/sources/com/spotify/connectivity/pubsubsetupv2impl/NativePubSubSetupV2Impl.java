package com.spotify.connectivity.pubsubsetupv2impl;

import com.spotify.authentication.oauthsetup.NativeOAuthSetup;
import com.spotify.concurrency.async.NativeTimerManagerThread;
import com.spotify.connectivity.NativeApplicationScopeAPI;
import com.spotify.connectivity.auth.NativeSessionAPI;
import com.spotify.connectivity.pubsubsetup.NativePubSubSetup;
import com.spotify.esperanto.esperanto.Transport;
import kotlin.Metadata;
import p204p.bxi0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\u0018\u0000 \f2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0096 ¢\u0006\u0004\b\u0005\u0010\u0003R$\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m24212d2 = {"Lcom/spotify/connectivity/pubsubsetupv2impl/NativePubSubSetupV2Impl;", "Lcom/spotify/connectivity/pubsubsetup/NativePubSubSetup;", "<init>", "()V", "Lp/w2a1;", "destroy", "", "value", "nThis", "J", "getNThis", "()J", "Companion", "p/bxi0", "src_main_java_com_spotify_connectivity_pubsubsetupv2impl-pubsubsetupv2impl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class NativePubSubSetupV2Impl implements NativePubSubSetup {
    public static final bxi0 Companion = new bxi0();
    private long nThis;

    public static final native NativePubSubSetupV2Impl create(Transport transport, NativeTimerManagerThread nativeTimerManagerThread, NativeOAuthSetup nativeOAuthSetup, NativeApplicationScopeAPI nativeApplicationScopeAPI);

    public static final native NativePubSubSetupV2Impl createForKids(Transport transport, NativeTimerManagerThread nativeTimerManagerThread, NativeSessionAPI nativeSessionAPI, NativeApplicationScopeAPI nativeApplicationScopeAPI);

    @Override // com.spotify.connectivity.pubsubsetup.NativePubSubSetup
    public native void destroy();

    @Override // com.spotify.connectivity.pubsubsetup.NativePubSubSetup
    public long getNThis() {
        return this.nThis;
    }
}
