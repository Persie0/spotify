package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class of4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f164633a;

    /* JADX INFO: renamed from: b */
    public final boolean f164634b;

    /* JADX INFO: renamed from: c */
    public final bji f164635c;

    /* JADX INFO: renamed from: d */
    public final wg61 f164636d = new wg61(new ne4(this, 22));

    public of4(boolean z, boolean z2, bji bjiVar) {
        this.f164633a = z;
        this.f164634b = z2;
        this.f164635c = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m66812a() {
        of4 of4Var = (of4) this.f164636d.getValue();
        return of4Var != null ? of4Var.m66812a() : this.f164633a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m66813b() {
        of4 of4Var = (of4) this.f164636d.getValue();
        return of4Var != null ? of4Var.m66813b() : this.f164634b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_composer_share", "android-lyrics-share-controller", m66812a()), new k8a("enable_share_card_carousel", "android-lyrics-share-controller", m66813b()));
    }
}
