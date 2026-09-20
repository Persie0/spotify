package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class sva1 implements uva1 {

    /* JADX INFO: renamed from: a */
    public final fyf f214371a;

    public sva1(fyf fyfVar) {
        this.f214371a = fyfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sva1) && this.f214371a.equals(((sva1) obj).f214371a);
    }

    public final int hashCode() {
        return this.f214371a.hashCode();
    }
}
