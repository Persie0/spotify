package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class v330 extends ud6 {

    /* JADX INFO: renamed from: c */
    public final String f236758c;

    /* JADX INFO: renamed from: d */
    public final String f236759d;

    /* JADX INFO: renamed from: e */
    public final AbstractC2524w8 f236760e;

    /* JADX INFO: renamed from: f */
    public final String f236761f;

    /* JADX INFO: renamed from: g */
    public final boolean f236762g;

    /* JADX INFO: renamed from: h */
    public final int f236763h;

    /* JADX INFO: renamed from: i */
    public final String f236764i;

    /* JADX INFO: renamed from: j */
    public final p330 f236765j;

    public v330(String str, String str2, AbstractC2524w8 abstractC2524w8, String str3, boolean z, int i, String str4, p330 p330Var) {
        this.f236758c = str;
        this.f236759d = str2;
        this.f236760e = abstractC2524w8;
        this.f236761f = str3;
        this.f236762g = z;
        this.f236763h = i;
        this.f236764i = str4;
        this.f236765j = p330Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v330)) {
            return false;
        }
        v330 v330Var = (v330) obj;
        return wj50.m88271j(this.f236758c, v330Var.f236758c) && wj50.m88271j(this.f236759d, v330Var.f236759d) && wj50.m88271j(this.f236760e, v330Var.f236760e) && wj50.m88271j(this.f236761f, v330Var.f236761f) && this.f236762g == v330Var.f236762g && this.f236763h == v330Var.f236763h && wj50.m88271j(this.f236764i, v330Var.f236764i) && wj50.m88271j(this.f236765j, v330Var.f236765j);
    }

    public final int hashCode() {
        int iHashCode = (this.f236760e.hashCode() + s571.m77243b(this.f236758c.hashCode() * 31, 31, this.f236759d)) * 31;
        String str = this.f236761f;
        int iM40938f = f710.m40938f(this.f236763h, s571.m77245d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f236762g), 31);
        String str2 = this.f236764i;
        int iHashCode2 = (iM40938f + (str2 == null ? 0 : str2.hashCode())) * 31;
        p330 p330Var = this.f236765j;
        return iHashCode2 + (p330Var != null ? p330Var.hashCode() : 0);
    }
}
