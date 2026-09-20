package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class cn01 {

    /* JADX INFO: renamed from: a */
    public final sr01 f39857a;

    /* JADX INFO: renamed from: b */
    public final int f39858b;

    /* JADX INFO: renamed from: c */
    public final int f39859c;

    /* JADX INFO: renamed from: d */
    public final ou31 f39860d;

    public cn01(sr01 sr01Var, int i, int i2, ou31 ou31Var) {
        this.f39857a = sr01Var;
        this.f39858b = i;
        this.f39859c = i2;
        this.f39860d = ou31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cn01)) {
            return false;
        }
        cn01 cn01Var = (cn01) obj;
        return wj50.m88271j(this.f39857a, cn01Var.f39857a) && this.f39858b == cn01Var.f39858b && this.f39859c == cn01Var.f39859c && wj50.m88271j(this.f39860d, cn01Var.f39860d);
    }

    public final int hashCode() {
        return this.f39860d.hashCode() + f710.m40938f(this.f39859c, mt60.m62800g(this.f39858b, this.f39857a.hashCode() * 31, 31), 31);
    }
}
