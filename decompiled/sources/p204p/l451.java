package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class l451 {

    /* JADX INFO: renamed from: a */
    public final v140 f129573a;

    /* JADX INFO: renamed from: b */
    public final erc1 f129574b;

    public l451(v140 v140Var, erc1 erc1Var) {
        this.f129573a = v140Var;
        this.f129574b = erc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l451)) {
            return false;
        }
        l451 l451Var = (l451) obj;
        return wj50.m88271j(this.f129573a, l451Var.f129573a) && wj50.m88271j(this.f129574b, l451Var.f129574b);
    }

    public final int hashCode() {
        return this.f129574b.hashCode() + (this.f129573a.hashCode() * 31);
    }
}
