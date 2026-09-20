package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class aa71 {

    /* JADX INFO: renamed from: a */
    public final int f13779a;

    /* JADX INFO: renamed from: b */
    public final int f13780b;

    /* JADX INFO: renamed from: c */
    public final rsu0 f13781c;

    public aa71(int i, int i2, rsu0 rsu0Var) {
        this.f13779a = i;
        this.f13780b = i2;
        this.f13781c = rsu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa71)) {
            return false;
        }
        aa71 aa71Var = (aa71) obj;
        return this.f13779a == aa71Var.f13779a && this.f13780b == aa71Var.f13780b && this.f13781c == aa71Var.f13781c;
    }

    public final int hashCode() {
        return this.f13781c.hashCode() + mt60.m62800g(this.f13780b, Integer.hashCode(this.f13779a) * 31, 31);
    }
}
