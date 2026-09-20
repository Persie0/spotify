package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class sc4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f207644a;

    /* JADX INFO: renamed from: b */
    public final boolean f207645b;

    /* JADX INFO: renamed from: c */
    public final boolean f207646c;

    /* JADX INFO: renamed from: d */
    public final bji f207647d;

    /* JADX INFO: renamed from: e */
    public final wg61 f207648e;

    public sc4(boolean z, boolean z2, boolean z3, bji bjiVar) {
        this.f207644a = z;
        this.f207645b = z2;
        this.f207646c = z3;
        this.f207647d = bjiVar;
        this.f207648e = new wg61(new sb4(this, 22));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m77762a() {
        sc4 sc4Var = (sc4) this.f207648e.getValue();
        return sc4Var != null ? sc4Var.m77762a() : this.f207644a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m77763b() {
        sc4 sc4Var = (sc4) this.f207648e.getValue();
        return sc4Var != null ? sc4Var.m77763b() : this.f207645b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m77764c() {
        sc4 sc4Var = (sc4) this.f207648e.getValue();
        return sc4Var != null ? sc4Var.m77764c() : this.f207646c;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_gabito_error_logging", "android-libs-podcast-ads", m77762a()), new k8a("enable_mock_endpoint", "android-libs-podcast-ads", m77763b()), new k8a("npb_cta_button_shown", "android-libs-podcast-ads", m77764c()));
    }

    public sc4(bji bjiVar) {
        this(false, false, true, bjiVar);
    }
}
