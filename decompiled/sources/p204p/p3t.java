package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class p3t {

    /* JADX INFO: renamed from: a */
    public final String f173706a;

    /* JADX INFO: renamed from: b */
    public final String f173707b;

    /* JADX INFO: renamed from: c */
    public final String f173708c;

    /* JADX INFO: renamed from: d */
    public final String f173709d;

    /* JADX INFO: renamed from: e */
    public final boolean f173710e;

    /* JADX INFO: renamed from: f */
    public final int f173711f;

    /* JADX INFO: renamed from: g */
    public final String f173712g;

    /* JADX INFO: renamed from: h */
    public final String f173713h;

    /* JADX INFO: renamed from: i */
    public final Boolean f173714i;

    /* JADX INFO: renamed from: j */
    public final boolean f173715j;

    /* JADX INFO: renamed from: k */
    public final c6u0 f173716k;

    /* JADX INFO: renamed from: l */
    public final String f173717l;

    /* JADX INFO: renamed from: m */
    public final boolean f173718m;

    public p3t(String str, String str2, String str3, String str4, boolean z, int i, String str5, String str6, Boolean bool, boolean z2, c6u0 c6u0Var, String str7, boolean z3) {
        this.f173706a = str;
        this.f173707b = str2;
        this.f173708c = str3;
        this.f173709d = str4;
        this.f173710e = z;
        this.f173711f = i;
        this.f173712g = str5;
        this.f173713h = str6;
        this.f173714i = bool;
        this.f173715j = z2;
        this.f173716k = c6u0Var;
        this.f173717l = str7;
        this.f173718m = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p3t)) {
            return false;
        }
        p3t p3tVar = (p3t) obj;
        return wj50.m88271j(this.f173706a, p3tVar.f173706a) && wj50.m88271j(this.f173707b, p3tVar.f173707b) && wj50.m88271j(this.f173708c, p3tVar.f173708c) && wj50.m88271j(this.f173709d, p3tVar.f173709d) && this.f173710e == p3tVar.f173710e && this.f173711f == p3tVar.f173711f && wj50.m88271j(this.f173712g, p3tVar.f173712g) && wj50.m88271j(this.f173713h, p3tVar.f173713h) && wj50.m88271j(this.f173714i, p3tVar.f173714i) && this.f173715j == p3tVar.f173715j && wj50.m88271j(this.f173716k, p3tVar.f173716k) && wj50.m88271j(this.f173717l, p3tVar.f173717l) && this.f173718m == p3tVar.f173718m;
    }

    public final int hashCode() {
        int iHashCode = this.f173706a.hashCode() * 31;
        String str = this.f173707b;
        int iM77243b = s571.m77243b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f173708c);
        String str2 = this.f173709d;
        int iM62800g = mt60.m62800g(this.f173711f, s571.m77245d((iM77243b + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f173710e), 31);
        String str3 = this.f173712g;
        int iHashCode2 = (iM62800g + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f173713h;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.f173714i;
        int iHashCode4 = (this.f173716k.hashCode() + s571.m77245d((iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.f173715j)) * 31;
        String str5 = this.f173717l;
        return Boolean.hashCode(this.f173718m) + ((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31);
    }

    public /* synthetic */ p3t(String str, String str2, String str3, String str4, boolean z, int i, String str5, String str6, Boolean bool) {
        this(str, str2, str3, str4, z, i, str5, str6, bool, false, new c6u0(0, 0, 7, 0), null, false);
    }
}
