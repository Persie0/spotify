package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class j380 {

    /* JADX INFO: renamed from: a */
    public final boolean f108304a;

    /* JADX INFO: renamed from: b */
    public final boolean f108305b;

    /* JADX INFO: renamed from: c */
    public final boolean f108306c;

    /* JADX INFO: renamed from: d */
    public final boolean f108307d;

    public j380(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f108304a = z;
        this.f108305b = z2;
        this.f108306c = z3;
        this.f108307d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j380)) {
            return false;
        }
        j380 j380Var = (j380) obj;
        return this.f108304a == j380Var.f108304a && this.f108305b == j380Var.f108305b && this.f108306c == j380Var.f108306c && this.f108307d == j380Var.f108307d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f108307d) + s571.m77245d(s571.m77245d(Boolean.hashCode(this.f108304a) * 31, 31, this.f108305b), 31, this.f108306c);
    }
}
