package p204p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes10.dex */
public final class t9v implements r4m0 {

    /* JADX INFO: renamed from: a */
    public final qav f218360a;

    /* JADX INFO: renamed from: b */
    public final doh f218361b;

    /* JADX INFO: renamed from: c */
    public final nvm f218362c;

    /* JADX INFO: renamed from: d */
    public final dcm0 f218363d;

    /* JADX INFO: renamed from: e */
    public final pfm0 f218364e;

    public t9v(qav qavVar, doh dohVar, nvm nvmVar, dcm0 dcm0Var, qxr qxrVar, x451 x451Var) {
        this.f218360a = qavVar;
        this.f218361b = dohVar;
        this.f218362c = nvmVar;
        this.f218363d = dcm0Var;
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        this.f218364e = new pfm0(new qfm0[]{new q040(xgg1.m90662N1("ENHANCED_SHARE_CARD", "enhanced-share-card", 499, "enhanced-share-card"), xoc1.f264212v5, null), new ka70(14, h6f.m46715L(qxrVar, x451Var), null), new tkm0(qkm0.f189619a, 0, 2)}, false);
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: a */
    public final pfm0 mo24326a() {
        return this.f218364e;
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: b */
    public final u6m0 mo24327b() {
        return this.f218361b.m36532a(new fyf(new adu(this, 4), true, 109380793));
    }
}
