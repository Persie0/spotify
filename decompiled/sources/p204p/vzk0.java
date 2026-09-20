package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class vzk0 {

    /* JADX INFO: renamed from: a */
    public final cks f246479a;

    /* JADX INFO: renamed from: b */
    public final cks f246480b;

    public vzk0(cks cksVar, cks cksVar2) {
        this.f246479a = cksVar;
        this.f246480b = cksVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vzk0)) {
            return false;
        }
        vzk0 vzk0Var = (vzk0) obj;
        return wj50.m88271j(this.f246479a, vzk0Var.f246479a) && wj50.m88271j(this.f246480b, vzk0Var.f246480b);
    }

    public final int hashCode() {
        cks cksVar = this.f246479a;
        int iHashCode = (cksVar == null ? 0 : Long.hashCode(cksVar.f39083a)) * 31;
        cks cksVar2 = this.f246480b;
        return iHashCode + (cksVar2 != null ? Long.hashCode(cksVar2.f39083a) : 0);
    }
}
