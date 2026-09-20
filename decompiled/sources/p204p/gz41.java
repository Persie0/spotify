package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class gz41 {

    /* JADX INFO: renamed from: a */
    public final xz41 f85834a;

    /* JADX INFO: renamed from: b */
    public final tz41 f85835b;

    /* JADX INFO: renamed from: c */
    public final fmn0 f85836c;

    /* JADX INFO: renamed from: d */
    public final int f85837d;

    /* JADX INFO: renamed from: e */
    public final String f85838e;

    /* JADX INFO: renamed from: f */
    public final boolean f85839f;

    public gz41(xz41 xz41Var, tz41 tz41Var, fmn0 fmn0Var, int i, String str, boolean z) {
        this.f85834a = xz41Var;
        this.f85835b = tz41Var;
        this.f85836c = fmn0Var;
        this.f85837d = i;
        this.f85838e = str;
        this.f85839f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gz41)) {
            return false;
        }
        gz41 gz41Var = (gz41) obj;
        return wj50.m88271j(this.f85834a, gz41Var.f85834a) && this.f85835b == gz41Var.f85835b && wj50.m88271j(this.f85836c, gz41Var.f85836c) && this.f85837d == gz41Var.f85837d && wj50.m88271j(this.f85838e, gz41Var.f85838e) && this.f85839f == gz41Var.f85839f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f85839f) + s571.m77243b(f710.m40938f(this.f85837d, (this.f85836c.hashCode() + ((this.f85835b.hashCode() + (this.f85834a.hashCode() * 31)) * 31)) * 31, 31), 31, this.f85838e);
    }
}
