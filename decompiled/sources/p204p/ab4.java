package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ab4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f13987a;

    /* JADX INFO: renamed from: b */
    public final boolean f13988b;

    /* JADX INFO: renamed from: c */
    public final boolean f13989c;

    /* JADX INFO: renamed from: d */
    public final boolean f13990d;

    /* JADX INFO: renamed from: e */
    public final boolean f13991e;

    /* JADX INFO: renamed from: f */
    public final boolean f13992f;

    /* JADX INFO: renamed from: g */
    public final bji f13993g;

    /* JADX INFO: renamed from: h */
    public final wg61 f13994h;

    public ab4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, bji bjiVar) {
        this.f13987a = z;
        this.f13988b = z2;
        this.f13989c = z3;
        this.f13990d = z4;
        this.f13991e = z5;
        this.f13992f = z6;
        this.f13993g = bjiVar;
        this.f13994h = new wg61(new ga4(this, 15));
    }

    /* JADX INFO: renamed from: a */
    public final ab4 m25319a() {
        return (ab4) this.f13994h.getValue();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m25320b() {
        ab4 ab4VarM25319a = m25319a();
        return ab4VarM25319a != null ? ab4VarM25319a.m25320b() : this.f13987a;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m25321c() {
        ab4 ab4VarM25319a = m25319a();
        return ab4VarM25319a != null ? ab4VarM25319a.m25321c() : this.f13988b;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m25322d() {
        ab4 ab4VarM25319a = m25319a();
        return ab4VarM25319a != null ? ab4VarM25319a.m25322d() : this.f13989c;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m25323e() {
        ab4 ab4VarM25319a = m25319a();
        return ab4VarM25319a != null ? ab4VarM25319a.m25323e() : this.f13990d;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m25324f() {
        ab4 ab4VarM25319a = m25319a();
        return ab4VarM25319a != null ? ab4VarM25319a.m25324f() : this.f13991e;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m25325g() {
        ab4 ab4VarM25319a = m25319a();
        return ab4VarM25319a != null ? ab4VarM25319a.m25325g() : this.f13992f;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_contribution_notes_management", "android-libs-contribution-properties", m25320b()), new k8a("enable_notes_confirmation_snackbars", "android-libs-contribution-properties", m25321c()), new k8a("enable_release_row_notes", "android-libs-contribution-properties", m25322d()), new k8a("enable_track_notes", "android-libs-contribution-properties", m25323e()), new k8a("show_editorial_notes", "android-libs-contribution-properties", m25324f()), new k8a("show_user_notes", "android-libs-contribution-properties", m25325g()));
    }

    public ab4(bji bjiVar) {
        this(false, false, false, false, false, false, bjiVar);
    }
}
