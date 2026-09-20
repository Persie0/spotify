package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ac4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f14233a;

    /* JADX INFO: renamed from: b */
    public final boolean f14234b;

    /* JADX INFO: renamed from: c */
    public final boolean f14235c;

    /* JADX INFO: renamed from: d */
    public final boolean f14236d;

    /* JADX INFO: renamed from: e */
    public final boolean f14237e;

    /* JADX INFO: renamed from: f */
    public final boolean f14238f;

    /* JADX INFO: renamed from: g */
    public final boolean f14239g;

    /* JADX INFO: renamed from: h */
    public final boolean f14240h;

    /* JADX INFO: renamed from: i */
    public final boolean f14241i;

    /* JADX INFO: renamed from: j */
    public final bji f14242j;

    /* JADX INFO: renamed from: k */
    public final wg61 f14243k;

    public ac4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, bji bjiVar) {
        this.f14233a = z;
        this.f14234b = z2;
        this.f14235c = z3;
        this.f14236d = z4;
        this.f14237e = z5;
        this.f14238f = z6;
        this.f14239g = z7;
        this.f14240h = z8;
        this.f14241i = z9;
        this.f14242j = bjiVar;
        this.f14243k = new wg61(new sb4(this, 7));
    }

    /* JADX INFO: renamed from: a */
    public final ac4 m25421a() {
        return (ac4) this.f14243k.getValue();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m25422b() {
        ac4 ac4VarM25421a = m25421a();
        return ac4VarM25421a != null ? ac4VarM25421a.m25422b() : this.f14233a;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m25423c() {
        ac4 ac4VarM25421a = m25421a();
        return ac4VarM25421a != null ? ac4VarM25421a.m25423c() : this.f14234b;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m25424d() {
        ac4 ac4VarM25421a = m25421a();
        return ac4VarM25421a != null ? ac4VarM25421a.m25424d() : this.f14235c;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m25425e() {
        ac4 ac4VarM25421a = m25421a();
        return ac4VarM25421a != null ? ac4VarM25421a.m25425e() : this.f14236d;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m25426f() {
        ac4 ac4VarM25421a = m25421a();
        return ac4VarM25421a != null ? ac4VarM25421a.m25426f() : this.f14237e;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m25427g() {
        ac4 ac4VarM25421a = m25421a();
        return ac4VarM25421a != null ? ac4VarM25421a.m25427g() : this.f14238f;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m25428h() {
        ac4 ac4VarM25421a = m25421a();
        return ac4VarM25421a != null ? ac4VarM25421a.m25428h() : this.f14239g;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m25429i() {
        ac4 ac4VarM25421a = m25421a();
        return ac4VarM25421a != null ? ac4VarM25421a.m25429i() : this.f14240h;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m25430j() {
        ac4 ac4VarM25421a = m25421a();
        return ac4VarM25421a != null ? ac4VarM25421a.m25430j() : this.f14241i;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("is_hello_kitty_easter_egg_enabled", "android-libs-nowplaying-elements-seekbar", m25422b()), new k8a("is_pokemon_easter_egg_enabled", "android-libs-nowplaying-elements-seekbar", m25423c()), new k8a("is_sanremo_easter_egg_enabled", "android-libs-nowplaying-elements-seekbar", m25424d()), new k8a("is_stranger_things_easter_egg_enabled", "android-libs-nowplaying-elements-seekbar", m25425e()), new k8a("is_super_mario_luma_easter_egg_enabled", "android-libs-nowplaying-elements-seekbar", m25426f()), new k8a("is_super_mario_star_easter_egg_enabled", "android-libs-nowplaying-elements-seekbar", m25427g()), new k8a("is_wednesday_official_easter_egg_enabled", "android-libs-nowplaying-elements-seekbar", m25428h()), new k8a("is_wicked_easter_egg_enabled", "android-libs-nowplaying-elements-seekbar", m25429i()), new k8a("is_world_cup_easter_egg_enabled", "android-libs-nowplaying-elements-seekbar", m25430j()));
    }

    public ac4(bji bjiVar) {
        this(false, false, false, false, false, false, false, false, false, bjiVar);
    }
}
