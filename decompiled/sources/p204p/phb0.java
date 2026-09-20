package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class phb0 {

    /* JADX INFO: renamed from: a */
    public final ohb0 f177520a;

    /* JADX INFO: renamed from: b */
    public final sbb0 f177521b;

    /* JADX INFO: renamed from: c */
    public final String f177522c;

    /* JADX INFO: renamed from: d */
    public final String f177523d;

    /* JADX INFO: renamed from: e */
    public final String f177524e;

    /* JADX INFO: renamed from: f */
    public final String f177525f;

    /* JADX INFO: renamed from: g */
    public final fhb0 f177526g;

    /* JADX INFO: renamed from: h */
    public final String f177527h;

    /* JADX INFO: renamed from: i */
    public final boolean f177528i;

    /* JADX INFO: renamed from: j */
    public final boolean f177529j;

    /* JADX INFO: renamed from: k */
    public final yc91 f177530k;

    /* JADX INFO: renamed from: l */
    public final boolean f177531l;

    /* JADX INFO: renamed from: m */
    public final bhb0 f177532m;

    /* JADX INFO: renamed from: n */
    public final k100 f177533n;

    /* JADX INFO: renamed from: o */
    public final boolean f177534o;

    /* JADX INFO: renamed from: p */
    public final boolean f177535p;

    /* JADX INFO: renamed from: q */
    public final boolean f177536q;

    /* JADX INFO: renamed from: r */
    public final ktw0 f177537r;

    public phb0(ohb0 ohb0Var, sbb0 sbb0Var, String str, String str2, String str3, String str4, fhb0 fhb0Var, String str5, boolean z, boolean z2, yc91 yc91Var, boolean z3, bhb0 bhb0Var, k100 k100Var, boolean z4, boolean z5, boolean z6, ktw0 ktw0Var) {
        this.f177520a = ohb0Var;
        this.f177521b = sbb0Var;
        this.f177522c = str;
        this.f177523d = str2;
        this.f177524e = str3;
        this.f177525f = str4;
        this.f177526g = fhb0Var;
        this.f177527h = str5;
        this.f177528i = z;
        this.f177529j = z2;
        this.f177530k = yc91Var;
        this.f177531l = z3;
        this.f177532m = bhb0Var;
        this.f177533n = k100Var;
        this.f177534o = z4;
        this.f177535p = z5;
        this.f177536q = z6;
        this.f177537r = ktw0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof phb0)) {
            return false;
        }
        phb0 phb0Var = (phb0) obj;
        return wj50.m88271j(this.f177520a, phb0Var.f177520a) && wj50.m88271j(this.f177521b, phb0Var.f177521b) && wj50.m88271j(this.f177522c, phb0Var.f177522c) && wj50.m88271j(this.f177523d, phb0Var.f177523d) && wj50.m88271j(this.f177524e, phb0Var.f177524e) && wj50.m88271j(this.f177525f, phb0Var.f177525f) && wj50.m88271j(this.f177526g, phb0Var.f177526g) && wj50.m88271j(this.f177527h, phb0Var.f177527h) && this.f177528i == phb0Var.f177528i && this.f177529j == phb0Var.f177529j && wj50.m88271j(this.f177530k, phb0Var.f177530k) && this.f177531l == phb0Var.f177531l && wj50.m88271j(this.f177532m, phb0Var.f177532m) && wj50.m88271j(this.f177533n, phb0Var.f177533n) && this.f177534o == phb0Var.f177534o && this.f177535p == phb0Var.f177535p && this.f177536q == phb0Var.f177536q && wj50.m88271j(this.f177537r, phb0Var.f177537r);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77245d((this.f177533n.hashCode() + ((this.f177532m.hashCode() + s571.m77245d((this.f177530k.hashCode() + s571.m77245d(s571.m77245d(s571.m77243b((this.f177526g.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b((this.f177521b.hashCode() + (this.f177520a.hashCode() * 31)) * 31, 31, this.f177522c), 31, this.f177523d), 31, this.f177524e), 31, this.f177525f)) * 31, 31, this.f177527h), 31, this.f177528i), 31, this.f177529j)) * 31, 31, this.f177531l)) * 31)) * 31, 31, this.f177534o), 31, this.f177535p), 31, this.f177536q);
        ktw0 ktw0Var = this.f177537r;
        return iM77245d + (ktw0Var == null ? 0 : ktw0Var.hashCode());
    }
}
