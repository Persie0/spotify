package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class e5c1 {

    /* JADX INFO: renamed from: a */
    public final boolean f56350a;

    /* JADX INFO: renamed from: b */
    public final w4c1 f56351b;

    /* JADX INFO: renamed from: c */
    public final s4c1 f56352c;

    public e5c1(boolean z, w4c1 w4c1Var, s4c1 s4c1Var) {
        this.f56350a = z;
        this.f56351b = w4c1Var;
        this.f56352c = s4c1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e5c1)) {
            return false;
        }
        e5c1 e5c1Var = (e5c1) obj;
        return this.f56350a == e5c1Var.f56350a && wj50.m88271j(this.f56351b, e5c1Var.f56351b) && this.f56352c == e5c1Var.f56352c;
    }

    public final int hashCode() {
        int iHashCode = (this.f56351b.hashCode() + (Boolean.hashCode(this.f56350a) * 31)) * 31;
        s4c1 s4c1Var = this.f56352c;
        return iHashCode + (s4c1Var == null ? 0 : s4c1Var.hashCode());
    }
}
