package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class xzq implements k0r {

    /* JADX INFO: renamed from: a */
    public final wzq f267733a;

    /* JADX INFO: renamed from: b */
    public final d850 f267734b;

    public xzq(wzq wzqVar, d850 d850Var) {
        this.f267733a = wzqVar;
        this.f267734b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xzq)) {
            return false;
        }
        xzq xzqVar = (xzq) obj;
        return this.f267733a == xzqVar.f267733a && wj50.m88271j(this.f267734b, xzqVar.f267734b);
    }

    public final int hashCode() {
        int iHashCode = this.f267733a.hashCode() * 31;
        d850 d850Var = this.f267734b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
