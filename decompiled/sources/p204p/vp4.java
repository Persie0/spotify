package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class vp4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f243584a;

    /* JADX INFO: renamed from: b */
    public final boolean f243585b;

    /* JADX INFO: renamed from: c */
    public final boolean f243586c;

    /* JADX INFO: renamed from: d */
    public final boolean f243587d;

    /* JADX INFO: renamed from: e */
    public final boolean f243588e;

    /* JADX INFO: renamed from: f */
    public final boolean f243589f;

    /* JADX INFO: renamed from: g */
    public final boolean f243590g;

    /* JADX INFO: renamed from: h */
    public final wy91 f243591h;

    /* JADX INFO: renamed from: i */
    public final wg61 f243592i = new wg61(new kp4(this, 7));

    public vp4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, wy91 wy91Var) {
        this.f243584a = z;
        this.f243585b = z2;
        this.f243586c = z3;
        this.f243587d = z4;
        this.f243588e = z5;
        this.f243589f = z6;
        this.f243590g = z7;
        this.f243591h = wy91Var;
    }

    /* JADX INFO: renamed from: a */
    public final vp4 m86113a() {
        return (vp4) this.f243592i.getValue();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m86114b() {
        vp4 vp4VarM86113a = m86113a();
        return vp4VarM86113a != null ? vp4VarM86113a.m86114b() : this.f243584a;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m86115c() {
        vp4 vp4VarM86113a = m86113a();
        return vp4VarM86113a != null ? vp4VarM86113a.m86115c() : this.f243585b;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m86116d() {
        vp4 vp4VarM86113a = m86113a();
        return vp4VarM86113a != null ? vp4VarM86113a.m86116d() : this.f243586c;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m86117e() {
        vp4 vp4VarM86113a = m86113a();
        return vp4VarM86113a != null ? vp4VarM86113a.m86117e() : this.f243587d;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m86118f() {
        vp4 vp4VarM86113a = m86113a();
        return vp4VarM86113a != null ? vp4VarM86113a.m86118f() : this.f243588e;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m86119g() {
        vp4 vp4VarM86113a = m86113a();
        return vp4VarM86113a != null ? vp4VarM86113a.m86119g() : this.f243589f;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m86120h() {
        vp4 vp4VarM86113a = m86113a();
        return vp4VarM86113a != null ? vp4VarM86113a.m86120h() : this.f243590g;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("desktop_layout_detection_enabled", "android-system-encore", m86114b()), new k8a("enable_programmatic_episode_card", "android-system-encore", m86115c()), new k8a("enable_programmatic_play_button", "android-system-encore", m86116d()), new k8a("enable_programmatic_section_headings", "android-system-encore", m86117e()), new k8a("enable_programmatic_track_row", "android-system-encore", m86118f()), new k8a("medium_sizes_enabled", "android-system-encore", m86119g()), new k8a("tinted_secondary_buttons", "android-system-encore", m86120h()));
    }
}
