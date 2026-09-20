package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class e44 implements iys0 {

    /* JADX INFO: renamed from: A */
    public final bji f55943A;

    /* JADX INFO: renamed from: B */
    public final wg61 f55944B;

    /* JADX INFO: renamed from: a */
    public final boolean f55945a;

    /* JADX INFO: renamed from: b */
    public final boolean f55946b;

    /* JADX INFO: renamed from: c */
    public final boolean f55947c;

    /* JADX INFO: renamed from: d */
    public final boolean f55948d;

    /* JADX INFO: renamed from: e */
    public final boolean f55949e;

    /* JADX INFO: renamed from: f */
    public final boolean f55950f;

    /* JADX INFO: renamed from: g */
    public final boolean f55951g;

    /* JADX INFO: renamed from: h */
    public final boolean f55952h;

    /* JADX INFO: renamed from: i */
    public final boolean f55953i;

    /* JADX INFO: renamed from: j */
    public final boolean f55954j;

    /* JADX INFO: renamed from: k */
    public final boolean f55955k;

    /* JADX INFO: renamed from: l */
    public final boolean f55956l;

    /* JADX INFO: renamed from: m */
    public final boolean f55957m;

    /* JADX INFO: renamed from: n */
    public final boolean f55958n;

    /* JADX INFO: renamed from: o */
    public final boolean f55959o;

    /* JADX INFO: renamed from: p */
    public final boolean f55960p;

    /* JADX INFO: renamed from: q */
    public final boolean f55961q;

    /* JADX INFO: renamed from: r */
    public final boolean f55962r;

    /* JADX INFO: renamed from: s */
    public final boolean f55963s;

    /* JADX INFO: renamed from: t */
    public final boolean f55964t;

    /* JADX INFO: renamed from: u */
    public final boolean f55965u;

    /* JADX INFO: renamed from: v */
    public final boolean f55966v;

    /* JADX INFO: renamed from: w */
    public final boolean f55967w;

    /* JADX INFO: renamed from: x */
    public final boolean f55968x;

    /* JADX INFO: renamed from: y */
    public final boolean f55969y;

    /* JADX INFO: renamed from: z */
    public final boolean f55970z;

    public e44(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, bji bjiVar) {
        this.f55945a = z;
        this.f55946b = z2;
        this.f55947c = z3;
        this.f55948d = z4;
        this.f55949e = z5;
        this.f55950f = z6;
        this.f55951g = z7;
        this.f55952h = z8;
        this.f55953i = z9;
        this.f55954j = z10;
        this.f55955k = z11;
        this.f55956l = z12;
        this.f55957m = z13;
        this.f55958n = z14;
        this.f55959o = z15;
        this.f55960p = z16;
        this.f55961q = z17;
        this.f55962r = z18;
        this.f55963s = z19;
        this.f55964t = z20;
        this.f55965u = z21;
        this.f55966v = z22;
        this.f55967w = z23;
        this.f55968x = z24;
        this.f55969y = z25;
        this.f55970z = z26;
        this.f55943A = bjiVar;
        this.f55944B = new wg61(new y34(this, 5));
    }

    /* JADX INFO: renamed from: B */
    public static e44 m37706B(uys0 uys0Var) {
        return new e44(uys0Var.mo47707c("android-feature-bluejay:artwork_carousel_enabled", true), uys0Var.mo47707c("android-feature-bluejay:capping_enabled", true), uys0Var.mo47707c("android-feature-bluejay:connect_apps_chip_enabled", true), uys0Var.mo47707c("android-feature-bluejay:create_show_on_confirm_enabled", false), uys0Var.mo47707c("android-feature-bluejay:create_show_upload_enabled", true), uys0Var.mo47707c("android-feature-bluejay:data_source_enabled", true), uys0Var.mo47707c("android-feature-bluejay:disclosure_sheet_enabled", true), uys0Var.mo47707c("android-feature-bluejay:episode_page_refine_podcast_entry_point_enabled", false), uys0Var.mo47707c("android-feature-bluejay:episode_readiness_indicator_enabled", false), uys0Var.mo47707c("android-feature-bluejay:generating_episode_subtitle_enabled", false), uys0Var.mo47707c("android-feature-bluejay:generation_banner_enabled", false), uys0Var.mo47707c("android-feature-bluejay:is_enabled", false), uys0Var.mo47707c("android-feature-bluejay:is_episode_page_entry_point_enabled", true), uys0Var.mo47707c("android-feature-bluejay:is_now_playing_entry_point_enabled", true), uys0Var.mo47707c("android-feature-bluejay:is_show_page_entry_point_enabled", true), uys0Var.mo47707c("android-feature-bluejay:is_upload_enabled", true), uys0Var.mo47707c("android-feature-bluejay:now_playing_view_refine_podcast_entry_point_enabled", false), uys0Var.mo47707c("android-feature-bluejay:onboarding_enabled", false), uys0Var.mo47707c("android-feature-bluejay:personal_apps_settings_enabled", true), uys0Var.mo47707c("android-feature-bluejay:schedule_chip_capped_upsell_enabled", false), uys0Var.mo47707c("android-feature-bluejay:show_generation_list_enabled", false), uys0Var.mo47707c("android-feature-bluejay:show_page_refine_podcast_entry_point_enabled", false), uys0Var.mo47707c("android-feature-bluejay:show_page_schedule_chip_enabled", false), uys0Var.mo47707c("android-feature-bluejay:skip_forward_enabled", false), uys0Var.mo47707c("android-feature-bluejay:suggestions_carousel_enabled", true), uys0Var.mo47707c("android-feature-bluejay:supports_more_connections_in_settings", false), null);
    }

    /* JADX INFO: renamed from: A */
    public final boolean m37707A() {
        e44 e44VarM37713f = m37713f();
        return e44VarM37713f != null ? e44VarM37713f.m37707A() : this.f55960p;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m37708a() {
        e44 e44VarM37713f = m37713f();
        return e44VarM37713f != null ? e44VarM37713f.m37708a() : this.f55945a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m37709b() {
        e44 e44VarM37713f = m37713f();
        return e44VarM37713f != null ? e44VarM37713f.m37709b() : this.f55946b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m37710c() {
        e44 e44VarM37713f = m37713f();
        return e44VarM37713f != null ? e44VarM37713f.m37710c() : this.f55947c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m37711d() {
        e44 e44VarM37713f = m37713f();
        return e44VarM37713f != null ? e44VarM37713f.m37711d() : this.f55948d;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m37712e() {
        e44 e44VarM37713f = m37713f();
        return e44VarM37713f != null ? e44VarM37713f.m37712e() : this.f55949e;
    }

    /* JADX INFO: renamed from: f */
    public final e44 m37713f() {
        return (e44) this.f55944B.getValue();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m37714g() {
        e44 e44VarM37713f = m37713f();
        return e44VarM37713f != null ? e44VarM37713f.m37714g() : this.f55950f;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m37715h() {
        e44 e44VarM37713f = m37713f();
        return e44VarM37713f != null ? e44VarM37713f.m37715h() : this.f55951g;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m37716i() {
        e44 e44VarM37713f = m37713f();
        return e44VarM37713f != null ? e44VarM37713f.m37716i() : this.f55952h;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m37717j() {
        e44 e44VarM37713f = m37713f();
        return e44VarM37713f != null ? e44VarM37713f.m37717j() : this.f55953i;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m37718k() {
        e44 e44VarM37713f = m37713f();
        return e44VarM37713f != null ? e44VarM37713f.m37718k() : this.f55954j;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m37719l() {
        e44 e44VarM37713f = m37713f();
        return e44VarM37713f != null ? e44VarM37713f.m37719l() : this.f55955k;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m37720m() {
        e44 e44VarM37713f = m37713f();
        return e44VarM37713f != null ? e44VarM37713f.m37720m() : this.f55961q;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("artwork_carousel_enabled", "android-feature-bluejay", m37708a()), new k8a("capping_enabled", "android-feature-bluejay", m37709b()), new k8a("connect_apps_chip_enabled", "android-feature-bluejay", m37710c()), new k8a("create_show_on_confirm_enabled", "android-feature-bluejay", m37711d()), new k8a("create_show_upload_enabled", "android-feature-bluejay", m37712e()), new k8a("data_source_enabled", "android-feature-bluejay", m37714g()), new k8a("disclosure_sheet_enabled", "android-feature-bluejay", m37715h()), new k8a("episode_page_refine_podcast_entry_point_enabled", "android-feature-bluejay", m37716i()), new k8a("episode_readiness_indicator_enabled", "android-feature-bluejay", m37717j()), new k8a("generating_episode_subtitle_enabled", "android-feature-bluejay", m37718k()), new k8a("generation_banner_enabled", "android-feature-bluejay", m37719l()), new k8a("is_enabled", "android-feature-bluejay", m37730w()), new k8a("is_episode_page_entry_point_enabled", "android-feature-bluejay", m37731x()), new k8a("is_now_playing_entry_point_enabled", "android-feature-bluejay", m37732y()), new k8a("is_show_page_entry_point_enabled", "android-feature-bluejay", m37733z()), new k8a("is_upload_enabled", "android-feature-bluejay", m37707A()), new k8a("now_playing_view_refine_podcast_entry_point_enabled", "android-feature-bluejay", m37720m()), new k8a("onboarding_enabled", "android-feature-bluejay", m37721n()), new k8a("personal_apps_settings_enabled", "android-feature-bluejay", m37722o()), new k8a("schedule_chip_capped_upsell_enabled", "android-feature-bluejay", m37723p()), new k8a("show_generation_list_enabled", "android-feature-bluejay", m37724q()), new k8a("show_page_refine_podcast_entry_point_enabled", "android-feature-bluejay", m37725r()), new k8a("show_page_schedule_chip_enabled", "android-feature-bluejay", m37726s()), new k8a("skip_forward_enabled", "android-feature-bluejay", m37727t()), new k8a("suggestions_carousel_enabled", "android-feature-bluejay", m37728u()), new k8a("supports_more_connections_in_settings", "android-feature-bluejay", m37729v()));
    }

    /* JADX INFO: renamed from: n */
    public final boolean m37721n() {
        e44 e44VarM37713f = m37713f();
        return e44VarM37713f != null ? e44VarM37713f.m37721n() : this.f55962r;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m37722o() {
        e44 e44VarM37713f = m37713f();
        return e44VarM37713f != null ? e44VarM37713f.m37722o() : this.f55963s;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m37723p() {
        e44 e44VarM37713f = m37713f();
        return e44VarM37713f != null ? e44VarM37713f.m37723p() : this.f55964t;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m37724q() {
        e44 e44VarM37713f = m37713f();
        return e44VarM37713f != null ? e44VarM37713f.m37724q() : this.f55965u;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m37725r() {
        e44 e44VarM37713f = m37713f();
        return e44VarM37713f != null ? e44VarM37713f.m37725r() : this.f55966v;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m37726s() {
        e44 e44VarM37713f = m37713f();
        return e44VarM37713f != null ? e44VarM37713f.m37726s() : this.f55967w;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m37727t() {
        e44 e44VarM37713f = m37713f();
        return e44VarM37713f != null ? e44VarM37713f.m37727t() : this.f55968x;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m37728u() {
        e44 e44VarM37713f = m37713f();
        return e44VarM37713f != null ? e44VarM37713f.m37728u() : this.f55969y;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m37729v() {
        e44 e44VarM37713f = m37713f();
        return e44VarM37713f != null ? e44VarM37713f.m37729v() : this.f55970z;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m37730w() {
        e44 e44VarM37713f = m37713f();
        return e44VarM37713f != null ? e44VarM37713f.m37730w() : this.f55956l;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m37731x() {
        e44 e44VarM37713f = m37713f();
        return e44VarM37713f != null ? e44VarM37713f.m37731x() : this.f55957m;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m37732y() {
        e44 e44VarM37713f = m37713f();
        return e44VarM37713f != null ? e44VarM37713f.m37732y() : this.f55958n;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m37733z() {
        e44 e44VarM37713f = m37713f();
        return e44VarM37713f != null ? e44VarM37713f.m37733z() : this.f55959o;
    }

    public e44(bji bjiVar) {
        this(true, true, true, false, true, true, true, false, false, false, false, false, true, true, true, true, false, false, true, false, false, false, false, false, true, false, bjiVar);
    }
}
