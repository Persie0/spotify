package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class vk1 {

    /* JADX INFO: renamed from: a */
    public final hz80 f242107a;

    /* JADX INFO: renamed from: b */
    public final skx0 f242108b;

    /* JADX INFO: renamed from: c */
    public final boolean f242109c;

    public vk1(hz80 hz80Var, skx0 skx0Var, boolean z) {
        this.f242107a = hz80Var;
        this.f242108b = skx0Var;
        this.f242109c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vk1)) {
            return false;
        }
        vk1 vk1Var = (vk1) obj;
        return wj50.m88271j(this.f242107a, vk1Var.f242107a) && wj50.m88271j(this.f242108b, vk1Var.f242108b) && this.f242109c == vk1Var.f242109c;
    }

    public final int hashCode() {
        int iHashCode = this.f242107a.hashCode() * 31;
        skx0 skx0Var = this.f242108b;
        return Boolean.hashCode(this.f242109c) + ((iHashCode + (skx0Var == null ? 0 : Boolean.hashCode(skx0Var.f210217a))) * 31);
    }
}
