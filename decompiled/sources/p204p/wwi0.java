package p204p;

import com.spotify.authentication.oauthsetupimpl.NativeOAuthSetupImpl;
import com.spotify.cosmos.sharedcosmosrouterapi.SharedCosmosRouterApi;

/* JADX INFO: loaded from: classes.dex */
public final class wwi0 implements fwz0 {

    /* JADX INFO: renamed from: a */
    public final xtk f255774a;

    /* JADX INFO: renamed from: b */
    public final ztk f255775b;

    /* JADX INFO: renamed from: c */
    public NativeOAuthSetupImpl f255776c;

    /* JADX INFO: renamed from: d */
    public twy f255777d;

    public wwi0(fke fkeVar, mh7 mh7Var, p0j p0jVar, SharedCosmosRouterApi sharedCosmosRouterApi, xre xreVar, xtk xtkVar, ztk ztkVar) {
        this.f255774a = xtkVar;
        this.f255775b = ztkVar;
        ((auk) xtkVar).f19950c.runBlocking(new yte(mh7Var, this, p0jVar, sharedCosmosRouterApi, xreVar, fkeVar, 1));
    }

    /* JADX INFO: renamed from: a */
    public final NativeOAuthSetupImpl m89206a() {
        NativeOAuthSetupImpl nativeOAuthSetupImpl = this.f255776c;
        if (nativeOAuthSetupImpl != null) {
            return nativeOAuthSetupImpl;
        }
        wj50.m88260d0("nativeOAuthSetup");
        throw null;
    }

    @Override // p204p.hgm
    public final void shutdown() {
        twy twyVar = this.f255777d;
        if (twyVar == null) {
            wj50.m88260d0("accessTokenClient");
            throw null;
        }
        twyVar.m81788K().set(true);
        ((auk) this.f255774a).f19950c.runBlocking(new kk00(this, 18));
    }

    @Override // p204p.fwz0
    public final Object getApi() {
        return this;
    }
}
