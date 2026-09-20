package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class gi5 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f80051a;

    /* JADX INFO: renamed from: b */
    public final boolean f80052b;

    /* JADX INFO: renamed from: c */
    public final boolean f80053c;

    /* JADX INFO: renamed from: d */
    public final int f80054d;

    /* JADX INFO: renamed from: e */
    public final int f80055e;

    /* JADX INFO: renamed from: f */
    public final int f80056f;

    /* JADX INFO: renamed from: g */
    public final int f80057g;

    /* JADX INFO: renamed from: h */
    public final int f80058h;

    /* JADX INFO: renamed from: i */
    public final int f80059i;

    /* JADX INFO: renamed from: j */
    public final int f80060j;

    /* JADX INFO: renamed from: k */
    public final int f80061k;

    /* JADX INFO: renamed from: l */
    public final int f80062l;

    /* JADX INFO: renamed from: m */
    public final int f80063m;

    /* JADX INFO: renamed from: n */
    public final int f80064n;

    /* JADX INFO: renamed from: o */
    public final boolean f80065o;

    /* JADX INFO: renamed from: p */
    public final boolean f80066p;

    /* JADX INFO: renamed from: q */
    public final boolean f80067q;

    /* JADX INFO: renamed from: r */
    public final fnk0 f80068r;

    /* JADX INFO: renamed from: s */
    public final bji f80069s;

    /* JADX INFO: renamed from: t */
    public final wg61 f80070t;

    /* JADX INFO: renamed from: u */
    public final wg61 f80071u;

    public gi5(boolean z, boolean z2, boolean z3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, boolean z4, boolean z5, boolean z6, fnk0 fnk0Var, bji bjiVar) {
        this.f80051a = z;
        this.f80052b = z2;
        this.f80053c = z3;
        this.f80054d = i;
        this.f80055e = i2;
        this.f80056f = i3;
        this.f80057g = i4;
        this.f80058h = i5;
        this.f80059i = i6;
        this.f80060j = i7;
        this.f80061k = i8;
        this.f80062l = i9;
        this.f80063m = i10;
        this.f80064n = i11;
        this.f80065o = z4;
        this.f80066p = z5;
        this.f80067q = z6;
        this.f80068r = fnk0Var;
        this.f80069s = bjiVar;
        this.f80070t = new wg61(new f30(this, 25));
        this.f80071u = new wg61(new uu4(this, 29));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m44769a() {
        gi5 gi5VarM44771c = m44771c();
        return gi5VarM44771c != null ? gi5VarM44771c.m44769a() : this.f80051a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m44770b() {
        gi5 gi5VarM44771c = m44771c();
        return gi5VarM44771c != null ? gi5VarM44771c.m44770b() : this.f80052b;
    }

    /* JADX INFO: renamed from: c */
    public final gi5 m44771c() {
        return (gi5) this.f80071u.getValue();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m44772d() {
        gi5 gi5VarM44771c = m44771c();
        return gi5VarM44771c != null ? gi5VarM44771c.m44772d() : this.f80053c;
    }

    /* JADX INFO: renamed from: e */
    public final int m44773e() {
        gi5 gi5VarM44771c = m44771c();
        return gi5VarM44771c != null ? gi5VarM44771c.m44773e() : this.f80054d;
    }

    /* JADX INFO: renamed from: f */
    public final int m44774f() {
        gi5 gi5VarM44771c = m44771c();
        return gi5VarM44771c != null ? gi5VarM44771c.m44774f() : this.f80055e;
    }

    /* JADX INFO: renamed from: g */
    public final int m44775g() {
        gi5 gi5VarM44771c = m44771c();
        return gi5VarM44771c != null ? gi5VarM44771c.m44775g() : this.f80056f;
    }

    /* JADX INFO: renamed from: h */
    public final int m44776h() {
        gi5 gi5VarM44771c = m44771c();
        return gi5VarM44771c != null ? gi5VarM44771c.m44776h() : this.f80057g;
    }

    /* JADX INFO: renamed from: i */
    public final int m44777i() {
        gi5 gi5VarM44771c = m44771c();
        return gi5VarM44771c != null ? gi5VarM44771c.m44777i() : this.f80058h;
    }

    /* JADX INFO: renamed from: j */
    public final int m44778j() {
        gi5 gi5VarM44771c = m44771c();
        return gi5VarM44771c != null ? gi5VarM44771c.m44778j() : this.f80059i;
    }

    /* JADX INFO: renamed from: k */
    public final int m44779k() {
        gi5 gi5VarM44771c = m44771c();
        return gi5VarM44771c != null ? gi5VarM44771c.m44779k() : this.f80060j;
    }

    /* JADX INFO: renamed from: l */
    public final int m44780l() {
        gi5 gi5VarM44771c = m44771c();
        return gi5VarM44771c != null ? gi5VarM44771c.m44780l() : this.f80061k;
    }

    /* JADX INFO: renamed from: m */
    public final int m44781m() {
        gi5 gi5VarM44771c = m44771c();
        return gi5VarM44771c != null ? gi5VarM44771c.m44781m() : this.f80062l;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("background_worker_send", "apps-music-libs-eventsender", m44769a()), new k8a("background_worker_send_on_stop", "apps-music-libs-eventsender", m44770b()), new k8a("enable_rate_limiter", "apps-music-libs-eventsender", m44772d()), new k8a("event_sending_interval_seconds", "apps-music-libs-eventsender", m44773e(), 0, 3600), new k8a("heartbeat_interval", "apps-music-libs-eventsender", m44774f(), 0, 43200), new k8a("heartbeat_retry_interval", "apps-music-libs-eventsender", m44775g(), 0, 3600), new k8a("max_batch_bytes", "apps-music-libs-eventsender", m44776h(), 10000, 512000), new k8a("max_batch_size", "apps-music-libs-eventsender", m44777i(), 1, 1000), new k8a("rate_limiting_rule_1_events_per_time_unit", "apps-music-libs-eventsender", m44778j(), 0, 10000), new k8a("rate_limiting_rule_1_time_unit_seconds", "apps-music-libs-eventsender", m44779k(), 0, 3600), new k8a("rate_limiting_rule_2_events_per_time_unit", "apps-music-libs-eventsender", m44780l(), 0, 10000), new k8a("rate_limiting_rule_2_time_unit_seconds", "apps-music-libs-eventsender", m44781m(), 0, 3600), new k8a("rate_limiting_rule_3_events_per_time_unit", "apps-music-libs-eventsender", m44782n(), 0, 10000), new k8a("rate_limiting_rule_3_time_unit_seconds", "apps-music-libs-eventsender", m44783o(), 0, 3600), new k8a("retry_db_operations", "apps-music-libs-eventsender", m44784p()), new k8a("send_events_on_bcd_event", "apps-music-libs-eventsender", m44785q()), new k8a("send_full_ess2", "apps-music-libs-eventsender", m44786r()));
    }

    /* JADX INFO: renamed from: n */
    public final int m44782n() {
        gi5 gi5VarM44771c = m44771c();
        return gi5VarM44771c != null ? gi5VarM44771c.m44782n() : this.f80063m;
    }

    /* JADX INFO: renamed from: o */
    public final int m44783o() {
        gi5 gi5VarM44771c = m44771c();
        return gi5VarM44771c != null ? gi5VarM44771c.m44783o() : this.f80064n;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m44784p() {
        gi5 gi5VarM44771c = m44771c();
        return gi5VarM44771c != null ? gi5VarM44771c.m44784p() : this.f80065o;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m44785q() {
        gi5 gi5VarM44771c = m44771c();
        return gi5VarM44771c != null ? gi5VarM44771c.m44785q() : this.f80066p;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m44786r() {
        gi5 gi5VarM44771c = m44771c();
        return gi5VarM44771c != null ? gi5VarM44771c.m44786r() : this.f80067q;
    }

    public gi5(fnk0 fnk0Var, bji bjiVar) {
        this(false, false, false, 0, 0, 30, 128000, 100, 0, 0, 0, 0, 0, 0, false, false, true, fnk0Var, bjiVar);
    }
}
