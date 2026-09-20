package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class yc61 implements ad61 {

    /* JADX INFO: renamed from: a */
    public final x5w0 f271411a;

    /* JADX INFO: renamed from: b */
    public final x5w0 f271412b;

    public yc61(x5w0 x5w0Var, x5w0 x5w0Var2) {
        this.f271411a = x5w0Var;
        this.f271412b = x5w0Var2;
    }

    /* JADX INFO: renamed from: a */
    public final x5w0 m93332a() {
        return this.f271411a;
    }

    /* JADX INFO: renamed from: b */
    public final x5w0 m93333b() {
        return this.f271412b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yc61)) {
            return false;
        }
        yc61 yc61Var = (yc61) obj;
        return wj50.m88271j(this.f271411a, yc61Var.f271411a) && wj50.m88271j(this.f271412b, yc61Var.f271412b);
    }

    public final int hashCode() {
        x5w0 x5w0Var = this.f271411a;
        int iHashCode = (x5w0Var == null ? 0 : x5w0Var.hashCode()) * 31;
        x5w0 x5w0Var2 = this.f271412b;
        return iHashCode + (x5w0Var2 != null ? x5w0Var2.hashCode() : 0);
    }
}
