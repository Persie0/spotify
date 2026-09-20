package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ae31 {

    /* JADX INFO: renamed from: a */
    public final int f14737a;

    /* JADX INFO: renamed from: b */
    public final boolean f14738b;

    /* JADX INFO: renamed from: c */
    public final boolean f14739c;

    /* JADX INFO: renamed from: d */
    public final qla1 f14740d;

    /* JADX INFO: renamed from: e */
    public final ud31 f14741e;

    public ae31(int i, boolean z, boolean z2, qla1 qla1Var, ud31 ud31Var) {
        this.f14737a = i;
        this.f14738b = z;
        this.f14739c = z2;
        this.f14740d = qla1Var;
        this.f14741e = ud31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ae31)) {
            return false;
        }
        ae31 ae31Var = (ae31) obj;
        return this.f14737a == ae31Var.f14737a && this.f14738b == ae31Var.f14738b && this.f14739c == ae31Var.f14739c && wj50.m88271j(this.f14740d, ae31Var.f14740d) && wj50.m88271j(this.f14741e, ae31Var.f14741e);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d(Integer.hashCode(this.f14737a) * 31, 31, this.f14738b), 31, this.f14739c);
        qla1 qla1Var = this.f14740d;
        return this.f14741e.hashCode() + ((iM77245d + (qla1Var == null ? 0 : qla1Var.hashCode())) * 31);
    }
}
