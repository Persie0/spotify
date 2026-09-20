package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class lta1 {

    /* JADX INFO: renamed from: a */
    public final String f136735a;

    /* JADX INFO: renamed from: b */
    public final String f136736b;

    /* JADX INFO: renamed from: c */
    public final String f136737c;

    /* JADX INFO: renamed from: d */
    public final boolean f136738d;

    public lta1(String str, String str2, String str3, boolean z) {
        this.f136735a = str;
        this.f136736b = str2;
        this.f136737c = str3;
        this.f136738d = z;
    }

    /* JADX INFO: renamed from: a */
    public final String m59877a() {
        return this.f136735a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lta1)) {
            return false;
        }
        lta1 lta1Var = (lta1) obj;
        return wj50.m88271j(this.f136735a, lta1Var.f136735a) && wj50.m88271j(this.f136736b, lta1Var.f136736b) && wj50.m88271j(this.f136737c, lta1Var.f136737c) && this.f136738d == lta1Var.f136738d;
    }

    public final int hashCode() {
        int iHashCode = this.f136735a.hashCode() * 31;
        String str = this.f136736b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f136737c;
        return Boolean.hashCode(this.f136738d) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
