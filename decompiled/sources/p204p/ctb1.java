package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ctb1 {

    /* JADX INFO: renamed from: a */
    public final int f41850a;

    /* JADX INFO: renamed from: b */
    public final int f41851b;

    public ctb1(int i, int i2) {
        this.f41850a = i;
        this.f41851b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ctb1)) {
            return false;
        }
        ctb1 ctb1Var = (ctb1) obj;
        return this.f41850a == ctb1Var.f41850a && this.f41851b == ctb1Var.f41851b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f41851b) + (Integer.hashCode(this.f41850a) * 31);
    }
}
