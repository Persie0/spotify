package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class g9d0 {

    /* JADX INFO: renamed from: a */
    public final String f77733a;

    /* JADX INFO: renamed from: b */
    public final String f77734b;

    /* JADX INFO: renamed from: c */
    public final String f77735c;

    /* JADX INFO: renamed from: d */
    public final int f77736d;

    /* JADX INFO: renamed from: e */
    public final boolean f77737e;

    /* JADX INFO: renamed from: f */
    public final ye30 f77738f;

    public g9d0(String str, String str2, String str3, int i, boolean z, ye30 ye30Var) {
        this.f77733a = str;
        this.f77734b = str2;
        this.f77735c = str3;
        this.f77736d = i;
        this.f77737e = z;
        this.f77738f = ye30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g9d0)) {
            return false;
        }
        g9d0 g9d0Var = (g9d0) obj;
        return wj50.m88271j(this.f77733a, g9d0Var.f77733a) && wj50.m88271j(this.f77734b, g9d0Var.f77734b) && wj50.m88271j(this.f77735c, g9d0Var.f77735c) && this.f77736d == g9d0Var.f77736d && this.f77737e == g9d0Var.f77737e && wj50.m88271j(this.f77738f, g9d0Var.f77738f);
    }

    public final int hashCode() {
        String str = this.f77733a;
        int iM77243b = s571.m77243b((str == null ? 0 : str.hashCode()) * 31, 31, this.f77734b);
        String str2 = this.f77735c;
        int iM77245d = s571.m77245d(mt60.m62800g(this.f77736d, (iM77243b + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31, this.f77737e);
        ye30 ye30Var = this.f77738f;
        return iM77245d + (ye30Var != null ? ye30Var.hashCode() : 0);
    }

    public /* synthetic */ g9d0(String str, String str2, String str3, int i, boolean z, ye30 ye30Var, int i2) {
        this(str, str2, str3, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? false : z, ye30Var);
    }
}
