package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class zsm0 {

    /* JADX INFO: renamed from: a */
    public final int f285976a;

    /* JADX INFO: renamed from: b */
    public final int f285977b;

    /* JADX INFO: renamed from: c */
    public final atm0 f285978c;

    public zsm0(int i, int i2, atm0 atm0Var) {
        this.f285976a = i;
        this.f285977b = i2;
        this.f285978c = atm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zsm0)) {
            return false;
        }
        zsm0 zsm0Var = (zsm0) obj;
        return this.f285976a == zsm0Var.f285976a && this.f285977b == zsm0Var.f285977b && wj50.m88271j(this.f285978c, zsm0Var.f285978c);
    }

    public final int hashCode() {
        return this.f285978c.hashCode() + mt60.m62800g(this.f285977b, Integer.hashCode(this.f285976a) * 31, 31);
    }
}
