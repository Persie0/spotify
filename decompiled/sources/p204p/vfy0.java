package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class vfy0 extends g50 {

    /* JADX INFO: renamed from: d */
    public final ney0 f241070d;

    public vfy0(ney0 ney0Var) {
        super(ney0Var, true, 1);
        this.f241070d = ney0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vfy0) && wj50.m88271j(this.f241070d, ((vfy0) obj).f241070d);
    }

    public final int hashCode() {
        return this.f241070d.hashCode();
    }
}
