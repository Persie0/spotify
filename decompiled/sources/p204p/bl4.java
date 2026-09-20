package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class bl4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final int f28076a;

    /* JADX INFO: renamed from: b */
    public final boolean f28077b;

    /* JADX INFO: renamed from: c */
    public final boolean f28078c;

    /* JADX INFO: renamed from: d */
    public final boolean f28079d;

    /* JADX INFO: renamed from: e */
    public final boolean f28080e;

    /* JADX INFO: renamed from: f */
    public final boolean f28081f;

    /* JADX INFO: renamed from: g */
    public final int f28082g;

    /* JADX INFO: renamed from: h */
    public final int f28083h;

    /* JADX INFO: renamed from: i */
    public final boolean f28084i;

    /* JADX INFO: renamed from: j */
    public final boolean f28085j;

    /* JADX INFO: renamed from: k */
    public final boolean f28086k;

    /* JADX INFO: renamed from: l */
    public final fnk0 f28087l;

    /* JADX INFO: renamed from: m */
    public final bji f28088m;

    /* JADX INFO: renamed from: n */
    public final wg61 f28089n = new wg61(new f30(this, 22));

    /* JADX INFO: renamed from: o */
    public final wg61 f28090o = new wg61(new jk4(this, 2));

    public bl4(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i2, int i3, boolean z6, boolean z7, boolean z8, fnk0 fnk0Var, bji bjiVar) {
        this.f28076a = i;
        this.f28077b = z;
        this.f28078c = z2;
        this.f28079d = z3;
        this.f28080e = z4;
        this.f28081f = z5;
        this.f28082g = i2;
        this.f28083h = i3;
        this.f28084i = z6;
        this.f28085j = z7;
        this.f28086k = z8;
        this.f28087l = fnk0Var;
        this.f28088m = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final int m29727a() {
        bl4 bl4VarM29729c = m29729c();
        return bl4VarM29729c != null ? bl4VarM29729c.m29727a() : this.f28076a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m29728b() {
        bl4 bl4VarM29729c = m29729c();
        return bl4VarM29729c != null ? bl4VarM29729c.m29728b() : this.f28077b;
    }

    /* JADX INFO: renamed from: c */
    public final bl4 m29729c() {
        return (bl4) this.f28090o.getValue();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m29730d() {
        bl4 bl4VarM29729c = m29729c();
        return bl4VarM29729c != null ? bl4VarM29729c.m29730d() : this.f28078c;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m29731e() {
        bl4 bl4VarM29729c = m29729c();
        return bl4VarM29729c != null ? bl4VarM29729c.m29731e() : this.f28079d;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m29732f() {
        bl4 bl4VarM29729c = m29729c();
        return bl4VarM29729c != null ? bl4VarM29729c.m29732f() : this.f28080e;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m29733g() {
        bl4 bl4VarM29729c = m29729c();
        return bl4VarM29729c != null ? bl4VarM29729c.m29733g() : this.f28081f;
    }

    /* JADX INFO: renamed from: h */
    public final int m29734h() {
        bl4 bl4VarM29729c = m29729c();
        return bl4VarM29729c != null ? bl4VarM29729c.m29734h() : this.f28082g;
    }

    /* JADX INFO: renamed from: i */
    public final int m29735i() {
        bl4 bl4VarM29729c = m29729c();
        return bl4VarM29729c != null ? bl4VarM29729c.m29735i() : this.f28083h;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m29736j() {
        bl4 bl4VarM29729c = m29729c();
        return bl4VarM29729c != null ? bl4VarM29729c.m29736j() : this.f28084i;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m29737k() {
        bl4 bl4VarM29729c = m29729c();
        return bl4VarM29729c != null ? bl4VarM29729c.m29737k() : this.f28085j;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m29738l() {
        bl4 bl4VarM29729c = m29729c();
        return bl4VarM29729c != null ? bl4VarM29729c.m29738l() : this.f28086k;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("ads_fetch_oops_sampling_bps", "android-perf-tracking", m29727a(), 0, 10000), new k8a("cold_startup_time_guardrail_metric", "android-perf-tracking", m29728b()), new k8a("device_metrics_enabled", "android-perf-tracking", m29730d()), new k8a("jank_coordinator_enabled", "android-perf-tracking", m29731e()), new k8a("observability_platform_enabled", "android-perf-tracking", m29732f()), new k8a("page_load_time_guardrail_metric", "android-perf-tracking", m29733g()), new k8a("page_visit_baseline_oops_sampling_bps", "android-perf-tracking", m29734h(), 0, 10000), new k8a("page_visit_detailed_oops_sampling_bps", "android-perf-tracking", m29735i(), 0, 10000), new k8a("seqlock_buffer_enabled", "android-perf-tracking", m29736j()), new k8a("should_log_cold_startup_subdurations", "android-perf-tracking", m29737k()), new k8a("should_send_time_measurements", "android-perf-tracking", m29738l()));
    }
}
