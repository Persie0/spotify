package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class wqc1 {

    /* JADX INFO: renamed from: a */
    public final int f254001a;

    /* JADX INFO: renamed from: b */
    public final int f254002b;

    /* JADX INFO: renamed from: c */
    public final int f254003c;

    /* JADX INFO: renamed from: d */
    public final boolean f254004d;

    public wqc1(int i, int i2, int i3, boolean z) {
        this.f254001a = i;
        this.f254002b = i2;
        this.f254003c = i3;
        this.f254004d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wqc1)) {
            return false;
        }
        wqc1 wqc1Var = (wqc1) obj;
        return this.f254001a == wqc1Var.f254001a && this.f254002b == wqc1Var.f254002b && this.f254003c == wqc1Var.f254003c && this.f254004d == wqc1Var.f254004d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f254004d) + f710.m40938f(this.f254003c, mt60.m62800g(this.f254002b, Integer.hashCode(this.f254001a) * 31, 31), 31);
    }
}
