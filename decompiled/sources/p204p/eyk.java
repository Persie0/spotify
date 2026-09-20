package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class eyk implements myk {

    /* JADX INFO: renamed from: a */
    public final String f64112a;

    /* JADX INFO: renamed from: b */
    public final String f64113b;

    /* JADX INFO: renamed from: c */
    public final String f64114c;

    /* JADX INFO: renamed from: d */
    public final int f64115d;

    public eyk(String str, String str2, int i, String str3) {
        this.f64112a = str;
        this.f64113b = str2;
        this.f64114c = str3;
        this.f64115d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eyk)) {
            return false;
        }
        eyk eykVar = (eyk) obj;
        return wj50.m88271j(this.f64112a, eykVar.f64112a) && wj50.m88271j(this.f64113b, eykVar.f64113b) && wj50.m88271j(this.f64114c, eykVar.f64114c) && this.f64115d == eykVar.f64115d;
    }

    public final int hashCode() {
        int iHashCode = this.f64112a.hashCode() * 31;
        String str = this.f64113b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f64114c;
        return Integer.hashCode(this.f64115d) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
