package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class hu50 {

    /* JADX INFO: renamed from: a */
    public final int f95288a;

    /* JADX INFO: renamed from: b */
    public final up60 f95289b;

    public hu50(int i, up60 up60Var) {
        this.f95288a = i;
        this.f95289b = up60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hu50)) {
            return false;
        }
        hu50 hu50Var = (hu50) obj;
        return this.f95288a == hu50Var.f95288a && wj50.m88271j(this.f95289b, hu50Var.f95289b);
    }

    public final int hashCode() {
        return this.f95289b.hashCode() + (edb.m38547C(this.f95288a) * 31);
    }
}
