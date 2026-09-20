package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class es80 implements hs80 {

    /* JADX INFO: renamed from: a */
    public final sp80 f62307a;

    public es80(sp80 sp80Var) {
        this.f62307a = sp80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof es80) && wj50.m88271j(this.f62307a, ((es80) obj).f62307a);
    }

    public final int hashCode() {
        return this.f62307a.hashCode();
    }
}
