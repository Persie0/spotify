package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class qpp0 implements tpp0 {

    /* JADX INFO: renamed from: a */
    public final String f191353a;

    /* JADX INFO: renamed from: b */
    public final String f191354b;

    /* JADX INFO: renamed from: c */
    public final boolean f191355c;

    /* JADX INFO: renamed from: d */
    public final boolean f191356d;

    /* JADX INFO: renamed from: e */
    public final String f191357e;

    /* JADX INFO: renamed from: f */
    public final String f191358f;

    /* JADX INFO: renamed from: g */
    public final lpp0 f191359g;

    /* JADX INFO: renamed from: h */
    public final boolean f191360h;

    public qpp0(String str, String str2, boolean z, boolean z2, String str3, String str4, lpp0 lpp0Var, boolean z3) {
        this.f191353a = str;
        this.f191354b = str2;
        this.f191355c = z;
        this.f191356d = z2;
        this.f191357e = str3;
        this.f191358f = str4;
        this.f191359g = lpp0Var;
        this.f191360h = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qpp0)) {
            return false;
        }
        qpp0 qpp0Var = (qpp0) obj;
        return wj50.m88271j(this.f191353a, qpp0Var.f191353a) && wj50.m88271j(this.f191354b, qpp0Var.f191354b) && this.f191355c == qpp0Var.f191355c && this.f191356d == qpp0Var.f191356d && wj50.m88271j(this.f191357e, qpp0Var.f191357e) && wj50.m88271j(this.f191358f, qpp0Var.f191358f) && wj50.m88271j(this.f191359g, qpp0Var.f191359g) && this.f191360h == qpp0Var.f191360h;
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77243b(this.f191353a.hashCode() * 31, 31, this.f191354b), 31, this.f191355c), 31, this.f191356d);
        String str = this.f191357e;
        int iHashCode = (iM77245d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f191358f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        lpp0 lpp0Var = this.f191359g;
        return Boolean.hashCode(this.f191360h) + ((iHashCode2 + (lpp0Var != null ? lpp0Var.hashCode() : 0)) * 31);
    }
}
