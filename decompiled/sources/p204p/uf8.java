package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class uf8 implements vf8 {

    /* JADX INFO: renamed from: a */
    public final pf8 f229720a;

    public uf8(pf8 pf8Var) {
        this.f229720a = pf8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uf8) && wj50.m88271j(this.f229720a, ((uf8) obj).f229720a);
    }

    public final int hashCode() {
        return this.f229720a.hashCode();
    }
}
