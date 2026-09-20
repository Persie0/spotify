package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class li31 implements mi31 {

    /* JADX INFO: renamed from: a */
    public final boolean f133713a;

    /* JADX INFO: renamed from: b */
    public final boolean f133714b;

    public li31(boolean z, boolean z2) {
        this.f133713a = z;
        this.f133714b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof li31)) {
            return false;
        }
        li31 li31Var = (li31) obj;
        return this.f133713a == li31Var.f133713a && this.f133714b == li31Var.f133714b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f133714b) + (Boolean.hashCode(this.f133713a) * 31);
    }
}
