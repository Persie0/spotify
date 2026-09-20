package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class uhb1 implements xhb1 {

    /* JADX INFO: renamed from: a */
    public final long f230408a;

    /* JADX INFO: renamed from: b */
    public final boolean f230409b;

    public uhb1(long j, boolean z) {
        this.f230408a = j;
        this.f230409b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uhb1)) {
            return false;
        }
        uhb1 uhb1Var = (uhb1) obj;
        return this.f230408a == uhb1Var.f230408a && this.f230409b == uhb1Var.f230409b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f230409b) + (Long.hashCode(this.f230408a) * 31);
    }
}
