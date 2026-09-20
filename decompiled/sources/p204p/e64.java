package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class e64 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f56533a;

    /* JADX INFO: renamed from: b */
    public final boolean f56534b;

    /* JADX INFO: renamed from: c */
    public final boolean f56535c;

    /* JADX INFO: renamed from: d */
    public final boolean f56536d;

    /* JADX INFO: renamed from: e */
    public final boolean f56537e;

    /* JADX INFO: renamed from: f */
    public final boolean f56538f;

    /* JADX INFO: renamed from: g */
    public final boolean f56539g;

    /* JADX INFO: renamed from: h */
    public final boolean f56540h;

    /* JADX INFO: renamed from: i */
    public final boolean f56541i;

    /* JADX INFO: renamed from: j */
    public final boolean f56542j;

    /* JADX INFO: renamed from: k */
    public final boolean f56543k;

    /* JADX INFO: renamed from: l */
    public final boolean f56544l;

    /* JADX INFO: renamed from: m */
    public final boolean f56545m;

    /* JADX INFO: renamed from: n */
    public final boolean f56546n;

    /* JADX INFO: renamed from: o */
    public final boolean f56547o;

    /* JADX INFO: renamed from: p */
    public final boolean f56548p;

    /* JADX INFO: renamed from: q */
    public final boolean f56549q;

    /* JADX INFO: renamed from: r */
    public final bji f56550r;

    /* JADX INFO: renamed from: s */
    public final wg61 f56551s = new wg61(new o54(this, 13));

    public e64(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, bji bjiVar) {
        this.f56533a = z;
        this.f56534b = z2;
        this.f56535c = z3;
        this.f56536d = z4;
        this.f56537e = z5;
        this.f56538f = z6;
        this.f56539g = z7;
        this.f56540h = z8;
        this.f56541i = z9;
        this.f56542j = z10;
        this.f56543k = z11;
        this.f56544l = z12;
        this.f56545m = z13;
        this.f56546n = z14;
        this.f56547o = z15;
        this.f56548p = z16;
        this.f56549q = z17;
        this.f56550r = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final e64 m37870a() {
        return (e64) this.f56551s.getValue();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m37871b() {
        e64 e64VarM37870a = m37870a();
        return e64VarM37870a != null ? e64VarM37870a.m37871b() : this.f56533a;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m37872c() {
        e64 e64VarM37870a = m37870a();
        return e64VarM37870a != null ? e64VarM37870a.m37872c() : this.f56534b;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m37873d() {
        e64 e64VarM37870a = m37870a();
        return e64VarM37870a != null ? e64VarM37870a.m37873d() : this.f56535c;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m37874e() {
        e64 e64VarM37870a = m37870a();
        return e64VarM37870a != null ? e64VarM37870a.m37874e() : this.f56536d;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m37875f() {
        e64 e64VarM37870a = m37870a();
        return e64VarM37870a != null ? e64VarM37870a.m37875f() : this.f56537e;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m37876g() {
        e64 e64VarM37870a = m37870a();
        return e64VarM37870a != null ? e64VarM37870a.m37876g() : this.f56538f;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m37877h() {
        e64 e64VarM37870a = m37870a();
        return e64VarM37870a != null ? e64VarM37870a.m37877h() : this.f56539g;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m37878i() {
        e64 e64VarM37870a = m37870a();
        return e64VarM37870a != null ? e64VarM37870a.m37878i() : this.f56540h;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m37879j() {
        e64 e64VarM37870a = m37870a();
        return e64VarM37870a != null ? e64VarM37870a.m37879j() : this.f56541i;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m37880k() {
        e64 e64VarM37870a = m37870a();
        return e64VarM37870a != null ? e64VarM37870a.m37880k() : this.f56542j;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m37881l() {
        e64 e64VarM37870a = m37870a();
        return e64VarM37870a != null ? e64VarM37870a.m37881l() : this.f56544l;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m37882m() {
        e64 e64VarM37870a = m37870a();
        return e64VarM37870a != null ? e64VarM37870a.m37882m() : this.f56545m;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_about_podcast", "android-feature-podcast-episode", m37871b()), new k8a("enable_age_assurance_verification", "android-feature-podcast-episode", m37872c()), new k8a("enable_byom_episode_entry", "android-feature-podcast-episode", m37873d()), new k8a("enable_comments_card", "android-feature-podcast-episode", m37874e()), new k8a("enable_content_capability_download_gate", "android-feature-podcast-episode", m37875f()), new k8a("enable_guest_chips_element", "android-feature-podcast-episode", m37876g()), new k8a("enable_page_bound_ubi_logger", "android-feature-podcast-episode", m37877h()), new k8a("episode_page_leavebehind_element_enabled", "android-feature-podcast-episode", m37878i()), new k8a("fewer_ads_label_enabled", "android-feature-podcast-episode", m37879j()), new k8a("hide_chapter_download_button", "android-feature-podcast-episode", m37880k()), new k8a("is_audiobook_playback_enabled", "android-feature-podcast-episode", m37887r()), new k8a("popularity_indicator_enabled", "android-feature-podcast-episode", m37881l()), new k8a("see_all_episodes_element_enabled", "android-feature-podcast-episode", m37882m()), new k8a("unified_signifier_enabled", "android-feature-podcast-episode", m37883n()), new k8a("video_label_enabled", "android-feature-podcast-episode", m37884o()), new k8a("video_thumbnail", "android-feature-podcast-episode", m37885p()), new k8a("vodcast_auto_opens_npv", "android-feature-podcast-episode", m37886q()));
    }

    /* JADX INFO: renamed from: n */
    public final boolean m37883n() {
        e64 e64VarM37870a = m37870a();
        return e64VarM37870a != null ? e64VarM37870a.m37883n() : this.f56546n;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m37884o() {
        e64 e64VarM37870a = m37870a();
        return e64VarM37870a != null ? e64VarM37870a.m37884o() : this.f56547o;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m37885p() {
        e64 e64VarM37870a = m37870a();
        return e64VarM37870a != null ? e64VarM37870a.m37885p() : this.f56548p;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m37886q() {
        e64 e64VarM37870a = m37870a();
        return e64VarM37870a != null ? e64VarM37870a.m37886q() : this.f56549q;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m37887r() {
        e64 e64VarM37870a = m37870a();
        return e64VarM37870a != null ? e64VarM37870a.m37887r() : this.f56543k;
    }
}
