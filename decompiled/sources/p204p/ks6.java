package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ks6 {

    /* JADX INFO: renamed from: a */
    public final String f125842a;

    /* JADX INFO: renamed from: b */
    public final String f125843b;

    /* JADX INFO: renamed from: c */
    public final String f125844c;

    /* JADX INFO: renamed from: d */
    public final boolean f125845d;

    /* JADX INFO: renamed from: e */
    public final boolean f125846e;

    /* JADX INFO: renamed from: f */
    public final int f125847f;

    public ks6(int i, String str, String str2, String str3, boolean z, boolean z2) {
        this.f125842a = str;
        this.f125843b = str2;
        this.f125844c = str3;
        this.f125845d = z;
        this.f125846e = z2;
        this.f125847f = i;
    }

    /* JADX INFO: renamed from: a */
    public static ks6 m57190a(ks6 ks6Var, String str, String str2, String str3, boolean z, boolean z2, int i, int i2) {
        if ((i2 & 1) != 0) {
            str = ks6Var.f125842a;
        }
        String str4 = str;
        if ((i2 & 2) != 0) {
            str2 = ks6Var.f125843b;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            str3 = ks6Var.f125844c;
        }
        String str6 = str3;
        if ((i2 & 8) != 0) {
            z = ks6Var.f125845d;
        }
        boolean z3 = z;
        if ((i2 & 16) != 0) {
            z2 = ks6Var.f125846e;
        }
        boolean z4 = z2;
        if ((i2 & 32) != 0) {
            i = ks6Var.f125847f;
        }
        ks6Var.getClass();
        return new ks6(i, str4, str5, str6, z3, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ks6)) {
            return false;
        }
        ks6 ks6Var = (ks6) obj;
        return wj50.m88271j(this.f125842a, ks6Var.f125842a) && wj50.m88271j(this.f125843b, ks6Var.f125843b) && wj50.m88271j(this.f125844c, ks6Var.f125844c) && this.f125845d == ks6Var.f125845d && this.f125846e == ks6Var.f125846e && this.f125847f == ks6Var.f125847f;
    }

    public final int hashCode() {
        int iHashCode = this.f125842a.hashCode() * 31;
        String str = this.f125843b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f125844c;
        return edb.m38547C(this.f125847f) + s571.m77245d(s571.m77245d((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f125845d), 31, this.f125846e);
    }
}
