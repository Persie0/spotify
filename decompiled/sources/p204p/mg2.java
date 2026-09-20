package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class mg2 implements ug2 {

    /* JADX INFO: renamed from: a */
    public final bdb1 f143286a;

    public mg2(bdb1 bdb1Var) {
        this.f143286a = bdb1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mg2) && this.f143286a == ((mg2) obj).f143286a;
    }

    public final int hashCode() {
        return this.f143286a.hashCode();
    }
}
