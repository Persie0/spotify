package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class j54 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f108860a;

    /* JADX INFO: renamed from: b */
    public final boolean f108861b;

    /* JADX INFO: renamed from: c */
    public final boolean f108862c;

    /* JADX INFO: renamed from: d */
    public final boolean f108863d;

    /* JADX INFO: renamed from: e */
    public final boolean f108864e;

    /* JADX INFO: renamed from: f */
    public final boolean f108865f;

    /* JADX INFO: renamed from: g */
    public final boolean f108866g;

    /* JADX INFO: renamed from: h */
    public final boolean f108867h;

    /* JADX INFO: renamed from: i */
    public final bji f108868i;

    /* JADX INFO: renamed from: j */
    public final wg61 f108869j;

    public j54(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, bji bjiVar) {
        this.f108860a = z;
        this.f108861b = z2;
        this.f108862c = z3;
        this.f108863d = z4;
        this.f108864e = z5;
        this.f108865f = z6;
        this.f108866g = z7;
        this.f108867h = z8;
        this.f108868i = bjiVar;
        this.f108869j = new wg61(new y34(this, 25));
    }

    /* JADX INFO: renamed from: a */
    public final j54 m52435a() {
        return (j54) this.f108869j.getValue();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m52436b() {
        j54 j54VarM52435a = m52435a();
        return j54VarM52435a != null ? j54VarM52435a.m52436b() : this.f108860a;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m52437c() {
        j54 j54VarM52435a = m52435a();
        return j54VarM52435a != null ? j54VarM52435a.m52437c() : this.f108861b;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m52438d() {
        j54 j54VarM52435a = m52435a();
        return j54VarM52435a != null ? j54VarM52435a.m52438d() : this.f108862c;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m52439e() {
        j54 j54VarM52435a = m52435a();
        return j54VarM52435a != null ? j54VarM52435a.m52439e() : this.f108863d;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m52440f() {
        j54 j54VarM52435a = m52435a();
        return j54VarM52435a != null ? j54VarM52435a.m52440f() : this.f108864e;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m52441g() {
        j54 j54VarM52435a = m52435a();
        return j54VarM52435a != null ? j54VarM52435a.m52441g() : this.f108865f;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m52442h() {
        j54 j54VarM52435a = m52435a();
        return j54VarM52435a != null ? j54VarM52435a.m52442h() : this.f108866g;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m52443i() {
        j54 j54VarM52435a = m52435a();
        return j54VarM52435a != null ? j54VarM52435a.m52443i() : this.f108867h;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_lyrics_multilanguage", "android-feature-lyrics-npvelements", m52436b()), new k8a("hide_lyrics_on_mixing_transition", "android-feature-lyrics-npvelements", m52437c()), new k8a("lifecycle_aware_lyrics_fetch_enabled", "android-feature-lyrics-npvelements", m52438d()), new k8a("lyrics_entry_point_button_v2_enabled", "android-feature-lyrics-npvelements", m52439e()), new k8a("lyrics_entry_point_enabled", "android-feature-lyrics-npvelements", m52440f()), new k8a("lyrics_on_car_player_enabled", "android-feature-lyrics-npvelements", m52441g()), new k8a("semantic_player_state_deduplication_enabled", "android-feature-lyrics-npvelements", m52442h()), new k8a("shared_npv_lyrics_loading_enabled", "android-feature-lyrics-npvelements", m52443i()));
    }

    public j54(bji bjiVar) {
        this(false, false, false, false, false, false, false, false, bjiVar);
    }
}
