package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class lgi0 {

    /* JADX INFO: renamed from: a */
    public final thj f133229a;

    public lgi0(thj thjVar) {
        this.f133229a = thjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lgi0) && wj50.m88271j(this.f133229a, ((lgi0) obj).f133229a);
    }

    public final int hashCode() {
        thj thjVar = this.f133229a;
        if (thjVar == null) {
            return 0;
        }
        return thjVar.f220443a.hashCode();
    }
}
