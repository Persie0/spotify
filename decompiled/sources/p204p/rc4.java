package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class rc4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f197717a;

    /* JADX INFO: renamed from: b */
    public final boolean f197718b;

    /* JADX INFO: renamed from: c */
    public final boolean f197719c;

    /* JADX INFO: renamed from: d */
    public final bji f197720d;

    /* JADX INFO: renamed from: e */
    public final wg61 f197721e;

    public rc4(boolean z, boolean z2, boolean z3, bji bjiVar) {
        this.f197717a = z;
        this.f197718b = z2;
        this.f197719c = z3;
        this.f197720d = bjiVar;
        this.f197721e = new wg61(new sb4(this, 21));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m75202a() {
        rc4 rc4Var = (rc4) this.f197721e.getValue();
        return rc4Var != null ? rc4Var.m75202a() : this.f197717a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m75203b() {
        rc4 rc4Var = (rc4) this.f197721e.getValue();
        return rc4Var != null ? rc4Var.m75203b() : this.f197718b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m75204c() {
        rc4 rc4Var = (rc4) this.f197721e.getValue();
        return rc4Var != null ? rc4Var.m75204c() : this.f197719c;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("lenses_filter_chips_enabled", "android-libs-playlist-entity-modes-blend", m75202a()), new k8a("referrals_entrypoint_section_enabled", "android-libs-playlist-entity-modes-blend", m75203b()), new k8a("row_slots_enabled", "android-libs-playlist-entity-modes-blend", m75204c()));
    }

    public rc4(bji bjiVar) {
        this(true, false, false, bjiVar);
    }
}
