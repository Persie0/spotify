package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class cbd1 {

    /* JADX INFO: renamed from: a */
    public final zbd1 f36097a;

    /* JADX INFO: renamed from: b */
    public final bbd1 f36098b;

    public cbd1(zbd1 zbd1Var, bbd1 bbd1Var) {
        this.f36097a = zbd1Var;
        this.f36098b = bbd1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cbd1)) {
            return false;
        }
        cbd1 cbd1Var = (cbd1) obj;
        return wj50.m88271j(this.f36097a, cbd1Var.f36097a) && wj50.m88271j(this.f36098b, cbd1Var.f36098b);
    }

    public final int hashCode() {
        return this.f36098b.hashCode() + (this.f36097a.hashCode() * 31);
    }
}
