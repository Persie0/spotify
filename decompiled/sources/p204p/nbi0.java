package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class nbi0 implements obi0, cn41 {

    /* JADX INFO: renamed from: a */
    public final int f152276a;

    public nbi0(int i) {
        this.f152276a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nbi0) && this.f152276a == ((nbi0) obj).f152276a;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (edb.m38547C(this.f152276a) * 31);
    }
}
