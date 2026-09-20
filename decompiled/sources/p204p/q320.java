package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class q320 {

    /* JADX INFO: renamed from: a */
    public final r320 f184779a;

    /* JADX INFO: renamed from: b */
    public final cvt f184780b;

    public q320(r320 r320Var, cvt cvtVar) {
        this.f184779a = r320Var;
        this.f184780b = cvtVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q320)) {
            return false;
        }
        q320 q320Var = (q320) obj;
        return wj50.m88271j(this.f184779a, q320Var.f184779a) && wj50.m88271j(this.f184780b, q320Var.f184780b);
    }

    public final int hashCode() {
        int iHashCode = this.f184779a.hashCode() * 31;
        cvt cvtVar = this.f184780b;
        return iHashCode + (cvtVar == null ? 0 : cvtVar.hashCode());
    }
}
