package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class wie {

    /* JADX INFO: renamed from: a */
    public final wu71 f251615a;

    /* JADX INFO: renamed from: b */
    public final qdz0 f251616b;

    /* JADX INFO: renamed from: c */
    public final g6o0 f251617c;

    public wie(wu71 wu71Var, qdz0 qdz0Var, g6o0 g6o0Var) {
        this.f251615a = wu71Var;
        this.f251616b = qdz0Var;
        this.f251617c = g6o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wie)) {
            return false;
        }
        wie wieVar = (wie) obj;
        return wj50.m88271j(this.f251615a, wieVar.f251615a) && wj50.m88271j(this.f251616b, wieVar.f251616b) && wj50.m88271j(this.f251617c, wieVar.f251617c);
    }

    public final int hashCode() {
        return this.f251617c.hashCode() + ((this.f251616b.hashCode() + (this.f251615a.hashCode() * 31)) * 31);
    }
}
