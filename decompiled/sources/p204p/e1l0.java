package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class e1l0 extends f1l0 {

    /* JADX INFO: renamed from: a */
    public final rzd1 f55214a;

    public e1l0(rzd1 rzd1Var) {
        this.f55214a = rzd1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e1l0) && this.f55214a.equals(((e1l0) obj).f55214a);
    }

    public final int hashCode() {
        return this.f55214a.hashCode() - 1150326230;
    }
}
