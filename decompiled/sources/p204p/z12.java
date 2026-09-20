package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class z12 extends a22 {

    /* JADX INFO: renamed from: e */
    public final String f278213e;

    /* JADX INFO: renamed from: f */
    public final m761 f278214f;

    /* JADX INFO: renamed from: g */
    public final int f278215g;

    public z12(String str, m761 m761Var, int i) {
        super(str, m761Var, i);
        this.f278213e = str;
        this.f278214f = m761Var;
        this.f278215g = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z12)) {
            return false;
        }
        z12 z12Var = (z12) obj;
        return wj50.m88271j(this.f278213e, z12Var.f278213e) && this.f278214f == z12Var.f278214f && this.f278215g == z12Var.f278215g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f278215g) + ((this.f278214f.hashCode() + (this.f278213e.hashCode() * 31)) * 31);
    }
}
