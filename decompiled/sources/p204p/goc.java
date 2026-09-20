package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class goc {

    /* JADX INFO: renamed from: a */
    public final thj f82930a;

    /* JADX INFO: renamed from: b */
    public final Boolean f82931b;

    public goc(thj thjVar, Boolean bool) {
        this.f82930a = thjVar;
        this.f82931b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof goc)) {
            return false;
        }
        goc gocVar = (goc) obj;
        return wj50.m88271j(this.f82930a, gocVar.f82930a) && wj50.m88271j(this.f82931b, gocVar.f82931b);
    }

    public final int hashCode() {
        thj thjVar = this.f82930a;
        int iHashCode = (thjVar == null ? 0 : thjVar.f220443a.hashCode()) * 31;
        Boolean bool = this.f82931b;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }
}
