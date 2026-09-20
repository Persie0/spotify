package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class v7m {

    /* JADX INFO: renamed from: a */
    public final ie7 f238278a;

    /* JADX INFO: renamed from: b */
    public final y6s0 f238279b;

    public v7m(ie7 ie7Var, y6s0 y6s0Var) {
        this.f238278a = ie7Var;
        this.f238279b = y6s0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v7m)) {
            return false;
        }
        v7m v7mVar = (v7m) obj;
        return wj50.m88271j(this.f238278a, v7mVar.f238278a) && wj50.m88271j(this.f238279b, v7mVar.f238279b);
    }

    public final int hashCode() {
        ie7 ie7Var = this.f238278a;
        return this.f238279b.hashCode() + ((ie7Var == null ? 0 : ie7Var.f101336a.hashCode()) * 31);
    }
}
