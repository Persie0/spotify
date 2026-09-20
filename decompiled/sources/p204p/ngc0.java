package p204p;

/* JADX INFO: loaded from: classes10.dex */
@rtz0
public final class ngc0 {
    public static final mgc0 Companion = new mgc0();

    /* JADX INFO: renamed from: h */
    public static final fr70[] f153639h = {null, null, null, null, q3d0.m72078I(2, pec0.f176729t), null, q3d0.m72078I(2, pec0.f176712X)};

    /* JADX INFO: renamed from: a */
    public final gy31 f153640a;

    /* JADX INFO: renamed from: b */
    public final wx31 f153641b;

    /* JADX INFO: renamed from: c */
    public final k4y f153642c;

    /* JADX INFO: renamed from: d */
    public final d4y f153643d;

    /* JADX INFO: renamed from: e */
    public final mbr f153644e;

    /* JADX INFO: renamed from: f */
    public final String f153645f;

    /* JADX INFO: renamed from: g */
    public final ep3 f153646g;

    public /* synthetic */ ngc0(int i, gy31 gy31Var, wx31 wx31Var, k4y k4yVar, d4y d4yVar, mbr mbrVar, String str, ep3 ep3Var) {
        if (30 != (i & 30)) {
            edo.m38617p(i, 30, lgc0.f133201a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.f153640a = null;
        } else {
            this.f153640a = gy31Var;
        }
        this.f153641b = wx31Var;
        this.f153642c = k4yVar;
        this.f153643d = d4yVar;
        this.f153644e = mbrVar;
        if ((i & 32) == 0) {
            this.f153645f = null;
        } else {
            this.f153645f = str;
        }
        if ((i & 64) == 0) {
            this.f153646g = null;
        } else {
            this.f153646g = ep3Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ngc0)) {
            return false;
        }
        ngc0 ngc0Var = (ngc0) obj;
        return wj50.m88271j(this.f153640a, ngc0Var.f153640a) && wj50.m88271j(this.f153641b, ngc0Var.f153641b) && wj50.m88271j(this.f153642c, ngc0Var.f153642c) && wj50.m88271j(this.f153643d, ngc0Var.f153643d) && this.f153644e == ngc0Var.f153644e && wj50.m88271j(this.f153645f, ngc0Var.f153645f) && this.f153646g == ngc0Var.f153646g;
    }

    public final int hashCode() {
        gy31 gy31Var = this.f153640a;
        int iHashCode = (this.f153644e.hashCode() + ((this.f153643d.hashCode() + ((this.f153642c.hashCode() + ((this.f153641b.hashCode() + ((gy31Var == null ? 0 : gy31Var.hashCode()) * 31)) * 31)) * 31)) * 31)) * 31;
        String str = this.f153645f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ep3 ep3Var = this.f153646g;
        return iHashCode2 + (ep3Var != null ? ep3Var.hashCode() : 0);
    }
}
