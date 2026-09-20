package p204p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes2.dex */
public final class jkd1 implements r4m0 {

    /* JADX INFO: renamed from: a */
    public final doh f113287a;

    /* JADX INFO: renamed from: b */
    public final i4t0 f113288b;

    /* JADX INFO: renamed from: c */
    public final pfm0 f113289c;

    public jkd1(doh dohVar, zao zaoVar, n6q n6qVar) {
        this.f113287a = dohVar;
        this.f113288b = zaoVar;
        pw71 pw71Var = new pw71(new sl51(""));
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        this.f113289c = new pfm0(new qfm0[]{pw71Var, new q040(xgg1.m90721V4(), xoc1.f264165p6, null), new fda(null, bda.f26062b, null, 0, null, n6qVar, true, true, false, 1821), new e6m0(true), new sw91(14, true, false, false)}, false);
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: a */
    public final pfm0 mo24326a() {
        return this.f113289c;
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: b */
    public final u6m0 mo24327b() {
        return this.f113287a.m36532a(rkk.m75763o(new c6c1(this, 14), true, -752179705));
    }
}
