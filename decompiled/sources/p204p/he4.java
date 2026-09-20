package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class he4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f90313a;

    /* JADX INFO: renamed from: b */
    public final boolean f90314b;

    /* JADX INFO: renamed from: c */
    public final bji f90315c;

    /* JADX INFO: renamed from: d */
    public final wg61 f90316d;

    public he4(boolean z, boolean z2, bji bjiVar) {
        this.f90313a = z;
        this.f90314b = z2;
        this.f90315c = bjiVar;
        this.f90316d = new wg61(new dd4(this, 26));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m47265a() {
        he4 he4Var = (he4) this.f90316d.getValue();
        return he4Var != null ? he4Var.m47265a() : this.f90313a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m47266b() {
        he4 he4Var = (he4) this.f90316d.getValue();
        return he4Var != null ? he4Var.m47266b() : this.f90314b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("allow_accept_of_list_component", "android-list-ux-platform-consumers-playlistcollaboration-listcomponents-reactionlens", m47265a()), new k8a("allow_reaction_lens", "android-list-ux-platform-consumers-playlistcollaboration-listcomponents-reactionlens", m47266b()));
    }

    public he4(bji bjiVar) {
        this(false, false, bjiVar);
    }
}
