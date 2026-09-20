package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class z5b0 {

    /* JADX INFO: renamed from: a */
    public final int f279527a;

    /* JADX INFO: renamed from: b */
    public final b251 f279528b;

    /* JADX INFO: renamed from: c */
    public final qf40 f279529c;

    /* JADX INFO: renamed from: d */
    public final int f279530d;

    public z5b0(int i, b251 b251Var, qf40 qf40Var, int i2) {
        this.f279527a = i;
        this.f279528b = b251Var;
        this.f279529c = qf40Var;
        this.f279530d = i2;
    }

    /* JADX INFO: renamed from: a */
    public static z5b0 m95455a(z5b0 z5b0Var, int i, b251 b251Var) {
        qf40 qf40Var = z5b0Var.f279529c;
        int i2 = z5b0Var.f279530d;
        z5b0Var.getClass();
        return new z5b0(i, b251Var, qf40Var, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z5b0)) {
            return false;
        }
        z5b0 z5b0Var = (z5b0) obj;
        return this.f279527a == z5b0Var.f279527a && wj50.m88271j(this.f279528b, z5b0Var.f279528b) && wj50.m88271j(this.f279529c, z5b0Var.f279529c) && this.f279530d == z5b0Var.f279530d;
    }

    public final int hashCode() {
        return edb.m38547C(this.f279530d) + fr0.m42461e(this.f279529c, (this.f279528b.hashCode() + (Integer.hashCode(this.f279527a) * 31)) * 31, 31);
    }
}
