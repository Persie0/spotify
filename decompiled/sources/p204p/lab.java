package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class lab extends mab {

    /* JADX INFO: renamed from: a */
    public final g4t0 f131324a;

    public lab(g4t0 g4t0Var) {
        this.f131324a = g4t0Var;
    }

    @Override // p204p.mab
    /* JADX INFO: renamed from: a */
    public final g4t0 mo52807a() {
        return this.f131324a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lab) && wj50.m88271j(this.f131324a, ((lab) obj).f131324a);
    }

    public final int hashCode() {
        return this.f131324a.hashCode();
    }
}
