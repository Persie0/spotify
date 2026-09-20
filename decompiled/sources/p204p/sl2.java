package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class sl2 {

    /* JADX INFO: renamed from: a */
    public final String f210254a;

    /* JADX INFO: renamed from: b */
    public final String f210255b;

    /* JADX INFO: renamed from: c */
    public final tl2 f210256c;

    /* JADX INFO: renamed from: d */
    public final bm2 f210257d;

    /* JADX INFO: renamed from: e */
    public final bm2 f210258e;

    /* JADX INFO: renamed from: f */
    public final vm2 f210259f;

    public sl2(String str, String str2, tl2 tl2Var, bm2 bm2Var, bm2 bm2Var2, vm2 vm2Var, int i) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        tl2Var = (i & 4) != 0 ? null : tl2Var;
        bm2Var = (i & 8) != 0 ? null : bm2Var;
        bm2Var2 = (i & 16) != 0 ? null : bm2Var2;
        vm2Var = (i & 32) != 0 ? null : vm2Var;
        this.f210254a = str;
        this.f210255b = str2;
        this.f210256c = tl2Var;
        this.f210257d = bm2Var;
        this.f210258e = bm2Var2;
        this.f210259f = vm2Var;
    }

    /* JADX INFO: renamed from: a */
    public final String m78428a() {
        return this.f210255b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sl2)) {
            return false;
        }
        sl2 sl2Var = (sl2) obj;
        return wj50.m88271j(this.f210254a, sl2Var.f210254a) && wj50.m88271j(this.f210255b, sl2Var.f210255b) && wj50.m88271j(this.f210256c, sl2Var.f210256c) && wj50.m88271j(this.f210257d, sl2Var.f210257d) && wj50.m88271j(this.f210258e, sl2Var.f210258e) && wj50.m88271j(this.f210259f, sl2Var.f210259f);
    }

    public final int hashCode() {
        String str = this.f210254a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f210255b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        tl2 tl2Var = this.f210256c;
        int iHashCode3 = (iHashCode2 + (tl2Var == null ? 0 : tl2Var.hashCode())) * 31;
        bm2 bm2Var = this.f210257d;
        int iHashCode4 = (iHashCode3 + (bm2Var == null ? 0 : bm2Var.hashCode())) * 31;
        bm2 bm2Var2 = this.f210258e;
        int iHashCode5 = (iHashCode4 + (bm2Var2 == null ? 0 : bm2Var2.hashCode())) * 31;
        vm2 vm2Var = this.f210259f;
        return iHashCode5 + (vm2Var != null ? vm2Var.hashCode() : 0);
    }
}
