package p204p;

import com.spotify.connectivity.AnalyticsDelegate;
import com.spotify.connectivity.AuthenticatedScopeConfiguration;
import com.spotify.connectivity.NativeAuthenticatedScope;
import com.spotify.cosmos.sharedcosmosrouterapi.SharedCosmosRouterApi;

/* JADX INFO: loaded from: classes.dex */
public final class p1j implements fwz0 {

    /* JADX INFO: renamed from: a */
    public final xtk f173109a;

    /* JADX INFO: renamed from: b */
    public final SharedCosmosRouterApi f173110b;

    /* JADX INFO: renamed from: c */
    public final p0j f173111c;

    /* JADX INFO: renamed from: d */
    public final AnalyticsDelegate f173112d;

    /* JADX INFO: renamed from: e */
    public final AuthenticatedScopeConfiguration f173113e;

    /* JADX INFO: renamed from: f */
    public final b301 f173114f;

    /* JADX INFO: renamed from: g */
    public final l5t0 f173115g;

    /* JADX INFO: renamed from: h */
    public final g5t0 f173116h;

    /* JADX INFO: renamed from: i */
    public final bwy f173117i;

    /* JADX INFO: renamed from: t */
    public NativeAuthenticatedScope f173118t;

    public p1j(xtk xtkVar, SharedCosmosRouterApi sharedCosmosRouterApi, p0j p0jVar, AnalyticsDelegate analyticsDelegate, AuthenticatedScopeConfiguration authenticatedScopeConfiguration, b301 b301Var, l5t0 l5t0Var, g5t0 g5t0Var, bwy bwyVar) {
        this.f173109a = xtkVar;
        this.f173110b = sharedCosmosRouterApi;
        this.f173111c = p0jVar;
        this.f173112d = analyticsDelegate;
        this.f173113e = authenticatedScopeConfiguration;
        this.f173114f = b301Var;
        this.f173115g = l5t0Var;
        this.f173116h = g5t0Var;
        this.f173117i = bwyVar;
        ((auk) xtkVar).f19950c.runBlocking(new zu3(this, 5));
        zv41 zv41Var = g5t0Var.f76768b;
        Object objInvoke = g5t0Var.f76767a.invoke();
        zv41Var.getClass();
        zv41Var.m97091m(null, objInvoke);
    }

    @Override // p204p.hgm
    public final void shutdown() {
        this.f173116h.f76768b.m97090l(null);
        ((auk) this.f173109a).f19950c.runBlocking(new eph(this, 3));
    }

    @Override // p204p.fwz0
    public final Object getApi() {
        return this;
    }
}
