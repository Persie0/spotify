package p204p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes7.dex */
public final class xz70 implements r4m0 {

    /* JADX INFO: renamed from: a */
    public final doh f267535a;

    /* JADX INFO: renamed from: b */
    public final v0y f267536b;

    /* JADX INFO: renamed from: c */
    public final pfm0 f267537c;

    public xz70(doh dohVar, v0y v0yVar) {
        this.f267535a = dohVar;
        this.f267536b = v0yVar;
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        this.f267537c = new pfm0(new qfm0[]{new q040(xgg1.m90662N1("MANAGED_ACCOUNT_LINKING_LEARN_MORE", "managed-account-linking/learn-more", 976, "managed-account-linking"), new voc1("spotify:managed-account-linking:learn-more"), null), new fda(null, bda.f26062b, null, 0, null, null, false, false, true, 1789)}, false);
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: a */
    public final pfm0 mo24326a() {
        return this.f267537c;
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: b */
    public final u6m0 mo24327b() {
        return this.f267535a.m36532a(new fyf(new wa60(this, 22), true, -6969184));
    }
}
