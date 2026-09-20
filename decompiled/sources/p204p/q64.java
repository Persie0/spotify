package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class q64 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f185662a;

    /* JADX INFO: renamed from: b */
    public final boolean f185663b;

    /* JADX INFO: renamed from: c */
    public final boolean f185664c;

    /* JADX INFO: renamed from: d */
    public final boolean f185665d;

    /* JADX INFO: renamed from: e */
    public final boolean f185666e;

    /* JADX INFO: renamed from: f */
    public final boolean f185667f;

    /* JADX INFO: renamed from: g */
    public final boolean f185668g;

    /* JADX INFO: renamed from: h */
    public final boolean f185669h;

    /* JADX INFO: renamed from: i */
    public final boolean f185670i;

    /* JADX INFO: renamed from: j */
    public final boolean f185671j;

    /* JADX INFO: renamed from: k */
    public final boolean f185672k;

    /* JADX INFO: renamed from: l */
    public final bji f185673l;

    /* JADX INFO: renamed from: m */
    public final wg61 f185674m;

    public q64(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, bji bjiVar) {
        this.f185662a = z;
        this.f185663b = z2;
        this.f185664c = z3;
        this.f185665d = z4;
        this.f185666e = z5;
        this.f185667f = z6;
        this.f185668g = z7;
        this.f185669h = z8;
        this.f185670i = z9;
        this.f185671j = z10;
        this.f185672k = z11;
        this.f185673l = bjiVar;
        this.f185674m = new wg61(new o54(this, 23));
    }

    /* JADX INFO: renamed from: a */
    public final q64 m72203a() {
        return (q64) this.f185674m.getValue();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m72204b() {
        q64 q64VarM72203a = m72203a();
        return q64VarM72203a != null ? q64VarM72203a.m72204b() : this.f185662a;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m72205c() {
        q64 q64VarM72203a = m72203a();
        return q64VarM72203a != null ? q64VarM72203a.m72205c() : this.f185663b;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m72206d() {
        q64 q64VarM72203a = m72203a();
        return q64VarM72203a != null ? q64VarM72203a.m72206d() : this.f185664c;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m72207e() {
        q64 q64VarM72203a = m72203a();
        return q64VarM72203a != null ? q64VarM72203a.m72207e() : this.f185665d;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m72208f() {
        q64 q64VarM72203a = m72203a();
        return q64VarM72203a != null ? q64VarM72203a.m72208f() : this.f185666e;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m72209g() {
        q64 q64VarM72203a = m72203a();
        return q64VarM72203a != null ? q64VarM72203a.m72209g() : this.f185667f;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m72210h() {
        q64 q64VarM72203a = m72203a();
        return q64VarM72203a != null ? q64VarM72203a.m72210h() : this.f185668g;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m72211i() {
        q64 q64VarM72203a = m72203a();
        return q64VarM72203a != null ? q64VarM72203a.m72211i() : this.f185669h;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m72212j() {
        q64 q64VarM72203a = m72203a();
        return q64VarM72203a != null ? q64VarM72203a.m72212j() : this.f185670i;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m72213k() {
        q64 q64VarM72203a = m72203a();
        return q64VarM72203a != null ? q64VarM72203a.m72213k() : this.f185671j;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m72214l() {
        q64 q64VarM72203a = m72203a();
        return q64VarM72203a != null ? q64VarM72203a.m72214l() : this.f185672k;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_album_reporting", "android-feature-reporting", m72204b()), new k8a("enable_artist_reporting", "android-feature-reporting", m72205c()), new k8a("enable_audiobook_chapter_reporting", "android-feature-reporting", m72206d()), new k8a("enable_author_reporting", "android-feature-reporting", m72207e()), new k8a("enable_canvas_track_reporting", "android-feature-reporting", m72208f()), new k8a("enable_episode_reporting", "android-feature-reporting", m72209g()), new k8a("enable_hybrid_report_flow", "android-feature-reporting", m72210h()), new k8a("enable_promo_episode_reporting", "android-feature-reporting", m72211i()), new k8a("enable_show_reporting", "android-feature-reporting", m72212j()), new k8a("enable_track_reporting", "android-feature-reporting", m72213k()), new k8a("enable_user_reporting", "android-feature-reporting", m72214l()));
    }

    public q64(bji bjiVar) {
        this(false, false, false, false, true, false, false, false, false, false, true, bjiVar);
    }
}
