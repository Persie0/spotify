package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class c1l0 extends f1l0 {

    /* JADX INFO: renamed from: a */
    public final rzd1 f33151a;

    public c1l0(rzd1 rzd1Var) {
        this.f33151a = rzd1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c1l0) && this.f33151a.equals(((c1l0) obj).f33151a);
    }

    public final int hashCode() {
        return this.f33151a.hashCode() - 1150326230;
    }
}
