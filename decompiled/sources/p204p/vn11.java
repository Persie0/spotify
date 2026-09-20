package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class vn11 {

    /* JADX INFO: renamed from: a */
    public final String f242972a;

    /* JADX INFO: renamed from: b */
    public final String f242973b;

    /* JADX INFO: renamed from: c */
    public final String f242974c;

    /* JADX INFO: renamed from: d */
    public final String f242975d;

    /* JADX INFO: renamed from: e */
    public final int f242976e;

    public vn11(int i, String str, String str2, String str3, String str4) {
        this.f242972a = str;
        this.f242973b = str2;
        this.f242974c = str3;
        this.f242975d = str4;
        this.f242976e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vn11)) {
            return false;
        }
        vn11 vn11Var = (vn11) obj;
        return this.f242972a.equals(vn11Var.f242972a) && wj50.m88271j(this.f242973b, vn11Var.f242973b) && wj50.m88271j(this.f242974c, vn11Var.f242974c) && wj50.m88271j(this.f242975d, vn11Var.f242975d) && this.f242976e == vn11Var.f242976e;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f242972a.hashCode() * 31, 31, this.f242973b);
        String str = this.f242974c;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f242975d;
        return edb.m38547C(this.f242976e) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
