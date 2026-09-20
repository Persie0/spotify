package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class fj4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f70071a;

    /* JADX INFO: renamed from: b */
    public final boolean f70072b;

    /* JADX INFO: renamed from: c */
    public final boolean f70073c;

    /* JADX INFO: renamed from: d */
    public final bji f70074d;

    /* JADX INFO: renamed from: e */
    public final wg61 f70075e = new wg61(new si4(this, 12));

    public fj4(boolean z, boolean z2, boolean z3, bji bjiVar) {
        this.f70071a = z;
        this.f70072b = z2;
        this.f70073c = z3;
        this.f70074d = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m41791a() {
        fj4 fj4Var = (fj4) this.f70075e.getValue();
        return fj4Var != null ? fj4Var.m41791a() : this.f70071a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m41792b() {
        fj4 fj4Var = (fj4) this.f70075e.getValue();
        return fj4Var != null ? fj4Var.m41792b() : this.f70072b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m41793c() {
        fj4 fj4Var = (fj4) this.f70075e.getValue();
        return fj4Var != null ? fj4Var.m41793c() : this.f70073c;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("book_progress_in_npv_header_enabled", "android-nowplaying-navcontext", m41791a()), new k8a("book_progress_in_playlist_context_header_enabled", "android-nowplaying-navcontext", m41792b()), new k8a("show_artist_title_from_search_enabled", "android-nowplaying-navcontext", m41793c()));
    }
}
