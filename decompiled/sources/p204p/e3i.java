package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class e3i {

    /* JADX INFO: renamed from: a */
    public final String f55802a;

    /* JADX INFO: renamed from: b */
    public final String f55803b;

    /* JADX INFO: renamed from: c */
    public final String f55804c;

    /* JADX INFO: renamed from: d */
    public final String f55805d;

    /* JADX INFO: renamed from: e */
    public final String f55806e;

    /* JADX INFO: renamed from: f */
    public final String f55807f;

    /* JADX INFO: renamed from: g */
    public final String f55808g;

    /* JADX INFO: renamed from: h */
    public final rcm0 f55809h;

    /* JADX INFO: renamed from: i */
    public final int f55810i;

    /* JADX INFO: renamed from: j */
    public final Integer f55811j;

    /* JADX INFO: renamed from: k */
    public final String f55812k;

    public e3i(String str, String str2, String str3, String str4, String str5, String str6, String str7, rcm0 rcm0Var, int i, Integer num, String str8) {
        this.f55802a = str;
        this.f55803b = str2;
        this.f55804c = str3;
        this.f55805d = str4;
        this.f55806e = str5;
        this.f55807f = str6;
        this.f55808g = str7;
        this.f55809h = rcm0Var;
        this.f55810i = i;
        this.f55811j = num;
        this.f55812k = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e3i)) {
            return false;
        }
        e3i e3iVar = (e3i) obj;
        return wj50.m88271j(this.f55802a, e3iVar.f55802a) && wj50.m88271j(this.f55803b, e3iVar.f55803b) && wj50.m88271j(this.f55804c, e3iVar.f55804c) && wj50.m88271j(this.f55805d, e3iVar.f55805d) && wj50.m88271j(this.f55806e, e3iVar.f55806e) && wj50.m88271j(this.f55807f, e3iVar.f55807f) && wj50.m88271j(this.f55808g, e3iVar.f55808g) && wj50.m88271j(this.f55809h, e3iVar.f55809h) && this.f55810i == e3iVar.f55810i && wj50.m88271j(this.f55811j, e3iVar.f55811j) && wj50.m88271j(this.f55812k, e3iVar.f55812k);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f55802a.hashCode() * 31, 31, this.f55803b);
        String str = this.f55804c;
        int iM62800g = mt60.m62800g(this.f55810i, yds.m93483m(this.f55809h, s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f55805d), 31, this.f55806e), 31, this.f55807f), 31, this.f55808g), 31), 31);
        Integer num = this.f55811j;
        int iHashCode = (iM62800g + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f55812k;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
