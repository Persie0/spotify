package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class f44 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f65661a;

    /* JADX INFO: renamed from: b */
    public final boolean f65662b;

    /* JADX INFO: renamed from: c */
    public final boolean f65663c;

    /* JADX INFO: renamed from: d */
    public final boolean f65664d;

    /* JADX INFO: renamed from: e */
    public final boolean f65665e;

    /* JADX INFO: renamed from: f */
    public final boolean f65666f;

    /* JADX INFO: renamed from: g */
    public final boolean f65667g;

    /* JADX INFO: renamed from: h */
    public final boolean f65668h;

    /* JADX INFO: renamed from: i */
    public final bji f65669i;

    /* JADX INFO: renamed from: j */
    public final wg61 f65670j;

    public f44(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, bji bjiVar) {
        this.f65661a = z;
        this.f65662b = z2;
        this.f65663c = z3;
        this.f65664d = z4;
        this.f65665e = z5;
        this.f65666f = z6;
        this.f65667g = z7;
        this.f65668h = z8;
        this.f65669i = bjiVar;
        this.f65670j = new wg61(new y34(this, 6));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m40705a() {
        f44 f44VarM40707c = m40707c();
        return f44VarM40707c != null ? f44VarM40707c.m40705a() : this.f65661a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m40706b() {
        f44 f44VarM40707c = m40707c();
        return f44VarM40707c != null ? f44VarM40707c.m40706b() : this.f65662b;
    }

    /* JADX INFO: renamed from: c */
    public final f44 m40707c() {
        return (f44) this.f65670j.getValue();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m40708d() {
        f44 f44VarM40707c = m40707c();
        return f44VarM40707c != null ? f44VarM40707c.m40708d() : this.f65663c;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m40709e() {
        f44 f44VarM40707c = m40707c();
        return f44VarM40707c != null ? f44VarM40707c.m40709e() : this.f65664d;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m40710f() {
        f44 f44VarM40707c = m40707c();
        return f44VarM40707c != null ? f44VarM40707c.m40710f() : this.f65665e;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m40711g() {
        f44 f44VarM40707c = m40707c();
        return f44VarM40707c != null ? f44VarM40707c.m40711g() : this.f65666f;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m40712h() {
        f44 f44VarM40707c = m40707c();
        return f44VarM40707c != null ? f44VarM40707c.m40712h() : this.f65667g;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m40713i() {
        f44 f44VarM40707c = m40707c();
        return f44VarM40707c != null ? f44VarM40707c.m40713i() : this.f65668h;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("compose_browse_content_enabled", "android-feature-browse-clientnative", m40705a()), new k8a("condensed_browse_enabled", "android-feature-browse-clientnative", m40706b()), new k8a("enable_e2e_test_feed", "android-feature-browse-clientnative", m40708d()), new k8a("enable_episode_access_info", "android-feature-browse-clientnative", m40709e()), new k8a("enable_optional_playback_trait", "android-feature-browse-clientnative", m40710f()), new k8a("kodiak_play_link_card_enabled", "android-feature-browse-clientnative", m40711g()), new k8a("send_is_tablet", "android-feature-browse-clientnative", m40712h()), new k8a("show_audiobook_access_info_signifier", "android-feature-browse-clientnative", m40713i()));
    }

    public f44(bji bjiVar) {
        this(false, false, false, true, false, false, false, false, bjiVar);
    }
}
