package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class sm31 {

    /* JADX INFO: renamed from: a */
    public final v140 f210559a;

    /* JADX INFO: renamed from: b */
    public final erc1 f210560b;

    /* JADX INFO: renamed from: c */
    public final jl31 f210561c;

    public sm31(v140 v140Var, erc1 erc1Var, jl31 jl31Var) {
        this.f210559a = v140Var;
        this.f210560b = erc1Var;
        this.f210561c = jl31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sm31)) {
            return false;
        }
        sm31 sm31Var = (sm31) obj;
        return wj50.m88271j(this.f210559a, sm31Var.f210559a) && wj50.m88271j(this.f210560b, sm31Var.f210560b) && wj50.m88271j(this.f210561c, sm31Var.f210561c);
    }

    public final int hashCode() {
        return this.f210561c.f113477a.hashCode() + ((this.f210560b.hashCode() + (this.f210559a.hashCode() * 31)) * 31);
    }
}
