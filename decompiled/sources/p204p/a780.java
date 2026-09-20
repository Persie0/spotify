package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class a780 {

    /* JADX INFO: renamed from: a */
    public final d3h1 f12991a;

    /* JADX INFO: renamed from: b */
    public final boolean f12992b;

    /* JADX INFO: renamed from: c */
    public final z650 f12993c;

    /* JADX INFO: renamed from: d */
    public final kbm0 f12994d;

    public a780(d3h1 d3h1Var, boolean z, z650 z650Var, kbm0 kbm0Var) {
        this.f12991a = d3h1Var;
        this.f12992b = z;
        this.f12993c = z650Var;
        this.f12994d = kbm0Var;
    }

    /* JADX INFO: renamed from: a */
    public static a780 m24929a(a780 a780Var, d3h1 d3h1Var, boolean z, int i) {
        if ((i & 1) != 0) {
            d3h1Var = a780Var.f12991a;
        }
        if ((i & 2) != 0) {
            z = a780Var.f12992b;
        }
        z650 z650Var = a780Var.f12993c;
        kbm0 kbm0Var = a780Var.f12994d;
        a780Var.getClass();
        return new a780(d3h1Var, z, z650Var, kbm0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a780)) {
            return false;
        }
        a780 a780Var = (a780) obj;
        return wj50.m88271j(this.f12991a, a780Var.f12991a) && this.f12992b == a780Var.f12992b && wj50.m88271j(this.f12993c, a780Var.f12993c) && wj50.m88271j(this.f12994d, a780Var.f12994d);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(this.f12991a.hashCode() * 31, 31, this.f12992b);
        z650 z650Var = this.f12993c;
        int iHashCode = (iM77245d + (z650Var == null ? 0 : z650Var.f279709a.hashCode())) * 31;
        kbm0 kbm0Var = this.f12994d;
        return iHashCode + (kbm0Var != null ? kbm0Var.f121231a.hashCode() : 0);
    }
}
