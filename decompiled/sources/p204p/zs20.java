package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class zs20 implements bt20 {

    /* JADX INFO: renamed from: a */
    public final String f285827a;

    /* JADX INFO: renamed from: b */
    public final pt20 f285828b;

    /* JADX INFO: renamed from: c */
    public final pt20 f285829c;

    /* JADX INFO: renamed from: d */
    public final ts20 f285830d;

    public zs20(String str, pt20 pt20Var, pt20 pt20Var2, ts20 ts20Var) {
        this.f285827a = str;
        this.f285828b = pt20Var;
        this.f285829c = pt20Var2;
        this.f285830d = ts20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zs20)) {
            return false;
        }
        zs20 zs20Var = (zs20) obj;
        return wj50.m88271j(this.f285827a, zs20Var.f285827a) && wj50.m88271j(this.f285828b, zs20Var.f285828b) && wj50.m88271j(this.f285829c, zs20Var.f285829c) && wj50.m88271j(this.f285830d, zs20Var.f285830d);
    }

    public final int hashCode() {
        int iHashCode = (this.f285829c.hashCode() + ((this.f285828b.hashCode() + (this.f285827a.hashCode() * 31)) * 31)) * 31;
        ts20 ts20Var = this.f285830d;
        return iHashCode + (ts20Var == null ? 0 : ts20Var.hashCode());
    }
}
