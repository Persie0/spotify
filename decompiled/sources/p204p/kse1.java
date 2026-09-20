package p204p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes2.dex */
public final class kse1 implements r4m0 {

    /* JADX INFO: renamed from: a */
    public final jpp f125939a;

    /* JADX INFO: renamed from: b */
    public final sdo f125940b;

    /* JADX INFO: renamed from: c */
    public final hkh f125941c;

    /* JADX INFO: renamed from: d */
    public final C2483v5 f125942d;

    /* JADX INFO: renamed from: e */
    public final pfm0 f125943e;

    static {
        pfm0 pfm0Var = pfm0.f177111c;
    }

    public kse1(n6q n6qVar, jpp jppVar, sdo sdoVar, hkh hkhVar, C2483v5 c2483v5) {
        this.f125939a = jppVar;
        this.f125940b = sdoVar;
        this.f125941c = hkhVar;
        this.f125942d = c2483v5;
        e6m0 e6m0Var = new e6m0(true);
        fda fdaVar = new fda(null, bda.f26062b, null, 1, null, n6qVar, false, false, true, 1749);
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        this.f125943e = new pfm0(new qfm0[]{e6m0Var, fdaVar, new q040(xgg1.m90820j6(), new voc1("spotify:collection:tags"), null), new sw91(14, true, false, false)}, false);
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: a */
    public final pfm0 mo24326a() {
        return this.f125943e;
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: b */
    public final u6m0 mo24327b() {
        return this.f125941c.m47840a(tky.m81027c(new v4a0[0], new s481(this, null, 13)), rkk.m75763o(new qxa1(this, 22), true, 1239935866), new u5a0(new jse1(this), zme1.f284261c, oqq0.f168358Z0), new hlh(null, null, null, false, 63));
    }
}
