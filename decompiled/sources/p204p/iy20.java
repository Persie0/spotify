package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class iy20 implements ky20 {

    /* JADX INFO: renamed from: a */
    public final qf40 f106824a;

    /* JADX INFO: renamed from: b */
    public final ig40 f106825b;

    public iy20(qf40 qf40Var, ig40 ig40Var) {
        this.f106824a = qf40Var;
        this.f106825b = ig40Var;
    }

    /* JADX INFO: renamed from: a */
    public static iy20 m51876a(iy20 iy20Var, qf40 qf40Var, ig40 ig40Var, int i) {
        if ((i & 1) != 0) {
            qf40Var = iy20Var.f106824a;
        }
        if ((i & 2) != 0) {
            ig40Var = iy20Var.f106825b;
        }
        return new iy20(qf40Var, ig40Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iy20)) {
            return false;
        }
        iy20 iy20Var = (iy20) obj;
        return wj50.m88271j(this.f106824a, iy20Var.f106824a) && wj50.m88271j(this.f106825b, iy20Var.f106825b);
    }

    public final int hashCode() {
        return this.f106825b.hashCode() + (this.f106824a.hashCode() * 31);
    }
}
