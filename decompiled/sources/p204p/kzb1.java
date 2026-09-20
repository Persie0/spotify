package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class kzb1 {

    /* JADX INFO: renamed from: a */
    public final String f128062a;

    /* JADX INFO: renamed from: b */
    public final int f128063b;

    /* JADX INFO: renamed from: c */
    public final String f128064c;

    /* JADX INFO: renamed from: d */
    public final String f128065d;

    public kzb1(String str, String str2, int i, String str3) {
        this.f128062a = str;
        this.f128063b = i;
        this.f128064c = str2;
        this.f128065d = str3;
    }

    /* JADX INFO: renamed from: a */
    public final int m57749a() {
        return this.f128063b;
    }

    /* JADX INFO: renamed from: b */
    public final String m57750b() {
        return this.f128065d;
    }

    /* JADX INFO: renamed from: c */
    public final String m57751c() {
        return this.f128062a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kzb1)) {
            return false;
        }
        kzb1 kzb1Var = (kzb1) obj;
        return wj50.m88271j(this.f128062a, kzb1Var.f128062a) && this.f128063b == kzb1Var.f128063b && wj50.m88271j(this.f128064c, kzb1Var.f128064c) && wj50.m88271j(this.f128065d, kzb1Var.f128065d);
    }

    public final int hashCode() {
        String str = this.f128062a;
        int iM62800g = mt60.m62800g(this.f128063b, (str == null ? 0 : str.hashCode()) * 31, 31);
        String str2 = this.f128064c;
        int iHashCode = (iM62800g + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f128065d;
        return iHashCode + (str3 != null ? str3.hashCode() : 0);
    }
}
