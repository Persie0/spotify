package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class aco0 {

    /* JADX INFO: renamed from: a */
    public final boolean f14397a;

    /* JADX INFO: renamed from: b */
    public final boolean f14398b;

    /* JADX INFO: renamed from: c */
    public final boolean f14399c;

    /* JADX INFO: renamed from: d */
    public final tdu f14400d;

    /* JADX INFO: renamed from: e */
    public final boolean f14401e;

    /* JADX INFO: renamed from: f */
    public final boolean f14402f;

    public aco0(boolean z, boolean z2, boolean z3, tdu tduVar, boolean z4, boolean z5) {
        this.f14397a = z;
        this.f14398b = z2;
        this.f14399c = z3;
        this.f14400d = tduVar;
        this.f14401e = z4;
        this.f14402f = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aco0)) {
            return false;
        }
        aco0 aco0Var = (aco0) obj;
        return this.f14397a == aco0Var.f14397a && this.f14398b == aco0Var.f14398b && this.f14399c == aco0Var.f14399c && wj50.m88271j(this.f14400d, aco0Var.f14400d) && this.f14401e == aco0Var.f14401e && this.f14402f == aco0Var.f14402f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f14402f) + s571.m77245d((this.f14400d.hashCode() + s571.m77245d(s571.m77245d(Boolean.hashCode(this.f14397a) * 31, 31, this.f14398b), 31, this.f14399c)) * 31, 31, this.f14401e);
    }
}
