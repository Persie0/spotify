package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class n6b1 {

    /* JADX INFO: renamed from: a */
    public final String f150807a;

    /* JADX INFO: renamed from: b */
    public final String f150808b;

    /* JADX INFO: renamed from: c */
    public final String f150809c;

    /* JADX INFO: renamed from: d */
    public final String f150810d;

    /* JADX INFO: renamed from: e */
    public final rcm0 f150811e;

    /* JADX INFO: renamed from: f */
    public final String f150812f;

    /* JADX INFO: renamed from: g */
    public final int f150813g;

    /* JADX INFO: renamed from: h */
    public final Integer f150814h;

    /* JADX INFO: renamed from: i */
    public final String f150815i;

    public n6b1(String str, String str2, String str3, String str4, rcm0 rcm0Var, String str5, int i, Integer num, String str6) {
        this.f150807a = str;
        this.f150808b = str2;
        this.f150809c = str3;
        this.f150810d = str4;
        this.f150811e = rcm0Var;
        this.f150812f = str5;
        this.f150813g = i;
        this.f150814h = num;
        this.f150815i = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n6b1)) {
            return false;
        }
        n6b1 n6b1Var = (n6b1) obj;
        return wj50.m88271j(this.f150807a, n6b1Var.f150807a) && wj50.m88271j(this.f150808b, n6b1Var.f150808b) && wj50.m88271j(this.f150809c, n6b1Var.f150809c) && wj50.m88271j(this.f150810d, n6b1Var.f150810d) && wj50.m88271j(this.f150811e, n6b1Var.f150811e) && wj50.m88271j(this.f150812f, n6b1Var.f150812f) && this.f150813g == n6b1Var.f150813g && wj50.m88271j(this.f150814h, n6b1Var.f150814h) && wj50.m88271j(this.f150815i, n6b1Var.f150815i);
    }

    public final int hashCode() {
        int iM62800g = mt60.m62800g(this.f150813g, s571.m77243b(yds.m93483m(this.f150811e, s571.m77243b(s571.m77243b(s571.m77243b(this.f150807a.hashCode() * 31, 31, this.f150808b), 31, this.f150809c), 31, this.f150810d), 31), 31, this.f150812f), 31);
        Integer num = this.f150814h;
        int iHashCode = (iM62800g + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f150815i;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
