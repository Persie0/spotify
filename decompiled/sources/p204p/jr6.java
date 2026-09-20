package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class jr6 {

    /* JADX INFO: renamed from: a */
    public final String f115092a;

    /* JADX INFO: renamed from: b */
    public final String f115093b;

    /* JADX INFO: renamed from: c */
    public final String f115094c;

    /* JADX INFO: renamed from: d */
    public final String f115095d;

    /* JADX INFO: renamed from: e */
    public final boolean f115096e;

    public jr6(String str, String str2, String str3, String str4, boolean z) {
        this.f115092a = str;
        this.f115093b = str2;
        this.f115094c = str3;
        this.f115095d = str4;
        this.f115096e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jr6)) {
            return false;
        }
        jr6 jr6Var = (jr6) obj;
        return wj50.m88271j(this.f115092a, jr6Var.f115092a) && wj50.m88271j(this.f115093b, jr6Var.f115093b) && this.f115094c.equals(jr6Var.f115094c) && wj50.m88271j(this.f115095d, jr6Var.f115095d) && this.f115096e == jr6Var.f115096e;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f115092a.hashCode() * 31, 31, this.f115093b), 31, this.f115094c);
        String str = this.f115095d;
        return Boolean.hashCode(this.f115096e) + ((iM77243b + (str == null ? 0 : str.hashCode())) * 31);
    }
}
