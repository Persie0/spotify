package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class sii0 {

    /* JADX INFO: renamed from: a */
    public final thj f209516a;

    public sii0(thj thjVar) {
        this.f209516a = thjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sii0) && wj50.m88271j(this.f209516a, ((sii0) obj).f209516a);
    }

    public final int hashCode() {
        thj thjVar = this.f209516a;
        if (thjVar == null) {
            return 0;
        }
        return thjVar.f220443a.hashCode();
    }
}
