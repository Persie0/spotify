package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class w3c1 {

    /* JADX INFO: renamed from: a */
    public final v3c1 f247555a;

    /* JADX INFO: renamed from: b */
    public final jix0 f247556b;

    /* JADX INFO: renamed from: c */
    public final cq51 f247557c;

    /* JADX INFO: renamed from: d */
    public final int f247558d;

    /* JADX INFO: renamed from: e */
    public final boolean f247559e;

    /* JADX INFO: renamed from: f */
    public final boolean f247560f;

    public w3c1(v3c1 v3c1Var, jix0 jix0Var, cq51 cq51Var, int i, boolean z, boolean z2) {
        this.f247555a = v3c1Var;
        this.f247556b = jix0Var;
        this.f247557c = cq51Var;
        this.f247558d = i;
        this.f247559e = z;
        this.f247560f = z2;
    }

    /* JADX INFO: renamed from: a */
    public static w3c1 m87106a(w3c1 w3c1Var, v3c1 v3c1Var, jix0 jix0Var, cq51 cq51Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            jix0Var = w3c1Var.f247556b;
        }
        jix0 jix0Var2 = jix0Var;
        if ((i2 & 4) != 0) {
            cq51Var = w3c1Var.f247557c;
        }
        cq51 cq51Var2 = cq51Var;
        if ((i2 & 8) != 0) {
            i = w3c1Var.f247558d;
        }
        int i3 = i;
        boolean z = w3c1Var.f247559e;
        boolean z2 = (i2 & 32) != 0 ? w3c1Var.f247560f : true;
        w3c1Var.getClass();
        return new w3c1(v3c1Var, jix0Var2, cq51Var2, i3, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w3c1)) {
            return false;
        }
        w3c1 w3c1Var = (w3c1) obj;
        return wj50.m88271j(this.f247555a, w3c1Var.f247555a) && wj50.m88271j(this.f247556b, w3c1Var.f247556b) && wj50.m88271j(this.f247557c, w3c1Var.f247557c) && this.f247558d == w3c1Var.f247558d && this.f247559e == w3c1Var.f247559e && this.f247560f == w3c1Var.f247560f;
    }

    public final int hashCode() {
        int iHashCode = this.f247555a.hashCode() * 31;
        jix0 jix0Var = this.f247556b;
        int iHashCode2 = (iHashCode + (jix0Var == null ? 0 : jix0Var.hashCode())) * 31;
        cq51 cq51Var = this.f247557c;
        return Boolean.hashCode(this.f247560f) + s571.m77245d(mt60.m62800g(this.f247558d, (iHashCode2 + (cq51Var != null ? cq51Var.hashCode() : 0)) * 31, 31), 31, this.f247559e);
    }
}
