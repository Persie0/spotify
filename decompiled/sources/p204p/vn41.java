package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class vn41 extends wn41 {

    /* JADX INFO: renamed from: a */
    public final int f242996a;

    /* JADX INFO: renamed from: b */
    public final gc61 f242997b;

    public vn41(int i, gc61 gc61Var) {
        this.f242996a = i;
        this.f242997b = gc61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vn41)) {
            return false;
        }
        vn41 vn41Var = (vn41) obj;
        return this.f242996a == vn41Var.f242996a && wj50.m88271j(this.f242997b, vn41Var.f242997b);
    }

    public final int hashCode() {
        return this.f242997b.hashCode() + (Integer.hashCode(this.f242996a) * 31);
    }
}
