package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class eh4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f59483a;

    /* JADX INFO: renamed from: b */
    public final boolean f59484b;

    /* JADX INFO: renamed from: c */
    public final boolean f59485c;

    /* JADX INFO: renamed from: d */
    public final boolean f59486d;

    /* JADX INFO: renamed from: e */
    public final boolean f59487e;

    /* JADX INFO: renamed from: f */
    public final boolean f59488f;

    /* JADX INFO: renamed from: g */
    public final boolean f59489g;

    /* JADX INFO: renamed from: h */
    public final boolean f59490h;

    /* JADX INFO: renamed from: i */
    public final boolean f59491i;

    /* JADX INFO: renamed from: j */
    public final boolean f59492j;

    /* JADX INFO: renamed from: k */
    public final boolean f59493k;

    /* JADX INFO: renamed from: l */
    public final fnk0 f59494l;

    /* JADX INFO: renamed from: m */
    public final bji f59495m;

    /* JADX INFO: renamed from: n */
    public final wg61 f59496n = new wg61(new f30(this, 20));

    /* JADX INFO: renamed from: o */
    public final wg61 f59497o = new wg61(new bh4(this, 1));

    public eh4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, fnk0 fnk0Var, bji bjiVar) {
        this.f59483a = z;
        this.f59484b = z2;
        this.f59485c = z3;
        this.f59486d = z4;
        this.f59487e = z5;
        this.f59488f = z6;
        this.f59489g = z7;
        this.f59490h = z8;
        this.f59491i = z9;
        this.f59492j = z10;
        this.f59493k = z11;
        this.f59494l = fnk0Var;
        this.f59495m = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m38895a() {
        eh4 eh4VarM38898d = m38898d();
        return eh4VarM38898d != null ? eh4VarM38898d.m38895a() : this.f59483a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m38896b() {
        eh4 eh4VarM38898d = m38898d();
        return eh4VarM38898d != null ? eh4VarM38898d.m38896b() : this.f59484b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m38897c() {
        eh4 eh4VarM38898d = m38898d();
        return eh4VarM38898d != null ? eh4VarM38898d.m38897c() : this.f59485c;
    }

    /* JADX INFO: renamed from: d */
    public final eh4 m38898d() {
        return (eh4) this.f59497o.getValue();
    }

    /* JADX INFO: renamed from: e */
    public final boolean m38899e() {
        eh4 eh4VarM38898d = m38898d();
        return eh4VarM38898d != null ? eh4VarM38898d.m38899e() : this.f59486d;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m38900f() {
        eh4 eh4VarM38898d = m38898d();
        return eh4VarM38898d != null ? eh4VarM38898d.m38900f() : this.f59487e;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m38901g() {
        eh4 eh4VarM38898d = m38898d();
        return eh4VarM38898d != null ? eh4VarM38898d.m38901g() : this.f59488f;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m38902h() {
        eh4 eh4VarM38898d = m38898d();
        return eh4VarM38898d != null ? eh4VarM38898d.m38902h() : this.f59489g;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m38903i() {
        eh4 eh4VarM38898d = m38898d();
        return eh4VarM38898d != null ? eh4VarM38898d.m38903i() : this.f59490h;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m38904j() {
        eh4 eh4VarM38898d = m38898d();
        return eh4VarM38898d != null ? eh4VarM38898d.m38904j() : this.f59491i;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m38905k() {
        eh4 eh4VarM38898d = m38898d();
        return eh4VarM38898d != null ? eh4VarM38898d.m38905k() : this.f59492j;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m38906l() {
        eh4 eh4VarM38898d = m38898d();
        return eh4VarM38898d != null ? eh4VarM38898d.m38906l() : this.f59493k;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("book_progress_on_lock_screen_enabled", "android-media-session", m38895a()), new k8a("burst_skip_enabled", "android-media-session", m38896b()), new k8a("canvas_in_media_session_enabled", "android-media-session", m38897c()), new k8a("enable_chaptered_content_experience", "android-media-session", m38899e()), new k8a("enable_cold_boot_defaults", "android-media-session", m38900f()), new k8a("enable_lossless_signifiers_when_car_is_connected", "android-media-session", m38901g()), new k8a("media3_enabled", "android-media-session", m38902h()), new k8a("playback_takeover_enabled", "android-media-session", m38903i()), new k8a("restrict_playing_state_when_connect_car_is_active", "android-media-session", m38904j()), new k8a("should_use_vit", "android-media-session", m38905k()), new k8a("skip_to_next_chapter_enabled", "android-media-session", m38906l()));
    }
}
