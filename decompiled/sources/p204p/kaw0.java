package p204p;

import com.spotify.remoteconfig.NativeRemoteConfigImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class kaw0 implements fwz0 {

    /* JADX INFO: renamed from: a */
    public final NativeRemoteConfigImpl f120976a;

    public kaw0(u0x0 u0x0Var) {
        cxi0 cxi0Var = NativeRemoteConfigImpl.Companion;
        law0 law0Var = new law0(u0x0Var);
        cxi0Var.getClass();
        NativeRemoteConfigImpl nativeRemoteConfigImplCreateInternal = NativeRemoteConfigImpl.createInternal(law0Var);
        nativeRemoteConfigImplCreateInternal.initialize();
        this.f120976a = nativeRemoteConfigImplCreateInternal;
    }

    @Override // p204p.hgm
    public final void shutdown() {
        this.f120976a.destroy();
    }

    @Override // p204p.fwz0
    public final Object getApi() {
        return this;
    }
}
