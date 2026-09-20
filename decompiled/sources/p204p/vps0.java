package p204p;

import android.content.res.Resources;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes2.dex */
public final class vps0 implements r4m0 {

    /* JADX INFO: renamed from: a */
    public final hkh f243771a;

    /* JADX INFO: renamed from: b */
    public final sb6 f243772b;

    /* JADX INFO: renamed from: c */
    public final gqs0 f243773c;

    /* JADX INFO: renamed from: d */
    public final agc f243774d;

    /* JADX INFO: renamed from: e */
    public final tk9 f243775e;

    /* JADX INFO: renamed from: f */
    public final tfm0 f243776f;

    /* JADX INFO: renamed from: g */
    public final q831 f243777g;

    /* JADX INFO: renamed from: h */
    public final vb6 f243778h;

    /* JADX INFO: renamed from: i */
    public final pfm0 f243779i;

    public vps0(Resources resources, hkh hkhVar, sb6 sb6Var, gqs0 gqs0Var, agc agcVar, tk9 tk9Var, tfm0 tfm0Var, q831 q831Var, vb6 vb6Var, ka70 ka70Var) {
        this.f243771a = hkhVar;
        this.f243772b = sb6Var;
        this.f243773c = gqs0Var;
        this.f243774d = agcVar;
        this.f243775e = tk9Var;
        this.f243776f = tfm0Var;
        this.f243777g = q831Var;
        this.f243778h = vb6Var;
        e6m0 e6m0Var = new e6m0(true);
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        this.f243779i = new pfm0(new qfm0[]{e6m0Var, new q040(xgg1.m90670O2(), xoc1.f264002U5, null), new fda(Integer.valueOf((int) (resources.getDisplayMetrics().heightPixels * 0.5f)), bda.f26061a, null, 2, null, null, false, false, false, 2036), new sw91(14, true, false, false), ka70Var}, false);
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: a */
    public final pfm0 mo24326a() {
        return this.f243779i;
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: b */
    public final u6m0 mo24327b() {
        s4a0 s4a0VarM79513e = sw41.m79513e(this.f243772b);
        u5a0 u5a0Var = new u5a0(new tps0(this), b5r0.f23663V0, oqq0.f168363d);
        return this.f243771a.m47840a(s4a0VarM79513e, rkk.m75763o(new h3n0(this, 28), true, -1319642980), u5a0Var, new hlh(null, null, null, false, 63));
    }
}
