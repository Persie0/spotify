package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class xb8 implements bc8 {

    /* JADX INFO: renamed from: a */
    public final boolean f259856a;

    /* JADX INFO: renamed from: b */
    public final boolean f259857b;

    public xb8(boolean z, boolean z2) {
        this.f259856a = z;
        this.f259857b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xb8)) {
            return false;
        }
        xb8 xb8Var = (xb8) obj;
        return this.f259856a == xb8Var.f259856a && this.f259857b == xb8Var.f259857b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f259857b) + (Boolean.hashCode(this.f259856a) * 31);
    }
}
