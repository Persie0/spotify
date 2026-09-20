package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class y54 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f269318a;

    /* JADX INFO: renamed from: b */
    public final boolean f269319b;

    /* JADX INFO: renamed from: c */
    public final boolean f269320c;

    /* JADX INFO: renamed from: d */
    public final boolean f269321d;

    /* JADX INFO: renamed from: e */
    public final boolean f269322e;

    /* JADX INFO: renamed from: f */
    public final boolean f269323f;

    /* JADX INFO: renamed from: g */
    public final boolean f269324g;

    /* JADX INFO: renamed from: h */
    public final boolean f269325h;

    /* JADX INFO: renamed from: i */
    public final boolean f269326i;

    /* JADX INFO: renamed from: j */
    public final boolean f269327j;

    /* JADX INFO: renamed from: k */
    public final bji f269328k;

    /* JADX INFO: renamed from: l */
    public final wg61 f269329l;

    public y54(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, bji bjiVar) {
        this.f269318a = z;
        this.f269319b = z2;
        this.f269320c = z3;
        this.f269321d = z4;
        this.f269322e = z5;
        this.f269323f = z6;
        this.f269324g = z7;
        this.f269325h = z8;
        this.f269326i = z9;
        this.f269327j = z10;
        this.f269328k = bjiVar;
        this.f269329l = new wg61(new o54(this, 7));
    }

    /* JADX INFO: renamed from: a */
    public final y54 m92827a() {
        return (y54) this.f269329l.getValue();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m92828b() {
        y54 y54VarM92827a = m92827a();
        return y54VarM92827a != null ? y54VarM92827a.m92828b() : this.f269318a;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m92829c() {
        y54 y54VarM92827a = m92827a();
        return y54VarM92827a != null ? y54VarM92827a.m92829c() : this.f269319b;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m92830d() {
        y54 y54VarM92827a = m92827a();
        return y54VarM92827a != null ? y54VarM92827a.m92830d() : this.f269320c;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m92831e() {
        y54 y54VarM92827a = m92827a();
        return y54VarM92827a != null ? y54VarM92827a.m92831e() : this.f269322e;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m92832f() {
        y54 y54VarM92827a = m92827a();
        return y54VarM92827a != null ? y54VarM92827a.m92832f() : this.f269323f;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m92833g() {
        y54 y54VarM92827a = m92827a();
        return y54VarM92827a != null ? y54VarM92827a.m92833g() : this.f269324g;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m92834h() {
        y54 y54VarM92827a = m92827a();
        return y54VarM92827a != null ? y54VarM92827a.m92834h() : this.f269325h;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m92835i() {
        y54 y54VarM92827a = m92827a();
        return y54VarM92827a != null ? y54VarM92827a.m92835i() : this.f269326i;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m92836j() {
        y54 y54VarM92827a = m92827a();
        return y54VarM92827a != null ? y54VarM92827a.m92836j() : this.f269327j;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m92837k() {
        y54 y54VarM92827a = m92827a();
        return y54VarM92827a != null ? y54VarM92827a.m92837k() : this.f269321d;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("default_size_remove_video_padding", "android-feature-nowplayingbar", m92828b()), new k8a("enable_resize_gesture", "android-feature-nowplayingbar", m92829c()), new k8a("hide_add_to_element", "android-feature-nowplayingbar", m92830d()), new k8a("is_npb_promo_indicator_enabled", "android-feature-nowplayingbar", m92837k()), new k8a("large_size_remove_video_padding", "android-feature-nowplayingbar", m92831e()), new k8a("larger_npb_video_on_by_default", "android-feature-nowplayingbar", m92832f()), new k8a("larger_npb_video_setting_visible", "android-feature-nowplayingbar", m92833g()), new k8a("npb_visibility_gating", "android-feature-nowplayingbar", m92834h()), new k8a("render_video_surface_as_overlay", "android-feature-nowplayingbar", m92835i()), new k8a("use_video_element", "android-feature-nowplayingbar", m92836j()));
    }

    public y54(bji bjiVar) {
        this(false, false, false, false, false, false, false, false, true, false, bjiVar);
    }
}
