package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class n8l0 implements o8l0 {

    /* JADX INFO: renamed from: a */
    public final int f151558a;

    /* JADX INFO: renamed from: b */
    public final int f151559b;

    public n8l0(int i, int i2) {
        this.f151558a = i;
        this.f151559b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n8l0)) {
            return false;
        }
        n8l0 n8l0Var = (n8l0) obj;
        return this.f151558a == n8l0Var.f151558a && this.f151559b == n8l0Var.f151559b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f151559b) + (Integer.hashCode(this.f151558a) * 31);
    }
}
