package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class e8v {

    /* JADX INFO: renamed from: a */
    public final String f57276a;

    /* JADX INFO: renamed from: b */
    public final String f57277b;

    /* JADX INFO: renamed from: c */
    public final String f57278c;

    /* JADX INFO: renamed from: d */
    public final String f57279d;

    /* JADX INFO: renamed from: e */
    public final String f57280e;

    /* JADX INFO: renamed from: f */
    public final String f57281f;

    /* JADX INFO: renamed from: g */
    public final String f57282g;

    /* JADX INFO: renamed from: h */
    public final String f57283h;

    public e8v(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.f57276a = str;
        this.f57277b = str2;
        this.f57278c = str3;
        this.f57279d = str4;
        this.f57280e = str5;
        this.f57281f = str6;
        this.f57282g = str7;
        this.f57283h = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8v)) {
            return false;
        }
        e8v e8vVar = (e8v) obj;
        return wj50.m88271j(this.f57276a, e8vVar.f57276a) && wj50.m88271j(this.f57277b, e8vVar.f57277b) && wj50.m88271j(this.f57278c, e8vVar.f57278c) && wj50.m88271j(this.f57279d, e8vVar.f57279d) && wj50.m88271j(this.f57280e, e8vVar.f57280e) && wj50.m88271j(this.f57281f, e8vVar.f57281f) && wj50.m88271j(this.f57282g, e8vVar.f57282g) && wj50.m88271j(this.f57283h, e8vVar.f57283h);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f57276a.hashCode() * 31, 31, this.f57277b), 31, this.f57278c), 31, this.f57279d), 31, this.f57280e);
        String str = this.f57281f;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f57282g;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f57283h;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
