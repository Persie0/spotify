package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class i4d1 extends b5d1 {

    /* JADX INFO: renamed from: a */
    public final g6d1 f98513a;

    public i4d1(g6d1 g6d1Var) {
        this.f98513a = g6d1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i4d1) && this.f98513a.equals(((i4d1) obj).f98513a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f98513a.hashCode() * 31);
    }
}
