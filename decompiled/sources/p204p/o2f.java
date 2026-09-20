package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class o2f implements t2f {

    /* JADX INFO: renamed from: a */
    public final s2f f161038a;

    public o2f(s2f s2fVar) {
        this.f161038a = s2fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o2f) && wj50.m88271j(this.f161038a, ((o2f) obj).f161038a);
    }

    @Override // p204p.t2f
    public final s2f getIdentifier() {
        return this.f161038a;
    }

    public final int hashCode() {
        return this.f161038a.hashCode();
    }
}
