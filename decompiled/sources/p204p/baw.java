package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class baw {

    /* JADX INFO: renamed from: a */
    public final thj f25353a;

    public baw(thj thjVar) {
        this.f25353a = thjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof baw) && wj50.m88271j(this.f25353a, ((baw) obj).f25353a);
    }

    public final int hashCode() {
        thj thjVar = this.f25353a;
        if (thjVar == null) {
            return 0;
        }
        return thjVar.f220443a.hashCode();
    }
}
