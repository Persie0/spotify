package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class n54 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f150478a;

    /* JADX INFO: renamed from: b */
    public final boolean f150479b;

    /* JADX INFO: renamed from: c */
    public final boolean f150480c;

    /* JADX INFO: renamed from: d */
    public final boolean f150481d;

    /* JADX INFO: renamed from: e */
    public final boolean f150482e;

    /* JADX INFO: renamed from: f */
    public final boolean f150483f;

    /* JADX INFO: renamed from: g */
    public final bji f150484g;

    /* JADX INFO: renamed from: h */
    public final wg61 f150485h = new wg61(new y34(this, 29));

    public n54(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, bji bjiVar) {
        this.f150478a = z;
        this.f150479b = z2;
        this.f150480c = z3;
        this.f150481d = z4;
        this.f150482e = z5;
        this.f150483f = z6;
        this.f150484g = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m63702a() {
        n54 n54VarM63706e = m63706e();
        return n54VarM63706e != null ? n54VarM63706e.m63702a() : this.f150478a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m63703b() {
        n54 n54VarM63706e = m63706e();
        return n54VarM63706e != null ? n54VarM63706e.m63703b() : this.f150479b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m63704c() {
        n54 n54VarM63706e = m63706e();
        return n54VarM63706e != null ? n54VarM63706e.m63704c() : this.f150480c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m63705d() {
        n54 n54VarM63706e = m63706e();
        return n54VarM63706e != null ? n54VarM63706e.m63705d() : this.f150481d;
    }

    /* JADX INFO: renamed from: e */
    public final n54 m63706e() {
        return (n54) this.f150485h.getValue();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m63707f() {
        n54 n54VarM63706e = m63706e();
        return n54VarM63706e != null ? n54VarM63706e.m63707f() : this.f150482e;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m63708g() {
        n54 n54VarM63706e = m63706e();
        return n54VarM63706e != null ? n54VarM63706e.m63708g() : this.f150483f;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("album_prerelease_full_width_limitation_enabled", "android-feature-main-layout", m63702a()), new k8a("browse_full_width", "android-feature-main-layout", m63703b()), new k8a("creator_full_width", "android-feature-main-layout", m63704c()), new k8a("cwp_full_width", "android-feature-main-layout", m63705d()), new k8a("home_full_width", "android-feature-main-layout", m63707f()), new k8a("releases_page_full_width_limitation_enabled", "android-feature-main-layout", m63708g()));
    }
}
