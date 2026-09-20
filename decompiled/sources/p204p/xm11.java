package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class xm11 {

    /* JADX INFO: renamed from: a */
    public final String f263266a;

    /* JADX INFO: renamed from: b */
    public final String f263267b;

    /* JADX INFO: renamed from: c */
    public final String f263268c;

    /* JADX INFO: renamed from: d */
    public final String f263269d;

    /* JADX INFO: renamed from: e */
    public final int f263270e;

    /* JADX INFO: renamed from: f */
    public final int f263271f;

    public xm11(int i, int i2, String str, String str2, String str3, String str4) {
        this.f263266a = str;
        this.f263267b = str2;
        this.f263268c = str3;
        this.f263269d = str4;
        this.f263270e = i;
        this.f263271f = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xm11)) {
            return false;
        }
        xm11 xm11Var = (xm11) obj;
        return this.f263266a.equals(xm11Var.f263266a) && wj50.m88271j(this.f263267b, xm11Var.f263267b) && wj50.m88271j(this.f263268c, xm11Var.f263268c) && wj50.m88271j(this.f263269d, xm11Var.f263269d) && this.f263270e == xm11Var.f263270e && this.f263271f == xm11Var.f263271f;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f263266a.hashCode() * 31, 31, this.f263267b);
        String str = this.f263268c;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f263269d;
        int iM40938f = f710.m40938f(this.f263270e, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        int i = this.f263271f;
        return iM40938f + (i != 0 ? edb.m38547C(i) : 0);
    }
}
