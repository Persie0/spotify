package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class be4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f26271a;

    /* JADX INFO: renamed from: b */
    public final boolean f26272b;

    /* JADX INFO: renamed from: c */
    public final boolean f26273c;

    /* JADX INFO: renamed from: d */
    public final boolean f26274d;

    /* JADX INFO: renamed from: e */
    public final boolean f26275e;

    /* JADX INFO: renamed from: f */
    public final bji f26276f;

    /* JADX INFO: renamed from: g */
    public final wg61 f26277g;

    public be4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, bji bjiVar) {
        this.f26271a = z;
        this.f26272b = z2;
        this.f26273c = z3;
        this.f26274d = z4;
        this.f26275e = z5;
        this.f26276f = bjiVar;
        this.f26277g = new wg61(new dd4(this, 20));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m28869a() {
        be4 be4Var = (be4) this.f26277g.getValue();
        return be4Var != null ? be4Var.m28869a() : this.f26271a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m28870b() {
        be4 be4Var = (be4) this.f26277g.getValue();
        return be4Var != null ? be4Var.m28870b() : this.f26272b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m28871c() {
        be4 be4Var = (be4) this.f26277g.getValue();
        return be4Var != null ? be4Var.m28871c() : this.f26273c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m28872d() {
        be4 be4Var = (be4) this.f26277g.getValue();
        return be4Var != null ? be4Var.m28872d() : this.f26274d;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m28873e() {
        be4 be4Var = (be4) this.f26277g.getValue();
        return be4Var != null ? be4Var.m28873e() : this.f26275e;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_genres_chip_bar_action", "android-list-ux-platform-consumers-likedsongs-shared", m28869a()), new k8a("enable_graduation_chip", "android-list-ux-platform-consumers-likedsongs-shared", m28870b()), new k8a("enable_independent_filter_chips_section", "android-list-ux-platform-consumers-likedsongs-shared", m28871c()), new k8a("use_header_slots", "android-list-ux-platform-consumers-likedsongs-shared", m28872d()), new k8a("use_select_chip_language_for_playlist_name", "android-list-ux-platform-consumers-likedsongs-shared", m28873e()));
    }

    public be4(bji bjiVar) {
        this(false, true, true, false, true, bjiVar);
    }
}
