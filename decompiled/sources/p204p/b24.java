package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class b24 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f22484a;

    /* JADX INFO: renamed from: b */
    public final boolean f22485b;

    /* JADX INFO: renamed from: c */
    public final boolean f22486c;

    /* JADX INFO: renamed from: d */
    public final boolean f22487d;

    /* JADX INFO: renamed from: e */
    public final int f22488e;

    /* JADX INFO: renamed from: f */
    public final int f22489f;

    /* JADX INFO: renamed from: g */
    public final bji f22490g;

    /* JADX INFO: renamed from: h */
    public final wg61 f22491h = new wg61(new u14(this, 4));

    public b24(boolean z, boolean z2, boolean z3, boolean z4, int i, int i2, bji bjiVar) {
        this.f22484a = z;
        this.f22485b = z2;
        this.f22486c = z3;
        this.f22487d = z4;
        this.f22488e = i;
        this.f22489f = i2;
        this.f22490g = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final b24 m27924a() {
        return (b24) this.f22491h.getValue();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m27925b() {
        b24 b24VarM27924a = m27924a();
        return b24VarM27924a != null ? b24VarM27924a.m27925b() : this.f22484a;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m27926c() {
        b24 b24VarM27924a = m27924a();
        return b24VarM27924a != null ? b24VarM27924a.m27926c() : this.f22485b;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m27927d() {
        b24 b24VarM27924a = m27924a();
        return b24VarM27924a != null ? b24VarM27924a.m27927d() : this.f22486c;
    }

    /* JADX INFO: renamed from: e */
    public final int m27928e() {
        b24 b24VarM27924a = m27924a();
        return b24VarM27924a != null ? b24VarM27924a.m27928e() : this.f22488e;
    }

    /* JADX INFO: renamed from: f */
    public final int m27929f() {
        b24 b24VarM27924a = m27924a();
        return b24VarM27924a != null ? b24VarM27924a.m27929f() : this.f22489f;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m27930g() {
        b24 b24VarM27924a = m27924a();
        return b24VarM27924a != null ? b24VarM27924a.m27930g() : this.f22487d;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_auto_dismiss", "android-device-predictability", m27925b()), new k8a("enable_debug_source_icon", "android-device-predictability", m27926c()), new k8a("enable_where_to_play", "android-device-predictability", m27927d()), new k8a("is_smart_control_nudge_enabled", "android-device-predictability", m27930g()), new k8a("session_timeout_minutes", "android-device-predictability", m27928e(), 0, 720), new k8a("smart_control_dismiss_timeout_ms", "android-device-predictability", m27929f(), 0, 36000000));
    }
}
