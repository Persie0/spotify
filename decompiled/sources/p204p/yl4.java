package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class yl4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f273900a;

    /* JADX INFO: renamed from: b */
    public final boolean f273901b;

    /* JADX INFO: renamed from: c */
    public final boolean f273902c;

    /* JADX INFO: renamed from: d */
    public final boolean f273903d;

    /* JADX INFO: renamed from: e */
    public final bji f273904e;

    /* JADX INFO: renamed from: f */
    public final wg61 f273905f;

    public yl4(boolean z, boolean z2, boolean z3, boolean z4, bji bjiVar) {
        this.f273900a = z;
        this.f273901b = z2;
        this.f273902c = z3;
        this.f273903d = z4;
        this.f273904e = bjiVar;
        this.f273905f = new wg61(new jk4(this, 14));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m94148a() {
        yl4 yl4Var = (yl4) this.f273905f.getValue();
        return yl4Var != null ? yl4Var.m94148a() : this.f273900a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m94149b() {
        yl4 yl4Var = (yl4) this.f273905f.getValue();
        return yl4Var != null ? yl4Var.m94149b() : this.f273901b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m94150c() {
        yl4 yl4Var = (yl4) this.f273905f.getValue();
        return yl4Var != null ? yl4Var.m94150c() : this.f273902c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m94151d() {
        yl4 yl4Var = (yl4) this.f273905f.getValue();
        return yl4Var != null ? yl4Var.m94151d() : this.f273903d;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("bypass_auth_for_pme", "android-pme-mbs-configuration", m94148a()), new k8a("content_programming_for_pme_enabled", "android-pme-mbs-configuration", m94149b()), new k8a("remote_recently_played_for_pme_enabled", "android-pme-mbs-configuration", m94150c()), new k8a("restrict_check_enabled", "android-pme-mbs-configuration", m94151d()));
    }

    public yl4(bji bjiVar) {
        this(false, true, false, true, bjiVar);
    }
}
