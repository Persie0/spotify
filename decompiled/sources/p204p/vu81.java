package p204p;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class vu81 {

    /* JADX INFO: renamed from: a */
    public final luk f244889a;

    /* JADX INFO: renamed from: b */
    public final luk f244890b;

    /* JADX INFO: renamed from: c */
    public final xre f244891c;

    /* JADX INFO: renamed from: d */
    public final ConcurrentHashMap f244892d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e */
    public final ConcurrentHashMap f244893e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: f */
    public final hb11 f244894f;

    /* JADX INFO: renamed from: g */
    public final hb11 f244895g;

    /* JADX INFO: renamed from: h */
    public volatile e69 f244896h;

    public vu81(luk lukVar, luk lukVar2, gcu0 gcu0Var, nn3 nn3Var, xre xreVar, boolean z) {
        this.f244889a = lukVar;
        this.f244890b = lukVar2;
        this.f244891c = xreVar;
        c9k c9kVarM56661c = kk40.m56661c(cct.m32296A(lukVar, new uuk("OkHttpTrafficMonitorInterceptor")).mo26608y(njg1.m64613f()));
        this.f244894f = j0g1.m52092t(0, 64, 0, 4);
        this.f244895g = j0g1.m52091s(0, 1024, 2);
        this.f244896h = e69.f56590c;
        fbk fbkVar = null;
        wxf1.m89255l(c9kVarM56661c, b0g1.m27776L(mvl0.m62953p(gcu0Var.mo44322d()), new cv0(this, nn3Var, fbkVar, 14)));
        if (z) {
            x0h1.m89578u(c9kVarM56661c, null, 0, new wm81(this, fbkVar, 2), 3);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m86413a(hu81 hu81Var, gh00 gh00Var) {
        this.f244892d.computeIfPresent(hu81Var, new su81(gh00Var, this, hu81Var));
    }

    /* JADX INFO: renamed from: b */
    public final void m86414b(hu81 hu81Var, gh00 gh00Var) {
        this.f244892d.computeIfPresent(hu81Var, new u6i0((gh00) new uu81(0, gh00Var)));
    }
}
