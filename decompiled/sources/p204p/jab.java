package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class jab extends mab {

    /* JADX INFO: renamed from: a */
    public final g4t0 f110426a;

    public jab(g4t0 g4t0Var) {
        this.f110426a = g4t0Var;
    }

    @Override // p204p.mab
    /* JADX INFO: renamed from: a */
    public final g4t0 mo52807a() {
        return this.f110426a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jab) && wj50.m88271j(this.f110426a, ((jab) obj).f110426a);
    }

    public final int hashCode() {
        return this.f110426a.hashCode();
    }
}
