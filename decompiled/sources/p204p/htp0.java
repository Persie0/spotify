package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class htp0 {

    /* JADX INFO: renamed from: a */
    public final int f95109a;

    /* JADX INFO: renamed from: b */
    public final long f95110b;

    public htp0(int i, long j) {
        this.f95109a = i;
        this.f95110b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof htp0)) {
            return false;
        }
        htp0 htp0Var = (htp0) obj;
        return this.f95109a == htp0Var.f95109a && this.f95110b == htp0Var.f95110b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f95110b) + (Integer.hashCode(this.f95109a) * 31);
    }
}
