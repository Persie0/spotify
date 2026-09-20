package p204p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes7.dex */
public final class kn50 implements r4m0 {

    /* JADX INFO: renamed from: a */
    public final doh f124313a;

    /* JADX INFO: renamed from: b */
    public final pfm0 f124314b;

    static {
        pfm0 pfm0Var = pfm0.f177111c;
    }

    public kn50(doh dohVar) {
        this.f124313a = dohVar;
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        this.f124314b = new pfm0(new qfm0[]{new q040(xgg1.m90662N1("MANAGED_ACCOUNT_LINKING_INVITE_OPTIONS", "managed-account-linking/invite-options", 974, "managed-account-linking"), new voc1("spotify:managed-account-linking:invite-options"), null), new fda(null, bda.f26062b, null, 0, null, null, false, false, true, 1789)}, false);
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: a */
    public final pfm0 mo24326a() {
        return this.f124314b;
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: b */
    public final u6m0 mo24327b() {
        return this.f124313a.m36532a(tmg.f221723a);
    }
}
