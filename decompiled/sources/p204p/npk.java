package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class npk {

    /* JADX INFO: renamed from: a */
    public final long f157021a;

    /* JADX INFO: renamed from: b */
    public final long f157022b;

    /* JADX INFO: renamed from: c */
    public final nu71 f157023c;

    /* JADX INFO: renamed from: d */
    public final nu71 f157024d;

    public npk(long j, long j2, nu71 nu71Var, nu71 nu71Var2) {
        this.f157021a = j;
        this.f157022b = j2;
        this.f157023c = nu71Var;
        this.f157024d = nu71Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof npk)) {
            return false;
        }
        npk npkVar = (npk) obj;
        return mu71.m62836c(this.f157021a, npkVar.f157021a) && mu71.m62836c(this.f157022b, npkVar.f157022b) && wj50.m88271j(this.f157023c, npkVar.f157023c) && wj50.m88271j(this.f157024d, npkVar.f157024d);
    }

    public final int hashCode() {
        int iM36605e = dq60.m36605e(Long.hashCode(this.f157021a) * 31, this.f157022b, 31);
        nu71 nu71Var = this.f157023c;
        int iHashCode = (iM36605e + (nu71Var == null ? 0 : Long.hashCode(nu71Var.f158526a))) * 31;
        nu71 nu71Var2 = this.f157024d;
        return iHashCode + (nu71Var2 != null ? Long.hashCode(nu71Var2.f158526a) : 0);
    }
}
