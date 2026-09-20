package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class gi01 {

    /* JADX INFO: renamed from: a */
    public final m340 f80003a;

    /* JADX INFO: renamed from: b */
    public final int f80004b;

    public gi01(m340 m340Var, int i) {
        this.f80003a = m340Var;
        this.f80004b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gi01)) {
            return false;
        }
        gi01 gi01Var = (gi01) obj;
        return wj50.m88271j(this.f80003a, gi01Var.f80003a) && this.f80004b == gi01Var.f80004b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f80004b) + (this.f80003a.hashCode() * 31);
    }
}
