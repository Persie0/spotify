package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class asq0 extends bsq0 {

    /* JADX INFO: renamed from: a */
    public final csq0 f19489a;

    /* JADX INFO: renamed from: b */
    public final int f19490b;

    public asq0(csq0 csq0Var, int i) {
        this.f19489a = csq0Var;
        this.f19490b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof asq0)) {
            return false;
        }
        asq0 asq0Var = (asq0) obj;
        return wj50.m88271j(this.f19489a, asq0Var.f19489a) && this.f19490b == asq0Var.f19490b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f19490b) + (this.f19489a.hashCode() * 31);
    }
}
