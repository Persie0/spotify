package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class pzi0 {

    /* JADX INFO: renamed from: a */
    public final String f183714a;

    /* JADX INFO: renamed from: b */
    public final String f183715b;

    /* JADX INFO: renamed from: c */
    public final String f183716c;

    /* JADX INFO: renamed from: d */
    public final String f183717d;

    public pzi0(String str, String str2, String str3, String str4) {
        this.f183714a = str;
        this.f183715b = str2;
        this.f183716c = str3;
        this.f183717d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pzi0)) {
            return false;
        }
        pzi0 pzi0Var = (pzi0) obj;
        return wj50.m88271j(this.f183714a, pzi0Var.f183714a) && wj50.m88271j(this.f183715b, pzi0Var.f183715b) && wj50.m88271j(this.f183716c, pzi0Var.f183716c) && wj50.m88271j(this.f183717d, pzi0Var.f183717d);
    }

    public final int hashCode() {
        String str = this.f183714a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f183715b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f183716c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f183717d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }
}
