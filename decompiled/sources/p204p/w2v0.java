package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class w2v0 {

    /* JADX INFO: renamed from: a */
    public final v2v0 f247432a;

    /* JADX INFO: renamed from: b */
    public final v2v0 f247433b;

    public w2v0(v2v0 v2v0Var, v2v0 v2v0Var2) {
        this.f247432a = v2v0Var;
        this.f247433b = v2v0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w2v0)) {
            return false;
        }
        w2v0 w2v0Var = (w2v0) obj;
        return wj50.m88271j(this.f247432a, w2v0Var.f247432a) && wj50.m88271j(this.f247433b, w2v0Var.f247433b);
    }

    public final int hashCode() {
        return this.f247433b.hashCode() + (this.f247432a.hashCode() * 31);
    }
}
