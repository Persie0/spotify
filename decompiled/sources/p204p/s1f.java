package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class s1f implements w1f {

    /* JADX INFO: renamed from: a */
    public final f1f f204706a;

    /* JADX INFO: renamed from: b */
    public final z650 f204707b;

    public s1f(f1f f1fVar, z650 z650Var) {
        this.f204706a = f1fVar;
        this.f204707b = z650Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1f)) {
            return false;
        }
        s1f s1fVar = (s1f) obj;
        return wj50.m88271j(this.f204706a, s1fVar.f204706a) && wj50.m88271j(this.f204707b, s1fVar.f204707b);
    }

    public final int hashCode() {
        return this.f204707b.f279709a.hashCode() + (this.f204706a.hashCode() * 31);
    }
}
