package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class zs6 implements ktx {

    /* JADX INFO: renamed from: a */
    public final double f285849a;

    /* JADX INFO: renamed from: b */
    public final String f285850b;

    /* JADX INFO: renamed from: c */
    public final int f285851c;

    /* JADX INFO: renamed from: d */
    public final ys6 f285852d;

    public zs6(double d, String str, int i, ys6 ys6Var) {
        this.f285849a = d;
        this.f285850b = str;
        this.f285851c = i;
        this.f285852d = ys6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zs6)) {
            return false;
        }
        zs6 zs6Var = (zs6) obj;
        return Double.compare(this.f285849a, zs6Var.f285849a) == 0 && wj50.m88271j(this.f285850b, zs6Var.f285850b) && this.f285851c == zs6Var.f285851c && this.f285852d.equals(zs6Var.f285852d);
    }

    public final int hashCode() {
        return this.f285852d.hashCode() + f710.m40938f(this.f285851c, s571.m77243b(Double.hashCode(this.f285849a) * 31, 31, this.f285850b), 31);
    }
}
