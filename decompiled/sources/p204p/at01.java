package p204p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes7.dex */
public final class at01 implements r4m0 {

    /* JADX INFO: renamed from: a */
    public final doh f19541a;

    /* JADX INFO: renamed from: b */
    public final pfm0 f19542b;

    static {
        pfm0 pfm0Var = pfm0.f177111c;
    }

    public at01(doh dohVar) {
        this.f19541a = dohVar;
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        this.f19542b = new pfm0(new qfm0[]{new q040(xgg1.m90662N1("MANAGED_ACCOUNT_LINKING_SHARE_INVITE_LINK", "managed-account-linking/share-invite-link", 978, "managed-account-linking"), new voc1("spotify:managed-account-linking:share-invite-link"), null), new fda(null, bda.f26062b, null, 0, null, null, false, false, true, 1789)}, false);
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: a */
    public final pfm0 mo24326a() {
        return this.f19542b;
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: b */
    public final u6m0 mo24327b() {
        return this.f19541a.m36532a(e8h.f57201a);
    }
}
