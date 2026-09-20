package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class lz40 implements nz40 {

    /* JADX INFO: renamed from: a */
    public final sx40 f138258a;

    public lz40(sx40 sx40Var) {
        this.f138258a = sx40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lz40) && wj50.m88271j(this.f138258a, ((lz40) obj).f138258a);
    }

    public final int hashCode() {
        return this.f138258a.hashCode();
    }
}
