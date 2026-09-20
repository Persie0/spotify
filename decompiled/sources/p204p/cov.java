package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class cov {

    /* JADX INFO: renamed from: a */
    public final String f40345a;

    /* JADX INFO: renamed from: b */
    public final int f40346b;

    /* JADX INFO: renamed from: c */
    public final String f40347c;

    /* JADX INFO: renamed from: d */
    public final String f40348d;

    /* JADX INFO: renamed from: e */
    public final String f40349e;

    /* JADX INFO: renamed from: f */
    public final boolean f40350f;

    /* JADX INFO: renamed from: g */
    public final boolean f40351g;

    /* JADX INFO: renamed from: h */
    public final ctj f40352h;

    /* JADX INFO: renamed from: i */
    public final pv00 f40353i;

    /* JADX INFO: renamed from: j */
    public final bso0 f40354j;

    /* JADX INFO: renamed from: k */
    public final unv f40355k;

    /* JADX INFO: renamed from: l */
    public final hug1 f40356l;

    /* JADX INFO: renamed from: m */
    public final String f40357m;

    public cov(String str, int i, String str2, String str3, String str4, boolean z, boolean z2, ctj ctjVar, pv00 pv00Var, bso0 bso0Var, unv unvVar, hug1 hug1Var, String str5) {
        this.f40345a = str;
        this.f40346b = i;
        this.f40347c = str2;
        this.f40348d = str3;
        this.f40349e = str4;
        this.f40350f = z;
        this.f40351g = z2;
        this.f40352h = ctjVar;
        this.f40353i = pv00Var;
        this.f40354j = bso0Var;
        this.f40355k = unvVar;
        this.f40356l = hug1Var;
        this.f40357m = str5;
    }

    /* JADX INFO: renamed from: a */
    public static cov m33510a(cov covVar, String str, String str2, String str3, boolean z, boolean z2, ctj ctjVar, pv00 pv00Var, bso0 bso0Var, unv unvVar, String str4, int i) {
        String str5 = covVar.f40345a;
        int i2 = covVar.f40346b;
        String str6 = (i & 4) != 0 ? covVar.f40347c : str;
        String str7 = (i & 8) != 0 ? covVar.f40348d : str2;
        String str8 = (i & 16) != 0 ? covVar.f40349e : str3;
        boolean z3 = (i & 32) != 0 ? covVar.f40350f : z;
        boolean z4 = (i & 64) != 0 ? covVar.f40351g : z2;
        ctj ctjVar2 = (i & 128) != 0 ? covVar.f40352h : ctjVar;
        pv00 pv00Var2 = (i & 256) != 0 ? covVar.f40353i : pv00Var;
        bso0 bso0Var2 = (i & 512) != 0 ? covVar.f40354j : bso0Var;
        unv unvVar2 = (i & 1024) != 0 ? covVar.f40355k : unvVar;
        hug1 hug1Var = covVar.f40356l;
        String str9 = (i & 4096) != 0 ? covVar.f40357m : str4;
        covVar.getClass();
        return new cov(str5, i2, str6, str7, str8, z3, z4, ctjVar2, pv00Var2, bso0Var2, unvVar2, hug1Var, str9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cov)) {
            return false;
        }
        cov covVar = (cov) obj;
        return wj50.m88271j(this.f40345a, covVar.f40345a) && this.f40346b == covVar.f40346b && wj50.m88271j(this.f40347c, covVar.f40347c) && wj50.m88271j(this.f40348d, covVar.f40348d) && wj50.m88271j(this.f40349e, covVar.f40349e) && this.f40350f == covVar.f40350f && this.f40351g == covVar.f40351g && wj50.m88271j(this.f40352h, covVar.f40352h) && wj50.m88271j(this.f40353i, covVar.f40353i) && this.f40354j == covVar.f40354j && wj50.m88271j(this.f40355k, covVar.f40355k) && wj50.m88271j(this.f40356l, covVar.f40356l) && wj50.m88271j(this.f40357m, covVar.f40357m);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(f710.m40938f(this.f40346b, this.f40345a.hashCode() * 31, 31), 31, this.f40347c);
        String str = this.f40348d;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f40349e;
        int iHashCode2 = (this.f40354j.hashCode() + ((this.f40353i.hashCode() + ((this.f40352h.hashCode() + s571.m77245d(s571.m77245d((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f40350f), 31, this.f40351g)) * 31)) * 31)) * 31;
        unv unvVar = this.f40355k;
        int iHashCode3 = unvVar != null ? unvVar.hashCode() : 0;
        return this.f40357m.hashCode() + ((this.f40356l.hashCode() + ((iHashCode2 + iHashCode3) * 31)) * 31);
    }
}
