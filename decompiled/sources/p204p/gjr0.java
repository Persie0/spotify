package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class gjr0 {

    /* JADX INFO: renamed from: a */
    public final String f80525a;

    /* JADX INFO: renamed from: b */
    public final double f80526b;

    /* JADX INFO: renamed from: c */
    public final String f80527c;

    /* JADX INFO: renamed from: d */
    public final String f80528d;

    /* JADX INFO: renamed from: e */
    public final String f80529e;

    /* JADX INFO: renamed from: f */
    public final String f80530f;

    /* JADX INFO: renamed from: g */
    public final r5b1 f80531g;

    /* JADX INFO: renamed from: h */
    public final int f80532h;

    public gjr0(String str, double d, String str2, String str3, String str4, String str5, r5b1 r5b1Var, int i) {
        this.f80525a = str;
        this.f80526b = d;
        this.f80527c = str2;
        this.f80528d = str3;
        this.f80529e = str4;
        this.f80530f = str5;
        this.f80531g = r5b1Var;
        this.f80532h = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gjr0)) {
            return false;
        }
        gjr0 gjr0Var = (gjr0) obj;
        return wj50.m88271j(this.f80525a, gjr0Var.f80525a) && Double.compare(this.f80526b, gjr0Var.f80526b) == 0 && wj50.m88271j(this.f80527c, gjr0Var.f80527c) && wj50.m88271j(this.f80528d, gjr0Var.f80528d) && wj50.m88271j(this.f80529e, gjr0Var.f80529e) && wj50.m88271j(this.f80530f, gjr0Var.f80530f) && wj50.m88271j(this.f80531g, gjr0Var.f80531g) && this.f80532h == gjr0Var.f80532h;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(xl81.m91399h(this.f80526b, this.f80525a.hashCode() * 31, 31), 31, this.f80527c), 31, this.f80528d);
        String str = this.f80529e;
        int iM77243b2 = s571.m77243b((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f80530f);
        r5b1 r5b1Var = this.f80531g;
        return Integer.hashCode(this.f80532h) + ((iM77243b2 + (r5b1Var != null ? Double.hashCode(r5b1Var.f196009a) : 0)) * 31);
    }
}
