package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class hb4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f89384a;

    /* JADX INFO: renamed from: b */
    public final boolean f89385b;

    /* JADX INFO: renamed from: c */
    public final boolean f89386c;

    /* JADX INFO: renamed from: d */
    public final boolean f89387d;

    /* JADX INFO: renamed from: e */
    public final bji f89388e;

    /* JADX INFO: renamed from: f */
    public final wg61 f89389f;

    public hb4(boolean z, boolean z2, boolean z3, boolean z4, bji bjiVar) {
        this.f89384a = z;
        this.f89385b = z2;
        this.f89386c = z3;
        this.f89387d = z4;
        this.f89388e = bjiVar;
        this.f89389f = new wg61(new ga4(this, 20));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m46983a() {
        hb4 hb4Var = (hb4) this.f89389f.getValue();
        return hb4Var != null ? hb4Var.m46983a() : this.f89384a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m46984b() {
        hb4 hb4Var = (hb4) this.f89389f.getValue();
        return hb4Var != null ? hb4Var.m46984b() : this.f89386c;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m46985c() {
        hb4 hb4Var = (hb4) this.f89389f.getValue();
        return hb4Var != null ? hb4Var.m46985c() : this.f89387d;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m46986d() {
        hb4 hb4Var = (hb4) this.f89389f.getValue();
        return hb4Var != null ? hb4Var.m46986d() : this.f89385b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("error_dialogs_enabled", "android-libs-greenroom", m46983a()), new k8a("is_upcoming_state_check_enabled", "android-libs-greenroom", m46986d()), new k8a("list_playback_enabled", "android-libs-greenroom", m46984b()), new k8a("reporting_enabled", "android-libs-greenroom", m46985c()));
    }

    public hb4(bji bjiVar) {
        this(false, false, false, false, bjiVar);
    }
}
