package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class yj1 implements mzs0 {

    /* JADX INFO: renamed from: a */
    public final String f273241a;

    /* JADX INFO: renamed from: b */
    public final String f273242b;

    /* JADX INFO: renamed from: c */
    public final String f273243c;

    /* JADX INFO: renamed from: d */
    public final boolean f273244d;

    /* JADX INFO: renamed from: e */
    public final boolean f273245e;

    public yj1(int i, String str, String str2, String str3, boolean z, boolean z2) {
        str2 = (i & 2) != 0 ? null : str2;
        z = (i & 8) != 0 ? true : z;
        z2 = (i & 16) != 0 ? false : z2;
        this.f273241a = str;
        this.f273242b = str2;
        this.f273243c = str3;
        this.f273244d = z;
        this.f273245e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yj1)) {
            return false;
        }
        yj1 yj1Var = (yj1) obj;
        return wj50.m88271j(this.f273241a, yj1Var.f273241a) && wj50.m88271j(this.f273242b, yj1Var.f273242b) && wj50.m88271j(this.f273243c, yj1Var.f273243c) && this.f273244d == yj1Var.f273244d && this.f273245e == yj1Var.f273245e;
    }

    public final int hashCode() {
        String str = this.f273241a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f273242b;
        return Boolean.hashCode(this.f273245e) + s571.m77245d(s571.m77243b((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f273243c), 31, this.f273244d);
    }
}
