package p204p;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes6.dex */
public final class qfe0 implements r4m0 {

    /* JADX INFO: renamed from: a */
    public final pkh f188184a;

    /* JADX INFO: renamed from: b */
    public final ofe0 f188185b;

    /* JADX INFO: renamed from: c */
    public final z9j0 f188186c;

    /* JADX INFO: renamed from: d */
    public final li80 f188187d;

    /* JADX INFO: renamed from: e */
    public final nge0 f188188e;

    /* JADX INFO: renamed from: f */
    public final sdo f188189f;

    /* JADX INFO: renamed from: g */
    public final pfm0 f188190g;

    public qfe0(pkh pkhVar, ofe0 ofe0Var, z9j0 z9j0Var, tfe0 tfe0Var, li80 li80Var, nge0 nge0Var, sdo sdoVar) {
        this.f188184a = pkhVar;
        this.f188185b = ofe0Var;
        this.f188186c = z9j0Var;
        this.f188187d = li80Var;
        this.f188188e = nge0Var;
        this.f188189f = sdoVar;
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        cbm0 cbm0VarM90662N1 = xgg1.m90662N1("PODCAST_SHOW_MEMBERSHIPSUCCESSMODAL", "podcast/show/membershipsuccessmodal", 1445, "podcast");
        Parcelable.Creator<voc1> creator = voc1.CREATOR;
        String str = tfe0Var.f219933a;
        this.f188190g = new pfm0(new qfm0[]{new q040(cbm0VarM90662N1, new voc1(s571.m77250i(str, ":membershipsuccess")), null)}, false);
        if (wl51.m88460J0(str)) {
            throw new IllegalArgumentException("Membership confirmation requires non-blank showUri");
        }
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: a */
    public final pfm0 mo24326a() {
        return this.f188190g;
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: b */
    public final u6m0 mo24327b() {
        return this.f188184a.m70217a(sw41.m79513e(this.f188185b), new fyf(new x7e0(this, 1), true, 73257415), new hlh(null, null, null, false, 63));
    }
}
