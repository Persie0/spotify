package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class bsk0 {

    /* JADX INFO: renamed from: a */
    public final int f30343a;

    /* JADX INFO: renamed from: b */
    public final String f30344b;

    /* JADX INFO: renamed from: c */
    public final int f30345c;

    /* JADX INFO: renamed from: d */
    public final String f30346d;

    /* JADX INFO: renamed from: e */
    public final boolean f30347e;

    public bsk0(int i, boolean z, String str, int i2, String str2) {
        this.f30343a = i;
        this.f30344b = str;
        this.f30345c = i2;
        this.f30346d = str2;
        this.f30347e = z;
    }

    /* JADX INFO: renamed from: a */
    public static bsk0 m30443a(bsk0 bsk0Var, int i, String str, int i2, String str2, boolean z, int i3) {
        if ((i3 & 1) != 0) {
            i = bsk0Var.f30343a;
        }
        int i4 = i;
        if ((i3 & 2) != 0) {
            str = bsk0Var.f30344b;
        }
        String str3 = str;
        if ((i3 & 4) != 0) {
            i2 = bsk0Var.f30345c;
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            str2 = bsk0Var.f30346d;
        }
        String str4 = str2;
        if ((i3 & 16) != 0) {
            z = bsk0Var.f30347e;
        }
        bsk0Var.getClass();
        return new bsk0(i4, z, str3, i5, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bsk0)) {
            return false;
        }
        bsk0 bsk0Var = (bsk0) obj;
        return this.f30343a == bsk0Var.f30343a && wj50.m88271j(this.f30344b, bsk0Var.f30344b) && this.f30345c == bsk0Var.f30345c && wj50.m88271j(this.f30346d, bsk0Var.f30346d) && this.f30347e == bsk0Var.f30347e;
    }

    public final int hashCode() {
        int i = this.f30343a;
        int iM77243b = s571.m77243b((i == 0 ? 0 : edb.m38547C(i)) * 31, 31, this.f30344b);
        int i2 = this.f30345c;
        return Boolean.hashCode(this.f30347e) + s571.m77243b((iM77243b + (i2 != 0 ? edb.m38547C(i2) : 0)) * 31, 31, this.f30346d);
    }
}
