package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class lnr0 {

    /* JADX INFO: renamed from: a */
    public final int f135212a;

    /* JADX INFO: renamed from: b */
    public final String f135213b;

    /* JADX INFO: renamed from: c */
    public final String f135214c;

    /* JADX INFO: renamed from: d */
    public final String f135215d;

    /* JADX INFO: renamed from: e */
    public final boolean f135216e;

    /* JADX INFO: renamed from: f */
    public final boolean f135217f;

    public lnr0(int i, String str, String str2, String str3, boolean z, boolean z2) {
        this.f135212a = i;
        this.f135213b = str;
        this.f135214c = str2;
        this.f135215d = str3;
        this.f135216e = z;
        this.f135217f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lnr0)) {
            return false;
        }
        lnr0 lnr0Var = (lnr0) obj;
        return this.f135212a == lnr0Var.f135212a && wj50.m88271j(this.f135213b, lnr0Var.f135213b) && wj50.m88271j(this.f135214c, lnr0Var.f135214c) && wj50.m88271j(this.f135215d, lnr0Var.f135215d) && this.f135216e == lnr0Var.f135216e && this.f135217f == lnr0Var.f135217f;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(edb.m38547C(this.f135212a) * 31, 31, this.f135213b), 31, this.f135214c);
        String str = this.f135215d;
        return Boolean.hashCode(this.f135217f) + s571.m77245d((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f135216e);
    }
}
