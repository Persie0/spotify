package p204p;

import com.comscore.util.log.LogLevel;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h04 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final int f86123a;

    /* JADX INFO: renamed from: b */
    public final boolean f86124b;

    /* JADX INFO: renamed from: c */
    public final boolean f86125c;

    /* JADX INFO: renamed from: d */
    public final boolean f86126d;

    /* JADX INFO: renamed from: e */
    public final boolean f86127e;

    /* JADX INFO: renamed from: f */
    public final boolean f86128f;

    /* JADX INFO: renamed from: g */
    public final boolean f86129g;

    /* JADX INFO: renamed from: h */
    public final int f86130h;

    /* JADX INFO: renamed from: i */
    public final int f86131i;

    /* JADX INFO: renamed from: j */
    public final int f86132j;

    /* JADX INFO: renamed from: k */
    public final int f86133k;

    /* JADX INFO: renamed from: l */
    public final int f86134l;

    /* JADX INFO: renamed from: m */
    public final int f86135m;

    /* JADX INFO: renamed from: n */
    public final int f86136n;

    /* JADX INFO: renamed from: o */
    public final boolean f86137o;

    /* JADX INFO: renamed from: p */
    public final int f86138p;

    /* JADX INFO: renamed from: q */
    public final boolean f86139q;

    /* JADX INFO: renamed from: r */
    public final boolean f86140r;

    /* JADX INFO: renamed from: s */
    public final bji f86141s;

    /* JADX INFO: renamed from: t */
    public final wg61 f86142t = new wg61(new ey3(this, 15));

    public h04(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z7, int i9, boolean z8, boolean z9, bji bjiVar) {
        this.f86123a = i;
        this.f86124b = z;
        this.f86125c = z2;
        this.f86126d = z3;
        this.f86127e = z4;
        this.f86128f = z5;
        this.f86129g = z6;
        this.f86130h = i2;
        this.f86131i = i3;
        this.f86132j = i4;
        this.f86133k = i5;
        this.f86134l = i6;
        this.f86135m = i7;
        this.f86136n = i8;
        this.f86137o = z7;
        this.f86138p = i9;
        this.f86139q = z8;
        this.f86140r = z9;
        this.f86141s = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final int m46236a() {
        h04 h04VarM46237b = m46237b();
        return h04VarM46237b != null ? h04VarM46237b.m46236a() : this.f86123a;
    }

    /* JADX INFO: renamed from: b */
    public final h04 m46237b() {
        return (h04) this.f86142t.getValue();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m46238c() {
        h04 h04VarM46237b = m46237b();
        return h04VarM46237b != null ? h04VarM46237b.m46238c() : this.f86124b;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m46239d() {
        h04 h04VarM46237b = m46237b();
        return h04VarM46237b != null ? h04VarM46237b.m46239d() : this.f86125c;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m46240e() {
        h04 h04VarM46237b = m46237b();
        return h04VarM46237b != null ? h04VarM46237b.m46240e() : this.f86126d;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m46241f() {
        h04 h04VarM46237b = m46237b();
        return h04VarM46237b != null ? h04VarM46237b.m46241f() : this.f86127e;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m46242g() {
        h04 h04VarM46237b = m46237b();
        return h04VarM46237b != null ? h04VarM46237b.m46242g() : this.f86128f;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m46243h() {
        h04 h04VarM46237b = m46237b();
        return h04VarM46237b != null ? h04VarM46237b.m46243h() : this.f86129g;
    }

    /* JADX INFO: renamed from: i */
    public final int m46244i() {
        h04 h04VarM46237b = m46237b();
        return h04VarM46237b != null ? h04VarM46237b.m46244i() : this.f86130h;
    }

    /* JADX INFO: renamed from: j */
    public final int m46245j() {
        h04 h04VarM46237b = m46237b();
        return h04VarM46237b != null ? h04VarM46237b.m46245j() : this.f86131i;
    }

    /* JADX INFO: renamed from: k */
    public final int m46246k() {
        h04 h04VarM46237b = m46237b();
        return h04VarM46237b != null ? h04VarM46237b.m46246k() : this.f86132j;
    }

    /* JADX INFO: renamed from: l */
    public final int m46247l() {
        h04 h04VarM46237b = m46237b();
        return h04VarM46237b != null ? h04VarM46237b.m46247l() : this.f86133k;
    }

    /* JADX INFO: renamed from: m */
    public final int m46248m() {
        h04 h04VarM46237b = m46237b();
        return h04VarM46237b != null ? h04VarM46237b.m46248m() : this.f86134l;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("client_token_failure_cache_millis", "android-connectivity", m46236a(), 0, LogLevel.NONE), new k8a("decorator_zero_hop", "android-connectivity", m46238c()), new k8a("disable_broken_cache_detector", "android-connectivity", m46239d()), new k8a("disable_decorator_scheduling", "android-connectivity", m46240e()), new k8a("disable_webgate_token_cache", "android-connectivity", m46241f()), new k8a("evict_connection_pools_on_reachability_change_enabled", "android-connectivity", m46242g()), new k8a("evict_connection_pools_on_trim_enabled", "android-connectivity", m46243h()), new k8a("plain_instance_call_timeout_millis", "android-connectivity", m46244i(), 0, 600000), new k8a("plain_instance_connect_timeout_millis", "android-connectivity", m46245j(), 1000, 600000), new k8a("plain_instance_connection_pool_keep_alive_duration_minutes", "android-connectivity", m46246k(), 1, 1440), new k8a("plain_instance_connection_pool_max_idle_connections", "android-connectivity", m46247l(), 1, 1000), new k8a("plain_instance_max_requests", "android-connectivity", m46248m(), 1, 1000), new k8a("plain_instance_max_requests_per_host", "android-connectivity", m46249n(), 1, 1000), new k8a("plain_instance_read_timeout_millis", "android-connectivity", m46250o(), 1000, 600000), new k8a("plain_instance_retry_on_connection_failure", "android-connectivity", m46251p()), new k8a("plain_instance_write_timeout_millis", "android-connectivity", m46252q(), 1000, 600000), new k8a("pre_warm_connections", "android-connectivity", m46253r()), new k8a("single_flight_token_provider_enabled", "android-connectivity", m46254s()));
    }

    /* JADX INFO: renamed from: n */
    public final int m46249n() {
        h04 h04VarM46237b = m46237b();
        return h04VarM46237b != null ? h04VarM46237b.m46249n() : this.f86135m;
    }

    /* JADX INFO: renamed from: o */
    public final int m46250o() {
        h04 h04VarM46237b = m46237b();
        return h04VarM46237b != null ? h04VarM46237b.m46250o() : this.f86136n;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m46251p() {
        h04 h04VarM46237b = m46237b();
        return h04VarM46237b != null ? h04VarM46237b.m46251p() : this.f86137o;
    }

    /* JADX INFO: renamed from: q */
    public final int m46252q() {
        h04 h04VarM46237b = m46237b();
        return h04VarM46237b != null ? h04VarM46237b.m46252q() : this.f86138p;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m46253r() {
        h04 h04VarM46237b = m46237b();
        return h04VarM46237b != null ? h04VarM46237b.m46253r() : this.f86139q;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m46254s() {
        h04 h04VarM46237b = m46237b();
        return h04VarM46237b != null ? h04VarM46237b.m46254s() : this.f86140r;
    }
}
