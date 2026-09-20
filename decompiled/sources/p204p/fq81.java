package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class fq81 {

    /* JADX INFO: renamed from: a */
    public final String f72103a;

    /* JADX INFO: renamed from: b */
    public final int f72104b;

    /* JADX INFO: renamed from: c */
    public final bq81 f72105c;

    /* JADX INFO: renamed from: d */
    public final gh00 f72106d;

    public fq81(String str, int i, bq81 bq81Var, gh00 gh00Var) {
        this.f72103a = str;
        this.f72104b = i;
        this.f72105c = bq81Var;
        this.f72106d = gh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fq81)) {
            return false;
        }
        fq81 fq81Var = (fq81) obj;
        return wj50.m88271j(this.f72103a, fq81Var.f72103a) && this.f72104b == fq81Var.f72104b && wj50.m88271j(this.f72105c, fq81Var.f72105c) && wj50.m88271j(this.f72106d, fq81Var.f72106d);
    }

    public final int hashCode() {
        return this.f72106d.hashCode() + ((this.f72105c.hashCode() + mt60.m62800g(this.f72104b, this.f72103a.hashCode() * 31, 31)) * 31);
    }
}
