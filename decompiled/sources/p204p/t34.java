package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class t34 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f216696a;

    /* JADX INFO: renamed from: b */
    public final boolean f216697b;

    /* JADX INFO: renamed from: c */
    public final boolean f216698c;

    /* JADX INFO: renamed from: d */
    public final boolean f216699d;

    /* JADX INFO: renamed from: e */
    public final boolean f216700e;

    /* JADX INFO: renamed from: f */
    public final boolean f216701f;

    /* JADX INFO: renamed from: g */
    public final boolean f216702g;

    /* JADX INFO: renamed from: h */
    public final boolean f216703h;

    /* JADX INFO: renamed from: i */
    public final bji f216704i;

    /* JADX INFO: renamed from: j */
    public final wg61 f216705j = new wg61(new u14(this, 25));

    public t34(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, bji bjiVar) {
        this.f216696a = z;
        this.f216697b = z2;
        this.f216698c = z3;
        this.f216699d = z4;
        this.f216700e = z5;
        this.f216701f = z6;
        this.f216702g = z7;
        this.f216703h = z8;
        this.f216704i = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m79952a() {
        t34 t34VarM79954c = m79954c();
        return t34VarM79954c != null ? t34VarM79954c.m79952a() : this.f216696a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m79953b() {
        t34 t34VarM79954c = m79954c();
        return t34VarM79954c != null ? t34VarM79954c.m79953b() : this.f216697b;
    }

    /* JADX INFO: renamed from: c */
    public final t34 m79954c() {
        return (t34) this.f216705j.getValue();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m79955d() {
        t34 t34VarM79954c = m79954c();
        return t34VarM79954c != null ? t34VarM79954c.m79955d() : this.f216698c;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m79956e() {
        t34 t34VarM79954c = m79954c();
        return t34VarM79954c != null ? t34VarM79954c.m79956e() : this.f216699d;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m79957f() {
        t34 t34VarM79954c = m79954c();
        return t34VarM79954c != null ? t34VarM79954c.m79957f() : this.f216700e;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m79958g() {
        t34 t34VarM79954c = m79954c();
        return t34VarM79954c != null ? t34VarM79954c.m79958g() : this.f216701f;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m79959h() {
        t34 t34VarM79954c = m79954c();
        return t34VarM79954c != null ? t34VarM79954c.m79959h() : this.f216702g;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m79960i() {
        t34 t34VarM79954c = m79954c();
        return t34VarM79954c != null ? t34VarM79954c.m79960i() : this.f216703h;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("app_launch_dialog_enabled", "android-feature-age-verification", m79952a()), new k8a("blocking_host_page_enabled", "android-feature-age-verification", m79953b()), new k8a("episode_play_command_interceptor_enabled", "android-feature-age-verification", m79955d()), new k8a("ignore_product_state_for_entry_points", "android-feature-age-verification", m79956e()), new k8a("request_parental_consent_button_enabled", "android-feature-age-verification", m79957f()), new k8a("settings_note_enabled", "android-feature-age-verification", m79958g()), new k8a("side_drawer_entry_point_enabled", "android-feature-age-verification", m79959h()), new k8a("unmapped_music_video_play_command_interceptor_enabled", "android-feature-age-verification", m79960i()));
    }
}
