package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class hsc0 implements isc0 {

    /* JADX INFO: renamed from: a */
    public final dvc1 f94668a;

    /* JADX INFO: renamed from: b */
    public final gtc0 f94669b;

    public hsc0(dvc1 dvc1Var, gtc0 gtc0Var) {
        this.f94668a = dvc1Var;
        this.f94669b = gtc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hsc0)) {
            return false;
        }
        hsc0 hsc0Var = (hsc0) obj;
        return wj50.m88271j(this.f94668a, hsc0Var.f94668a) && wj50.m88271j(this.f94669b, hsc0Var.f94669b);
    }

    public final int hashCode() {
        int iHashCode = this.f94668a.hashCode() * 31;
        gtc0 gtc0Var = this.f94669b;
        return iHashCode + (gtc0Var == null ? 0 : gtc0Var.hashCode());
    }
}
