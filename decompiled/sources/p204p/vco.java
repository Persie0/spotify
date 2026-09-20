package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class vco {

    /* JADX INFO: renamed from: a */
    public final int f240170a;

    /* JADX INFO: renamed from: b */
    public final boolean f240171b;

    /* JADX INFO: renamed from: c */
    public final boolean f240172c;

    /* JADX INFO: renamed from: d */
    public final boolean f240173d;

    /* JADX INFO: renamed from: e */
    public final rco f240174e;

    /* JADX INFO: renamed from: f */
    public final ilv0 f240175f;

    /* JADX INFO: renamed from: g */
    public final s5a0 f240176g;

    public vco(int i, boolean z, boolean z2, boolean z3, rco rcoVar, ilv0 ilv0Var, s5a0 s5a0Var) {
        this.f240170a = i;
        this.f240171b = z;
        this.f240172c = z2;
        this.f240173d = z3;
        this.f240174e = rcoVar;
        this.f240175f = ilv0Var;
        this.f240176g = s5a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vco)) {
            return false;
        }
        vco vcoVar = (vco) obj;
        return this.f240170a == vcoVar.f240170a && this.f240171b == vcoVar.f240171b && this.f240172c == vcoVar.f240172c && this.f240173d == vcoVar.f240173d && wj50.m88271j(this.f240174e, vcoVar.f240174e) && wj50.m88271j(this.f240175f, vcoVar.f240175f) && wj50.m88271j(this.f240176g, vcoVar.f240176g);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77245d(Integer.hashCode(this.f240170a) * 31, 31, this.f240171b), 31, this.f240172c), 31, this.f240173d);
        rco rcoVar = this.f240174e;
        return this.f240176g.hashCode() + ((this.f240175f.hashCode() + ((iM77245d + (rcoVar == null ? 0 : rcoVar.hashCode())) * 31)) * 31);
    }
}
