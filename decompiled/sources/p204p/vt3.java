package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class vt3 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f244538a;

    /* JADX INFO: renamed from: b */
    public final boolean f244539b;

    /* JADX INFO: renamed from: c */
    public final bji f244540c;

    /* JADX INFO: renamed from: d */
    public final wg61 f244541d = new wg61(new w62(this, 22));

    public vt3(boolean z, boolean z2, bji bjiVar) {
        this.f244538a = z;
        this.f244539b = z2;
        this.f244540c = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m86370a() {
        vt3 vt3Var = (vt3) this.f244541d.getValue();
        return vt3Var != null ? vt3Var.m86370a() : this.f244538a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m86371b() {
        vt3 vt3Var = (vt3) this.f244541d.getValue();
        return vt3Var != null ? vt3Var.m86371b() : this.f244539b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("cached_has_users", "android-accountswitching", m86370a()), new k8a("direct_prefs_access", "android-accountswitching", m86371b()));
    }
}
