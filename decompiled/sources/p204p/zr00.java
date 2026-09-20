package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class zr00 implements as00 {

    /* JADX INFO: renamed from: a */
    public final String f285499a;

    /* JADX INFO: renamed from: b */
    public final String f285500b;

    /* JADX INFO: renamed from: c */
    public final String f285501c;

    /* JADX INFO: renamed from: d */
    public final String f285502d;

    public zr00(String str, String str2, String str3, String str4) {
        this.f285499a = str;
        this.f285500b = str2;
        this.f285501c = str3;
        this.f285502d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zr00)) {
            return false;
        }
        zr00 zr00Var = (zr00) obj;
        return wj50.m88271j(this.f285499a, zr00Var.f285499a) && wj50.m88271j(this.f285500b, zr00Var.f285500b) && wj50.m88271j(this.f285501c, zr00Var.f285501c) && wj50.m88271j(this.f285502d, zr00Var.f285502d);
    }

    public final int hashCode() {
        int iHashCode = this.f285499a.hashCode() * 31;
        String str = this.f285500b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f285501c;
        return this.f285502d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
