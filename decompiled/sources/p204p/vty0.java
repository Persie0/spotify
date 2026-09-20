package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class vty0 implements quy0 {

    /* JADX INFO: renamed from: a */
    public final int f244792a;

    /* JADX INFO: renamed from: b */
    public final n0z0 f244793b;

    public vty0(int i, n0z0 n0z0Var) {
        this.f244792a = i;
        this.f244793b = n0z0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vty0)) {
            return false;
        }
        vty0 vty0Var = (vty0) obj;
        return this.f244792a == vty0Var.f244792a && wj50.m88271j(this.f244793b, vty0Var.f244793b);
    }

    public final int hashCode() {
        return this.f244793b.hashCode() + (Integer.hashCode(this.f244792a) * 31);
    }
}
