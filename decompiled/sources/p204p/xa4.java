package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class xa4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f259548a;

    /* JADX INFO: renamed from: b */
    public final boolean f259549b;

    /* JADX INFO: renamed from: c */
    public final boolean f259550c;

    /* JADX INFO: renamed from: d */
    public final boolean f259551d;

    /* JADX INFO: renamed from: e */
    public final boolean f259552e;

    /* JADX INFO: renamed from: f */
    public final bji f259553f;

    /* JADX INFO: renamed from: g */
    public final wg61 f259554g = new wg61(new ga4(this, 13));

    public xa4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, bji bjiVar) {
        this.f259548a = z;
        this.f259549b = z2;
        this.f259550c = z3;
        this.f259551d = z4;
        this.f259552e = z5;
        this.f259553f = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m90274a() {
        xa4 xa4Var = (xa4) this.f259554g.getValue();
        return xa4Var != null ? xa4Var.m90274a() : this.f259548a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m90275b() {
        xa4 xa4Var = (xa4) this.f259554g.getValue();
        return xa4Var != null ? xa4Var.m90275b() : this.f259549b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m90276c() {
        xa4 xa4Var = (xa4) this.f259554g.getValue();
        return xa4Var != null ? xa4Var.m90276c() : this.f259550c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m90277d() {
        xa4 xa4Var = (xa4) this.f259554g.getValue();
        return xa4Var != null ? xa4Var.m90277d() : this.f259551d;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m90278e() {
        xa4 xa4Var = (xa4) this.f259554g.getValue();
        return xa4Var != null ? xa4Var.m90278e() : this.f259552e;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("auto_service_reconnect", "android-libs-checkout-flags", m90274a()), new k8a("gpb_enabled", "android-libs-checkout-flags", m90275b()), new k8a("native_choice_screen", "android-libs-checkout-flags", m90276c()), new k8a("native_uc_choice_screen", "android-libs-checkout-flags", m90277d()), new k8a("samsung_disable_gpb", "android-libs-checkout-flags", m90278e()));
    }
}
