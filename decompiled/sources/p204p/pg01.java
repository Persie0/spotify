package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class pg01 {

    /* JADX INFO: renamed from: a */
    public final uf60 f177185a;

    /* JADX INFO: renamed from: b */
    public final Object f177186b;

    public pg01(uf60 uf60Var, Object obj) {
        this.f177185a = uf60Var;
        this.f177186b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pg01)) {
            return false;
        }
        pg01 pg01Var = (pg01) obj;
        return this.f177185a.equals(pg01Var.f177185a) && wj50.m88271j(this.f177186b, pg01Var.f177186b);
    }

    public final int hashCode() {
        int iHashCode = this.f177185a.hashCode() * 31;
        Object obj = this.f177186b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }
}
