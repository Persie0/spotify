package p204p;

import com.spotify.music.R;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes7.dex */
public final class pn50 implements r4m0 {

    /* JADX INFO: renamed from: a */
    public final z9j0 f179312a;

    /* JADX INFO: renamed from: b */
    public final doh f179313b;

    /* JADX INFO: renamed from: c */
    public final pfm0 f179314c;

    public pn50(doh dohVar, z9j0 z9j0Var) {
        this.f179312a = z9j0Var;
        this.f179313b = dohVar;
        pw71 pw71Var = new pw71(new p1x0(R.string.invite_parent_page_title));
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        this.f179314c = new pfm0(new qfm0[]{pw71Var, new q040(xgg1.m90662N1("MANAGED_ACCOUNT_LINKING_INVITE_PARENT", "managed-account-linking/invite-parent", 975, "managed-account-linking"), new voc1("spotify:managed-account-linking:invite-parent"), null), new tkm0(qkm0.f189619a, 0, 2)}, false);
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: a */
    public final pfm0 mo24326a() {
        return this.f179314c;
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: b */
    public final u6m0 mo24327b() {
        return this.f179313b.m36532a(new fyf(new a720(this, 24), true, 907146796));
    }
}
