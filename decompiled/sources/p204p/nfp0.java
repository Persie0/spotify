package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class nfp0 {

    /* JADX INFO: renamed from: a */
    public final String f153409a;

    /* JADX INFO: renamed from: b */
    public final String f153410b;

    /* JADX INFO: renamed from: c */
    public final String f153411c;

    /* JADX INFO: renamed from: d */
    public final String f153412d;

    public nfp0(String str, String str2, String str3, String str4) {
        this.f153409a = str;
        this.f153410b = str2;
        this.f153411c = str3;
        this.f153412d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nfp0)) {
            return false;
        }
        nfp0 nfp0Var = (nfp0) obj;
        return wj50.m88271j(this.f153409a, nfp0Var.f153409a) && wj50.m88271j(this.f153410b, nfp0Var.f153410b) && wj50.m88271j(this.f153411c, nfp0Var.f153411c) && wj50.m88271j(this.f153412d, nfp0Var.f153412d);
    }

    public final int hashCode() {
        int iHashCode = this.f153409a.hashCode() * 31;
        String str = this.f153410b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f153411c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f153412d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
