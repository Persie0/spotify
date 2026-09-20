package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class it20 implements rt71 {

    /* JADX INFO: renamed from: X */
    public final qf40 f105397X;

    /* JADX INFO: renamed from: a */
    public final String f105398a;

    /* JADX INFO: renamed from: b */
    public final String f105399b;

    /* JADX INFO: renamed from: c */
    public final fuz0 f105400c;

    /* JADX INFO: renamed from: d */
    public final uu20 f105401d;

    /* JADX INFO: renamed from: e */
    public final bo01 f105402e;

    /* JADX INFO: renamed from: f */
    public final gs20 f105403f;

    /* JADX INFO: renamed from: g */
    public final String f105404g;

    /* JADX INFO: renamed from: h */
    public final hs20 f105405h;

    /* JADX INFO: renamed from: i */
    public final is20 f105406i;

    /* JADX INFO: renamed from: t */
    public final String f105407t;

    public it20(String str, String str2, fuz0 fuz0Var, uu20 uu20Var, bo01 bo01Var, gs20 gs20Var, String str3, hs20 hs20Var, is20 is20Var, String str4, qf40 qf40Var) {
        this.f105398a = str;
        this.f105399b = str2;
        this.f105400c = fuz0Var;
        this.f105401d = uu20Var;
        this.f105402e = bo01Var;
        this.f105403f = gs20Var;
        this.f105404g = str3;
        this.f105405h = hs20Var;
        this.f105406i = is20Var;
        this.f105407t = str4;
        this.f105397X = qf40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof it20)) {
            return false;
        }
        it20 it20Var = (it20) obj;
        return wj50.m88271j(this.f105398a, it20Var.f105398a) && wj50.m88271j(this.f105399b, it20Var.f105399b) && wj50.m88271j(this.f105400c, it20Var.f105400c) && wj50.m88271j(this.f105401d, it20Var.f105401d) && wj50.m88271j(this.f105402e, it20Var.f105402e) && wj50.m88271j(this.f105403f, it20Var.f105403f) && wj50.m88271j(this.f105404g, it20Var.f105404g) && wj50.m88271j(this.f105405h, it20Var.f105405h) && wj50.m88271j(this.f105406i, it20Var.f105406i) && wj50.m88271j(this.f105407t, it20Var.f105407t) && wj50.m88271j(this.f105397X, it20Var.f105397X);
    }

    @Override // p204p.rt71
    public final String getId() {
        return this.f105398a;
    }

    public final int hashCode() {
        int iHashCode = (this.f105403f.hashCode() + ((this.f105402e.hashCode() + ((this.f105401d.hashCode() + tfe.m80647e(s571.m77243b(this.f105398a.hashCode() * 31, 31, this.f105399b), this.f105400c.f73606a, 31)) * 31)) * 31)) * 31;
        String str = this.f105404g;
        int iHashCode2 = (this.f105405h.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        is20 is20Var = this.f105406i;
        return this.f105397X.hashCode() + s571.m77243b((iHashCode2 + (is20Var != null ? is20Var.hashCode() : 0)) * 31, 31, this.f105407t);
    }
}
