package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class gv00 implements jv00 {

    /* JADX INFO: renamed from: a */
    public final String f84577a;

    /* JADX INFO: renamed from: b */
    public final String f84578b;

    /* JADX INFO: renamed from: c */
    public final String f84579c;

    /* JADX INFO: renamed from: d */
    public final String f84580d;

    /* JADX INFO: renamed from: e */
    public final String f84581e;

    /* JADX INFO: renamed from: f */
    public final String f84582f;

    /* JADX INFO: renamed from: g */
    public final String f84583g;

    /* JADX INFO: renamed from: h */
    public final String f84584h;

    /* JADX INFO: renamed from: i */
    public final String f84585i;

    /* JADX INFO: renamed from: j */
    public final boolean f84586j;

    public gv00(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z) {
        this.f84577a = str;
        this.f84578b = str2;
        this.f84579c = str3;
        this.f84580d = str4;
        this.f84581e = str5;
        this.f84582f = str6;
        this.f84583g = str7;
        this.f84584h = str8;
        this.f84585i = str9;
        this.f84586j = z;
    }

    @Override // p204p.jv00
    /* JADX INFO: renamed from: a */
    public final boolean mo40080a() {
        return this.f84586j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gv00)) {
            return false;
        }
        gv00 gv00Var = (gv00) obj;
        return wj50.m88271j(this.f84577a, gv00Var.f84577a) && wj50.m88271j(this.f84578b, gv00Var.f84578b) && wj50.m88271j(this.f84579c, gv00Var.f84579c) && wj50.m88271j(this.f84580d, gv00Var.f84580d) && wj50.m88271j(this.f84581e, gv00Var.f84581e) && wj50.m88271j(this.f84582f, gv00Var.f84582f) && wj50.m88271j(this.f84583g, gv00Var.f84583g) && wj50.m88271j(this.f84584h, gv00Var.f84584h) && wj50.m88271j(this.f84585i, gv00Var.f84585i) && this.f84586j == gv00Var.f84586j;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f84577a.hashCode() * 31, 31, this.f84578b), 31, this.f84579c), 31, this.f84580d), 31, this.f84581e);
        String str = this.f84582f;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f84583g;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f84584h;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f84585i;
        return Boolean.hashCode(this.f84586j) + ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }
}
