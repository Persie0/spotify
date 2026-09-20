package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class owc1 implements bxc1 {

    /* JADX INFO: renamed from: a */
    public final dy1 f170693a;

    /* JADX INFO: renamed from: b */
    public final boolean f170694b;

    public owc1(dy1 dy1Var, boolean z) {
        this.f170693a = dy1Var;
        this.f170694b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof owc1)) {
            return false;
        }
        owc1 owc1Var = (owc1) obj;
        return wj50.m88271j(this.f170693a, owc1Var.f170693a) && this.f170694b == owc1Var.f170694b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f170694b) + (this.f170693a.hashCode() * 31);
    }
}
