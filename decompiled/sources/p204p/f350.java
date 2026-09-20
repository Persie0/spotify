package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class f350 {

    /* JADX INFO: renamed from: a */
    public final Object f65360a;

    /* JADX INFO: renamed from: b */
    public final cvt f65361b;

    public f350(Object obj, cvt cvtVar) {
        this.f65360a = obj;
        this.f65361b = cvtVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f350)) {
            return false;
        }
        f350 f350Var = (f350) obj;
        return wj50.m88271j(this.f65360a, f350Var.f65360a) && wj50.m88271j(this.f65361b, f350Var.f65361b);
    }

    public final int hashCode() {
        Object obj = this.f65360a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        cvt cvtVar = this.f65361b;
        return iHashCode + (cvtVar != null ? cvtVar.hashCode() : 0);
    }
}
