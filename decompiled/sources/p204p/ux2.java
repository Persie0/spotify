package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ux2 implements hwf {

    /* JADX INFO: renamed from: a */
    public final boolean f234805a;

    /* JADX INFO: renamed from: b */
    public final boolean f234806b;

    /* JADX INFO: renamed from: c */
    public final boolean f234807c;

    /* JADX INFO: renamed from: d */
    public final boolean f234808d;

    public ux2(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f234805a = z;
        this.f234806b = z2;
        this.f234807c = z3;
        this.f234808d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ux2)) {
            return false;
        }
        ux2 ux2Var = (ux2) obj;
        return this.f234805a == ux2Var.f234805a && this.f234806b == ux2Var.f234806b && this.f234807c == ux2Var.f234807c && this.f234808d == ux2Var.f234808d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f234808d) + s571.m77245d(s571.m77245d(Boolean.hashCode(this.f234805a) * 31, 31, this.f234806b), 31, this.f234807c);
    }
}
