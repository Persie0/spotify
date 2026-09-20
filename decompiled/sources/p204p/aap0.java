package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class aap0 extends bap0 {

    /* JADX INFO: renamed from: a */
    public final jb81 f13903a;

    /* JADX INFO: renamed from: b */
    public final y3p0 f13904b;

    public aap0(jb81 jb81Var, y3p0 y3p0Var) {
        this.f13903a = jb81Var;
        this.f13904b = y3p0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aap0)) {
            return false;
        }
        aap0 aap0Var = (aap0) obj;
        return wj50.m88271j(this.f13903a, aap0Var.f13903a) && wj50.m88271j(this.f13904b, aap0Var.f13904b);
    }

    public final int hashCode() {
        return this.f13904b.hashCode() + (this.f13903a.hashCode() * 31);
    }
}
