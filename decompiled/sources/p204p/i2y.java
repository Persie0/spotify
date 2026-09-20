package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class i2y {

    /* JADX INFO: renamed from: a */
    public final ex81 f97929a;

    /* JADX INFO: renamed from: b */
    public final y9s f97930b;

    /* JADX INFO: renamed from: c */
    public final y6s0 f97931c;

    /* JADX INFO: renamed from: d */
    public final glr f97932d;

    /* JADX INFO: renamed from: e */
    public final pro0 f97933e;

    /* JADX INFO: renamed from: f */
    public final boolean f97934f;

    /* JADX INFO: renamed from: g */
    public final boolean f97935g;

    /* JADX INFO: renamed from: h */
    public final Double f97936h;

    /* JADX INFO: renamed from: i */
    public final a92 f97937i;

    /* JADX INFO: renamed from: j */
    public final m140 f97938j;

    /* JADX INFO: renamed from: k */
    public final String f97939k;

    public i2y(ex81 ex81Var, y9s y9sVar, y6s0 y6s0Var, glr glrVar, pro0 pro0Var, boolean z, boolean z2, Double d, a92 a92Var, m140 m140Var, String str) {
        this.f97929a = ex81Var;
        this.f97930b = y9sVar;
        this.f97931c = y6s0Var;
        this.f97932d = glrVar;
        this.f97933e = pro0Var;
        this.f97934f = z;
        this.f97935g = z2;
        this.f97936h = d;
        this.f97937i = a92Var;
        this.f97938j = m140Var;
        this.f97939k = str;
    }

    /* JADX INFO: renamed from: a */
    public static i2y m49529a(i2y i2yVar, ex81 ex81Var, y9s y9sVar, y6s0 y6s0Var, glr glrVar, pro0 pro0Var, boolean z, boolean z2, Double d, a92 a92Var, m140 m140Var, String str, int i) {
        if ((i & 1) != 0) {
            ex81Var = i2yVar.f97929a;
        }
        ex81 ex81Var2 = ex81Var;
        if ((i & 2) != 0) {
            y9sVar = i2yVar.f97930b;
        }
        y9s y9sVar2 = y9sVar;
        if ((i & 4) != 0) {
            y6s0Var = i2yVar.f97931c;
        }
        y6s0 y6s0Var2 = y6s0Var;
        glr glrVar2 = (i & 8) != 0 ? i2yVar.f97932d : glrVar;
        pro0 pro0Var2 = (i & 16) != 0 ? i2yVar.f97933e : pro0Var;
        boolean z3 = (i & 32) != 0 ? i2yVar.f97934f : z;
        boolean z4 = (i & 64) != 0 ? i2yVar.f97935g : z2;
        Double d2 = (i & 128) != 0 ? i2yVar.f97936h : d;
        a92 a92Var2 = (i & 256) != 0 ? i2yVar.f97937i : a92Var;
        m140 m140Var2 = (i & 512) != 0 ? i2yVar.f97938j : m140Var;
        String str2 = (i & 1024) != 0 ? i2yVar.f97939k : str;
        i2yVar.getClass();
        return new i2y(ex81Var2, y9sVar2, y6s0Var2, glrVar2, pro0Var2, z3, z4, d2, a92Var2, m140Var2, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2y)) {
            return false;
        }
        i2y i2yVar = (i2y) obj;
        return wj50.m88271j(this.f97929a, i2yVar.f97929a) && this.f97930b == i2yVar.f97930b && wj50.m88271j(this.f97931c, i2yVar.f97931c) && wj50.m88271j(this.f97932d, i2yVar.f97932d) && this.f97933e == i2yVar.f97933e && this.f97934f == i2yVar.f97934f && this.f97935g == i2yVar.f97935g && wj50.m88271j(this.f97936h, i2yVar.f97936h) && wj50.m88271j(this.f97937i, i2yVar.f97937i) && wj50.m88271j(this.f97938j, i2yVar.f97938j) && wj50.m88271j(this.f97939k, i2yVar.f97939k);
    }

    public final int hashCode() {
        int iHashCode = (this.f97930b.hashCode() + (this.f97929a.hashCode() * 31)) * 31;
        y6s0 y6s0Var = this.f97931c;
        int iM77245d = s571.m77245d(s571.m77245d((this.f97933e.hashCode() + ((this.f97932d.hashCode() + ((iHashCode + (y6s0Var == null ? 0 : y6s0Var.hashCode())) * 31)) * 31)) * 31, 31, this.f97934f), 31, this.f97935g);
        Double d = this.f97936h;
        int iHashCode2 = (iM77245d + (d == null ? 0 : d.hashCode())) * 31;
        a92 a92Var = this.f97937i;
        int iHashCode3 = (iHashCode2 + (a92Var == null ? 0 : a92Var.hashCode())) * 31;
        m140 m140Var = this.f97938j;
        int iHashCode4 = (iHashCode3 + (m140Var == null ? 0 : m140Var.hashCode())) * 31;
        String str = this.f97939k;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    public /* synthetic */ i2y(ex81 ex81Var, y9s y9sVar, y6s0 y6s0Var, glr glrVar, pro0 pro0Var, Double d, a92 a92Var, int i) {
        this((i & 1) != 0 ? cx81.f42952a : ex81Var, (i & 2) != 0 ? y9s.f270638a : y9sVar, (i & 4) != 0 ? null : y6s0Var, (i & 8) != 0 ? clr.f39347a : glrVar, (i & 16) != 0 ? pro0.f180654b : pro0Var, true, false, (i & 128) != 0 ? null : d, (i & 256) != 0 ? null : a92Var, null, null);
    }
}
