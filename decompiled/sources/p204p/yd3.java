package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class yd3 extends s95 {

    /* JADX INFO: renamed from: j */
    public final int f271626j;

    /* JADX INFO: renamed from: k */
    public final boolean f271627k;

    /* JADX INFO: renamed from: l */
    public final boolean f271628l;

    public yd3(int i, boolean z, boolean z2) {
        this.f271626j = i;
        this.f271627k = z;
        this.f271628l = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yd3)) {
            return false;
        }
        yd3 yd3Var = (yd3) obj;
        return this.f271626j == yd3Var.f271626j && this.f271627k == yd3Var.f271627k && this.f271628l == yd3Var.f271628l;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f271628l) + s571.m77245d(Integer.hashCode(this.f271626j) * 31, 31, this.f271627k);
    }
}
