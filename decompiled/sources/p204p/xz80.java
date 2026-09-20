package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class xz80 {

    /* JADX INFO: renamed from: a */
    public final boolean f267550a;

    /* JADX INFO: renamed from: b */
    public final noa1 f267551b;

    /* JADX INFO: renamed from: c */
    public final wz80 f267552c;

    public xz80(boolean z, noa1 noa1Var, wz80 wz80Var) {
        this.f267550a = z;
        this.f267551b = noa1Var;
        this.f267552c = wz80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xz80)) {
            return false;
        }
        xz80 xz80Var = (xz80) obj;
        return this.f267550a == xz80Var.f267550a && wj50.m88271j(this.f267551b, xz80Var.f267551b) && wj50.m88271j(this.f267552c, xz80Var.f267552c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f267550a) * 31;
        noa1 noa1Var = this.f267551b;
        int iHashCode2 = (iHashCode + (noa1Var == null ? 0 : noa1Var.hashCode())) * 31;
        wz80 wz80Var = this.f267552c;
        return iHashCode2 + (wz80Var != null ? wz80Var.hashCode() : 0);
    }
}
