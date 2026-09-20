package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class yg6 {

    /* JADX INFO: renamed from: a */
    public final AbstractC1961i f272492a;

    /* JADX INFO: renamed from: b */
    public final boolean f272493b;

    /* JADX INFO: renamed from: c */
    public final boolean f272494c;

    /* JADX INFO: renamed from: d */
    public final boolean f272495d;

    /* JADX INFO: renamed from: e */
    public final boolean f272496e;

    /* JADX INFO: renamed from: f */
    public final int f272497f;

    /* JADX INFO: renamed from: g */
    public final bep0 f272498g;

    /* JADX INFO: renamed from: h */
    public final Object f272499h;

    public yg6(AbstractC1961i abstractC1961i, boolean z, boolean z2, boolean z3, boolean z4, int i, bep0 bep0Var, Object obj) {
        this.f272492a = abstractC1961i;
        this.f272493b = z;
        this.f272494c = z2;
        this.f272495d = z3;
        this.f272496e = z4;
        this.f272497f = i;
        this.f272498g = bep0Var;
        this.f272499h = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yg6)) {
            return false;
        }
        yg6 yg6Var = (yg6) obj;
        return this.f272492a.equals(yg6Var.f272492a) && this.f272493b == yg6Var.f272493b && this.f272494c == yg6Var.f272494c && this.f272495d == yg6Var.f272495d && this.f272496e == yg6Var.f272496e && this.f272497f == yg6Var.f272497f && this.f272498g.equals(yg6Var.f272498g) && wj50.m88271j(this.f272499h, yg6Var.f272499h);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(this.f272492a.hashCode() * 31, 31, this.f272493b), 31, this.f272494c), 31, this.f272495d), 31, this.f272496e);
        int i = this.f272497f;
        int iHashCode = (this.f272498g.hashCode() + ((iM77245d + (i == 0 ? 0 : edb.m38547C(i))) * 31)) * 31;
        Object obj = this.f272499h;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }
}
