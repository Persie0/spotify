package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class d8z0 {

    /* JADX INFO: renamed from: a */
    public final String f46554a;

    /* JADX INFO: renamed from: b */
    public final String f46555b;

    /* JADX INFO: renamed from: c */
    public final String f46556c;

    /* JADX INFO: renamed from: d */
    public final String f46557d;

    /* JADX INFO: renamed from: e */
    public final String f46558e;

    public d8z0(String str, String str2, String str3, String str4, String str5) {
        this.f46554a = str;
        this.f46555b = str2;
        this.f46556c = str3;
        this.f46557d = str4;
        this.f46558e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d8z0)) {
            return false;
        }
        d8z0 d8z0Var = (d8z0) obj;
        return wj50.m88271j(this.f46554a, d8z0Var.f46554a) && wj50.m88271j(this.f46555b, d8z0Var.f46555b) && wj50.m88271j(this.f46556c, d8z0Var.f46556c) && wj50.m88271j(this.f46557d, d8z0Var.f46557d) && wj50.m88271j(this.f46558e, d8z0Var.f46558e);
    }

    public final int hashCode() {
        int iHashCode = this.f46554a.hashCode() * 31;
        String str = this.f46555b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f46556c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f46557d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f46558e;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }
}
