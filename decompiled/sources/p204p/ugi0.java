package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ugi0 {

    /* JADX INFO: renamed from: a */
    public final thj f230192a;

    public ugi0(thj thjVar) {
        this.f230192a = thjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ugi0) && wj50.m88271j(this.f230192a, ((ugi0) obj).f230192a);
    }

    public final int hashCode() {
        thj thjVar = this.f230192a;
        if (thjVar == null) {
            return 0;
        }
        return thjVar.f220443a.hashCode();
    }
}
