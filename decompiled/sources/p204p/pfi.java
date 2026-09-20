package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class pfi {

    /* JADX INFO: renamed from: o */
    public static final pfi f177058o = new pfi("", null, null, "", "", "", "", false, null, true, false, false, false, null);

    /* JADX INFO: renamed from: a */
    public final String f177059a;

    /* JADX INFO: renamed from: b */
    public final j15 f177060b;

    /* JADX INFO: renamed from: c */
    public final n6f f177061c;

    /* JADX INFO: renamed from: d */
    public final String f177062d;

    /* JADX INFO: renamed from: e */
    public final String f177063e;

    /* JADX INFO: renamed from: f */
    public final String f177064f;

    /* JADX INFO: renamed from: g */
    public final String f177065g;

    /* JADX INFO: renamed from: h */
    public final boolean f177066h;

    /* JADX INFO: renamed from: i */
    public final String f177067i;

    /* JADX INFO: renamed from: j */
    public final boolean f177068j;

    /* JADX INFO: renamed from: k */
    public final boolean f177069k;

    /* JADX INFO: renamed from: l */
    public final boolean f177070l;

    /* JADX INFO: renamed from: m */
    public final boolean f177071m;

    /* JADX INFO: renamed from: n */
    public final n6f f177072n;

    public pfi(String str, j15 j15Var, n6f n6fVar, String str2, String str3, String str4, String str5, boolean z, String str6, boolean z2, boolean z3, boolean z4, boolean z5, n6f n6fVar2) {
        this.f177059a = str;
        this.f177060b = j15Var;
        this.f177061c = n6fVar;
        this.f177062d = str2;
        this.f177063e = str3;
        this.f177064f = str4;
        this.f177065g = str5;
        this.f177066h = z;
        this.f177067i = str6;
        this.f177068j = z2;
        this.f177069k = z3;
        this.f177070l = z4;
        this.f177071m = z5;
        this.f177072n = n6fVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pfi)) {
            return false;
        }
        pfi pfiVar = (pfi) obj;
        return wj50.m88271j(this.f177059a, pfiVar.f177059a) && wj50.m88271j(this.f177060b, pfiVar.f177060b) && wj50.m88271j(this.f177061c, pfiVar.f177061c) && wj50.m88271j(this.f177062d, pfiVar.f177062d) && wj50.m88271j(this.f177063e, pfiVar.f177063e) && wj50.m88271j(this.f177064f, pfiVar.f177064f) && wj50.m88271j(this.f177065g, pfiVar.f177065g) && this.f177066h == pfiVar.f177066h && wj50.m88271j(this.f177067i, pfiVar.f177067i) && this.f177068j == pfiVar.f177068j && this.f177069k == pfiVar.f177069k && this.f177070l == pfiVar.f177070l && this.f177071m == pfiVar.f177071m && wj50.m88271j(this.f177072n, pfiVar.f177072n);
    }

    public final int hashCode() {
        int iHashCode = this.f177059a.hashCode() * 31;
        j15 j15Var = this.f177060b;
        int iHashCode2 = (iHashCode + (j15Var == null ? 0 : j15Var.hashCode())) * 31;
        n6f n6fVar = this.f177061c;
        int iM77245d = s571.m77245d(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b((iHashCode2 + (n6fVar == null ? 0 : Long.hashCode(n6fVar.f150873a))) * 31, 31, this.f177062d), 31, this.f177063e), 31, this.f177064f), 31, this.f177065g), 31, this.f177066h);
        String str = this.f177067i;
        int iM77245d2 = s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d((iM77245d + (str == null ? 0 : str.hashCode())) * 31, 31, this.f177068j), 31, this.f177069k), 31, this.f177070l), 31, this.f177071m);
        n6f n6fVar2 = this.f177072n;
        return iM77245d2 + (n6fVar2 != null ? Long.hashCode(n6fVar2.f150873a) : 0);
    }
}
