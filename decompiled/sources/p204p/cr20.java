package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class cr20 {

    /* JADX INFO: renamed from: a */
    public final boolean f41160a;

    /* JADX INFO: renamed from: b */
    public final boolean f41161b;

    /* JADX INFO: renamed from: c */
    public final boolean f41162c;

    public cr20(boolean z, boolean z2, boolean z3) {
        this.f41160a = z;
        this.f41161b = z2;
        this.f41162c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cr20)) {
            return false;
        }
        cr20 cr20Var = (cr20) obj;
        return this.f41160a == cr20Var.f41160a && this.f41161b == cr20Var.f41161b && this.f41162c == cr20Var.f41162c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f41162c) + s571.m77245d(Boolean.hashCode(this.f41160a) * 31, 31, this.f41161b);
    }
}
