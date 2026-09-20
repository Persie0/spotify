package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class n2f implements t2f {

    /* JADX INFO: renamed from: a */
    public final s2f f149752a;

    public n2f(s2f s2fVar) {
        this.f149752a = s2fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n2f) && wj50.m88271j(this.f149752a, ((n2f) obj).f149752a);
    }

    @Override // p204p.t2f
    public final s2f getIdentifier() {
        return this.f149752a;
    }

    public final int hashCode() {
        return this.f149752a.hashCode();
    }
}
