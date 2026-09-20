package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class c04 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f32673a;

    /* JADX INFO: renamed from: b */
    public final boolean f32674b;

    /* JADX INFO: renamed from: c */
    public final boolean f32675c;

    /* JADX INFO: renamed from: d */
    public final wy91 f32676d;

    /* JADX INFO: renamed from: e */
    public final wg61 f32677e = new wg61(new ey3(this, 12));

    public c04(boolean z, boolean z2, boolean z3, saw0 saw0Var) {
        this.f32673a = z;
        this.f32674b = z2;
        this.f32675c = z3;
        this.f32676d = saw0Var;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m31071a() {
        c04 c04Var = (c04) this.f32677e.getValue();
        return c04Var != null ? c04Var.m31071a() : this.f32673a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m31072b() {
        c04 c04Var = (c04) this.f32677e.getValue();
        return c04Var != null ? c04Var.m31072b() : this.f32674b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m31073c() {
        c04 c04Var = (c04) this.f32677e.getValue();
        return c04Var != null ? c04Var.m31073c() : this.f32675c;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("net_capabilities_oem_paid_support_enabled", "android-connectivity-connectiontypeflags", m31071a()), new k8a("should_use_single_thread", "android-connectivity-connectiontypeflags", m31072b()), new k8a("unauth_net_capabilities_validated_disregarded_enabled", "android-connectivity-connectiontypeflags", m31073c()));
    }
}
