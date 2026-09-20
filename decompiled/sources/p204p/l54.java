package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class l54 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f129810a;

    /* JADX INFO: renamed from: b */
    public final boolean f129811b;

    /* JADX INFO: renamed from: c */
    public final boolean f129812c;

    /* JADX INFO: renamed from: d */
    public final boolean f129813d;

    /* JADX INFO: renamed from: e */
    public final boolean f129814e;

    /* JADX INFO: renamed from: f */
    public final boolean f129815f;

    /* JADX INFO: renamed from: g */
    public final boolean f129816g;

    /* JADX INFO: renamed from: h */
    public final bji f129817h;

    /* JADX INFO: renamed from: i */
    public final wg61 f129818i;

    public l54(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, bji bjiVar) {
        this.f129810a = z;
        this.f129811b = z2;
        this.f129812c = z3;
        this.f129813d = z4;
        this.f129814e = z5;
        this.f129815f = z6;
        this.f129816g = z7;
        this.f129817h = bjiVar;
        this.f129818i = new wg61(new y34(this, 27));
    }

    /* JADX INFO: renamed from: i */
    public static l54 m58191i(uys0 uys0Var) {
        return new l54(uys0Var.mo47707c("android-feature-magpie:capping_enabled", false), uys0Var.mo47707c("android-feature-magpie:force_product_state_enabled", false), uys0Var.mo47707c("android-feature-magpie:magpie_playlist_enabled", false), uys0Var.mo47707c("android-feature-magpie:magpie_playlist_update_cadence_enabled", false), uys0Var.mo47707c("android-feature-magpie:play_on_ready_enabled", false), uys0Var.mo47707c("android-feature-magpie:upsellability_enabled", false), uys0Var.mo47707c("android-feature-magpie:use_feature_definition", false), null);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m58192a() {
        l54 l54VarM58193b = m58193b();
        return l54VarM58193b != null ? l54VarM58193b.m58192a() : this.f129810a;
    }

    /* JADX INFO: renamed from: b */
    public final l54 m58193b() {
        return (l54) this.f129818i.getValue();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m58194c() {
        l54 l54VarM58193b = m58193b();
        return l54VarM58193b != null ? l54VarM58193b.m58194c() : this.f129811b;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m58195d() {
        l54 l54VarM58193b = m58193b();
        return l54VarM58193b != null ? l54VarM58193b.m58195d() : this.f129812c;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m58196e() {
        l54 l54VarM58193b = m58193b();
        return l54VarM58193b != null ? l54VarM58193b.m58196e() : this.f129813d;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m58197f() {
        l54 l54VarM58193b = m58193b();
        return l54VarM58193b != null ? l54VarM58193b.m58197f() : this.f129814e;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m58198g() {
        l54 l54VarM58193b = m58193b();
        return l54VarM58193b != null ? l54VarM58193b.m58198g() : this.f129815f;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m58199h() {
        l54 l54VarM58193b = m58193b();
        return l54VarM58193b != null ? l54VarM58193b.m58199h() : this.f129816g;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("capping_enabled", "android-feature-magpie", m58192a()), new k8a("force_product_state_enabled", "android-feature-magpie", m58194c()), new k8a("magpie_playlist_enabled", "android-feature-magpie", m58195d()), new k8a("magpie_playlist_update_cadence_enabled", "android-feature-magpie", m58196e()), new k8a("play_on_ready_enabled", "android-feature-magpie", m58197f()), new k8a("upsellability_enabled", "android-feature-magpie", m58198g()), new k8a("use_feature_definition", "android-feature-magpie", m58199h()));
    }

    public l54(bji bjiVar) {
        this(false, false, false, false, false, false, false, bjiVar);
    }
}
