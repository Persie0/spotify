package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class bce1 implements dce1 {

    /* JADX INFO: renamed from: a */
    public final Object f25854a;

    /* JADX INFO: renamed from: b */
    public final cvt f25855b;

    public bce1(Object obj, cvt cvtVar) {
        this.f25854a = obj;
        this.f25855b = cvtVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bce1)) {
            return false;
        }
        bce1 bce1Var = (bce1) obj;
        return wj50.m88271j(this.f25854a, bce1Var.f25854a) && wj50.m88271j(this.f25855b, bce1Var.f25855b);
    }

    public final int hashCode() {
        Object obj = this.f25854a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        cvt cvtVar = this.f25855b;
        return iHashCode + (cvtVar != null ? cvtVar.hashCode() : 0);
    }
}
