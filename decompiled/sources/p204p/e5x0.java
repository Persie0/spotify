package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class e5x0 {

    /* JADX INFO: renamed from: a */
    public final boolean f56490a;

    /* JADX INFO: renamed from: b */
    public final boolean f56491b;

    /* JADX INFO: renamed from: c */
    public final boolean f56492c;

    /* JADX INFO: renamed from: d */
    public final boolean f56493d;

    /* JADX INFO: renamed from: e */
    public final boolean f56494e;

    public e5x0(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f56490a = z;
        this.f56491b = z2;
        this.f56492c = z3;
        this.f56493d = z4;
        this.f56494e = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e5x0)) {
            return false;
        }
        e5x0 e5x0Var = (e5x0) obj;
        return this.f56490a == e5x0Var.f56490a && this.f56491b == e5x0Var.f56491b && this.f56492c == e5x0Var.f56492c && this.f56493d == e5x0Var.f56493d && this.f56494e == e5x0Var.f56494e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f56494e) + s571.m77245d(s571.m77245d(s571.m77245d(Boolean.hashCode(this.f56490a) * 31, 31, this.f56491b), 31, this.f56492c), 31, this.f56493d);
    }
}
