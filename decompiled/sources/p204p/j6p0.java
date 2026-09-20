package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class j6p0 {

    /* JADX INFO: renamed from: a */
    public final boolean f109376a;

    /* JADX INFO: renamed from: b */
    public final int f109377b;

    public j6p0(boolean z, int i) {
        this.f109376a = z;
        this.f109377b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j6p0)) {
            return false;
        }
        j6p0 j6p0Var = (j6p0) obj;
        return this.f109376a == j6p0Var.f109376a && this.f109377b == j6p0Var.f109377b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f109377b) + (Boolean.hashCode(this.f109376a) * 31);
    }
}
