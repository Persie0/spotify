package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class e851 extends g851 {

    /* JADX INFO: renamed from: a */
    public final int f57072a;

    /* JADX INFO: renamed from: b */
    public final int f57073b;

    /* JADX INFO: renamed from: c */
    public final Throwable f57074c;

    public e851(int i, int i2, Throwable th) {
        this.f57072a = i;
        this.f57073b = i2;
        this.f57074c = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e851)) {
            return false;
        }
        e851 e851Var = (e851) obj;
        return this.f57072a == e851Var.f57072a && this.f57073b == e851Var.f57073b && wj50.m88271j(this.f57074c, e851Var.f57074c);
    }

    public final int hashCode() {
        int iM40938f = f710.m40938f(this.f57073b, edb.m38547C(this.f57072a) * 31, 31);
        Throwable th = this.f57074c;
        return iM40938f + (th == null ? 0 : th.hashCode());
    }
}
