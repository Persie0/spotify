package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class h1f implements w1f {

    /* JADX INFO: renamed from: a */
    public final c1f f86617a;

    /* JADX INFO: renamed from: b */
    public final d850 f86618b;

    public h1f(c1f c1fVar, d850 d850Var) {
        this.f86617a = c1fVar;
        this.f86618b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1f)) {
            return false;
        }
        h1f h1fVar = (h1f) obj;
        return wj50.m88271j(this.f86617a, h1fVar.f86617a) && wj50.m88271j(this.f86618b, h1fVar.f86618b);
    }

    public final int hashCode() {
        return this.f86618b.hashCode() + (this.f86617a.hashCode() * 31);
    }
}
