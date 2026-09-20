package p204p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes2.dex */
public final class gxa1 implements r4m0 {

    /* JADX INFO: renamed from: a */
    public final hkh f85240a;

    /* JADX INFO: renamed from: b */
    public final yb81 f85241b;

    /* JADX INFO: renamed from: c */
    public final vwa1 f85242c;

    /* JADX INFO: renamed from: d */
    public final hxa1 f85243d;

    /* JADX INFO: renamed from: e */
    public final h9p f85244e;

    /* JADX INFO: renamed from: f */
    public final pfm0 f85245f;

    public gxa1(hkh hkhVar, yb81 yb81Var, vwa1 vwa1Var, hxa1 hxa1Var, h9p h9pVar, int i, nlh0 nlh0Var, slh0 slh0Var) {
        this.f85240a = hkhVar;
        this.f85241b = yb81Var;
        this.f85242c = vwa1Var;
        this.f85243d = hxa1Var;
        this.f85244e = h9pVar;
        pw71 pw71Var = new pw71(new p1x0(i));
        e6m0 e6m0Var = new e6m0(true);
        sw91 sw91Var = new sw91(14, true, false, false);
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        this.f85245f = new pfm0(new qfm0[]{pw71Var, e6m0Var, sw91Var, new q040(xgg1.m90586C2(), xoc1.f264187s4.m83614b("spotify:listeningstatsdetails:" + nlh0Var.m64740a() + ":" + hxa1Var.m48982c().mo33392g()), new afm0(slh0Var))}, false);
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: a */
    public final pfm0 mo24326a() {
        return this.f85245f;
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: b */
    public final u6m0 mo24327b() {
        hxa1 hxa1Var = this.f85243d;
        return this.f85240a.m47840a(tky.m81026b(this.f85244e.m46887m(hxa1Var.m48982c(), hxa1Var.m48983g()).map(vnq0.f243206V0).toObservable()), rkk.m75763o(new exa1(this, 0), true, -1370467003), new u5a0(new fxa1(this), koa1.f124738d, wnq0.f253245V0, bna1.f28769c1), new hlh(null, null, rkk.m75763o(new exa1(this, 1), true, -953260634), false, 59));
    }
}
