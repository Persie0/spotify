package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class lb4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f131555a;

    /* JADX INFO: renamed from: b */
    public final boolean f131556b;

    /* JADX INFO: renamed from: c */
    public final boolean f131557c;

    /* JADX INFO: renamed from: d */
    public final boolean f131558d;

    /* JADX INFO: renamed from: e */
    public final bji f131559e;

    /* JADX INFO: renamed from: f */
    public final wg61 f131560f;

    public lb4(boolean z, boolean z2, boolean z3, boolean z4, bji bjiVar) {
        this.f131555a = z;
        this.f131556b = z2;
        this.f131557c = z3;
        this.f131558d = z4;
        this.f131559e = bjiVar;
        this.f131560f = new wg61(new ga4(this, 23));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m58600a() {
        lb4 lb4Var = (lb4) this.f131560f.getValue();
        return lb4Var != null ? lb4Var.m58600a() : this.f131555a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m58601b() {
        lb4 lb4Var = (lb4) this.f131560f.getValue();
        return lb4Var != null ? lb4Var.m58601b() : this.f131556b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m58602c() {
        lb4 lb4Var = (lb4) this.f131560f.getValue();
        return lb4Var != null ? lb4Var.m58602c() : this.f131557c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m58603d() {
        lb4 lb4Var = (lb4) this.f131560f.getValue();
        return lb4Var != null ? lb4Var.m58603d() : this.f131558d;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_compose_marquee_overlay", "android-libs-marquee", m58600a()), new k8a("enable_genrecs_spring2026_compliance", "android-libs-marquee", m58601b()), new k8a("enable_marquee", "android-libs-marquee", m58602c()), new k8a("is_permission_dialog_on_presave_enabled", "android-libs-marquee", m58603d()));
    }

    public lb4(bji bjiVar) {
        this(false, false, false, false, bjiVar);
    }
}
