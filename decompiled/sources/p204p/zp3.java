package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class zp3 implements aq3 {

    /* JADX INFO: renamed from: a */
    public final String f284917a;

    /* JADX INFO: renamed from: b */
    public final String f284918b;

    /* JADX INFO: renamed from: c */
    public final String f284919c;

    /* JADX INFO: renamed from: d */
    public final String f284920d;

    /* JADX INFO: renamed from: e */
    public final String f284921e;

    /* JADX INFO: renamed from: f */
    public final int f284922f;

    public zp3(String str, String str2, String str3, String str4, String str5, int i) {
        this.f284917a = str;
        this.f284918b = str2;
        this.f284919c = str3;
        this.f284920d = str4;
        this.f284921e = str5;
        this.f284922f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zp3)) {
            return false;
        }
        zp3 zp3Var = (zp3) obj;
        return wj50.m88271j(this.f284917a, zp3Var.f284917a) && wj50.m88271j(this.f284918b, zp3Var.f284918b) && wj50.m88271j(this.f284919c, zp3Var.f284919c) && wj50.m88271j(this.f284920d, zp3Var.f284920d) && wj50.m88271j(this.f284921e, zp3Var.f284921e) && this.f284922f == zp3Var.f284922f;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f284917a.hashCode() * 31, 31, this.f284918b);
        String str = this.f284919c;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f284920d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f284921e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        int i = this.f284922f;
        return iHashCode3 + (i != 0 ? edb.m38547C(i) : 0);
    }
}
