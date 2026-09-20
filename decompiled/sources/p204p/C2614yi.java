package p204p;

/* JADX INFO: renamed from: p.yi */
/* JADX INFO: loaded from: classes10.dex */
public final class C2614yi {

    /* JADX INFO: renamed from: a */
    public final String f273003a;

    /* JADX INFO: renamed from: b */
    public final String f273004b;

    /* JADX INFO: renamed from: c */
    public final int f273005c;

    /* JADX INFO: renamed from: d */
    public final int f273006d;

    /* JADX INFO: renamed from: e */
    public final int f273007e;

    /* JADX INFO: renamed from: f */
    public final String f273008f;

    public C2614yi(int i, int i2, int i3, int i4, String str, String str2) {
        str = (i4 & 2) != 0 ? null : str;
        str2 = (i4 & 32) != 0 ? null : str2;
        this.f273003a = null;
        this.f273004b = str;
        this.f273005c = i;
        this.f273006d = i2;
        this.f273007e = i3;
        this.f273008f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2614yi)) {
            return false;
        }
        C2614yi c2614yi = (C2614yi) obj;
        return wj50.m88271j(this.f273003a, c2614yi.f273003a) && wj50.m88271j(this.f273004b, c2614yi.f273004b) && this.f273005c == c2614yi.f273005c && this.f273006d == c2614yi.f273006d && this.f273007e == c2614yi.f273007e && wj50.m88271j(this.f273008f, c2614yi.f273008f);
    }

    public final int hashCode() {
        String str = this.f273003a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f273004b;
        int iM62800g = mt60.m62800g(this.f273007e, mt60.m62800g(this.f273006d, mt60.m62800g(this.f273005c, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31), 31);
        String str3 = this.f273008f;
        return iM62800g + (str3 != null ? str3.hashCode() : 0);
    }
}
