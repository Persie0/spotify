package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class b1l0 {

    /* JADX INFO: renamed from: a */
    public final rzd1 f22375a;

    public b1l0(rzd1 rzd1Var) {
        this.f22375a = rzd1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b1l0) && this.f22375a.equals(((b1l0) obj).f22375a);
    }

    public final int hashCode() {
        return this.f22375a.hashCode() - 1150326230;
    }
}
