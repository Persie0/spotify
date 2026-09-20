package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class d74 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f45986a;

    /* JADX INFO: renamed from: b */
    public final boolean f45987b;

    /* JADX INFO: renamed from: c */
    public final boolean f45988c;

    /* JADX INFO: renamed from: d */
    public final boolean f45989d;

    /* JADX INFO: renamed from: e */
    public final boolean f45990e;

    /* JADX INFO: renamed from: f */
    public final bji f45991f;

    /* JADX INFO: renamed from: g */
    public final wg61 f45992g;

    public d74(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, bji bjiVar) {
        this.f45986a = z;
        this.f45987b = z2;
        this.f45988c = z3;
        this.f45989d = z4;
        this.f45990e = z5;
        this.f45991f = bjiVar;
        this.f45992g = new wg61(new o54(this, 28));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m35175a() {
        d74 d74Var = (d74) this.f45992g.getValue();
        return d74Var != null ? d74Var.m35175a() : this.f45986a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m35176b() {
        d74 d74Var = (d74) this.f45992g.getValue();
        return d74Var != null ? d74Var.m35176b() : this.f45987b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m35177c() {
        d74 d74Var = (d74) this.f45992g.getValue();
        return d74Var != null ? d74Var.m35177c() : this.f45988c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m35178d() {
        d74 d74Var = (d74) this.f45992g.getValue();
        return d74Var != null ? d74Var.m35178d() : this.f45989d;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m35179e() {
        d74 d74Var = (d74) this.f45992g.getValue();
        return d74Var != null ? d74Var.m35179e() : this.f45990e;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_auto_create_playlist", "android-feature-song-dna", m35175a()), new k8a("enable_contributor_sheet", "android-feature-song-dna", m35176b()), new k8a("enable_go_to_covers_playlist", "android-feature-song-dna", m35177c()), new k8a("enable_song_dna", "android-feature-song-dna", m35178d()), new k8a("enable_song_dna_share", "android-feature-song-dna", m35179e()));
    }

    public d74(bji bjiVar) {
        this(false, false, false, false, false, bjiVar);
    }
}
