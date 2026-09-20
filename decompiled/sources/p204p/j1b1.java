package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class j1b1 {

    /* JADX INFO: renamed from: a */
    public final String f107715a;

    /* JADX INFO: renamed from: b */
    public final String f107716b;

    /* JADX INFO: renamed from: c */
    public final String f107717c;

    /* JADX INFO: renamed from: d */
    public final String f107718d;

    /* JADX INFO: renamed from: e */
    public final String f107719e;

    public j1b1(String str, String str2, String str3, String str4, String str5) {
        this.f107715a = str;
        this.f107716b = str2;
        this.f107717c = str3;
        this.f107718d = str4;
        this.f107719e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1b1)) {
            return false;
        }
        j1b1 j1b1Var = (j1b1) obj;
        return wj50.m88271j(this.f107715a, j1b1Var.f107715a) && wj50.m88271j(this.f107716b, j1b1Var.f107716b) && wj50.m88271j(this.f107717c, j1b1Var.f107717c) && wj50.m88271j(this.f107718d, j1b1Var.f107718d) && wj50.m88271j(this.f107719e, j1b1Var.f107719e);
    }

    public final int hashCode() {
        String str = this.f107715a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f107716b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f107717c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f107718d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f107719e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
