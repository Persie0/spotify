package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class it41 implements tu41 {

    /* JADX INFO: renamed from: a */
    public final v6w0 f105421a;

    /* JADX INFO: renamed from: b */
    public final d6w0 f105422b;

    /* JADX INFO: renamed from: c */
    public final m140 f105423c;

    /* JADX INFO: renamed from: d */
    public final m140 f105424d;

    /* JADX INFO: renamed from: e */
    public final y6s0 f105425e;

    /* JADX INFO: renamed from: f */
    public final pro0 f105426f;

    /* JADX INFO: renamed from: g */
    public final y9s f105427g;

    /* JADX INFO: renamed from: h */
    public final int f105428h;

    /* JADX INFO: renamed from: i */
    public final glr f105429i;

    /* JADX INFO: renamed from: j */
    public final boolean f105430j;

    /* JADX INFO: renamed from: k */
    public final boolean f105431k;

    /* JADX INFO: renamed from: l */
    public final boolean f105432l;

    /* JADX INFO: renamed from: m */
    public final a92 f105433m;

    /* JADX INFO: renamed from: n */
    public final Double f105434n;

    public it41(v6w0 v6w0Var, d6w0 d6w0Var, m140 m140Var, m140 m140Var2, y6s0 y6s0Var, pro0 pro0Var, y9s y9sVar, int i, glr glrVar, boolean z, boolean z2, boolean z3, a92 a92Var, Double d) {
        this.f105421a = v6w0Var;
        this.f105422b = d6w0Var;
        this.f105423c = m140Var;
        this.f105424d = m140Var2;
        this.f105425e = y6s0Var;
        this.f105426f = pro0Var;
        this.f105427g = y9sVar;
        this.f105428h = i;
        this.f105429i = glrVar;
        this.f105430j = z;
        this.f105431k = z2;
        this.f105432l = z3;
        this.f105433m = a92Var;
        this.f105434n = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof it41)) {
            return false;
        }
        it41 it41Var = (it41) obj;
        return wj50.m88271j(this.f105421a, it41Var.f105421a) && wj50.m88271j(this.f105422b, it41Var.f105422b) && wj50.m88271j(this.f105423c, it41Var.f105423c) && wj50.m88271j(this.f105424d, it41Var.f105424d) && wj50.m88271j(this.f105425e, it41Var.f105425e) && this.f105426f == it41Var.f105426f && this.f105427g == it41Var.f105427g && this.f105428h == it41Var.f105428h && wj50.m88271j(this.f105429i, it41Var.f105429i) && this.f105430j == it41Var.f105430j && this.f105431k == it41Var.f105431k && this.f105432l == it41Var.f105432l && wj50.m88271j(this.f105433m, it41Var.f105433m) && wj50.m88271j(this.f105434n, it41Var.f105434n);
    }

    public final int hashCode() {
        int iHashCode = (this.f105422b.hashCode() + (this.f105421a.hashCode() * 31)) * 31;
        m140 m140Var = this.f105423c;
        int iHashCode2 = (iHashCode + (m140Var == null ? 0 : m140Var.hashCode())) * 31;
        m140 m140Var2 = this.f105424d;
        int iHashCode3 = (iHashCode2 + (m140Var2 == null ? 0 : m140Var2.hashCode())) * 31;
        y6s0 y6s0Var = this.f105425e;
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77245d((this.f105429i.hashCode() + f710.m40938f(this.f105428h, (this.f105427g.hashCode() + ((this.f105426f.hashCode() + ((iHashCode3 + (y6s0Var == null ? 0 : y6s0Var.hashCode())) * 31)) * 31)) * 31, 31)) * 31, 31, this.f105430j), 31, this.f105431k), 31, this.f105432l);
        a92 a92Var = this.f105433m;
        int iHashCode4 = (iM77245d + (a92Var == null ? 0 : a92Var.hashCode())) * 31;
        Double d = this.f105434n;
        return iHashCode4 + (d != null ? d.hashCode() : 0);
    }
}
