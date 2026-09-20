package com.spotify.remoteconfig;

import com.spotify.esperanto.esperanto.Transport;
import kotlin.Metadata;
import p204p.cxi0;
import p204p.eaw0;
import p204p.fzg1;
import p204p.wj50;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00162\u00020\u00012\u00020\u0002:\u0001\u0017B\t\b\u0012¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0082 ¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\u0004J\u0010\u0010\n\u001a\u00020\bH\u0096 ¢\u0006\u0004\b\n\u0010\u0004R$\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00118\u0006@BX\u0086.¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, m24212d2 = {"Lcom/spotify/remoteconfig/NativeRemoteConfigImpl;", "Lcom/spotify/remoteconfig/NativeRemoteConfig;", "", "<init>", "()V", "Lcom/spotify/esperanto/esperanto/Transport;", "getTransportToNative", "()Lcom/spotify/esperanto/esperanto/Transport;", "Lp/w2a1;", "initialize", "destroy", "", "value", "nThis", "J", "getNThis", "()J", "Lp/eaw0;", "resolveClient", "Lp/eaw0;", "getResolveClient", "()Lp/eaw0;", "Companion", "p/cxi0", "src_main_java_com_spotify_remoteconfig_remoteconfigimpl-remoteconfigimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class NativeRemoteConfigImpl implements NativeRemoteConfig {
    public static final cxi0 Companion = new cxi0();
    private long nThis;
    private eaw0 resolveClient;

    private NativeRemoteConfigImpl() {
    }

    public static final NativeRemoteConfigImpl create(Transport transport) {
        Companion.getClass();
        NativeRemoteConfigImpl nativeRemoteConfigImplCreateInternal = createInternal(transport);
        nativeRemoteConfigImplCreateInternal.initialize();
        return nativeRemoteConfigImplCreateInternal;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final native NativeRemoteConfigImpl createInternal(Transport transport);

    private final native Transport getTransportToNative();

    /* JADX INFO: Access modifiers changed from: private */
    public final void initialize() {
        this.resolveClient = fzg1.m43207j(getTransportToNative());
    }

    @Override // com.spotify.remoteconfig.NativeRemoteConfig
    public native void destroy();

    @Override // com.spotify.remoteconfig.NativeRemoteConfig
    public long getNThis() {
        return this.nThis;
    }

    public final eaw0 getResolveClient() {
        eaw0 eaw0Var = this.resolveClient;
        if (eaw0Var != null) {
            return eaw0Var;
        }
        wj50.m88260d0("resolveClient");
        throw null;
    }
}
