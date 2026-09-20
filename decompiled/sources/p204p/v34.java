package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class v34 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f236769a;

    /* JADX INFO: renamed from: b */
    public final boolean f236770b;

    /* JADX INFO: renamed from: c */
    public final int f236771c;

    /* JADX INFO: renamed from: d */
    public final boolean f236772d;

    /* JADX INFO: renamed from: e */
    public final wy91 f236773e;

    /* JADX INFO: renamed from: f */
    public final wg61 f236774f = new wg61(new u14(this, 27));

    public v34(boolean z, boolean z2, int i, boolean z3, wy91 wy91Var) {
        this.f236769a = z;
        this.f236770b = z2;
        this.f236771c = i;
        this.f236772d = z3;
        this.f236773e = wy91Var;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m84531a() {
        v34 v34Var = (v34) this.f236774f.getValue();
        return v34Var != null ? v34Var.m84531a() : this.f236769a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m84532b() {
        v34 v34Var = (v34) this.f236774f.getValue();
        return v34Var != null ? v34Var.m84532b() : this.f236770b;
    }

    /* JADX INFO: renamed from: c */
    public final int m84533c() {
        v34 v34Var = (v34) this.f236774f.getValue();
        return v34Var != null ? v34Var.m84533c() : this.f236771c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m84534d() {
        v34 v34Var = (v34) this.f236774f.getValue();
        return v34Var != null ? v34Var.m84534d() : this.f236772d;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("age_verification_enabled", "android-feature-agesignal", m84531a()), new k8a("authenticated_verification_enabled", "android-feature-agesignal", m84532b()), new k8a("signup_minimum_age", "android-feature-agesignal", m84533c(), 0, 100), new k8a("warmup_verification_enabled", "android-feature-agesignal", m84534d()));
    }
}
