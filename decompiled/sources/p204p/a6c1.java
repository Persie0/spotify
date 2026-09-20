package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class a6c1 {

    /* JADX INFO: renamed from: a */
    public final Float f12772a;

    /* JADX INFO: renamed from: b */
    public final s3l0 f12773b;

    public a6c1(Float f, s3l0 s3l0Var) {
        this.f12772a = f;
        this.f12773b = s3l0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a6c1)) {
            return false;
        }
        a6c1 a6c1Var = (a6c1) obj;
        return wj50.m88271j(this.f12772a, a6c1Var.f12772a) && wj50.m88271j(this.f12773b, a6c1Var.f12773b);
    }

    public final int hashCode() {
        Float f = this.f12772a;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        s3l0 s3l0Var = this.f12773b;
        return iHashCode + (s3l0Var != null ? s3l0Var.hashCode() : 0);
    }
}
