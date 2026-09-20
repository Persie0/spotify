package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class kkd implements ykd {

    /* JADX INFO: renamed from: a */
    public final z650 f123568a;

    /* JADX INFO: renamed from: b */
    public final int f123569b;

    public kkd(int i, z650 z650Var) {
        this.f123568a = z650Var;
        this.f123569b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kkd)) {
            return false;
        }
        kkd kkdVar = (kkd) obj;
        return wj50.m88271j(this.f123568a, kkdVar.f123568a) && this.f123569b == kkdVar.f123569b;
    }

    public final int hashCode() {
        z650 z650Var = this.f123568a;
        int iHashCode = (z650Var == null ? 0 : z650Var.f279709a.hashCode()) * 31;
        int i = this.f123569b;
        return iHashCode + (i != 0 ? edb.m38547C(i) : 0);
    }
}
