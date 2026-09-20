package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class rh71 {

    /* JADX INFO: renamed from: a */
    public final oh71 f199167a;

    /* JADX INFO: renamed from: b */
    public final th71 f199168b;

    /* JADX INFO: renamed from: c */
    public final sh71 f199169c;

    public rh71(oh71 oh71Var, th71 th71Var, sh71 sh71Var) {
        this.f199167a = oh71Var;
        this.f199168b = th71Var;
        this.f199169c = sh71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rh71)) {
            return false;
        }
        rh71 rh71Var = (rh71) obj;
        return wj50.m88271j(this.f199167a, rh71Var.f199167a) && this.f199168b == rh71Var.f199168b && this.f199169c == rh71Var.f199169c;
    }

    public final int hashCode() {
        return this.f199169c.hashCode() + ((this.f199168b.hashCode() + (this.f199167a.hashCode() * 31)) * 31);
    }
}
