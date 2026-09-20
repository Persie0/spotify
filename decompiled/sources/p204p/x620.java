package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class x620 {

    /* JADX INFO: renamed from: a */
    public final y620 f258563a;

    /* JADX INFO: renamed from: b */
    public final int f258564b;

    /* JADX INFO: renamed from: c */
    public final int f258565c;

    /* JADX INFO: renamed from: d */
    public final boolean f258566d;

    public x620(y620 y620Var, int i, int i2, boolean z) {
        this.f258563a = y620Var;
        this.f258564b = i;
        this.f258565c = i2;
        this.f258566d = z;
    }

    /* JADX INFO: renamed from: a */
    public static x620 m90072a(x620 x620Var, int i, int i2, boolean z, int i3) {
        y620 y620Var = (i3 & 1) != 0 ? x620Var.f258563a : y620.f269590a;
        if ((i3 & 2) != 0) {
            i = x620Var.f258564b;
        }
        if ((i3 & 4) != 0) {
            i2 = x620Var.f258565c;
        }
        if ((i3 & 8) != 0) {
            z = x620Var.f258566d;
        }
        x620Var.getClass();
        return new x620(y620Var, i, i2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x620)) {
            return false;
        }
        x620 x620Var = (x620) obj;
        return wj50.m88271j(this.f258563a, x620Var.f258563a) && this.f258564b == x620Var.f258564b && this.f258565c == x620Var.f258565c && this.f258566d == x620Var.f258566d;
    }

    public final int hashCode() {
        this.f258563a.getClass();
        int i = this.f258564b;
        int iM38547C = (4301500 + (i == 0 ? 0 : edb.m38547C(i))) * 31;
        int i2 = this.f258565c;
        return Boolean.hashCode(this.f258566d) + ((iM38547C + (i2 != 0 ? edb.m38547C(i2) : 0)) * 31);
    }
}
