package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class xjm0 implements dkm0 {

    /* JADX INFO: renamed from: a */
    public final boolean f262171a;

    /* JADX INFO: renamed from: b */
    public final String f262172b;

    /* JADX INFO: renamed from: c */
    public final String f262173c;

    /* JADX INFO: renamed from: d */
    public final int f262174d;

    /* JADX INFO: renamed from: e */
    public final String f262175e;

    /* JADX INFO: renamed from: f */
    public final gkm0 f262176f;

    public xjm0(boolean z, String str, String str2, int i, String str3, gkm0 gkm0Var) {
        this.f262171a = z;
        this.f262172b = str;
        this.f262173c = str2;
        this.f262174d = i;
        this.f262175e = str3;
        this.f262176f = gkm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xjm0)) {
            return false;
        }
        xjm0 xjm0Var = (xjm0) obj;
        return this.f262171a == xjm0Var.f262171a && wj50.m88271j(this.f262172b, xjm0Var.f262172b) && wj50.m88271j(this.f262173c, xjm0Var.f262173c) && this.f262174d == xjm0Var.f262174d && wj50.m88271j(this.f262175e, xjm0Var.f262175e) && wj50.m88271j(this.f262176f, xjm0Var.f262176f);
    }

    public final int hashCode() {
        int iM62800g = mt60.m62800g(this.f262174d, s571.m77243b(s571.m77243b(Boolean.hashCode(this.f262171a) * 31, 31, this.f262172b), 31, this.f262173c), 31);
        String str = this.f262175e;
        return this.f262176f.hashCode() + ((iM62800g + (str == null ? 0 : str.hashCode())) * 31);
    }
}
