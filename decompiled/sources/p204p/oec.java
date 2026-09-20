package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class oec {

    /* JADX INFO: renamed from: a */
    public final n6f f164398a;

    /* JADX INFO: renamed from: b */
    public final n6f f164399b;

    public oec(n6f n6fVar, n6f n6fVar2) {
        this.f164398a = n6fVar;
        this.f164399b = n6fVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oec)) {
            return false;
        }
        oec oecVar = (oec) obj;
        return wj50.m88271j(this.f164398a, oecVar.f164398a) && wj50.m88271j(this.f164399b, oecVar.f164399b);
    }

    public final int hashCode() {
        n6f n6fVar = this.f164398a;
        int iHashCode = (n6fVar == null ? 0 : Long.hashCode(n6fVar.f150873a)) * 31;
        n6f n6fVar2 = this.f164399b;
        return iHashCode + (n6fVar2 != null ? Long.hashCode(n6fVar2.f150873a) : 0);
    }
}
