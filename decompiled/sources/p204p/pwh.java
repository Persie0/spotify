package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class pwh implements cxh {

    /* JADX INFO: renamed from: a */
    public final n6f f182049a;

    /* JADX INFO: renamed from: b */
    public final n6f f182050b;

    public pwh(n6f n6fVar, n6f n6fVar2) {
        this.f182049a = n6fVar;
        this.f182050b = n6fVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pwh)) {
            return false;
        }
        pwh pwhVar = (pwh) obj;
        return wj50.m88271j(this.f182049a, pwhVar.f182049a) && wj50.m88271j(this.f182050b, pwhVar.f182050b);
    }

    public final int hashCode() {
        n6f n6fVar = this.f182049a;
        int iHashCode = (n6fVar == null ? 0 : Long.hashCode(n6fVar.f150873a)) * 31;
        n6f n6fVar2 = this.f182050b;
        return iHashCode + (n6fVar2 != null ? Long.hashCode(n6fVar2.f150873a) : 0);
    }
}
