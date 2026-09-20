package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class m1e0 {

    /* JADX INFO: renamed from: a */
    public final boolean f138949a;

    /* JADX INFO: renamed from: b */
    public final boolean f138950b;

    /* JADX INFO: renamed from: c */
    public final boolean f138951c;

    public m1e0(boolean z, boolean z2, boolean z3) {
        this.f138949a = z;
        this.f138950b = z2;
        this.f138951c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1e0)) {
            return false;
        }
        m1e0 m1e0Var = (m1e0) obj;
        return this.f138949a == m1e0Var.f138949a && this.f138950b == m1e0Var.f138950b && this.f138951c == m1e0Var.f138951c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f138951c) + s571.m77245d(s571.m77245d(Boolean.hashCode(this.f138949a) * 31, 31, false), 31, this.f138950b);
    }
}
