package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class zgv {

    /* JADX INFO: renamed from: a */
    public final int f282717a;

    /* JADX INFO: renamed from: b */
    public final boolean f282718b;

    public zgv(int i, boolean z) {
        this.f282717a = i;
        this.f282718b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zgv)) {
            return false;
        }
        zgv zgvVar = (zgv) obj;
        return this.f282717a == zgvVar.f282717a && this.f282718b == zgvVar.f282718b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f282718b) + (Integer.hashCode(this.f282717a) * 31);
    }
}
