package p204p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes2.dex */
public final class d4c0 implements r4m0 {

    /* JADX INFO: renamed from: a */
    public final y670 f45133a;

    /* JADX INFO: renamed from: b */
    public final hkh f45134b;

    /* JADX INFO: renamed from: c */
    public final a4c0 f45135c;

    /* JADX INFO: renamed from: d */
    public final g4c0 f45136d;

    /* JADX INFO: renamed from: e */
    public final ha80 f45137e;

    /* JADX INFO: renamed from: f */
    public final pfm0 f45138f;

    public d4c0(y670 y670Var, hkh hkhVar, a4c0 a4c0Var, g4c0 g4c0Var, ha80 ha80Var) {
        this.f45133a = y670Var;
        this.f45134b = hkhVar;
        this.f45135c = a4c0Var;
        this.f45136d = g4c0Var;
        this.f45137e = ha80Var;
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        this.f45138f = new pfm0(new qfm0[]{new q040(xgg1.m90918y3(), ptl.m70998s("spotify:internal:managed-account-allowlisting-requests:child:", g4c0Var.m43526c(), xoc1.f263972Q5), null), new e6m0(true)}, false);
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: a */
    public final pfm0 mo24326a() {
        return this.f45138f;
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: b */
    public final u6m0 mo24327b() {
        return this.f45134b.m47840a(tky.m81027c(new v4a0[0], new bya0(this, null, 1)), rkk.m75763o(new yhb0(this, 5), true, 2019047104), new u5a0(new c4c0(this), new jtb0(this, 10), new ly5(16), kxb0.f127407a1), new hlh(null, null, null, false, 63));
    }
}
