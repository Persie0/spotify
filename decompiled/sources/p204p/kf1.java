package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class kf1 {

    /* JADX INFO: renamed from: a */
    public final String f122025a;

    /* JADX INFO: renamed from: b */
    public final String f122026b;

    /* JADX INFO: renamed from: c */
    public final String f122027c;

    /* JADX INFO: renamed from: d */
    public final xf1 f122028d;

    /* JADX INFO: renamed from: e */
    public final ld1 f122029e;

    /* JADX INFO: renamed from: f */
    public final String f122030f;

    /* JADX INFO: renamed from: g */
    public final w00 f122031g;

    /* JADX INFO: renamed from: h */
    public final zf1 f122032h;

    /* JADX INFO: renamed from: i */
    public final boolean f122033i;

    /* JADX INFO: renamed from: j */
    public final w00 f122034j;

    public kf1(String str, String str2, String str3, xf1 xf1Var, ld1 ld1Var, String str4, w00 w00Var, zf1 zf1Var, boolean z, w00 w00Var2) {
        this.f122025a = str;
        this.f122026b = str2;
        this.f122027c = str3;
        this.f122028d = xf1Var;
        this.f122029e = ld1Var;
        this.f122030f = str4;
        this.f122031g = w00Var;
        this.f122032h = zf1Var;
        this.f122033i = z;
        this.f122034j = w00Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kf1)) {
            return false;
        }
        kf1 kf1Var = (kf1) obj;
        return wj50.m88271j(this.f122025a, kf1Var.f122025a) && wj50.m88271j(this.f122026b, kf1Var.f122026b) && wj50.m88271j(this.f122027c, kf1Var.f122027c) && wj50.m88271j(this.f122028d, kf1Var.f122028d) && wj50.m88271j(this.f122029e, kf1Var.f122029e) && wj50.m88271j(this.f122030f, kf1Var.f122030f) && wj50.m88271j(this.f122031g, kf1Var.f122031g) && wj50.m88271j(this.f122032h, kf1Var.f122032h) && this.f122033i == kf1Var.f122033i && wj50.m88271j(this.f122034j, kf1Var.f122034j);
    }

    public final int hashCode() {
        return this.f122034j.hashCode() + s571.m77245d((this.f122032h.hashCode() + ((this.f122031g.hashCode() + s571.m77243b((this.f122029e.hashCode() + ((this.f122028d.hashCode() + s571.m77243b(s571.m77243b(this.f122025a.hashCode() * 31, 31, this.f122026b), 31, this.f122027c)) * 31)) * 31, 31, this.f122030f)) * 31)) * 31, 31, this.f122033i);
    }
}
