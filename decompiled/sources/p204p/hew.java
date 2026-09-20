package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class hew {

    /* JADX INFO: renamed from: a */
    public final boolean f90516a;

    /* JADX INFO: renamed from: b */
    public final agw f90517b;

    public hew(agw agwVar, boolean z) {
        this.f90516a = z;
        this.f90517b = agwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hew)) {
            return false;
        }
        hew hewVar = (hew) obj;
        return this.f90516a == hewVar.f90516a && wj50.m88271j(this.f90517b, hewVar.f90517b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f90516a) * 31;
        agw agwVar = this.f90517b;
        return iHashCode + (agwVar == null ? 0 : agwVar.hashCode());
    }
}
