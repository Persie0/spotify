package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class g2y {

    /* JADX INFO: renamed from: a */
    public final int f76021a;

    /* JADX INFO: renamed from: b */
    public final boolean f76022b;

    /* JADX INFO: renamed from: c */
    public final boolean f76023c;

    public g2y(int i, boolean z, boolean z2) {
        this.f76021a = i;
        this.f76022b = z;
        this.f76023c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2y)) {
            return false;
        }
        g2y g2yVar = (g2y) obj;
        return this.f76021a == g2yVar.f76021a && this.f76022b == g2yVar.f76022b && this.f76023c == g2yVar.f76023c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f76023c) + s571.m77245d(edb.m38547C(this.f76021a) * 31, 31, this.f76022b);
    }
}
