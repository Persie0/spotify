package p204p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes7.dex */
public final class txm0 implements r4m0 {

    /* JADX INFO: renamed from: a */
    public final doh f224726a;

    /* JADX INFO: renamed from: b */
    public final pfm0 f224727b;

    static {
        pfm0 pfm0Var = pfm0.f177111c;
    }

    public txm0(doh dohVar) {
        this.f224726a = dohVar;
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        this.f224727b = new pfm0(new qfm0[]{new q040(xgg1.m90662N1("MANAGED_ACCOUNT_LINKING_SHARE_PARENTAL_CONSENT", "managed-account-linking/share-parental-consent", 979, "managed-account-linking"), new voc1("spotify:managed-account-linking:share-parental-consent"), null), new fda(null, bda.f26062b, null, 0, null, null, false, false, true, 1789)}, false);
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: a */
    public final pfm0 mo24326a() {
        return this.f224727b;
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: b */
    public final u6m0 mo24327b() {
        return this.f224726a.m36532a(hyg.f96582a);
    }
}
