package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class es4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final int f62273a;

    /* JADX INFO: renamed from: b */
    public final int f62274b;

    /* JADX INFO: renamed from: c */
    public final int f62275c;

    /* JADX INFO: renamed from: d */
    public final int f62276d;

    /* JADX INFO: renamed from: e */
    public final int f62277e;

    /* JADX INFO: renamed from: f */
    public final boolean f62278f;

    /* JADX INFO: renamed from: g */
    public final int f62279g;

    /* JADX INFO: renamed from: h */
    public final int f62280h;

    /* JADX INFO: renamed from: i */
    public final int f62281i;

    /* JADX INFO: renamed from: j */
    public final int f62282j;

    /* JADX INFO: renamed from: k */
    public final int f62283k;

    /* JADX INFO: renamed from: l */
    public final int f62284l;

    /* JADX INFO: renamed from: m */
    public final int f62285m;

    /* JADX INFO: renamed from: n */
    public final boolean f62286n;

    /* JADX INFO: renamed from: o */
    public final boolean f62287o;

    /* JADX INFO: renamed from: p */
    public final bji f62288p;

    /* JADX INFO: renamed from: q */
    public final wg61 f62289q = new wg61(new zr4(this, 3));

    public es4(int i, int i2, int i3, int i4, int i5, boolean z, int i6, int i7, int i8, int i9, int i10, int i11, int i12, boolean z2, boolean z3, bji bjiVar) {
        this.f62273a = i;
        this.f62274b = i2;
        this.f62275c = i3;
        this.f62276d = i4;
        this.f62277e = i5;
        this.f62278f = z;
        this.f62279g = i6;
        this.f62280h = i7;
        this.f62281i = i8;
        this.f62282j = i9;
        this.f62283k = i10;
        this.f62284l = i11;
        this.f62285m = i12;
        this.f62286n = z2;
        this.f62287o = z3;
        this.f62288p = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final int m39870a() {
        es4 es4VarM39876g = m39876g();
        return es4VarM39876g != null ? es4VarM39876g.m39870a() : this.f62273a;
    }

    /* JADX INFO: renamed from: b */
    public final int m39871b() {
        es4 es4VarM39876g = m39876g();
        return es4VarM39876g != null ? es4VarM39876g.m39871b() : this.f62274b;
    }

    /* JADX INFO: renamed from: c */
    public final int m39872c() {
        es4 es4VarM39876g = m39876g();
        return es4VarM39876g != null ? es4VarM39876g.m39872c() : this.f62275c;
    }

    /* JADX INFO: renamed from: d */
    public final int m39873d() {
        es4 es4VarM39876g = m39876g();
        return es4VarM39876g != null ? es4VarM39876g.m39873d() : this.f62276d;
    }

    /* JADX INFO: renamed from: e */
    public final int m39874e() {
        es4 es4VarM39876g = m39876g();
        return es4VarM39876g != null ? es4VarM39876g.m39874e() : this.f62277e;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m39875f() {
        es4 es4VarM39876g = m39876g();
        return es4VarM39876g != null ? es4VarM39876g.m39875f() : this.f62278f;
    }

    /* JADX INFO: renamed from: g */
    public final es4 m39876g() {
        return (es4) this.f62289q.getValue();
    }

    /* JADX INFO: renamed from: h */
    public final int m39877h() {
        es4 es4VarM39876g = m39876g();
        return es4VarM39876g != null ? es4VarM39876g.m39877h() : this.f62279g;
    }

    /* JADX INFO: renamed from: i */
    public final int m39878i() {
        es4 es4VarM39876g = m39876g();
        return es4VarM39876g != null ? es4VarM39876g.m39878i() : this.f62280h;
    }

    /* JADX INFO: renamed from: j */
    public final int m39879j() {
        es4 es4VarM39876g = m39876g();
        return es4VarM39876g != null ? es4VarM39876g.m39879j() : this.f62281i;
    }

    /* JADX INFO: renamed from: k */
    public final int m39880k() {
        es4 es4VarM39876g = m39876g();
        return es4VarM39876g != null ? es4VarM39876g.m39880k() : this.f62282j;
    }

    /* JADX INFO: renamed from: l */
    public final int m39881l() {
        es4 es4VarM39876g = m39876g();
        return es4VarM39876g != null ? es4VarM39876g.m39881l() : this.f62283k;
    }

    /* JADX INFO: renamed from: m */
    public final int m39882m() {
        es4 es4VarM39876g = m39876g();
        return es4VarM39876g != null ? es4VarM39876g.m39882m() : this.f62284l;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("connection_quality_max_concurrent_latency_bypass", "android-trafficapi-impl", m39870a(), 0, 1000000), new k8a("connection_quality_max_timer_error_ms", "android-trafficapi-impl", m39871b(), 0, 60000), new k8a("connection_quality_min_p90_sample_count", "android-trafficapi-impl", m39872c(), 0, 1000), new k8a("connection_quality_poor_latency_threshold_ms", "android-trafficapi-impl", m39873d(), 0, 60000), new k8a("connection_quality_poor_timeout_count", "android-trafficapi-impl", m39874e(), 0, 1000), new k8a("connection_quality_report_enabled", "android-trafficapi-impl", m39875f()), new k8a("debounce_good_to_poor_threshold", "android-trafficapi-impl", m39877h(), 0, 100), new k8a("debounce_poor_to_good_threshold", "android-trafficapi-impl", m39878i(), 0, 100), new k8a("debounce_unknown_to_good_threshold", "android-trafficapi-impl", m39879j(), 0, 100), new k8a("debounce_unknown_to_poor_threshold", "android-trafficapi-impl", m39880k(), 0, 100), new k8a("request_bucketing_interval", "android-trafficapi-impl", m39881l(), 0, 120), new k8a("speed_test_sample_rate_percent", "android-trafficapi-impl", m39882m(), 0, 100), new k8a("speed_test_url_variant", "android-trafficapi-impl", m39883n(), 0, 10000), new k8a("traffic_bucket_aggregation_v2_enabled", "android-trafficapi-impl", m39884o()), new k8a("traffic_stats_enabled", "android-trafficapi-impl", m39885p()));
    }

    /* JADX INFO: renamed from: n */
    public final int m39883n() {
        es4 es4VarM39876g = m39876g();
        return es4VarM39876g != null ? es4VarM39876g.m39883n() : this.f62285m;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m39884o() {
        es4 es4VarM39876g = m39876g();
        return es4VarM39876g != null ? es4VarM39876g.m39884o() : this.f62286n;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m39885p() {
        es4 es4VarM39876g = m39876g();
        return es4VarM39876g != null ? es4VarM39876g.m39885p() : this.f62287o;
    }
}
