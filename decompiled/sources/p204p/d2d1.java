package p204p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes2.dex */
public final class d2d1 implements r4m0 {

    /* JADX INFO: renamed from: a */
    public final f0d1 f44540a;

    /* JADX INFO: renamed from: b */
    public final l1d1 f44541b;

    /* JADX INFO: renamed from: c */
    public final hkh f44542c;

    /* JADX INFO: renamed from: d */
    public final h1d1 f44543d;

    /* JADX INFO: renamed from: e */
    public final pfm0 f44544e;

    public d2d1(f0d1 f0d1Var, l1d1 l1d1Var, hkh hkhVar, h1d1 h1d1Var) {
        this.f44540a = f0d1Var;
        this.f44541b = l1d1Var;
        this.f44542c = hkhVar;
        this.f44543d = h1d1Var;
        zox zoxVar = new zox();
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        this.f44544e = new pfm0(new qfm0[]{zoxVar, new q040(xgg1.m90757a6(), xoc1.f263867D4.m83614b(l1d1Var.getUri()), null), new e6m0(true)}, false);
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: a */
    public final pfm0 mo24326a() {
        return this.f44544e;
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: b */
    public final u6m0 mo24327b() {
        return this.f44542c.m47840a(tky.m81027c(new v4a0[0], new s481(this, null, 9)), rkk.m75763o(new qxa1(this, 17), true, -1075847494), new u5a0(new z1d1(this), nub1.f158572Z0, new b2d1(), hhc1.f91337U0), new hlh(null, null, null, false, 63));
    }
}
