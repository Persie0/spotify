package p204p;

import android.app.Activity;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes6.dex */
public final class ege0 implements r4m0 {

    /* JADX INFO: renamed from: a */
    public final pkh f59325a;

    /* JADX INFO: renamed from: b */
    public final age0 f59326b;

    /* JADX INFO: renamed from: c */
    public final z9j0 f59327c;

    /* JADX INFO: renamed from: d */
    public final v1e f59328d;

    /* JADX INFO: renamed from: e */
    public final Activity f59329e;

    /* JADX INFO: renamed from: f */
    public final n6q f59330f;

    /* JADX INFO: renamed from: g */
    public final oge0 f59331g;

    /* JADX INFO: renamed from: h */
    public final pfm0 f59332h;

    public ege0(pkh pkhVar, age0 age0Var, z9j0 z9j0Var, v1e v1eVar, hge0 hge0Var, Activity activity, n6q n6qVar, oge0 oge0Var) {
        this.f59325a = pkhVar;
        this.f59326b = age0Var;
        this.f59327c = z9j0Var;
        this.f59328d = v1eVar;
        this.f59329e = activity;
        this.f59330f = n6qVar;
        this.f59331g = oge0Var;
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        cbm0 cbm0VarM90662N1 = xgg1.m90662N1("PODCAST_SHOW_MEMBERSHIPUPSELL", "podcast/show/membershipupsell", 1446, "podcast");
        Parcelable.Creator<voc1> creator = voc1.CREATOR;
        this.f59332h = new pfm0(new qfm0[]{new q040(cbm0VarM90662N1, new voc1(s571.m77250i(hge0Var.f91144a, ":membershipupsell")), null), new fda(null, bda.f26062b, null, 0, null, n6qVar, false, false, true, 1757)}, false);
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: a */
    public final pfm0 mo24326a() {
        return this.f59332h;
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: b */
    public final u6m0 mo24327b() {
        return this.f59325a.m70217a(sw41.m79513e(this.f59326b), new fyf(new x7e0(this, 2), true, 1506608565), new hlh(null, null, null, false, 63));
    }
}
