package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class dp7 {

    /* JADX INFO: renamed from: a */
    public final cp7 f51201a;

    /* JADX INFO: renamed from: b */
    public final boolean f51202b;

    /* JADX INFO: renamed from: c */
    public final boolean f51203c;

    /* JADX INFO: renamed from: d */
    public final boolean f51204d;

    public dp7(cp7 cp7Var, boolean z, boolean z2, boolean z3) {
        this.f51201a = cp7Var;
        this.f51202b = z;
        this.f51203c = z2;
        this.f51204d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dp7)) {
            return false;
        }
        dp7 dp7Var = (dp7) obj;
        return wj50.m88271j(this.f51201a, dp7Var.f51201a) && this.f51202b == dp7Var.f51202b && this.f51203c == dp7Var.f51203c && this.f51204d == dp7Var.f51204d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f51204d) + s571.m77245d(s571.m77245d(this.f51201a.hashCode() * 31, 31, this.f51202b), 31, this.f51203c);
    }
}
