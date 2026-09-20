package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class kii0 {

    /* JADX INFO: renamed from: a */
    public final thj f122992a;

    public kii0(thj thjVar) {
        this.f122992a = thjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kii0) && wj50.m88271j(this.f122992a, ((kii0) obj).f122992a);
    }

    public final int hashCode() {
        thj thjVar = this.f122992a;
        if (thjVar == null) {
            return 0;
        }
        return thjVar.f220443a.hashCode();
    }
}
