package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class kab extends mab {

    /* JADX INFO: renamed from: a */
    public final g4t0 f120855a;

    public kab(g4t0 g4t0Var) {
        this.f120855a = g4t0Var;
    }

    @Override // p204p.mab
    /* JADX INFO: renamed from: a */
    public final g4t0 mo52807a() {
        return this.f120855a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kab) && wj50.m88271j(this.f120855a, ((kab) obj).f120855a);
    }

    public final int hashCode() {
        return this.f120855a.hashCode();
    }
}
