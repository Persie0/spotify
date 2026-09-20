package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ay3 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f21070a;

    /* JADX INFO: renamed from: b */
    public final boolean f21071b;

    /* JADX INFO: renamed from: c */
    public final boolean f21072c;

    /* JADX INFO: renamed from: d */
    public final boolean f21073d;

    /* JADX INFO: renamed from: e */
    public final boolean f21074e;

    /* JADX INFO: renamed from: f */
    public final boolean f21075f;

    /* JADX INFO: renamed from: g */
    public final boolean f21076g;

    /* JADX INFO: renamed from: h */
    public final boolean f21077h;

    /* JADX INFO: renamed from: i */
    public final boolean f21078i;

    /* JADX INFO: renamed from: j */
    public final boolean f21079j;

    /* JADX INFO: renamed from: k */
    public final boolean f21080k;

    /* JADX INFO: renamed from: l */
    public final bji f21081l;

    /* JADX INFO: renamed from: m */
    public final wg61 f21082m = new wg61(new f30(this, 7));

    public ay3(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, bji bjiVar) {
        this.f21070a = z;
        this.f21071b = z2;
        this.f21072c = z3;
        this.f21073d = z4;
        this.f21074e = z5;
        this.f21075f = z6;
        this.f21076g = z7;
        this.f21077h = z8;
        this.f21078i = z9;
        this.f21079j = z10;
        this.f21080k = z11;
        this.f21081l = bjiVar;
    }

    /* JADX INFO: renamed from: n */
    public static ay3 m27485n(uys0 uys0Var) {
        return new ay3(uys0Var.mo47707c("android-cal-app:enable_search_exception_workaround", true), uys0Var.mo47707c("android-cal-app:enable_voice_search_results", true), uys0Var.mo47707c("android-cal-app:home_clickable_headers_enabled", false), uys0Var.mo47707c("android-cal-app:home_condensed_shortcuts_enabled", false), uys0Var.mo47707c("android-cal-app:home_smaller_grid_items_enabled", false), uys0Var.mo47707c("android-cal-app:recently_played_grid_enabled", true), uys0Var.mo47707c("android-cal-app:respect_presentation_override", false), uys0Var.mo47707c("android-cal-app:resume_list_enabled", false), uys0Var.mo47707c("android-cal-app:search_sectioned_template_enabled", true), uys0Var.mo47707c("android-cal-app:sillywalk_enabled", false), uys0Var.mo47707c("android-cal-app:stateful_play_button_enabled", false), null);
    }

    /* JADX INFO: renamed from: b */
    public final ay3 m27486b() {
        return (ay3) this.f21082m.getValue();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m27487c() {
        ay3 ay3VarM27486b = m27486b();
        return ay3VarM27486b != null ? ay3VarM27486b.m27487c() : this.f21070a;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m27488d() {
        ay3 ay3VarM27486b = m27486b();
        return ay3VarM27486b != null ? ay3VarM27486b.m27488d() : this.f21071b;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m27489e() {
        ay3 ay3VarM27486b = m27486b();
        return ay3VarM27486b != null ? ay3VarM27486b.m27489e() : this.f21072c;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m27490f() {
        ay3 ay3VarM27486b = m27486b();
        return ay3VarM27486b != null ? ay3VarM27486b.m27490f() : this.f21073d;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m27491g() {
        ay3 ay3VarM27486b = m27486b();
        return ay3VarM27486b != null ? ay3VarM27486b.m27491g() : this.f21074e;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m27492h() {
        ay3 ay3VarM27486b = m27486b();
        return ay3VarM27486b != null ? ay3VarM27486b.m27492h() : this.f21075f;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m27493i() {
        ay3 ay3VarM27486b = m27486b();
        return ay3VarM27486b != null ? ay3VarM27486b.m27493i() : this.f21076g;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m27494j() {
        ay3 ay3VarM27486b = m27486b();
        return ay3VarM27486b != null ? ay3VarM27486b.m27494j() : this.f21077h;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m27495k() {
        ay3 ay3VarM27486b = m27486b();
        return ay3VarM27486b != null ? ay3VarM27486b.m27495k() : this.f21078i;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m27496l() {
        ay3 ay3VarM27486b = m27486b();
        return ay3VarM27486b != null ? ay3VarM27486b.m27496l() : this.f21079j;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m27497m() {
        ay3 ay3VarM27486b = m27486b();
        return ay3VarM27486b != null ? ay3VarM27486b.m27497m() : this.f21080k;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_search_exception_workaround", "android-cal-app", m27487c()), new k8a("enable_voice_search_results", "android-cal-app", m27488d()), new k8a("home_clickable_headers_enabled", "android-cal-app", m27489e()), new k8a("home_condensed_shortcuts_enabled", "android-cal-app", m27490f()), new k8a("home_smaller_grid_items_enabled", "android-cal-app", m27491g()), new k8a("recently_played_grid_enabled", "android-cal-app", m27492h()), new k8a("respect_presentation_override", "android-cal-app", m27493i()), new k8a("resume_list_enabled", "android-cal-app", m27494j()), new k8a("search_sectioned_template_enabled", "android-cal-app", m27495k()), new k8a("sillywalk_enabled", "android-cal-app", m27496l()), new k8a("stateful_play_button_enabled", "android-cal-app", m27497m()));
    }
}
