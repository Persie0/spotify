package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class nzq implements k0r {

    /* JADX INFO: renamed from: a */
    public final mzq f160136a;

    /* JADX INFO: renamed from: b */
    public final String f160137b;

    public nzq(mzq mzqVar, String str) {
        this.f160136a = mzqVar;
        this.f160137b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nzq)) {
            return false;
        }
        nzq nzqVar = (nzq) obj;
        return this.f160136a == nzqVar.f160136a && wj50.m88271j(this.f160137b, nzqVar.f160137b);
    }

    public final int hashCode() {
        int iHashCode = this.f160136a.hashCode() * 31;
        String str = this.f160137b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
