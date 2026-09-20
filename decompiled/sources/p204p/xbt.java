package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class xbt implements zbt {

    /* JADX INFO: renamed from: a */
    public final String f259998a;

    /* JADX INFO: renamed from: b */
    public final String f259999b;

    /* JADX INFO: renamed from: c */
    public final String f260000c;

    /* JADX INFO: renamed from: d */
    public final String f260001d;

    /* JADX INFO: renamed from: e */
    public final String f260002e;

    /* JADX INFO: renamed from: f */
    public final String f260003f;

    /* JADX INFO: renamed from: g */
    public final String f260004g;

    public xbt(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f259998a = str;
        this.f259999b = str2;
        this.f260000c = str3;
        this.f260001d = str4;
        this.f260002e = str5;
        this.f260003f = str6;
        this.f260004g = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xbt)) {
            return false;
        }
        xbt xbtVar = (xbt) obj;
        return wj50.m88271j(this.f259998a, xbtVar.f259998a) && wj50.m88271j(this.f259999b, xbtVar.f259999b) && wj50.m88271j(this.f260000c, xbtVar.f260000c) && wj50.m88271j(this.f260001d, xbtVar.f260001d) && wj50.m88271j(this.f260002e, xbtVar.f260002e) && wj50.m88271j(this.f260003f, xbtVar.f260003f) && wj50.m88271j(this.f260004g, xbtVar.f260004g);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(this.f259998a.hashCode() * 31, 31, this.f259999b), 31, this.f260000c), 31, this.f260001d);
        String str = this.f260002e;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f260003f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f260004g;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
