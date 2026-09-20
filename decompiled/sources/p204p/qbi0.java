package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class qbi0 implements ubi0 {

    /* JADX INFO: renamed from: a */
    public final up60 f187097a;

    /* JADX INFO: renamed from: b */
    public final xh00 f187098b;

    public qbi0(up60 up60Var, xh00 xh00Var) {
        this.f187097a = up60Var;
        this.f187098b = xh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qbi0)) {
            return false;
        }
        qbi0 qbi0Var = (qbi0) obj;
        return wj50.m88271j(this.f187097a, qbi0Var.f187097a) && wj50.m88271j(this.f187098b, qbi0Var.f187098b);
    }

    public final int hashCode() {
        return this.f187098b.hashCode() + (this.f187097a.hashCode() * 31);
    }
}
