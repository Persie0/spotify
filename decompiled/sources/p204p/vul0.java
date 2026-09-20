package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class vul0 {

    /* JADX INFO: renamed from: a */
    public final ol21 f245022a;

    /* JADX INFO: renamed from: b */
    public final int f245023b;

    /* JADX INFO: renamed from: c */
    public final int f245024c;

    /* JADX INFO: renamed from: d */
    public final nl21 f245025d;

    public vul0(ol21 ol21Var, int i, int i2, nl21 nl21Var) {
        this.f245022a = ol21Var;
        this.f245023b = i;
        this.f245024c = i2;
        this.f245025d = nl21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vul0)) {
            return false;
        }
        vul0 vul0Var = (vul0) obj;
        return this.f245022a == vul0Var.f245022a && this.f245023b == vul0Var.f245023b && this.f245024c == vul0Var.f245024c && this.f245025d.equals(vul0Var.f245025d);
    }

    public final int hashCode() {
        return this.f245025d.hashCode() + mt60.m62800g(this.f245024c, mt60.m62800g(this.f245023b, this.f245022a.hashCode() * 31, 31), 31);
    }
}
