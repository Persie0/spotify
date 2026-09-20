package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class hfd1 implements pcd1 {

    /* JADX INFO: renamed from: a */
    public final String f90698a;

    /* JADX INFO: renamed from: b */
    public final String f90699b;

    /* JADX INFO: renamed from: c */
    public final String f90700c;

    /* JADX INFO: renamed from: d */
    public final gej f90701d;

    /* JADX INFO: renamed from: e */
    public final efd1 f90702e;

    /* JADX INFO: renamed from: f */
    public final String f90703f;

    /* JADX INFO: renamed from: g */
    public final AbstractC2524w8 f90704g;

    /* JADX INFO: renamed from: h */
    public final gfd1 f90705h;

    /* JADX INFO: renamed from: i */
    public final ll20 f90706i;

    public hfd1(String str, String str2, String str3, gej gejVar, efd1 efd1Var, String str4, AbstractC2524w8 abstractC2524w8, gfd1 gfd1Var, ll20 ll20Var) {
        this.f90698a = str;
        this.f90699b = str2;
        this.f90700c = str3;
        this.f90701d = gejVar;
        this.f90702e = efd1Var;
        this.f90703f = str4;
        this.f90704g = abstractC2524w8;
        this.f90705h = gfd1Var;
        this.f90706i = ll20Var;
    }

    @Override // p204p.pcd1
    /* JADX INFO: renamed from: c */
    public final gej mo44314c() {
        return this.f90701d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hfd1)) {
            return false;
        }
        hfd1 hfd1Var = (hfd1) obj;
        return wj50.m88271j(this.f90698a, hfd1Var.f90698a) && wj50.m88271j(this.f90699b, hfd1Var.f90699b) && wj50.m88271j(this.f90700c, hfd1Var.f90700c) && wj50.m88271j(this.f90701d, hfd1Var.f90701d) && this.f90702e.equals(hfd1Var.f90702e) && wj50.m88271j(this.f90703f, hfd1Var.f90703f) && wj50.m88271j(this.f90704g, hfd1Var.f90704g) && wj50.m88271j(this.f90705h, hfd1Var.f90705h) && wj50.m88271j(this.f90706i, hfd1Var.f90706i);
    }

    @Override // p204p.pcd1
    /* JADX INFO: renamed from: g */
    public final ll20 mo44315g() {
        return this.f90706i;
    }

    @Override // p204p.pcd1
    public final String getItemId() {
        return this.f90698a;
    }

    @Override // p204p.pcd1
    public final String getUri() {
        return this.f90699b;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f90698a.hashCode() * 31, 31, this.f90699b), 31, this.f90700c);
        gej gejVar = this.f90701d;
        int iHashCode = (this.f90704g.hashCode() + s571.m77243b((this.f90702e.hashCode() + ((iM77243b + (gejVar == null ? 0 : gejVar.hashCode())) * 31)) * 31, 31, this.f90703f)) * 31;
        gfd1 gfd1Var = this.f90705h;
        int iHashCode2 = (iHashCode + (gfd1Var == null ? 0 : gfd1Var.hashCode())) * 961;
        ll20 ll20Var = this.f90706i;
        return iHashCode2 + (ll20Var != null ? ll20Var.hashCode() : 0);
    }
}
