package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class o3j0 {

    /* JADX INFO: renamed from: a */
    public final wwu f161379a;

    /* JADX INFO: renamed from: b */
    public final int f161380b;

    /* JADX INFO: renamed from: c */
    public final voc1 f161381c;

    /* JADX INFO: renamed from: d */
    public final y3j0 f161382d;

    /* JADX INFO: renamed from: e */
    public final boolean f161383e;

    /* JADX INFO: renamed from: f */
    public final n3j0 f161384f;

    public o3j0(wwu wwuVar, int i, voc1 voc1Var, y3j0 y3j0Var, boolean z, n3j0 n3j0Var) {
        this.f161379a = wwuVar;
        this.f161380b = i;
        this.f161381c = voc1Var;
        this.f161382d = y3j0Var;
        this.f161383e = z;
        this.f161384f = n3j0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3j0)) {
            return false;
        }
        o3j0 o3j0Var = (o3j0) obj;
        return wj50.m88271j(this.f161379a, o3j0Var.f161379a) && this.f161380b == o3j0Var.f161380b && wj50.m88271j(this.f161381c, o3j0Var.f161381c) && wj50.m88271j(this.f161382d, o3j0Var.f161382d) && this.f161383e == o3j0Var.f161383e && wj50.m88271j(this.f161384f, o3j0Var.f161384f);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(mt60.m62800g(this.f161380b, this.f161379a.hashCode() * 31, 31), 31, this.f161381c.f243453a);
        y3j0 y3j0Var = this.f161382d;
        return this.f161384f.hashCode() + s571.m77245d((iM77243b + (y3j0Var == null ? 0 : y3j0Var.hashCode())) * 31, 31, this.f161383e);
    }
}
