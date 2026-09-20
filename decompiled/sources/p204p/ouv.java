package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ouv {

    /* JADX INFO: renamed from: a */
    public final thj f170359a;

    public ouv(thj thjVar) {
        this.f170359a = thjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ouv) && wj50.m88271j(this.f170359a, ((ouv) obj).f170359a);
    }

    public final int hashCode() {
        thj thjVar = this.f170359a;
        if (thjVar == null) {
            return 0;
        }
        return thjVar.f220443a.hashCode();
    }
}
